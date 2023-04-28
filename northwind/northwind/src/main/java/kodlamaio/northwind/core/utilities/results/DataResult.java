package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
	//Bu result'ın DataResult'lı kısımıda olabilir.
		//Yani şu veriyi bana getir diyebilir.

	private T data;
	
	public DataResult(T data,boolean success, String message) {
		super(success, message);//Bu super base yani miras aldığım sınıfın özelliklerini çalıştırmamızı sağlar.
		//this(success) olsasydı içinde bulunduğumuz sınıfın özelliklerini çalıştırmış olurduk.
		// Burada mesajın yanında veriler yani data döndürmem gerekiyor.
		//Bu veri çalışan olabilir,ürün olabilir. Yani farklı türden tablolar olabilir.
		//Bu yüzden generic olmalı. Yani generic class kullanırız. Bu yüzden T ekledim.
		//datayıda ekleyelim
		this.data=data;
	}
	//mesaj verdirmek istemediğim durum için constructor
	//Sadece işlemin başarılı olup olmadığının kontrolü olabilir.
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
		
	}
	//datayıda okuyalım.
	public T getData() {
		return data;
	}
	
	
	

}
