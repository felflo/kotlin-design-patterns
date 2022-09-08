package abstractfactory.chocolate

class WhiteChocolateTopping : ChocolateToppingFactory {
    override fun createChocolate() {
        println("Creating a new white chocolate")
    }

    override fun provideTopping() : WhiteChocolateTopping {
        println("Providing white chocolate topping.")
        return this
    }
}