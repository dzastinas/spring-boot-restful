package kotlin.demo.model

import java.sql.Timestamp
import kotlin.demo.model.Factory

data class ErrorJson(val status: Int,
                     val errorAttributes: Map<String, Any>,
                     val error: String = errorAttributes["error"] as String,
                     val message: String = errorAttributes["message"] as String,
                     val timeStamp: String = errorAttributes["timeStamp"] as String,
                     val trace: String = errorAttributes["trace"] as String) {
    companion object : Factory<ErrorJson> {
        override fun create(): ErrorJson {
            val pairError = Pair("error", "error general")
            val pairMessage = Pair("message", "message general")
            val pairTimeStamp = Pair("timeStamp", Timestamp(System.currentTimeMillis()).toString())
            val pairTrace = Pair("trace", "trace general")
            return ErrorJson(404, mapOf(pairError, pairMessage, pairTimeStamp, pairTrace))
        }
    }
}




