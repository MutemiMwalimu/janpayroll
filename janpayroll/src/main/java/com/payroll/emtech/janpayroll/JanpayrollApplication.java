package com.payroll.emtech.janpayroll;

import com.payroll.emtech.janpayroll.model.Elps;
import com.payroll.emtech.janpayroll.repository.ElpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  JanpayrollApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JanpayrollApplication.class, args);
	}

	@Autowired
	private ElpsRepository ElpsRepository;

	@Override
	public void run(String... args) throws Exception {
		Elps elps = new Elps();
		elps.setFirstName("Mutemi");
		elps.setSecondName("Mwalimu");
		elps.setLastName("Lewis");
		elps.setEmailId("teshlemwa@gmail.com");
		ElpsRepository.save(elps);

		Elps elps1 = new Elps();
		elps1.setFirstName("Ben");
		elps1.setSecondName("Musili");
		elps1.setLastName("Kalonzo");
		elps1.setEmailId("bentech@gmail.com");
		ElpsRepository.save(elps1);

	}
}
