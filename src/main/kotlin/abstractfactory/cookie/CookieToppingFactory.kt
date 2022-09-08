package abstractfactory.cookie

import abstractfactory.AbstractToppingFactory

interface CookieToppingFactory : AbstractToppingFactory {
    fun createCookie()
}