package ch.heigvd.dai.chill.domain.BoluxByte;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class PrixGaranti implements IProduct {

  public final static String NAME = "Prix Garanti";
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
