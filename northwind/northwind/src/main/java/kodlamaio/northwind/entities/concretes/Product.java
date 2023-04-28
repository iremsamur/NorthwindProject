package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//@Data kullanımı lombok kullanmamızı sağlar. getter-setter oluşturur.
@Entity//Bu class'ın neye karşılık geldiğini Entity ile veririz. Spring framework bir class'ın hangi katmana karşılık geldiğini bu şekilde annotasyon yöntemi ile sorar.
//Annotasyon bir metodun , class'ın çalışma anında onunla ilgili bilgi toplama yapmak için kullanılan yapıdır. C#'da attribute'dur. Burada entity olur.Bu @Entity kullanımı ile product bir entity'dir diyoruz.Entity demek sen bir veritabanı nesnesisin demektir.
@Table(name="products")//Bu komutla bu sınıfın veritabanında products tablosuna karşılık geldiğini söylüyoruz.
//@AllArgsConstructor lomboktan gelen argümanlı constructor'ları oluşturması için anotasyon
//@NoArgsConstructor lomboktan gelen argümansız constructor'ları oluşturması için anotasyon
public class Product {

	//Veritabanındaki products tablomuzun karşılığını sınıf olarak burada yazdık.
	@Id//işlemlerini primary key yani id'ye göre yaptığı için bu şekilde ID olan özelliğin üstüne ID annotasyonunu veriyoruz.Hibernate'e bunu bildirmek için
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id'nin otomatik artan olduğunu da generatedvalue annotasyonu ile veririz.Identity özelliğini vermemiz gerekir.
	@Column(name="product_id")//Burada ise tanımlanan değişkenin veritabanı tablosunda hangi isimli sütuna karşılık geldiğini yazıyoruz.Tüm özellikler için bu annotasyonları yazarız.
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	//argümansız constructorda lombok ekleyebilir.
	public Product() {}
	//Bu argümanlı constructorıda lombok ekleyebilir.
	public Product(int id, int categoryId, String productName, double unitPrice, short unitInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	//Eğer lombok olsaydı bu getter- setter'ları silerdik. İhtiyacımız yoktu. Lombok kendi getter-setter'ları oluşturuldu. Bu projemizin daha temiz olmasını sağlar.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public short getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(short unitInStock) {
		this.unitInStock = unitInStock;
	}
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	
	
}
