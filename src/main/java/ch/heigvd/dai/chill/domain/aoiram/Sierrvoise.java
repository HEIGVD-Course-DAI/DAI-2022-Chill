package ch.heigvd.dai.chill.domain.aoiram;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sierrvoise implements IProduct {

  public final static String NAME = "Sierrvoise";
  public final static BigDecimal PRICE = new BigDecimal(4.6);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
