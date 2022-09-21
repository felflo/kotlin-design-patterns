package observer.subscribe

/**
 * Concrete subscriber with a starting price. Every Broker has its own broker fee & current price.
 * For the sake of simplicity we only require a broker fee as constructor parameter.
 */
class BrokerA(override var brokerFee: Double) : BrokerSubscriber {
    override var currentPrice : Double = 0.0
}