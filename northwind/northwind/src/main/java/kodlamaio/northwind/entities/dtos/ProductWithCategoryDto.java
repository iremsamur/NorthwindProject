package kodlamaio.northwind.entities.dtos;

//@Data
//AllArgsConstructor
//NoArgsConstructor

public class ProductWithCategoryDto {

	//ProductWithCategoryDto bir isimlendirme şeklidir.
	//Dto- Data Transformation Object - Transfer edilen obje demektir. 
	//Bu tek tabloyla çalışıldığı zamanda kullanılabilir. İlişkili tablolarda da kullanılabilir.
	//Product ve Category ilişkili tabloları için class oluşturdum. Ve sınıfta ilişkili tablolardan çekmek istediğim
	//özellikleri- field'ları yazdım.
	private int id;
	private String productName;
	private String categoryName;
	//8 'de kaldım.
	
}
