package com.cricketapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketapp.model.Player;
@Repository
public interface IPlayerRepository extends JpaRepository<Player, Integer>{

	List<Player> findPlayerByTeam(Player player);
	Integer findByPlayerByCity(Player player);
}
