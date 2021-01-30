package com.talevski.viktor.factory.topping;

import com.talevski.viktor.model.cheese.Cheese;
import com.talevski.viktor.model.cheese.GoatCheese;
import com.talevski.viktor.model.sauce.Sauce;
import com.talevski.viktor.model.sauce.TomatoSauce;

public class SicilianToppingFactory implements ToppingFactory {

    @Override
    public Sauce putSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese putCheese() {
        return new GoatCheese();
    }
}
