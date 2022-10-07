package ch.heigvd.dai.chill.domain.SNSantos;
import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaleImitationTest {

    @Test
    void thePriceAndNameForPaleImitationShouldBeCorrect() {
        PaleImitation beer = new PaleImitation();
        assertEquals(beer.getName(), PaleImitation.NAME);
        assertEquals(beer.getPrice(), PaleImitation.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPaleImitation() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.SNSantos.PaleImitation";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = PaleImitation.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}

