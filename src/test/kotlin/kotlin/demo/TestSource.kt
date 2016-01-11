package kotlin.demo

import kotlin.demo.model.ErrorJson
import kotlin.test.assertEquals
import org.junit.Test as test

class TestSource {
    @test fun f() {
        val pairError = Pair("error", "error general")
        assertEquals(pairError.second, ErrorJson.create().error)
    }
}

