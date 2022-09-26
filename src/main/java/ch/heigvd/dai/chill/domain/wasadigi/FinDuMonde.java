package ch.heigvd.dai.chill.domain.wasadigi;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class FinDuMonde implements IProduct {

    public final static String NAME = "Punk IPA";
    public final static BigDecimal PRICE = new BigDecimal(4.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
