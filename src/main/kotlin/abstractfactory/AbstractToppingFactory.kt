package abstractfactory

interface AbstractToppingFactory {
    fun provideTopping() : AbstractToppingFactory
}