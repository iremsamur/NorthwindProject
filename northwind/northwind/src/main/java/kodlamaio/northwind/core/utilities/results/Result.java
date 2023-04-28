package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean success;//işlemin başarılı olup olmadığının kontrolü
	private String message;//bilgilendirme mesajı
	//bunu tüm requestlerde kullanabiliriz
	//Ben bazen mesaj olmadan sadece boolean değer döndürebilirim. Bazen her ikisinide isteyebilirim. 
	//O yüzden iki constructor olur.
	public Result(boolean success) {
		
	}
	public Result(boolean success,String message) {
		this(success);
		this.message=message;
		
		
			
		}
	public boolean isSuccess() {
		return success;
	}
	
	public String getMessage() {
		return message;
	}
	
	/*
	 * Result ile yaptığımızın amacı ,
	 *  mesela Hepsiburada gibi bir sitede ürün listeleme ürün getirme gibi ürün ekleme gibi işlemlerde
	 *  Yani veritabanı işleminin başarılı olması ve başarısız olma olarak 2 durumu var
	 *  İşte bunun için true false olması yerine bu sınıftan miras alan Success ve Error Result sınıflarını
	 *  oluşturduk.
	 *  Result iki şekilde olabilir. Başarı ve başarısızlığı belirten bir mesaj verdirilebilir.
	 *  Mesaj olmadan sadece kontrolüde yapılabilir. O yüzden iki tür constructor oldu.
	 *  This() bu classdaki constructor'ı 
	 *  super ise miras veren class'daki constructor çalıştır demektir.
	 *  
	 *  Bu tarz işlemleri core katmanında yazarız. Bunlar bir kere yazılıp tüm projelerde kullanılabilen 
	 *  değişmeyen işlemlerdir. */

	

}
