package com.finaxys.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finaxys.dao.ContactRepository;
import com.finaxys.entities.Contact;

@RestController
public class ContactRestService {
	
	@Autowired
	ContactRepository contactRepository;
	
	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	public List<Contact> getContacts() {
		return contactRepository.findAll();	
	}
}
