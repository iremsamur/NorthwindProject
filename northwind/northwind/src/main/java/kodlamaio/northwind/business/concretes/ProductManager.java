package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
@Service//Bu class projede servis görevi görecek diye annotasyonla bilgi veriyoruz.Yani business görevini burası görecek
public class ProductManager implements ProductService {

	private ProductDao productDao;//DataAccess katmanındaki productDao'yu sınıftan bağımsız referans ile kullanmak için constructor injection yaptım.
	
	@Autowired//Bu annotasyon ile arka planda dependecy injection fabrika tasarım desenini çalıştırıır.
	//bunun ile spring projede buna karşılık gelebilecek productDao'nun sınıfını üretip veriyor.Ama bu projede tek bir instance oluşturduğu için bağımlılık oluşturur.
	//yani projeyi tarayıp, bu interface'e karşılık gelen sınıfı verir.Başka interface'lerde olur diye injection topluca olması için constructor üstüne yazılır.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {//Bu şekilde bunu da DataREsult'a göre değiştirdim.
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
				//Tüm dataları bizim için getirecek. data olarak this.productDao.findAll() verdik
		//ve mesajını yazdık. Bu şekilde başarı durumunu kontrol ediyor.
		//Hata durumu için Global hata yönetimi yapılır. Aspect oriented adı verilir. Şuan başarılı olarak aldık.
	
		//SuccessResult'ın base class'ı DataREsult olduğu için sorun olmadan döndürebilirim
	}

	//ekleme işlemi
	@Override
	public Result add(Product product) {
		// TODO Auto-generated method stub
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi.");//Data olmadığı için SuccessResult döndürürüm. İşlemin başarılı olduğuna dair
		//Veri listeleme olsaydı SuccessDataResult kullanırdım. metodun tipide
		//kendisinden miras alan DataResult olurdu.
	}

}
