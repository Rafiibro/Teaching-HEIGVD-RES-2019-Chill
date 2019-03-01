<<<<<<< HEAD
package ch.heigvd.res.chill.domain.rafiibro;
=======
package ch.heigvd.res.chill.domain.Rafiibro;
>>>>>>> e19502c82a7209dc9f2eab8d774e0d2e3b78c149

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sprite implements IProduct {

    public final static String NAME = "Sprite";
<<<<<<< HEAD
    public final static BigDecimal PRICE = new BigDecimal(3.5);
=======
    public final static BigDecimal PRICE = new BigDecimal(2.5);
>>>>>>> e19502c82a7209dc9f2eab8d774e0d2e3b78c149

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
