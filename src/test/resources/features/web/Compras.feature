 @Compras
Feature: Flujo de compra en Demoblaze

  @Carritodecompras
  Scenario Outline: Comprar productos
    Given que el "Cliente" esta en la home de Demoblaze
    When agrego los siguientes productos al carrito:
      | <producto1>          |
      | <producto2>          |
    Then el carrito debe mostrar los dos productos seleccionados:
      | <producto1>          |
      | <producto2>          |
    When completo el formulario de compra con los siguientes datos:
      | Nombre        | <nombre>          |
      | País          | <pais>            |
      | Ciudad        | <ciudad>          |
      | Tarjeta       | <tarjeta>         |
      | Mes           | <mes>             |
      | Año           | <año>             |
    Then visualiza la modal de confirmacion y finaliza

    Examples:
      | producto1              | producto2              | nombre            | pais     | ciudad | tarjeta             | mes | año |
      | Samsung galaxy s6     | Nokia lumia 1520      | Katherin Vargas   | Ecuador  | Quito  | 2580 2580 1212 7410 | 12  | 2029|
      | Nexus 6            | Sony xperia z5        | Carlos Pérez        | Colombia   | Bogotá | 1234 5678 9012 3456 | 11  | 2025|
      | Iphone 6 32gb             | Sony vaio i5          | Jennifer López       | México   | México   | 9876 5432 1098 7654 | 10  | 2024|
