//Redux'ı store'u bir depo olarak düşünüyoruz. Bu depoda aksiyonlarımızı ve reducer'larımızı tutuyoruz
//store'u oluşturalım
import { applyMiddleware, createStore } from "redux";
import rootReducer from './index';
import thunk from "redux-thunk";

export default function configureStore(){
    return createStore(rootReducer,applyMiddleware(thunk))//redux thunk'ı burada devreye alıyoruz. 
    //store oluşturacak fonksiyonu da yazdık
}