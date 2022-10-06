package ch.heigvd.dai.chill.domain.SNSantos;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HoegaardenTest {

    @Test
    void thePriceAndNameForHoegaardenShouldBeCorrect() {
        Hoegaarden beer = new Hoegaarden();
        assertEquals(beer.getName(), Hoegaarden.NAME);
        assertEquals(beer.getPrice(), Hoegaarden.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForHoegaarden() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.SNSantos.Hoegaarden";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Hoegaarden.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}