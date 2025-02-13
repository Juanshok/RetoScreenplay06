#language: es
Característica: Logueo en la plataforma

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