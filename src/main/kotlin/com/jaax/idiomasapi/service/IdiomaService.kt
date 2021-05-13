package com.jaax.idiomasapi.service

import com.jaax.idiomasapi.entities.Idioma
import com.jaax.idiomasapi.dao.IdiomaDAO
import com.jaax.idiomasapi.IdiomaCRUD
import com.jaax.idiomasapi.exceptions.IdiomaException
import com.jaax.idiomasapi.exceptions.NotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.jvm.Throws

// 4
@Service
class IdiomaService: IdiomaCRUD {

    @Autowired //inyectar datos en un objeto idioma
    val idiomaDAO: IdiomaDAO? = null

    @Throws(IdiomaException::class)
    override fun getAll(): List<Idioma> {
        try {
            return idiomaDAO!!.findAll()
        } catch(e: Exception) {
            throw IdiomaException(e.message)
        }
    }

    @Throws( IdiomaException::class, NotFoundException::class )
    override fun getById(id: Long): Idioma {
        val optional: Optional<Idioma> //sólo para saber si existe el objeto en la BD
        try {
            optional = idiomaDAO!!.findById( id )
        } catch(e: Exception) {
            throw IdiomaException(e.message)
        }
        if( optional.isPresent ){
            return optional.get()
        } else {
            throw NotFoundException("No se encontró: $id")
        }
    }

    @Throws(IdiomaException::class)
    override fun post(idioma: Idioma): Idioma {
        try {
            return idiomaDAO!!.save( idioma )
        } catch(e: Exception) {
            throw IdiomaException(e.message)
        }
    }

    override fun put(idioma: Idioma) {
        val optional: Optional<Idioma>?
        try {
            optional = idiomaDAO!!.findById( idioma.id )
        } catch(e: Exception) {
            throw IdiomaException(e.message)
        } catch(e: Exception) {
            throw NotFoundException("No se encontró: $idioma.id")
        }
        if( optional.isPresent ){
            idiomaDAO!!.save(idioma)
        }
    }

    @Throws(IdiomaException::class, NotFoundException::class)
    override fun deleteById(id: Long) {
        val optional: Optional<Idioma>?
        try {
            optional = idiomaDAO!!.findById( id )
        } catch(e: Exception) {
            throw IdiomaException(e.message)
        } catch(e: Exception) {
            throw NotFoundException("No se encontró: $id")
        }
        if( optional.isPresent ){
            idiomaDAO!!.deleteById( id )
        }
    }
}