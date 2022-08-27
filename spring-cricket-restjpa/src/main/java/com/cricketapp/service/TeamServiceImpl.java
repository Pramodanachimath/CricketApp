package com.cricketapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketapp.model.Team;
import com.cricketapp.repository.ITeamRepository;
@Service
public class TeamServiceImpl implements ITeamService{

	@Autowired
	ITeamRepository iTeamRepository;
	
	
	@Override
	public Team addTeam(Team team) {
		return iTeamRepository.save(team);
	}

	@Override
	public void updateTeam(Team team) {
		 iTeamRepository.save(team);
		
	}

	@Override
	public void deleteTeam(int teamId) {

		iTeamRepository.deleteById(teamId);
	}

	@Override
	public Team getById(int teamId) {
		return iTeamRepository.findById(teamId).get();
	}

	@Override
	public List<Team> getAll() {
		return iTeamRepository.findAll();
	}

	@Override
	public Team getByPlayerName(String playerName) {
		return iTeamRepository.FindByPlayerName(playerName);
	}

}
