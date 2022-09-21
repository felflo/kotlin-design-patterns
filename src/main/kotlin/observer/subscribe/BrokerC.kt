package observer.subscribe

/**
 * Concrete subscriber C with a starting price.
 */
class BrokerC(override var brokerFee: Double,
              private val additionalFee: Double) : BrokerSubscriber {
    override var currentPrice : Double = 2.0

    /**
     * An implementation that differs from the interface standard as BrokerC has an
     * "additionalFee" to consider.
     */
    override fun updateBuyPrice(newPrice: Double) {
       currentPrice = newPrice + (newPrice * brokerFee) + (newPrice * additionalFee)
       println("New buy price announced: $currentPrice")
    }
}