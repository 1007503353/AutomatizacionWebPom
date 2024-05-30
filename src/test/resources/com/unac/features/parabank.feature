Feature: Iniciar sesion de logueo en guru99
  yo como usuario
  necesito iniciar sesion en la pagina guru99
  para validar que el login fue exitoso

  Scenario: Iniciar sesion en guru99
    Given Deseo abrir la pagina guru99 "https://demo.guru99.com/V4/index.php"
    When ingreso el nombre de usuario "mngr573130"  y la contrasena "tazUpet"
    Then valido que el titulo sea "Manger Id : mngr573130"
