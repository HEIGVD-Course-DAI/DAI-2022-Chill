package ch.heigvd.dai.chill.domain.gogniat;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiereATest {

  @Test
  void thePriceAndNameForBiereAShouldBeCorrect() {
    BiereA beer = new BiereA();
    assertEquals(beer.getName(), BiereA.NAME);
    assertEquals(beer.getPrice(), BiereA.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBiereA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.gogniat.BiereA";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BiereA.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
