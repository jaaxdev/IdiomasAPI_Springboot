package com.jaax.idiomasapi.exceptions

class IdiomaException(mensaje: String? ): Exception(mensaje)
class NotFoundException(mensaje: String?): Exception(mensaje)