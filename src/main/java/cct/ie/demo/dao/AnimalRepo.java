package cct.ie.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import cct.ie.demo.model.Animals;

public interface AnimalRepo extends JpaRepository<Animals, Integer>{
	

}
