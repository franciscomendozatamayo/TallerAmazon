Feature: Busqueda Amazon

  Scenario Outline: Busqueda Articulo
    Given Ir a pagina "<url>"
    And Capturar busqueda <busqueda>
    #And Dar click en lupa de busqueda
    #Then Se muestran resultados de busqueda
    #And Ordenar resultados de busqueda de menor a mayor precio
    #And Seleccionar primer arcticulo
    #And Validar computadora

    Examples: 
      | url                        | busqueda     |
      | https://www.amazon.com.mx/ | Computadoras |
