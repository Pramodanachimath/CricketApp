package com.cricketapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketapp.model.Fixtures;
import com.cricketapp.repository.IFixtureRepository;
@Service
public class FixturesServiceImpl implements IFixturesService{

	@Autowired
	IFixtureRepository iFixtureRepository;
	
	
	@Override
	public Fixtures addFixtures(Fixtures fixtures) {
		return iFixtureRepository.save(fixtures);
	}

	@Override
	public void updateFixtures(Fixtures fixtures) {
		iFixtureRepository.save(fixtures);
		
	}

	@Override
	public void deleteFixtures(int fixtureId) {

		iFixtureRepository.deleteById(fixtureId);
	}

	@Override
	public Fixtures getById(int fixtureId) {
		return iFixtureRepository.findById(fixtureId).get();
	}

	@Override
	public List<Fixtures> getAll() {
		return iFixtureRepository.findAll();
	}

	@Override
	public List<Fixtures> getFixturesByLeague(String name) {
		return null;
	}

	@Override
	public List<Fixtures> getFixturesByTeamName(String teamName) {
		return null;
	}

	
}
