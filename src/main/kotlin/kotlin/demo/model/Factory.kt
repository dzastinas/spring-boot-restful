package kotlin.demo.model

interface Factory<T> {
    fun create(): T
}