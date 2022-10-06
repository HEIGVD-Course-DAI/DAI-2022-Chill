package ch.heigvd.dai.chill.domain.gogniat;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiereBTest {

  @Test
  void thePriceAndNameForTroisDamesIPAShouldBeCorrect() {
      BiereB beer = new BiereB();
    assertEquals(beer.getName(), BiereB.NAME);
    assertEquals(beer.getPrice(), BiereB.PRICE);
  }

  @Test
   void aBartenderShouldAcceptAnOrderForBiereB() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.gogniat.BiereB";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BiereB.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
