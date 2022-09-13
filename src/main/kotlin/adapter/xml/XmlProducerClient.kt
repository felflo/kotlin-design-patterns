package adapter.xml

import adapter.FileType

interface XmlProducerClient {
    fun produceXML() : FileType
}