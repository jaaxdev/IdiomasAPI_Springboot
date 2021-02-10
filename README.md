# IdiomasAPI
_Este proyecto habilita una API para Idiomas en localhost, cuyos parametros son un id, codigoISO, nombre y un número de hablantes_

## Comenzando 🚀
_Puedes hacer una copia de este repositorio con las instrucciones sugeridas en esta misma página: 'git clone'_

## Pre-requisitos 📋
_Tener instalado Intellij IDEA (recomendable) o Spring Tools_

## Instalación 🔧
_Ejecutar Intellij IDEA y abrir el proyecto clonado_

## Despliegue 📦
_Sólo hay que ejecutar 'IdiomasapiApplication.kt' y observar la terminal_
_En la terminal se eejcutará SPRING el cual nos mostrarán distintos mensajes de los cuales nos interesa:_
* "Tomcat initialized with port(s): 8080 (http)" que indica que localhost está disponible para ver nuestra API
* "Started IdiomasapiApplicationKt" donde éste dice que la aplicación se ejecutó correctamente

## Ejecutando las pruebas ⚙️
_En 'IdiomasapiApplication.kt' hay un poco de código comentado, para probar que la API funciona es cuestión de descomentarlo y re-ejecutar el proyecto_

_Lo que hace el código que antes estaba comentado, es invocar un método POST para agregar un nuevo Idioma_

_El resultado puede verse en forma de Json en la ruta: **http://localhost:8080/api/v1/idiomas/**_

## Construido con 🛠️

* [Spring](https://start.spring.io/) - Framework web para Kotlin/Java
