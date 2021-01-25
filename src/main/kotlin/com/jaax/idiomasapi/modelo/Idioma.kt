package com.jaax.idiomasapi.modelo
import javax.persistence.*

// 1
@Entity
@Table( name = "idioma" )
data class Idioma(val codigoISO: String,
                  val nombre: String,
                  val origen: String,
                  val numHablantes: Int ) {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    var id: Long = 0
}