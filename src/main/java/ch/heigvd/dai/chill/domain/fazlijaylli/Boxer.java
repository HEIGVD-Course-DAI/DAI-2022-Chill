package ch.heigvd.dai.chill.domain.fazlijaylli;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Boxer implements IProduct {

  public final static String NAME = "Boxer";
  public final static BigDecimal PRICE = new BigDecimal(3.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
