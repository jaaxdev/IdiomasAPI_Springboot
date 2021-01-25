package com.jaax.idiomasapi.modelo

// 3
interface IdiomaInterface {
    fun getAll(): List<Idioma>
    fun getById( id: Long ): Idioma
    fun post( idioma: Idioma ): Idioma
    fun putById( id: Long )
    fun deleteById( id: Long )
}