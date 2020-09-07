package com.hands_on_hcl.case_8;

public class Wicket {
	
	private long over;
	private long ball;
	private String wickerType;
	private String playerName;
	private String bowlerName;
	
	public Wicket(){
		
	}
	
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public String getWickerType() {
		return wickerType;
	}
	public void setWickerType(String wickerType) {
		this.wickerType = wickerType;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	public Wicket(long over, long ball, String wickerType, String playerName, String bowlerName) {
		super();
		this.over = over;
		this.ball = ball;
		this.wickerType = wickerType;
		this.playerName = playerName;
		this.bowlerName = bowlerName;
	}
	
	public void displayWicketDetails() {
		System.out.println("" +
				"\nOver : " + this.getOver() +
				"\nBall : " + this.getBall() +
				"\nWicket Type : " + this.getWickerType() + 
				"\nPlayer Name : " + this.getPlayerName() +
				"\nBowler Name : " + this.getBowlerName()
				);
	}
	
		

}
