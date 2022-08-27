package com.cricketapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Player {

	private String playerName;
	@Id
	@GeneratedValue(generator = "player_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="player_gen",sequenceName="player_sequence",initialValue=100, allocationSize = 1)
	private Integer platyerId;
	private String city;
	private int age;
	private String playerImage;
	
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team;

	public Player() {
		super();
	}

	public Player(String playerName, String city, int age, String playerImage) {
		super();
		this.playerName = playerName;
		this.city = city;
		this.age = age;
		this.playerImage = playerImage;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getPlatyerId() {
		return platyerId;
	}

	public void setPlatyerId(Integer platyerId) {
		this.platyerId = platyerId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlayerImage() {
		return playerImage;
	}

	public void setPlayerImage(String playerImage) {
		this.playerImage = playerImage;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", city=" + city + ", age=" + age + ", playerImage=" + playerImage
				+ "]";
	}
	
	
	
}
