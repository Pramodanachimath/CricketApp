package com.cricketapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricketapp.model.Fixtures;
@Repository
public interface IFixtureRepository extends JpaRepository<Fixtures, Integer>{

}
