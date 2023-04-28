//kullanacağım operasyonları tanımlıyorum
export const CHANGE_CATEGORY="CHANGE_CATEGORY"//kategori seçilmesi- seçilen kategori bilgilerini alma operasyonu
//kategorilerin listelenmesi işlemi için kategori verilerini tutacağım
//CHANGE_CATEGORY metod kategori seçildiğinde hangi kategorinin seçildiğini bana verecek method
//Bunu redux tarafında da yazabilirim. Veya componenttede çağırabilirim. Hangisinin daha uygun olacağını şuna göre seçeriz
//O data sadece o componenttemi kullanılacak yoksa o datayı birden fazla componette kullanmamız gerekecek mi
//bu sorunun cevabına göre kategorilerin listelenmesi yani kategori verisi sadece bana
//kategori componetti içinde lazım olmayacak aynı zamanda ben yeni ürün ekleme yaparken ürünün kategorisini
//seçerkende ürünleri getireceğim yani farklı componentlerde ürün listelenmesi kullanacağım için
//onu component tarafında değil reduxta tutarım. Yani aksiyonu burada tanımlıyorum
export const GET_CATEGORIES_SUCCESS="GET_CATEGORIES_SUCCESS"//apiye bağlandığımda oluşacak veri açıklarını
//çözmek için redux thunk kullanacağım. Bunun gibi veritabanı işlemlerinde bu tarz yapılar olur.
// oyüzden success'li isim verdim.
//GET_CATEGORIES_SUCCESS method ise kategorileri listeleyecek metod.


//ürünlerin listelenmesi için action
export const GET_PRODUCTS_SUCCESS="GET_PRODUCTS_SUCCESS"



