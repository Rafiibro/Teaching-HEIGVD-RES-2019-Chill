<<<<<<< HEAD
package ch.heigvd.res.chill.domain.rafiibro;
=======
package ch.heigvd.res.chill.domain.Rafiibro;
>>>>>>> e19502c82a7209dc9f2eab8d774e0d2e3b78c149

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpriteTest {

    @Test
    void thePriceAndNameForSpriteShouldBeCorrect() {
<<<<<<< HEAD
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
=======
        Sprite sprite = new Sprite();
        assertEquals(sprite.getName(), Sprite.NAME);
        assertEquals(sprite.getPrice(), Sprite.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSprite() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Rafiibro.Sprite";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
>>>>>>> e19502c82a7209dc9f2eab8d774e0d2e3b78c149
        BigDecimal expectedTotalPrice = Sprite.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}