import abstractfactory.IceCreamClient
import abstractfactory.chocolate.NougatChocolateTopping
import abstractfactory.chocolate.WhiteChocolateTopping
import abstractfactory.cookie.BrownCookieTopping
import abstractfactory.cookie.DarkCookieTopping
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ToppingFactoryTest {

    @Test
    fun createTopping_expectWhiteChocolate() {
        val iceCreamClient = IceCreamClient(WhiteChocolateTopping())
        val topping = iceCreamClient.createTopping()
        assertTrue(topping is WhiteChocolateTopping)
    }

    @Test
    fun createTopping_expectNougatChocolate() {
        val iceCreamClient = IceCreamClient(NougatChocolateTopping())
        val topping = iceCreamClient.createTopping()
        assertTrue(topping is NougatChocolateTopping)
    }

    @Test
    fun createTopping_expectDarkCookie() {
        val iceCreamClient = IceCreamClient(DarkCookieTopping())
        val topping = iceCreamClient.createTopping()
        assertTrue(topping is DarkCookieTopping)
    }

    @Test
    fun createTopping_expectBrownCookie() {
        val iceCreamClient = IceCreamClient(BrownCookieTopping())
        val topping = iceCreamClient.createTopping()
        assertTrue(topping is BrownCookieTopping)
    }
}