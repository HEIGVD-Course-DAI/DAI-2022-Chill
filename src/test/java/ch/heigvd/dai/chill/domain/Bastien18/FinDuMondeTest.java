package ch.heigvd.dai.chill.domain.Bastien18;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.Bastien18.FinDuMonde;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinDuMondeTest {

  @Test
  void thePriceAndNameForFinDuMondeShouldBeCorrect() {
    FinDuMonde beer = new FinDuMonde();
    assertEquals(beer.getName(), FinDuMonde.NAME);
    assertEquals(beer.getPrice(), FinDuMonde.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFinDuMonde() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.Bastien18.FinDuMonde";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = FinDuMonde.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
