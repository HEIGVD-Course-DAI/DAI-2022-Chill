package ch.heigvd.dai.chill.domain.SNSantos;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;


public class Hoegaarden implements IProduct {

    public final static String NAME = "Hoegaarden";
    public final static BigDecimal PRICE = new BigDecimal(1.74);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}