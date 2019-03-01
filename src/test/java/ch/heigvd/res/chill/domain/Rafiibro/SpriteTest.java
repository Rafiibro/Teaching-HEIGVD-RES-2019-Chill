package ch.heigvd.res.chill.domain.rafiibro;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpriteTest {

    @Test
    void thePriceAndNameForSpriteShouldBeCorrect() {
        Sprite soft = new Sprite();
        assertEquals(soft.getName(), Sprite.NAME);
        assertEquals(soft.getPrice(), Sprite.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoi() {
        Bartender jack = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.rafiibro.Sprite";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jack.order(request);
        BigDecimal expectedTotalPrice = Sprite.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}