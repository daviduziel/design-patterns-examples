package com.einsoft.designpatterns.strategy;

import com.einsoft.designpatterns.strategy.client.Duck;
import com.einsoft.designpatterns.strategy.client.MallardDuck;
import com.einsoft.designpatterns.strategy.client.RubberDuck;
import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class StrategyPatternTest {

    @Test
    public void performFly_rubberDuck_itCantFly(){
        Duck duck = new RubberDuck();
        assertThat(duck.performFly()).isEqualTo("-");
    }
    
    @Test
    public void performQuack_rubberDuck_squeak() {
        Duck duck = new RubberDuck();
        assertThat(duck.performQuack()).isEqualTo("Squeeeeaaaaaakkkk");
    }
    
    @Test
    public void performFly_mallarDuck_itFlies() {
        Duck duck = new MallardDuck();
        assertThat(duck.performFly()).isEqualTo("Moving wings >> Flyyyyyyy");
    }

    @Test
    public void performQuack_mallarDuck_quack() {
        Duck duck = new MallardDuck();
        assertThat(duck.performQuack()).isEqualTo("Quaaaaaack");
    }
    
    @Test
    public void performFly_decoyDuck_itCantFly() {
        Duck duck = new MallardDuck();
        assertThat(duck.performFly()).isEqualTo("-");
    }

    @Test
    public void performQuack_decoyDuck_itCanQuack() {
        Duck duck = new MallardDuck();
        assertThat(duck.performQuack()).isEqualTo("-");
    }
}
