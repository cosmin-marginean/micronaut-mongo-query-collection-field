package com.test

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest(transactional = false)
class BugTest {

    @Inject
    lateinit var repository: PojoRepository

    @Test
    fun test() {
        val id = repository.save(Pojo("a")).id
        assertEquals("a", repository.findNameById(id))
    }
}