package adapter

import adapter.json.JsonConsumer
import adapter.xml.XmlProducerClient

/**
 * Adapter to transform XML data into JSON data.
 *
 * This adapter wraps the object that is targeted to receive the adapted data.
 * The data to adapt will be retrieved by a client-interface.
 */
class XmlToJsonAdapter(val adaptee: JsonConsumer, val xmlProducer: XmlProducerClient) {

    fun convertXmlToJson() : String {
        val xmlData = xmlProducer.produceXML()
        val jsonData = convert(xmlData)
        return adaptee.consumeJson(jsonData)
    }

    private fun convert(xmlData: FileType) : FileType {
        println("Converting $xmlData to JSON...")
        return FileType.JSON
    }

}