package ch.heigvd.dai.chill.domain.aoiram;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Marmotte implements IProduct {

    public final static String NAME = "Marmotte";
    public final static BigDecimal PRICE = new BigDecimal(5.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
