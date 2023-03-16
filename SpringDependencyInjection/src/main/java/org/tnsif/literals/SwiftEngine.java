package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	
	//DI using constructor
		public SwiftEngine(String company, double cost) {
			super();
			this.company = company;
			this.cost = cost;
		}
		
	//1. DI in the form of literals
	private String company;
	private double cost;
	
	public double cost() {
		return cost;
	}

	public String display() {
		return "Japan";
	}

	//Di using setters
	public void setCompany(String company) {
		this.company = company;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "origin of company: " +company+" "+fuel;
	}

	
	
	
	

}
