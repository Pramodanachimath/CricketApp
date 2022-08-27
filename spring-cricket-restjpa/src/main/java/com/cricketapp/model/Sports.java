package com.cricketapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Sports {

  @Column(length = 20)
  private String sportsName;
  @Id
  @GeneratedValue(generator="sports_gen",strategy=GenerationType.AUTO)
  @SequenceGenerator(name="sports_gen",sequenceName="sports_sequence",initialValue=150,allocationSize=1)
  private Integer sportsId;
  @Column(length = 20)
  private String origin;
  @Column(length = 20)
  private String sportsImage;
  
  @OneToMany(mappedBy = "sports")
  private  Set<League> league;

public Sports() {
	super();
}

public Sports(String sportsName, String origin, String sportsImage) {
	super();
	this.sportsName = sportsName;
	this.origin = origin;
	this.sportsImage = sportsImage;
}

public String getSportsName() {
	return sportsName;
}

public void setSportsName(String sportsName) {
	this.sportsName = sportsName;
}

public Integer getSportsId() {
	return sportsId;
}

public void setSportsId(Integer sportsId) {
	this.sportsId = sportsId;
}

public String getOrigin() {
	return origin;
}

public void setOrigin(String origin) {
	this.origin = origin;
}

public String getSportsImage() {
	return sportsImage;
}

public void setSportsImage(String sportsImage) {
	this.sportsImage = sportsImage;
}

public Set<League> getLeague() {
	return league;
}

public void setLeague(Set<League> league) {
	this.league = league;
}

@Override
public String toString() {
	return "Sports [sportsName=" + sportsName + ", origin=" + origin + ", sportsImage=" + sportsImage + "]";
}
  
  
  
  
}
