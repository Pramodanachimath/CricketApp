package com.cricketapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketapp.model.Fixtures;
import com.cricketapp.service.IFixturesService;


@RestController
@RequestMapping("ics-league-api")
@CrossOrigin("http://localhost:4200")
public class FixturesController {
	
	@Autowired
	IFixturesService fixturesService;
	
	@GetMapping("/fixtures")
	public List<Fixtures> getAll(){
		return fixturesService.getAll();
	}
	@GetMapping("/fixtures/{fixtureId}")
	public Fixtures getById(@PathVariable("fixtureId")int fixtureId){
		return fixturesService.getById(fixtureId);
	}

}
