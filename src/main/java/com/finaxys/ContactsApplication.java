package com.finaxys;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.finaxys.dao.ContactRepository;
import com.finaxys.entities.Contact;

@SpringBootApplication
public class ContactsApplication implements CommandLineRunner {
	
	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		contactRepository.save(new Contact("KACEL", "Nacim", df.parse("20/11/1999"), "nacim.kacel@finaxys.com", "0033152785943", "nacim.png"));
		contactRepository.save(new Contact("Steve", "Jobs", df.parse("20/11/1989"), "steve.jobs@finaxys.com", "0033452785943", "steve.png"));
		contactRepository.save(new Contact("thibault", "essertel", df.parse("20/11/1991"), "t.essertel@finaxys.com", "0033152785943", "thibault.png"));
		contactRepository.save(new Contact("audric", "leMaitre", df.parse("20/11/1949"), "a.lemAitre@finaxys.com", "0033152785943", "audrci.png"));
		
		contactRepository.findAll().forEach(c->{ System.out.println(c.getNom());
		});
		
	}
}
