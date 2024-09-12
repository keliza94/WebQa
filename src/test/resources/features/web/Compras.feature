@Compras
Feature: Flujo de compra en Demoblaze

  @Carritodecompras
  Scenario: Comprar dos productos
    Given que el "Cliente" esta en la home de Demoblaze
    When agrego los siguientes productos al carrito:
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
    Then el carrito debe mostrar los dos productos seleccionados:
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
    When completo el formulario de compra con los siguientes datos:
      | Nombre        | Katherin Vargas    |
      | País          | Ecuador         |
      | Ciudad        | Quito           |
      | Tarjeta       | 2580 2580 1212 7410|
      | Mes           | 12              |
      | Año           | 2029            |
    Then visualiza la modal de confirmacion y finaliza
