package inhatc.cse.first_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {}

record Address(String dong, String gu) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Kim Ki Tae";
    }
    
    @Bean
    public int age(){
        return 15;
    }
    
    @Bean
    public Person person() {
    	var person = new Person("Kim Ki Tae", 20, new Address("사당동", "동작구"));
    	return person;
    }
    
    @Bean
    public Person person2MethodCall() {
    	return new Person(name(), age(), address2());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {  // name, age, address
    	return new Person(name, age, address3);
    }

    @Bean(name="address2")
    public Address address2() {
    	return new Address("구월동 롯데캐슬 ", "남동구");
    }
    @Bean(name="address3")
    public Address address3() {
    	return new Address("학익동 ", "미추홀구");
    }
}
