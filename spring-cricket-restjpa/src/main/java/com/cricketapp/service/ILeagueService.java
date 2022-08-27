package com.cricketapp.service;

import java.util.List;

import com.cricketapp.model.League;
import com.cricketapp.model.LeagueView;

public interface ILeagueService {

	League addLeague(League league);
	void updateLeague(League league);
	void deleteLeague(int leagueId);
	League getById(int leagueId);
	
	List<League> getAll();

	// retrieving from view
	List<LeagueView> getLeagueDetails();
	
	List<LeagueView> getDurationInMonths();
	
	// using named queries
	List<League> getLeagueByBoard(String boardname);

	// calling stored procedure
	Integer getLeagueCountry(String country);
}
