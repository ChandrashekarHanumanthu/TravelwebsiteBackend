package com.example.travelagency.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.travelagency.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
