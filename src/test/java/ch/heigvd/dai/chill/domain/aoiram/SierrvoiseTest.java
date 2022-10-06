package ch.heigvd.dai.chill.domain.aoiram;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.aoiram.Sierrvoise;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SierrvoiseTest {

  @Test
  void thePriceAndNameForSierrvoiseShouldBeCorrect() {
    Sierrvoise beer = new Sierrvoise();
    assertEquals(beer.getName(), Sierrvoise.NAME);
    assertEquals(beer.getPrice(), Sierrvoise.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSierrvoise() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.aoiram.Sierrvoise";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Sierrvoise.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
