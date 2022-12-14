import org.junit.jupiter.api.Test
import kotlin.test.assertSame

class MainboardTest() {

    @Test
    fun retrieveSingletonTwice_happy_expectSameObject() {
        val main1 = Mainboard.initialize()
        val main2 = Mainboard.initialize()

        assertSame(main1, main2)
    }
}