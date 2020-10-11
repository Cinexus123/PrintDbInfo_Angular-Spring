package com.workersList.workerslist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.workersList.workerslist.model.User;
import com.workersList.workerslist.repository.UserRepository;

@SpringBootApplication
public class WorkersListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WorkersListApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Marcin", "Nielac", "marcin@wp.pl"));
		this.userRepository.save(new User("Tomek", "Domek", "tomek@wp.pl"));
		this.userRepository.save(new User("Adam", "Cwaniak", "adam@wp.pl"));
		
	}

}
