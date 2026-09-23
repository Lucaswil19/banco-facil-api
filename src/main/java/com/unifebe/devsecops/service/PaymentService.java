package com.unifebe.devsecops.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private static final Logger logger = LogManager.getLogger(PaymentService.class);

    /**
     * Aplica um desconto percentual sobre um preco.
     *
     * O percentual e convertido dividindo por 100.
     */
    public double applyDiscount(double price, int discountPercent) {
        logger.info("Calculando desconto de {}% sobre {}", discountPercent, price);
        return price - (price * discountPercent / 100);
    }
}
