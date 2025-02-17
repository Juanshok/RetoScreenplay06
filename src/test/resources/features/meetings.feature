#language: es
Característica: Crear reunion

  Antecedentes:

  @LogueoExitoso
  Esquema del escenario: :
    Dado que el usuario esta en la plataforma de StarSharp
    Cuando ingresa con credenciales correctas
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Entonces visualiza el titulo inicial
    Ejemplos:
      | usuario | contrasena |
      | admin   | serenity   |

  @CrearReunionExitoso
  Esquema del escenario: Creacion de reunion exitoso
    Cuando el usuario ingresa los datos para crear una nueva reunion
      | nombreR   | tipoReunion   | numeroReunion   | fechaInicio   | fechaFinalizacion   |
      | <nombreR> | <tipoReunion> | <numeroReunion> | <fechaInicio> | <fechaFinalizacion> |
    Entonces visualiza la reunion creada
    Ejemplos:
      | nombreR     | tipoReunion | numeroReunion | fechaInicio      | fechaFinalizacion |
      | testReunion | Strategy    | 12345         | 19/02/2025 23:27 | 23/02/2025 00:27  |