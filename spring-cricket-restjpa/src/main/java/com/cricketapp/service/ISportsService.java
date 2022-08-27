package com.cricketapp.service;

import java.util.List;

import com.cricketapp.model.Sports;
import com.cricketapp.model.SportsView;

public interface ISportsService {
	Sports addSports(Sports sports);
	Sports getById(int sportsId);
	List<Sports> getAll();
	
	// retrieving from view
	List<SportsView> getSportsDetails();
	
}
