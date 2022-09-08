/**
 * An 'object' in Kotlin is representing a singleton-instance that can be accessed (in a static way).
 */
object Mainboard {
    init {
        println("This is a mainboard platine: $this")
    }

    fun initialize(): Mainboard = apply { println("Initializing hardware system $this") }
}
