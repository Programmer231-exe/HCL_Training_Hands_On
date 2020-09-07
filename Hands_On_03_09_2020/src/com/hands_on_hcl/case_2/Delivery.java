package com.hands_on_hcl.case_2;

public class Delivery {
	private Long over;
	private Long ball;
	private Long runs;
	private String batsman;
	private String bowler;
	private String nonStriker;
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	
	public void displayDeliveryDetails() {
		System.out.println("\n\nDelivery Details:\n"+
				"Over : " + this.getOver() +
				"\nBall : " + this.getBall() +
				"\nRuns : " + this.getRuns() +
				"\nBatsman :" + this.getBatsman()+
				"\nBowler : " + this.getBowler() +
				"\nNonStriker : "+ this.getNonStriker());
	}
	
}
