Feature: Compra de producto DemoBlaze

  Scenario: Compra exitosa de un producto

    Given el usuario ingresa a DemoBlaze

    When agrega un producto al carrito

    And realiza la compra del producto

    Then visualiza el mensaje de compra exitosa