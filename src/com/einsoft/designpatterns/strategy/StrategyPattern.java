package com.einsoft.designpatterns.strategy;

import com.einsoft.designpatterns.strategy.client.DecoyDuck;
import com.einsoft.designpatterns.strategy.client.MallardDuck;
import com.einsoft.designpatterns.strategy.client.RubberDuck;

public class StrategyPattern {
	public static void main(String args[]) {
		RubberDuck rubberDuck = new RubberDuck();
		System.out.println(rubberDuck.getClass());
		rubberDuck.performFly();
		rubberDuck.performQuack();
		MallardDuck mallardDuck = new MallardDuck();
		System.out.println(mallardDuck.getClass());
		mallardDuck.performFly();
		mallardDuck.performQuack();
		DecoyDuck decoyDuck = new DecoyDuck();
		System.out.println(decoyDuck.getClass());
		decoyDuck.performFly();
		decoyDuck.performQuack();
	}
}
