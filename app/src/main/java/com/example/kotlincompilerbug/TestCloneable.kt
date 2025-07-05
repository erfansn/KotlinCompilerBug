package com.example.kotlincompilerbug

interface Cloneable<T> {
    fun clone(): T
}

abstract class TestCloneable : Cloneable<TestCloneable>

class TestCloneableImpl : TestCloneable() {
    override fun clone(): TestCloneable {
        return TestCloneableImpl()
    }
}
