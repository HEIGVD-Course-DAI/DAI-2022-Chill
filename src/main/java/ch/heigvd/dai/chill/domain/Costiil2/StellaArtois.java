package ch.heigvd.dai.chill.domain.Costiil2;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class StellaArtois implements IProduct {

  public final static String NAME = "Stella Artois";
  public final static BigDecimal PRICE = new BigDecimal(2.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
