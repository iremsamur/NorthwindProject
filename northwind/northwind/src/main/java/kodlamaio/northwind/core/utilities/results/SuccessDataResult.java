package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {
	
	//Result için oluşturduğumuz Success ve Error'un aynısını veri olma durumu için
	//oluşturduğumuz DataResult içinde Success yani true olan versiyonu ve false olan ErrorDataResult oluşturduk.
		

	//Böyle tüm kombinasyonları yazabiliriz.
	//Bana data mesaj ve true ver.
	public SuccessDataResult(T data, String message) {
		super(data, true,message);
		// TODO Auto-generated constructor stub
	}
	
	//Buna farklı alternatiflerde yazılabilir. Mesela message olmasın sadece data ve success bilgisini döndürsün
	//Böylece constructor'ları da miras almış olduk.
	//Bana sadece data ver
	public SuccessDataResult(T data) {
		super(data,true);
	}
	
	//data döndürmek istemeyebiliriz
	public SuccessDataResult(String message) {
		super(null,true,message);
		// TODO Auto-generated constructor stub
	}
	public SuccessDataResult() {
		super(null, true);
		// TODO Auto-generated constructor stub
	}
	

}
