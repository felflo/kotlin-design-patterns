package observer.publish

import observer.subscribe.BrokerSubscriber

/**
 * Publisher of (new) stock information. Managing its "observers", this class will
 * notify all subscribed Brokers in case a price update happened.
 */
class StockPricePublisher : Publisher {
    private var subscribers = mutableListOf<BrokerSubscriber>()

    override fun addSubscriber(brokerSubscriber: BrokerSubscriber) {
        subscribers.add(brokerSubscriber)
    }

    override fun removeSubscriber(brokerSubscriber: BrokerSubscriber) {
        subscribers.remove(brokerSubscriber)
    }

    override fun notifyAllSubscriber(newPrice: Double) {
        subscribers.forEach{ it.updateBuyPrice(newPrice) }
    }

    fun doPriceUpdate(newPrice: Double) {
        println("Stock price updated! Will inform subscribers.")
        notifyAllSubscriber(newPrice)
    }
}