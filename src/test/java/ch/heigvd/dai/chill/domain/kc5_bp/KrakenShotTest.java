package ch.heigvd.dai.chill.domain.kc5_bp;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.kc5_bp.KrakenShot;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KrakenShotTest {

  @Test
  void thePriceAndNameForKrakenShotShouldBeCorrect() {
    KrakenShot krakenShot = new KrakenShot();
    assertEquals(krakenShot.getName(), KrakenShot.NAME);
    assertEquals(krakenShot.getPrice(), KrakenShot.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKrakenShot() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.kc5_bp.KrakenShot";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = KrakenShot.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
