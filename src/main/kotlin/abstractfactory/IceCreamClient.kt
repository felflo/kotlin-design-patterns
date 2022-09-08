package abstractfactory

/**
 * Demonstrative client class which is making use of the factory
 * to create toppings while the whole creation-code is encapsulated
 * from the client.
 */
class IceCreamClient(private val toppingFactory: AbstractToppingFactory) {

    fun createTopping() : AbstractToppingFactory {
        return toppingFactory.provideTopping()
    }
}