package ch.heigvd.dai.chill.domain.kevinferati;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PunkIPATest {

    @Test
    void thePriceAndNameForPGShouldBeCorrect() {
        PrixGarantie beer = new PrixGarantie();
        assertEquals(beer.getName(), PrixGarantie.NAME);
        assertEquals(beer.getPrice(), PrixGarantie.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderPG() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.kevinferati.PrixGarantie";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = PrixGarantie.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
