package adapter.json

import adapter.FileType

/**
 * A consumer that is simulating consuming only JSON.
 */
class JsonConsumer {

    fun consumeJson(convertedJson: FileType) : String {
        println("Consuming json data: $convertedJson")
        return consume(convertedJson) { it.name }
    }

    /**
     * This function consumes another function which transforms the file type into a new String.
     * In this example it is of course a bit over-complicated but if we assume we would have loads
     * of jsons to consume the performance can be significantly improved by using the "inline" keyword.
     * It prevents an additional instance creation (& method-call "invoke") of the/every passed function.
     */
    private inline fun consume(convertedJson: FileType, consumeJson: (FileType) -> String) : String {
        return consumeJson(convertedJson)
    }

}