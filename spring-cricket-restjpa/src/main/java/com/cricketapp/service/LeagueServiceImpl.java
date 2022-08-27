package com.cricketapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketapp.model.League;
import com.cricketapp.model.LeagueView;
import com.cricketapp.repository.ILeagueRepository;
@Service
public class LeagueServiceImpl implements ILeagueService {

	@Autowired
	ILeagueRepository iLeagueRepository;
	
	@Override
	public League addLeague(League league) {
		return iLeagueRepository.save(league);
	}

	@Override
	public void updateLeague(League league) {
		 iLeagueRepository.save(league);

	}

	@Override
	public void deleteLeague(int leagueId) {

		iLeagueRepository.deleteById(leagueId);
	}

	@Override
	public League getById(int leagueId) {
		return iLeagueRepository.findById(leagueId).get();
	}

	@Override
	public List<League> getAll() {
		return iLeagueRepository.findAll();
	}

	@Override
	public List<LeagueView> getLeagueDetails() {
		return iLeagueRepository.findByLeagueDetails();
	}

	@Override
	public List<League> getLeagueByBoard(String boardname) {
		return iLeagueRepository.findByLeagueByBoard(boardname);
	}

	@Override
	public Integer getLeagueCountry(String country) {
		return iLeagueRepository.findByLeagueCountuntry(country);
	}

	@Override
	public List<LeagueView> getDurationInMonths() {
		return iLeagueRepository.findByDurationInMonths();
	}

}
