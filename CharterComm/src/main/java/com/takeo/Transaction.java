package com.takeo;

import lombok.Data;

@Data
public class Transaction {
private double amount;

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public Transaction(String name, double amount) {
	super();
	this.amount = amount;
}

public Transaction(double amount) {
	super();
	this.amount = amount;
}

}
