package ch.heigvd.dai.chill.domain.SNSantos;


import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class PaleImitation implements IProduct {

    public final static String NAME = "PaleImitation";
    public final static BigDecimal PRICE = new BigDecimal(1.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
