package kotlin.demo

class Utils {

    fun String.containsSpaces(): Boolean {
        return this.indexOf(" ")!=-1
    }
}