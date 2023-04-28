import React, { Component } from 'react'
import { connect } from 'react-redux';
import {Badge} from "reactstrap";
import * as productActions from "../../redux/actions/productActions"
import {bindActionCreators} from "redux";
import {Table} from "reactstrap";

class ProductList extends Component {
  componentDidMount(){
    //artık lifecycle event'i içinde uygulama açıldığında ürünleri çağırıp getirmesiin sağlarız. bu metodu kullanarak.
    this.props.actions.getProducts();
  }
  render() {
    return (
      <div>
        <Badge color="warning">Products</Badge>
        <Badge color="success">{this.props.currentCategory.categoryName}</Badge>
        <Table
>
  <thead>
    <tr>
      <th>
        #
      </th>
      <th>
        Product Name
      </th>
      <th>
        Unit Price
      </th>
      <th>
        Quantity Per Unit
      </th>
      <th>Units In Stock</th>
    </tr>
  </thead>
  <tbody>
    {this.props.products.map(product =>(
      <tr key={product.id}>
      <th scope="row">
        {product.id}
      </th>
      <td>
      {product.productName}
      </td>
      <td>
      {product.unitPrice}
      </td>
      <td>
      {product.quantityPerUnit}
      </td>
      <td>
      {product.unitsInStock}
      </td>
    </tr>

    ))}
    
    
  
  </tbody>
</Table>
        </div>
        
    )
  }
  
}
//productlist tarafında categorylistten gelen seçili kategoriyi kullanmak istersem bunu yazmam gerekir.
function mapStateToProps(state){

  return{
    currentCategory  : state.changeCategoryReducer,
    products:state.ProductListReducer//productListreducer'a bağla

    
  }
}
function mapDispatchToProps(dispatch){
  //aksiyona prop'lara bağlayacak
  return {
    action:{
      //bu component'in action'ları
      getProducts:bindActionCreators(productActions.getProducts,dispatch)
      
  




    }
  }

}
export default connect(mapStateToProps,mapDispatchToProps)(ProductList)
