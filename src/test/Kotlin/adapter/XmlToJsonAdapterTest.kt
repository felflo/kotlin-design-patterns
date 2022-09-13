package adapter

import adapter.json.JsonConsumer
import adapter.xml.XmlProducer
import kotlin.test.Test
import kotlin.test.assertSame

class XmlToJsonAdapterTest {

    @Test
    fun convertXmlToJson_expectJSON() {
        val testee = XmlToJsonAdapter(JsonConsumer(), XmlProducer())
        val result = testee.convertXmlToJson()

        assertSame(result, FileType.JSON.name)
    }

}