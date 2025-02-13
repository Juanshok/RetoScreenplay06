#language: es
Característica: Crear unidades de negocio

  Antecedentes:
    Dado que el usuario esta en la plataforma de StarSharp
    Cuando ingresa con credenciales correctas
    Entonces visualiza el titulo inicial

  @CrearUnidadExitoso
  Esquema del escenario: Creacion de unidad de negocio exitoso
    Cuando el usuario ingresa los datos para crear una nueva unidad de negocio
      | nombre   | unidadPadre   |
      | <nombre> | <unidadPadre> |
    Entonces visualiza el mensaje de creacion
    Ejemplos:
      | nombre  | unidadPadre |
      | Test JP | Technology  |