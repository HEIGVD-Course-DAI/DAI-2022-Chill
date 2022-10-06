package ch.heigvd.dai.chill.domain.Cedro22;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Strongbow implements IProduct {
    public static final String NAME = "Strongbow";
    public static final BigDecimal PRICE = new BigDecimal(4.35);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
