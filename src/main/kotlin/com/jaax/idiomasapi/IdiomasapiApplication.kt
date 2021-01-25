package com.jaax.idiomasapi

import com.jaax.idiomasapi.modelo.Idioma
import com.jaax.idiomasapi.modelo.dao.IdiomaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IdiomasapiApplication: CommandLineRunner {

	@Autowired
	val idiomaRepository: IdiomaRepository? = null

	override fun run(vararg args: String?) {
		val idioma = Idioma( "es", "Español", "romance", 5000000 )
		idiomaRepository!!.save( idioma )
	}
}

fun main(args: Array<String>) {
	runApplication<IdiomasapiApplication>(*args)
}
