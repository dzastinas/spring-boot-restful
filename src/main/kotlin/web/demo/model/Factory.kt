package web.demo.model

interface Factory<out T> {
    fun create(): T
}