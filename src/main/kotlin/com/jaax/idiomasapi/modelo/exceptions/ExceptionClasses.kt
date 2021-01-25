package com.jaax.idiomasapi.modelo.exceptions

class IdiomaException(mensaje: String? ): Exception(mensaje)
class NotFoundException(mensaje: String?): Exception(mensaje)