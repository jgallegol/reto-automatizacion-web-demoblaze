Feature: Login DemoBlaze

  Scenario Outline: Login exitoso en DemoBlaze

    Given el usuario ingresa a DemoBlaze

    When inicia sesion con las credenciales
      | user   | pass   |
      | <user> | <pass> |

    Then visualiza el mensaje de bienvenida <message>

    Examples:
      | user  | pass  | message       |
      | Admin | admin | Welcome Admin |