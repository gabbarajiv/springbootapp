package com.takeo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserTransactionService {

	private List<Transaction> transactions;

	public UserTransactionService() {
		transactions = new ArrayList<>();

		transactions.add(new Transaction(120));
//		transactions.add(new Transaction(120));
//		transactions.add(new Transaction(120));
//		transactions.add(new Transaction(120));
//		transactions.add(new Transaction(120));
	}

	public double rewardCalculator() {
		double totalreward = 0;
		for (Transaction tx : transactions) {
			if (tx.getAmount() > 100)
				totalreward += 50 + 2 * (tx.getAmount() - 100);
			else if (tx.getAmount() > 50)
				totalreward += (tx.getAmount() - 50);
			else
				totalreward = 0;
		}
		return totalreward;
	}

}
