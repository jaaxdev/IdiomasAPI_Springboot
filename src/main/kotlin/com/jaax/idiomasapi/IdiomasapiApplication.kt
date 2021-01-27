package com.jaax.idiomasapi

import com.jaax.idiomasapi.controlador.IdiomaController
import com.jaax.idiomasapi.modelo.Idioma
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IdiomasapiApplication: CommandLineRunner{

	/*@Autowired
	val controller: IdiomaController? = null*/
	override fun run(vararg args: String?) {
/*
		val usuario1 = Idioma("es", "Español", 50000)
		controller!!.post( usuario1 )*/
	}
}

fun main(args: Array<String>) {
	runApplication<IdiomasapiApplication>(*args)
}
