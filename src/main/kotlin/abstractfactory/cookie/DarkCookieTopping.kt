package abstractfactory.cookie

class DarkCookieTopping : CookieToppingFactory {
    override fun createCookie() {
        println("Create a new dark cookie")
    }

    override fun provideTopping() : DarkCookieTopping {
        println("Providing dark cookie topping.")
        return this
    }
}