import { combineReducers } from "redux";
import changeCategoryReducer from "./changeCategoryReducer"
import categoryListReducer from "./categoryListReducer"
import productListReducer from "./productListReducer"
const rootReducer = combineReducers({
    //combineReducers fonksiyonu içinde obje olarak reducer'larımı yazıyorum
    changeCategoryReducer,
    categoryListReducer,
    productListReducer
    //başka reducerlarda eklediğimizde , ile burada yazacağız
})

export default rootReducer;//root reducer'u diğer dosyalarda kullanabilmek için
