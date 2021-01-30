package com.talevski.viktor.facade;

import com.talevski.viktor.model.Product;
import com.talevski.viktor.service.InventoryService;
import com.talevski.viktor.service.PaymentService;
import com.talevski.viktor.service.ShippingService;

public class FacadeOrderServiceImpl implements FacadeOrderService {

    @Override
    public boolean orderProduct(Integer productId) {
        boolean productOrdered = false;

        Product product = new Product();
        product.setProductId(productId);

        if (InventoryService.isAvailable(product)) {
            System.out.println("Availability confirmed for product with ID - '" + product.getProductId() + "'.");

            if (PaymentService.makePayment(product)) {
                System.out.println("Payment confirmed for product with ID - '" + product.getProductId() + "'.");

                ShippingService.shipProduct(product);
                System.out.println("Shipment confirmed for product with ID - '" + product.getProductId() + "'.");

                productOrdered = true;
            }
        }
        return productOrdered;
    }
}
