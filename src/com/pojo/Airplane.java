package com.pojo;

public class Airplane {

	private int id;
	private String airNo;
	private int time;
	private double price;
	private Airport takeport;
	private Airport landport;
	
	public Airplane() {
		super();
	}
	
	public Airplane(int id, String airNo, int time, double price, Airport takeport, Airport landport) {
		super();
		this.id = id;
		this.airNo = airNo;
		this.time = time;
		this.price = price;
		this.takeport = takeport;
		this.landport = landport;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirNo() {
		return airNo;
	}
	public void setAirNo(String airNo) {
		this.airNo = airNo;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Airport getTakeport() {
		return takeport;
	}
	public void setTakeport(Airport takeport) {
		this.takeport = takeport;
	}
	public Airport getLandport() {
		return landport;
	}
	public void setLandport(Airport landport) {
		this.landport = landport;
	}

	@Override
	public String toString() {
		return "AirPlane [id=" + id + ", airNo=" + airNo + ", time=" + time + ", price=" + price + ", takeport="
				+ takeport + ", landport=" + landport + "]";
	}
	
}
