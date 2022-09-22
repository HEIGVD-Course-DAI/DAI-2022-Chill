package ch.heigvd.dai.chill.domain.fazlijaylli;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PunkIPATest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    PunkIPA beer = new PunkIPA();
    assertEquals(beer.getName(), PunkIPA.NAME);
    assertEquals(beer.getPrice(), PunkIPA.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.fazlijaylli.PunkIPA";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PunkIPA.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
