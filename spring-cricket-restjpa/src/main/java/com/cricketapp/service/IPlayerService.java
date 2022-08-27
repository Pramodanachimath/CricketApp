package com.cricketapp.service;

import java.util.List;

import com.cricketapp.model.Player;

public interface IPlayerService {

	Player addLeague(Player player);
	void updateLeague(Player player);
	void deleteLeague(int playerId);
	Player getById(int playerId);
	List<Player> getAll();

	
	
	
	List<Player> getPlayerByTeam(String team);

	Integer getPlayerByCity(String city);
}
