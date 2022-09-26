package ch.heigvd.dai.chill.domain.kc5_bp;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class KrakenShot implements IProduct {

  public final static String NAME = "Kraken Shot";
  public final static BigDecimal PRICE = new BigDecimal(4.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
