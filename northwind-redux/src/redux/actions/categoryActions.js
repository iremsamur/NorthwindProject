//action typeları import edelim
import * as actionTypes from './actionTypes';
//actionTypes içinde tanımladığım change category action'unu burada payload ve actiontype'ını vererek yazıyoruz
export function changeCategory(category){
    debugger;
    //kategoriye tıklandığında çalışacak event
    return {type:actionTypes.CHANGE_CATEGORY,payload:category}
    //bunun anlamı reducerda bu changecategory action'unu görünce state'i payloadda verilen category olarak set edecek

}
export function getCategoriesSuccess(categories){

    return {type:actionTypes.GET_CATEGORIES_SUCCESS,payload:categories}
    //type'lardan getcategoriessuccess olursa gelen categories payload'unu döndürecek
    //Yani reducer'a sen bu action'na göre bu yeni payload'u al demiş oluyoruz
}
//kategorileri listelemeyi yazalım.
export function getCategories(){
    return function(dispatch){
        //bu bir fonksiyon döndürüyor ve içine dispatch parametresini alıyor.
        let url = "http://localhost:3000/categories" //buraya apimizin url'ini veriyoruz.
        //burada json server için url
        return fetch(url).then(response =>response.json())//gelen bir response olacak
        //bu gelen response'u json'a çevir. Gelen response'u sistem her zaman json olarak algılar
        //o  yüzden json'a çeviriyoruz Yani görüntüsü json ama tipi string geldiği için çeviriyoruz
        .then(result=>dispatch(getCategoriesSuccess(result)))//bunun aldığı result üstteki response ile aynı değil. üstteki then'in ortaya çıkarttığı
        //sonuç yeni bir response'dur yani result'dur
        //Yani her then bir önceki then'in çıkarttığı sonuç ile ilgilidir.
        //dispatch yakalar içine yazacağımız getCategoriesSuccess metodunu alır. 
        //Bu metod içine result parametresi alır.


    }
}