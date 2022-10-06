package ch.heigvd.dai.chill.domain.aoiram;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.aoiram.Marmotte;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarmotteTest {

  @Test
  void thePriceAndNameForMarmotteShouldBeCorrect() {
    Marmotte beer = new Marmotte();
    assertEquals(beer.getName(), Marmotte.NAME);
    assertEquals(beer.getPrice(), Marmotte.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMarmotte() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.aoiram.Marmotte";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Marmotte.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
