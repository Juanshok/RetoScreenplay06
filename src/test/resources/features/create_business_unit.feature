#language: es
Característica: Crear unidades de negocio

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

  @CrearUnidadExitoso
  Esquema del escenario: Creacion de unidad de negocio exitoso
    Cuando el usuario ingresa los datos para crear una nueva unidad de negocio
      | nombre   | unidadPadre   |
      | <nombre> | <unidadPadre> |
    Entonces visualiza el mensaje de creacion
    Ejemplos:
      | nombre  | unidadPadre |
      | Test JP | Technology  |