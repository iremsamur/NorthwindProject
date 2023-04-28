import React from 'react';
//import ReactDOM from 'react-dom/client';
import ReactDOM from 'react-dom/client';

import App from './components/root/App';
import reportWebVitals from './reportWebVitals';
import 'bootstrap/dist/css/bootstrap.min.css';

import configureStore from './redux/reducers/configureStore';//configureStore'u çağırıyoruz.
import {Provider} from 'react-redux';//provider'ı da yine import ediyorum.

const store = configureStore();//configureStore'u değişkene atadım.

ReactDOM.render(
  <Provider store={store}>
    <App />

  </Provider>
  ,
  document.getElementById('root')
);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
