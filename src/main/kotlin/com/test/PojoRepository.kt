package com.test

import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.PageableRepository

@MongoRepository
interface PojoRepository : PageableRepository<Pojo, String> {

    fun findNameById(id: String): String
    fun findAliasesById(id: String): List<String>
}