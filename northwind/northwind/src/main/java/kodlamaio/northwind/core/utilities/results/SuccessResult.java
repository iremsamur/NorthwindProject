package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result{
	//ürünleri getirmenin yani yapılan veritabanı işleminin başarılı olma durumu için
	//SuccessResult sınıfı oluşturdum.
	//Buda Result'dan miras alır.
	//Bu işlemin başarılı olma durumunu belirtir.
	//Bu kullanımın amacı true false dönmemesi yani işlem baaşrılı ise direk SuccessResult başarısız ise
	//ErrorResult dönsün dedik. Hatalara sebebiyet vermemesini sağlarız. 
	public SuccessResult() {
		super(true);
	}
	public SuccessResult(String message) {
		super(true,message);
	}

}
