package com.cricketapp.service;

import java.util.List;

import com.cricketapp.model.Fixtures;

public interface IFixturesService {

	Fixtures addFixtures(Fixtures fixtures);
	void updateFixtures(Fixtures fixtures);
	void deleteFixtures(int fixtureId);
	Fixtures getById(int fixtureId);
	List<Fixtures> getAll();

	List<Fixtures> getFixturesByLeague(String name);
	List<Fixtures> getFixturesByTeamName(String teamName);
}
