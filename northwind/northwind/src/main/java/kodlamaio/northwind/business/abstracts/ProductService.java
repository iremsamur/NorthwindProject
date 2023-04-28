package kodlamaio.northwind.business.abstracts;

import java.util.*;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {

	//verileri listeleme metodu
	//List<Product> getAll();
	//Burada direk List Product döndürüyorum. Ama işlemin başarılı mı başarısız mı olduğunu bilmiyorum. 
	//İşte bunun için Bunun yerine DataResult döndürürüm.
	DataResult<List<Product>> getAll();
	Result add(Product product);//Bunun türü Result olmalı.
	//Veri listeleme olsaydı SuccessDataResult kullanırdım. metodun tipide
			//kendisinden miras alan DataResult olurdu.
}
