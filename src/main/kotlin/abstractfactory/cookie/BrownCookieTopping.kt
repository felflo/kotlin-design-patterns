package abstractfactory.cookie

class BrownCookieTopping : CookieToppingFactory {
    override fun createCookie() {
        println("Create a new brown cookie")
    }

    override fun provideTopping() : BrownCookieTopping {
        println("Providing brown cookie topping.")
        return this
    }
}