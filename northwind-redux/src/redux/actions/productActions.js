//action typeları import edelim
import * as actionTypes from './actionTypes';
export function getProductsSuccess(products){

    return {type:actionTypes.GET_PRODUCTS_SUCCESS,payload:products}
    //categoryAction'da olduğu gibi yazıyorum
}
//kategorileri listelemeyi yazalım.
export function getProducts(categoryId){
    return function(dispatch){
        
        let url = "http://localhost:3000/products" 
        if(categoryId){
            //eğer kullanıcı bir kategori id gönderirse
            url = url+ "?categoryId"+categoryId;//apiden o gönderilen id'li kategoriye ait verileri getirmesi için özelliği bu
        }
        return fetch(url).then(response =>response.json())
        .then(result=>dispatch(getProductsSuccess(result)))
      


    }
}