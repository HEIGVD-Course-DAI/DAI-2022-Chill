package ch.heigvd.dai.chill.domain.kevinferati;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class PrixGarantie implements IProduct {

    public static final BigDecimal PRICE = new BigDecimal(0.5);
    public static final String NAME = "Prix garantie";
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
