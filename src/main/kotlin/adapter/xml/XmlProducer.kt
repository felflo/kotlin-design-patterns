package adapter.xml

import adapter.FileType

/**
 * A provider that is simulating the producing of XML.
 */
class XmlProducer : XmlProducerClient {
    override fun produceXML() : FileType {
        println("Producing & returning XML data")
        return FileType.XML
    }
}