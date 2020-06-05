package com.einsoft.designpatterns.strategy.behavior.impl;

import com.einsoft.designpatterns.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public String quack() {
		return "Squeeeeaaaaaakkkk";
	}

}
