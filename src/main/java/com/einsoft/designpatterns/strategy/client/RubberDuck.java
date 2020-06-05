package com.einsoft.designpatterns.strategy.client;

import com.einsoft.designpatterns.strategy.behavior.FlyBehavior;
import com.einsoft.designpatterns.strategy.behavior.QuackBehavior;
import com.einsoft.designpatterns.strategy.behavior.impl.FlyNoWay;
import com.einsoft.designpatterns.strategy.behavior.impl.Squeak;

public class RubberDuck extends Duck {
	static FlyBehavior flyBehavior = new FlyNoWay();
	static QuackBehavior quackBehavior = new Squeak();

	public RubberDuck() {
		super(flyBehavior, quackBehavior);
	}

}
