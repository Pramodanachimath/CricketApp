package com.cricketapp.service;

import java.util.List;

import com.cricketapp.model.Team;


public interface ITeamService {
	Team addTeam(Team team);
	void updateTeam(Team team);
	void deleteTeam(int teamId);
	Team getById(int teamId);
	List<Team> getAll();
	
	Team getByPlayerName(String playerName);

}
