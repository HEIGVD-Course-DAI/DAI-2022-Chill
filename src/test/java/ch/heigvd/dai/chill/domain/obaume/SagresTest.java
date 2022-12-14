package ch.heigvd.dai.chill.domain.obaume;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.obaume.Sagres;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SagresTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Sagres beer = new Sagres();
    assertEquals(beer.getName(), Sagres.NAME);
    assertEquals(beer.getPrice(), Sagres.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.obaume.Sagres";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Sagres.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
