package com;

import java.util.List;

public class Mobile {
private String brand;
private int cost;
private List<String> apps;

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public List<String> getApps() {
	return apps;
}
public void setApps(List<String> apps) {
	this.apps = apps;
}

}
