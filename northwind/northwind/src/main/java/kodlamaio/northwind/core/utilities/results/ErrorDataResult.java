package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	//Result için oluşturduğumuz Success ve Error'un aynısını veri olma durumu için
		//oluşturduğumuz DataResult içinde false olan ErrorDataResult oluşturduk.
	//Yani bir hata olması durumu için de SuccessDataResult gibi yazalım.
	//Böyle tüm kombinasyonları yazabiliriz.
	
	//işlem başarısız durumu
	
		//Bana data mesaj ve false ver.
		public ErrorDataResult(T data, String message) {
			super(data, false,message);
			// TODO Auto-generated constructor stub
		}
		
		//Buna farklı alternatiflerde yazılabilir. Mesela message olmasın sadece data ve success bilgisini döndürsün
		//Böylece constructor'ları da miras almış olduk.
		//Bana sadece data ver
		public ErrorDataResult(T data) {
			super(data,false);//Errorda kurumsal standartlar olarak frontend uygulaması bozulmaması için boş şablon gönderilebilir
			//veya null döndürülebilir. Yani her şey olabilir. O duruma göre değişir.
		}
		
		//data döndürmek istemeyebiliriz
		public ErrorDataResult(String message) {
			super(null,false,message);
			// TODO Auto-generated constructor stub
		}
		public ErrorDataResult() {
			super(null, false);
			// TODO Auto-generated constructor stub
		}
			

}
