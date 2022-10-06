package ch.heigvd.dai.chill.domain.Cedro22;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrongbowTest {

    @Test
    void thePriceAndNameForFilsDePommeShouldBeCorrect() {
        Strongbow beer = new Strongbow();
        assertEquals(beer.getName(), Strongbow.NAME);
        assertEquals(beer.getPrice(), Strongbow.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFilsDePomme() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.Cedro22.Strongbow";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Strongbow.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
