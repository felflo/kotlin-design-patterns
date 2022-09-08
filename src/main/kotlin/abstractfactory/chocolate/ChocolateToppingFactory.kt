package abstractfactory.chocolate

import abstractfactory.AbstractToppingFactory

interface ChocolateToppingFactory : AbstractToppingFactory {
    fun createChocolate()
}