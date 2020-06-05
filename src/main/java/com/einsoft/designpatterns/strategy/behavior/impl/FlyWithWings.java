package com.einsoft.designpatterns.strategy.behavior.impl;

import com.einsoft.designpatterns.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public String fly() {
		return "Moving wings >> Flyyyyyyy";
	}

}
