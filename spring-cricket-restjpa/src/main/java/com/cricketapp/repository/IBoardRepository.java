package com.cricketapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketapp.model.Board;
@Repository
public interface IBoardRepository extends JpaRepository<Board, Integer>{

	
	List<Board> findByMonthInDuration(int duration);
	List<Board> findByCountry(String country);
}
