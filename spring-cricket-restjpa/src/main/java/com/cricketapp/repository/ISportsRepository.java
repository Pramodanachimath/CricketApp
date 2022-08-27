package com.cricketapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketapp.model.Sports;
import com.cricketapp.model.SportsView;
@Repository
public interface ISportsRepository extends JpaRepository<Sports, Integer>{

	 List<SportsView> findBySportsDetails();
}
