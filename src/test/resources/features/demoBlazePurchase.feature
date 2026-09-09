Feature: Compra de producto DemoBlaze

  Scenario: Agregar producto al carrito

    Given el usuario ingresa a DemoBlaze

    When agrega un producto al carrito

    Then visualiza el producto en el carrito