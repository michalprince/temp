package bhupen.in.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
		System.Out.Println("Welcome");
    }
	
	public String getName(String name){
		return "My name is ghghg" + name;
	

}
