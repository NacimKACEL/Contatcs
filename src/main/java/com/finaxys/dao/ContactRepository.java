package com.finaxys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finaxys.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
