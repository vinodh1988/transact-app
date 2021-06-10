package com.transact.transactapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transact.transactapp.entity.Person;

public interface PersonDAO extends JpaRepository<Person,Long>{

}
