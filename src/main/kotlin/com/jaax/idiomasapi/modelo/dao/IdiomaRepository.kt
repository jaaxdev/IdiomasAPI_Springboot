package com.jaax.idiomasapi.modelo.dao
/*
Esta interfaz es el puente entre JPA y el servicio para hacer CRUD
 */
// 2
import com.jaax.idiomasapi.modelo.Idioma
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IdiomaRepository: JpaRepository<Idioma, Long>