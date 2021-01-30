package com.talevski.viktor.api;

import com.talevski.viktor.facade.FacadeOrderService;

public class FacadeOrderController {
    private FacadeOrderService facadeOrderService;

    public FacadeOrderController(FacadeOrderService facadeOrderService) {
        this.facadeOrderService = facadeOrderService;
    }

    public void orderProduct(Integer productId) {
        if (facadeOrderService.orderProduct(productId)) {
            System.out.println("Product successfully ordered.");
        } else {
            System.out.println("Product order unsuccessful.");
        }
    }
}
