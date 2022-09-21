package adapter

import adapter.json.JsonConsumer
import adapter.xml.XmlProducer
import kotlin.test.Test
import kotlin.test.assertSame

class XmlToJsonAdapterTest {

    @Test
    fun convertXmlToJson_expectJSON() {
        val xmlToJsonAdapter = XmlToJsonAdapter(JsonConsumer(), XmlProducer())
        val result = xmlToJsonAdapter.convertXmlToJson()

        assertSame(result, FileType.JSON.name)
    }

}