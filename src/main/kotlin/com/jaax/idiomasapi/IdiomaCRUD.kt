package com.jaax.idiomasapi

import com.jaax.idiomasapi.entities.Idioma

// 3
interface IdiomaCRUD{
    fun getAll(): List<Idioma>
    fun getById( id: Long ): Idioma
    fun post( idioma: Idioma): Idioma
    fun putById( id: Long )
    fun deleteById(id: Long )
}