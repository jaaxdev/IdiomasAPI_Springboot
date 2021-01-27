package com.jaax.idiomasapi.controlador

import com.jaax.idiomasapi.modelo.Idioma
import com.jaax.idiomasapi.modelo.exceptions.NotFoundException
import com.jaax.idiomasapi.modelo.utils.Constantes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

// 5
/*
Clase que controla el CRUD
 */
@RestController
@RequestMapping( Constantes.URL_BASE ) // URL base de donde va a realizar CRUD
class IdiomaController {

    @Autowired
    private val idiomaService: IdiomaService? = null

    @GetMapping( Constantes.ENDPOINT_IDIOMAS )
    fun getAll(): ResponseEntity<List<Idioma>> {
        return try {
            ResponseEntity( idiomaService!!.getAll(), HttpStatus.OK )
        } catch(e: Exception) {
            ResponseEntity( HttpStatus.INTERNAL_SERVER_ERROR )
        }
    }

    @GetMapping( "${Constantes.ENDPOINT_IDIOMAS}/{id}" )
    fun getById( @PathVariable("id") id: Long ): ResponseEntity<Any> {
        return try {
            ResponseEntity( idiomaService!!.getById(id), HttpStatus.OK )
        } catch(e: Exception) {
            ResponseEntity( HttpStatus.INTERNAL_SERVER_ERROR )
        } catch(e: Exception) {
            ResponseEntity( HttpStatus.NOT_FOUND )
        }
    }

    @PostMapping( Constantes.ENDPOINT_IDIOMAS )
    fun post( @RequestBody idioma: Idioma ): ResponseEntity<Any> {
        return try {
            idiomaService!!.post( idioma )
            val responseHeader = HttpHeaders()
            responseHeader.set( "ruta: ", "${Constantes.ENDPOINT_IDIOMAS}/${idioma.id}" )
            ResponseEntity( responseHeader, HttpStatus.CREATED )
        } catch(e: Exception) {
            ResponseEntity( HttpStatus.INTERNAL_SERVER_ERROR )
        }
    }

    @PutMapping("")
    fun putById( @RequestBody idioma: Idioma ): ResponseEntity<Any> {
        return try {
            idiomaService!!.post( idioma )
            ResponseEntity( HttpStatus.OK )
        } catch(e: NotFoundException) {
            ResponseEntity( HttpStatus.NOT_FOUND )
        } catch(e: Exception) {
            ResponseEntity( HttpStatus.INTERNAL_SERVER_ERROR )
        }
    }

    @DeleteMapping( "/{id}" )
    fun deleteById( @PathVariable("id") id: Long ): ResponseEntity<Any> {
        return try {
            idiomaService!!.deleteById( id )
            ResponseEntity( HttpStatus.OK )
        } catch(e: Exception) {
            ResponseEntity( HttpStatus.INTERNAL_SERVER_ERROR )
        } catch(e: NotFoundException) {
            ResponseEntity( HttpStatus.NOT_FOUND )
        }
    }
}












