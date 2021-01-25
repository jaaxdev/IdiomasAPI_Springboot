package com.jaax.idiomasapi.modelo.utils

class Constantes {
    companion object {
        private const val URL_API_BASE = "/api"
        private const val URL_API_VERSION = "/v1"
        private const val URL_BASE = "$URL_API_BASE/$URL_API_VERSION"
        private const val ENDPOINT_IDIOMAS = "idiomas"
        const val URL_BASE_IDIOMAS = "$URL_BASE/$ENDPOINT_IDIOMAS"
    }
}