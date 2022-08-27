package com.cricketapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cricketapp.model.Player;
import com.cricketapp.repository.IPlayerRepository;

public class PlayerServiceImpl implements IPlayerService {

	@Autowired
	IPlayerRepository playerRepository;
	
	@Override
	public Player addLeague(Player player) {
		return playerRepository.save(player);
	}

	@Override
	public void updateLeague(Player player) {
		playerRepository.save(player);
	}

	@Override
	public void deleteLeague(int playerId) {

		playerRepository.deleteById(playerId);
	}

	@Override
	public Player getById(int playerId) {
		return playerRepository.findById(playerId).get();
	}

	@Override
	public List<Player> getAll() {
		return playerRepository.findAll();
	}

	@Override
	public List<Player> getPlayerByTeam(String team) {
		return playerRepository.findPlayerByTeam(team);
	}

	@Override
	public Integer getPlayerByCity(String city) {
		return playerRepository.findByPlayerByCity(city);
	}

}
