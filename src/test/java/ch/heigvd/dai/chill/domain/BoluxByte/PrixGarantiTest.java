package ch.heigvd.dai.chill.domain.BoluxByte;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrixGarantiTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    PrixGaranti beer = new PrixGaranti();
    assertEquals(beer.getName(), PrixGaranti.NAME);
    assertEquals(beer.getPrice(), PrixGaranti.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.wasadigi.PrixGaranti";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PrixGaranti.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
