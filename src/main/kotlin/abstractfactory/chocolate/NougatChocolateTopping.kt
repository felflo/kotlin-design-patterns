package abstractfactory.chocolate

class NougatChocolateTopping : ChocolateToppingFactory {
    override fun createChocolate() {
        println("Creating a new nougat chocolate")
    }

    override fun provideTopping() : NougatChocolateTopping {
        println("Providing nougat chocolate topping.")
        return this
    }
}