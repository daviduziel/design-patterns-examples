package com.einsoft.designpatterns.strategy.client;

import com.einsoft.designpatterns.strategy.behavior.FlyBehavior;
import com.einsoft.designpatterns.strategy.behavior.QuackBehavior;
import com.einsoft.designpatterns.strategy.behavior.impl.FlyWithWings;
import com.einsoft.designpatterns.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {
	static FlyBehavior flyBehavior = new FlyWithWings();
	static QuackBehavior quackBehavior = new Quack();


	public MallardDuck() {
		super(flyBehavior, quackBehavior);
	}

}
