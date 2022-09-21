package observer

import observer.publish.StockPricePublisher
import observer.subscribe.BrokerA
import observer.subscribe.BrokerB
import observer.subscribe.BrokerC
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class StockPricePublisherTest {

    @Test
    fun doPriceUpdate_addAndNotifyBrokerA_expectCorrectPrice() {
        // Given: A Publisher with one Subscriber (BrokerA with fee)
        val stockPricePublisher = StockPricePublisher()
        val brokerA = BrokerA(0.1)
        stockPricePublisher.addSubscriber(brokerA)

        // When: A price update was executed and subscribers get notified
        stockPricePublisher.doPriceUpdate(3.0)

        // Then: BrokerA has new Stock Price
        assertEquals(3.3, brokerA.currentPrice)
    }

    @Test
    fun doPriceUpdate_removeBrokerAAndNotify_expectPriceUnchanged() {
        // Given: A Publisher with one Subscriber (BrokerA with fee)
        val stockPricePublisher = StockPricePublisher()
        val brokerA = BrokerA(0.1)
        stockPricePublisher.addSubscriber(brokerA)

        // When: After unsubscribing BrokerA a new price update is executed to all subscribers
        stockPricePublisher.removeSubscriber(brokerA)
        stockPricePublisher.doPriceUpdate(99.0)

        // Then: As BrokerA is no subscriber anymore, it got no price update
        assertNotEquals(99.0, brokerA.currentPrice)
    }

    @Test
    fun doPriceUpdate_addBrokerBCAndNotify_expectPricesCorrect() {
        // Given: A Publisher with two Subscribers (BrokerB, BrokerC with same fee)
        val stockPricePublisher = StockPricePublisher()
        val brokerB = BrokerB(0.5)
        val brokerC = BrokerC(0.5, 0.1)
        stockPricePublisher.addSubscriber(brokerB)
        stockPricePublisher.addSubscriber(brokerC)

        // When: A new price update is executed to all subscribers
        stockPricePublisher.doPriceUpdate(3.0)

        // Then: As BrokerA is no subscriber anymore, it got no price update
        assertEquals(4.5, brokerB.currentPrice)
        assertEquals(4.8, brokerC.currentPrice)
    }
}