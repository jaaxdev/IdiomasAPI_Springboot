package com.jaax.idiomasapi.dao
/*
Esta interfaz es el puente entre JPA y el servicio para hacer CRUD
 */
// 2
import com.jaax.idiomasapi.entities.Idioma
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IdiomaDAO: JpaRepository<Idioma, Long>