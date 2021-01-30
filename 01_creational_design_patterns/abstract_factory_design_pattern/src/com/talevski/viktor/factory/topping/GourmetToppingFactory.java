package com.talevski.viktor.factory.topping;

import com.talevski.viktor.model.cheese.Cheese;
import com.talevski.viktor.model.cheese.MozzarellaCheese;
import com.talevski.viktor.model.sauce.CaliforniaOilSauce;
import com.talevski.viktor.model.sauce.Sauce;

public class GourmetToppingFactory implements ToppingFactory {

    @Override
    public Sauce putSauce() {
        return new CaliforniaOilSauce();
    }

    @Override
    public Cheese putCheese() {
        return new MozzarellaCheese();
    }
}
