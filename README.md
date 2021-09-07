Prueba técnica: Data pipeline
Descripción:

Desarrollar un pipeline de análisis de datos utilizando los datos abiertos de la Ciudad de
México correspondientes a la ubicación de las unidades del metrobús durante la última hora
para obtener un histórico de la posición en la que se encuentra cada unidad que pueda ser
consultado mediante un API Rest filtrando por unidad o por alcaldía.

Requerimientos y reglas de
negocio
● Presentar un diagrama con el diseño de su solución
● Consultar periódicamente la fuente de datos
● Obtener la alcaldía correspondiente a cada posición
● Almacenar la información en una base de datos

Diseñar e implementar un API que permita consultar la información almacenada, con las
siguientes características:
○ Obtener una lista de unidades disponibles
○ Consultar los el historial de ubicaciones/fechas de una unidad dado su ID
○ Obtener una lista de alcaldías disponibles
○ Obtener una lista de unidades que hayan estado dentro de una alcaldía

Opción código
● El candidato tendrá completa libertad de elegir el stack tecnológico
● Incluir comentarios en el código
● Manejar control de versiones
● Utilizar docker para empaquetar su(s) servicio(s)

Puntos extra● Implementar el API usando GraphQL
● Las configuraciones necesarias para desplegar su(s) servicio(s) en kubernetes
● Implementar una parte de su solución usando programación funcional
● Incluir pruebas unitarias
