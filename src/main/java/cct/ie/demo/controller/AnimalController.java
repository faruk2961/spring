package cct.ie.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cct.ie.demo.dao.AnimalRepo;

import cct.ie.demo.model.Animals;

@RestController
public class AnimalController 
{
	@Autowired
	AnimalRepo repo;
	@RequestMapping("/")
	public String home()
	{
		return "/home.jsp";
	}
	
	@PostMapping("/animal")
	public Animals addAnimal(Animals animal)
	{
		repo.save(animal);
		return animal;
	}
	
	@GetMapping("/animal")

	public List<Animals>  getAliens() 
	{
		return repo.findAll();
		
	
	}
	@RequestMapping("/animal/{aid}")
	//@ResponseBody //for returning data
	public Optional<Animals> getAnimal(@PathVariable("aid") int aid) 
	{
		return repo.findById(aid);
		
	}
	
	

}

