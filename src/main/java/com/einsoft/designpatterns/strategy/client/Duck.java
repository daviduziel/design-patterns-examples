package com.einsoft.designpatterns.strategy.client;

import com.einsoft.designpatterns.strategy.behavior.FlyBehavior;
import com.einsoft.designpatterns.strategy.behavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public String performFly() {
		return this.flyBehavior.fly();
	}

	public String performQuack() {
		return this.quackBehavior.quack();
	}
}
