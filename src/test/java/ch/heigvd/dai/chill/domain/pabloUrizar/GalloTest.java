package ch.heigvd.dai.chill.domain.pabloUrizar;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GalloTest {

    @Test
    void thePriceAndNameForGalloShouldBeCorrect() {
        Gallo beer = new Gallo();
        assertEquals(beer.getName(), Gallo.NAME);
        assertEquals(beer.getPrice(), Gallo.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGallo() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.pabloUrizar.Gallo";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Gallo.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
