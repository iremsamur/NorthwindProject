import React, { Component } from 'react'
import { connect } from 'react-redux';//componenti reduxa bağlamak için connect nesnesini import ederiz
import { ListGroup, ListGroupItem } from 'reactstrap';
//mapDispatchToProps için importlar
import {bindActionCreators} from "redux";
//bağlamak için kategori aksiyonlarını burada import etmem gerekiyor.
import * as categoryActions from "../../redux/actions/categoryActions"
import {Badge} from "reactstrap";
import * as productActions from "../../redux/actions/productActions"
class CategoryList extends Component {
  componentDidMount(){
    this.props.actions.getCategory()
  }
  selectCategory = (category)=>{
    this.props.actions.changeCategory(category);
    this.props.actions.getProducts(category.id);//seçili kategorinin id'sini gönderip
    //getproducts'ı burada çağırıyorum


  }
  render() {
    return (
      <div>
        <h3> <Badge color="warning">Categories</Badge></h3>
        <ListGroup>
          {
            this.props.categories.map(category =>(
              <ListGroupItem active={category.id===this.props.currentCategory.id} onClick={this.selectCategory(category)} key={category.id}>
                {
                  category.categoryName
                }

          </ListGroupItem>

            ))
          }
          

        </ListGroup>

        

      </div>
      
    )
  }
}
function mapStateToProps(state){//componentin proplarına bir state'i bağla

  return{
    currentCategory  : state.changeCategoryReducer,
    categories : state.categoryListReducer
    //propları reducer'a bağlıyoruz
    //currentCategory parametresini changeCategoryReducer'a bağla
  }
}
function mapDispatchToProps(dispatch){
  //aksiyona prop'lara bağlayacak
  return {
    action:{
      //bu component'in action'ları
      getCategories:bindActionCreators(categoryActions.getCategories,dispatch),//getCategories diye bir aksiyonum olacak
      //bizim category aksiyonlarımızdaki getCatrgories'i buraya bağla diyoruz
      //Burayı prop'lara bağla demiş olduk.
      changeCategory:bindActionCreators(categoryActions.changeCategory,dispatch),
      getProducts:bindActionCreators(productActions.getProducts,dispatch)//kategoriye göre ürün  listeleme
  




    }
  }

}
export default connect(mapStateToProps,mapDispatchToProps)(CategoryList)//connect fonksiyonunu yazıp CategoryListi parametre olarak gönderdik
//Tüm bağladıklarımı connect'e vererek bağladığımı sisteme söylemem gerekiyor.
