package ch.heigvd.dai.chill.domain.fazlijaylli;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FeldschlossenTest {

  @Test
  void thePriceAndNameForFeldschlossenShouldBeCorrect() {
    Feldschlossen beer = new Feldschlossen();
    assertEquals(beer.getName(), Feldschlossen.NAME);
    assertEquals(beer.getPrice(), Feldschlossen.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFeldschlossen() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.fazlijaylli.Feldschlossen";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Feldschlossen.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
