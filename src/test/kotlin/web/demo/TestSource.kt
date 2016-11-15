package web.demo

import web.demo.model.ErrorJson
import kotlin.test.assertEquals
import org.junit.Test as test

class TestSource {

    @org.junit.Test fun f() {
        val pairError = Pair("error", "error general")
        assertEquals(pairError.second, ErrorJson.create().error)
        assertEquals(pairError.first, ErrorJson.create().errorAttributes.keys.first())
    }
}

