Feature: Apertura de una nueva cuenta en Parabank
  Como usuario
  Necesito abrir una nueva cuenta
  Para verificar que aparece en el resumen de cuentas

  Scenario: Registro y apertura de una nueva cuenta
    Given Deseo abrir la pagina de registro de parabank "https://parabank.parasoft.com/parabank/register.htm"
    When registro un nuevo usuario con los siguientes datos: "Haiber", "Montaña", "calle 34b", "Medellin", "Ba", "456123", "3216549874", "123-45-6", "Haiber", "haiber2001"
    And abro una nueva cuenta de tipo "SAVINGS"
    Then verifico que la nueva cuenta aparece en el resumen de cuentas
