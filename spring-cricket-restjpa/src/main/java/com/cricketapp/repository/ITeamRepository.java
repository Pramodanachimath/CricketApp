package com.cricketapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketapp.model.Team;
@Repository
public interface ITeamRepository extends JpaRepository<Team, Integer>{

	Team FindByPlayerName(String playerName);
}
