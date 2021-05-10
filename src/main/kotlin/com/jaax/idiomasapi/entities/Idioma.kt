package com.jaax.idiomasapi.entities
import javax.persistence.*

// 1
@Entity
@Table( name = "idioma" )
data class Idioma(val codigoISO: String,
                  val nombre: String,
                  val numHablantes: Int ) {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    var id: Long = 0
}