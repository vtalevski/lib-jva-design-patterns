package com.talevski.viktor;

import com.talevski.viktor.api.FacadeOrderController;
import com.talevski.viktor.facade.FacadeOrderService;
import com.talevski.viktor.facade.FacadeOrderServiceImpl;

/**
 * Reference link for the Facade Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/facade-pattern'.
 */
public class FacadeDesignPatternApplication {
    public static void main(String[] args) {
        FacadeOrderService facadeOrderService = new FacadeOrderServiceImpl();
        FacadeOrderController facadeOrderController = new FacadeOrderController(facadeOrderService);
        facadeOrderController.orderProduct(123456);
    }
}
