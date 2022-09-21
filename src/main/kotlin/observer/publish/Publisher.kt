package observer.publish

import observer.subscribe.BrokerSubscriber

/**
 * Interface to abstract the main functions for handling subscribers by the publisher.
 */
interface Publisher {

    fun addSubscriber(brokerSubscriber: BrokerSubscriber)

    fun removeSubscriber(brokerSubscriber: BrokerSubscriber)

    fun notifyAllSubscriber(newPrice: Double)
}