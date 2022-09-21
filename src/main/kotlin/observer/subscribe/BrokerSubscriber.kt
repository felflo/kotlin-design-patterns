package observer.subscribe

interface BrokerSubscriber {
    var currentPrice: Double
    var brokerFee : Double
    fun updateBuyPrice(newPrice: Double) {
        currentPrice = newPrice + (newPrice * brokerFee)
        println("New buy price announced: $currentPrice")
    }
}