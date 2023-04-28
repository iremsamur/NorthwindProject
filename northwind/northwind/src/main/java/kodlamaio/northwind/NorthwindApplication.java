package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//swagger importları
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.builders.PathSelectors;

@SpringBootApplication//Bizim başlangıç uygulamamızı başlatan kısımı ifade ediyor.
@EnableSwagger2//Swagger'ı başlatan annotasyon
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
		//Projemizin başlangıç dosyası burasıdır.
	}
	@Bean//Bean Java classıdır. Kodlarımızı test etmek için postman ya da web gibi uygulamalar yerine swagger kullaıyoruz. O yüzden dahil ettik
	//Bu şekilde dahil ediyoruz. Önce pom.xml içine gerekli dependency'leri ekledim. Şimdi entegre etmek için burayada aşağıdaki komutu eklerim.
	//Swagger bizim uygulamamız içindeki tüm api'leri bulur. Ve test edebileceğimiz bir noktaya taşımamızı sağlar
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())//Burası gelen istekleri kontrol edip, bu controller'ları buluyor. Ve içerisindeki operasyonları bizim için dökümante eder. Yani hızlıca test etmemizi sağlar.              
          .paths(PathSelectors.any())                          
          .build();                                           
    }

}
