package com.takeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Autowired
	UserTransactionService service;

	@RequestMapping("/calculate")
	public double calculateReward() {
		return service.rewardCalculator();
	}

}
