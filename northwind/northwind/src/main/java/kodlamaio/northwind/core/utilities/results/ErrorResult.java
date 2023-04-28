package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {
	//ürünleri getirmenin yani yapılan veritabanı işleminin başarılı olma durumu için
		//ErrorResult sınıfı oluşturdum.
		//Buda Result'dan miras alır.
		//Buda işlemin başarısız olma durumunu belirtir.
		//Bu kullanımın amacı true false dönmemesi yani işlem baaşrılı ise direk SuccessResult başarısız ise
		//ErrorResult dönsün dedik. Hatalara sebebiyet vermemesini sağlarız. 
	//Bu Results klasörü tüm projelerde kullanılır. Yani Core için uygun olan bir kere yaz her yerde kullan mantığıdır.
	//İşlem başarısız anlamına gelir.
	
		public ErrorResult() {
			super(false);
		}
		public ErrorResult(String message) {
			super(false,message);
		}

}
