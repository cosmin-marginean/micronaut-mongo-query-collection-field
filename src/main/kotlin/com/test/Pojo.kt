package com.test

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import java.util.*

@Serdeable
@MappedEntity
data class Pojo(
    val name: String,
    val aliases: List<String>,

    @field: Id
    val id: String = UUID.randomUUID().toString()
)
