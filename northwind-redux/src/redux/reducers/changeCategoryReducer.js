import * as actionTypes from '../actions/actionTypes'//action types içindeki tüm aksiyonları getirmesi için * ile yazdık
import initialState from './initialState';
//şimdi asıl işlevi gerçekleştirecek olan action klasörü içinde tanımladığım payload verdiğim aksiyonların
//işlevlerini burada yazacağız
export default function changeCategoryReducer(state=initialState.currentCategory,action){
    //state değerini burada parantez içinde de verebilirim. Ama daha merkezi yönetebilmek adına initialState dosyasında
    //tanımlayıp burada çağırıyorum
    //bu fonksiyon  categoryActions içinde bu metodu tanımlarken verdiğimiz gibi iki parametre alır
    //1. aksiyon adı
    //2. gönderilen state
     /*Şimdi artık asıl işlevi yapacak yani seçilen kategori bilgisini tutacak işlevi metodun içine yazalım. */
     switch (action.type) {//gelen action'un type'ı için
         case actionTypes.CHANGE_CATEGORY://type change category ise
             
             return action.payload//action dan gelen payloadu döndür. yani o aksiyonun aldığı parametre yani seçilen kategoriyi
             //getirir.//Yani return edilen bizim state'imiz 
             //Yani reducer bizim için bir tutucu state döndürüyor. Ve isteyen herkes bu tutucuya
             // abone olup bu reducerun state'ini
             // kullanabiliyor.
     
         default:
             return state;//eğer bir aksiyon gönderilmemişse gönderilen state'i getir diyoruz
             //Yani initial state'i olduğu gibi return ederiz
     }
}