package com.cricketapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketapp.model.League;
import com.cricketapp.model.LeagueView;
@Repository
public interface ILeagueRepository extends JpaRepository<League, Integer>{

	 List<LeagueView> findByLeagueDetails();
	
	 List<League> findByLeagueByBoard(String boardname);

	 Integer findByLeagueCountuntry(String country);
	
	 List<LeagueView> findByDurationInMonths();
		
}
