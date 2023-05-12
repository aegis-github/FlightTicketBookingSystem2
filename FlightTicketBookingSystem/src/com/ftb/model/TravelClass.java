package com.ftb.model;

public class TravelClass {
	
	private String firstclass;
	private String businessclass;
	private String economyclass;
	
	public String getFirstClass() {
		return firstclass;
    }
    public void setFirstClass(String firstclass) {
		this.firstclass = firstclass;
    }
    public String getBusinessClass() {
		return businessclass;
    }
    public void setBusinessClass(String businessclass) {
		this.businessclass = businessclass;
    }
    public String getEconomyClass() {
		return economyclass;
    }
    public void setEconomyClass(String economyclass) {
		this.economyclass = economyclass;
    }
    public TravelClass(String firstclass, String businessclass, String economyclass)
	{
		this.firstclass = firstclass;
		this.businessclass = businessclass;
		this.economyclass = economyclass;
	}
}
