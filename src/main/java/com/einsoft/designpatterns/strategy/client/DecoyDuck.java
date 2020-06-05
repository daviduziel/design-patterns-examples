package com.einsoft.designpatterns.strategy.client;

import com.einsoft.designpatterns.strategy.behavior.FlyBehavior;
import com.einsoft.designpatterns.strategy.behavior.QuackBehavior;
import com.einsoft.designpatterns.strategy.behavior.impl.FlyNoWay;
import com.einsoft.designpatterns.strategy.behavior.impl.MuteQuack;

public class DecoyDuck extends Duck {
	static FlyBehavior flyBehavior = new FlyNoWay();
	static QuackBehavior quackBehavior = new MuteQuack();

	public DecoyDuck() {
		super(flyBehavior, quackBehavior);
	}

}
