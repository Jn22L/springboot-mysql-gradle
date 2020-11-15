package myBoardg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyBoardgApplication {
	
    @RequestMapping("/")
    String home() {        
        return "Hello World! 그래들!";
    }

	public static void main(String[] args) {
		SpringApplication.run(MyBoardgApplication.class, args);
	}

}
