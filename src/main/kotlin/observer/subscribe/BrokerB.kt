package observer.subscribe

/**
 * Concrete subscriber B with a starting price.
 */
class BrokerB(override var brokerFee: Double) : BrokerSubscriber {
    override var currentPrice : Double = 1.0
}