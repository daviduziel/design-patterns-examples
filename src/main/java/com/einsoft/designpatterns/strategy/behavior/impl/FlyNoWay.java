package com.einsoft.designpatterns.strategy.behavior.impl;

import com.einsoft.designpatterns.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public String fly() {
		return "-";
	}

}
