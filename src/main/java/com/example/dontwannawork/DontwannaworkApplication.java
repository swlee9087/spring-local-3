package com.example.dontwannawork;

import com.example.dontwannawork.user.entity.User;
import com.example.dontwannawork.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DontwannaworkApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DontwannaworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("a","hong","A@","1"));
		userRepository.save(new User("b","long","B@","1"));
		userRepository.save(new User("c","kong","C@","1"));
		userRepository.save(new User("d","bong","D@","1"));
		List<User> users=userRepository.findAll();
		System.out.println("print all");
		for(User u: users){
			System.out.println(u.toString());
		}
		System.out.println("print hong only");
		for(User u: userRepository.findAllByName("hong")){
			System.out.println(u.toString());
		}
	}
}
