package kodlamaio.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

import java.util.*;

@RestController//Sınıfa annotasyonla controller olduğunu bildiriyoruz.
//Bu restcontroller aynı zamanda java dışındaki başka dillerin de javayı tanımasını sağlar
@RequestMapping("/api/products")//Farklı birden fazla controller olabilir. Bize adres üzerinden istek gelirse karşılaması için bu controller'ın isteği karşılamasını ve karar vermesini sağlamak için kullanılırız.
//Yani bize /api/products diye bir istek web sitesinden gelirse bu controller karşılayıp gerekeni yapsın diyoruz.
public class ProductsController {
	//controller isimlendirme kuralı çoğul olur. O yüzden Products verdik.
	//Angular, mobil gibi farklı teknolojilerin birbiriyle anlaşabilmesi için controller kullanırız.
	//Yani controller dış dünyadan sistemimizle iletişim kurulmasını sağlar.
	//bana veri ver veriyi değiştir gibi istekler vardır. Bunlara http istekleri/request'leri denir.
	//Veri istenildiğinde get request olur.
	private ProductService productService ;
	@Autowired//Bu projede tarayıp kim  ProductService'i implemente etmiş bulur. Ve ProductManager sınıfını getirir. Ve sınıf bağımlığı olmadan bu sınıfı implemente eden class'tan kullanabilmemizi sağlar.
	//Böylece o arka planda new'leme yapar. Ve bizim yapmamıza gerek kalmaz. Bu olaya IOC denir.Birden fazla soyut sınıf olduğunda başka yöntemler kullanılır. Autowired işe yaramaz
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@GetMapping("/getall")//Get request için getmapping kullanılır. Yani veri listeleyecek methodların üstünde getmapping annotasyonu yazılır.
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();//Sınıfı implement eden interface'i kullanarak sınıf tanımlamaya gerek kalmadan sınıf içindeki metodu burada kullanabildik. Bunu constructor injection ile yaptık.
		
	}
	//ekleme işlemini yazalım.
	@PostMapping("/add")//Bu ekleme işlemi olduğu için yani veri istemediğimiz için PostMapping olur.
	//requestide add olsun dedik.
	public Result add(@RequestBody Product product) {//Bu tür post işlemlerinde gelen request'in bir body'si var diyoruz
		//Bu tür post işlemlerinde parametrenin yanına böyle vermemiz gerekir. Bu istek yapmamızı sağlar. Ve girdiğimiz parametreleri bir json datasına döndürüp gönderir.
		//Yani Request Body benim gönderdiğim alanları Products içinde arıyor. Ve değerleri eşleştirip gönderiyor
		return this.productService.add(product);
		
	}

}
