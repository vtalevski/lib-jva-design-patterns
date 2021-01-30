package com.talevski.viktor.factory.topping;

import com.talevski.viktor.model.cheese.Cheese;
import com.talevski.viktor.model.sauce.Sauce;

public interface ToppingFactory {
    Sauce putSauce();

    Cheese putCheese();
}
