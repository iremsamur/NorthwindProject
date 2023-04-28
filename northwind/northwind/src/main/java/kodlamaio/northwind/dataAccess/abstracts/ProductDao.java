package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	//Bu jparepository'den miras alarak içine verilen veritabanı işlemleri yazacağım tablonun karşışılığı olan class adı yani class veri türünü ve bunun primary key'i olan ID veri türünü içine vererek yazarım.
	//Böylece bu primary key'e göre o classdan çalışmasını sağlar.Hangi tabloya hangi id veri tipi ile sorguların hazırlanacağını repository'e söylemiş oldum.
	

}
