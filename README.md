# DOSW Lab 2 - Retos 1 y 2

## Integrantes
- Gina Sofia Garcia Zapata
- Juan Diego Patino Munoz

## Reto 1
<img width="991" height="955" alt="reto1sol" src="https://github.com/user-attachments/assets/d9f0c7ea-8d77-425e-a866-7c8649f834bf" />

**problema**: El problema consiste en crear un sistema para una tienda el cual genera un recibo, dependiendo los objetos
comprados y el usuario (longevidad) el recibo sera mas barato o mas caro.

**solucion**: Se crean las clases para cada concepto del problema (producto, carrito,
comprador, recibo) y cada una se asignan diferentes atributos, por ejemplo uno de los
mas importantes es el tipo del cliente (Customer.type) el cual especifica
la longevidad del cliente, tambien el metodo abstracto 'getDiscountRate' el cual
indica cuanto de descuento se le debe hacer a cada cliente (Frequent o New)

**SOLID**:
- S: Cada clase tiene un solo trabajo
- O: El codigo esta abierto a extension pero no a modificacion
- L: ...
- I: ...
- D: ShoppingCart depende de Customer, no de clases concretas

**Polimorfismo**:
Se aplica cuando se quiere tener el descuento de X cliente independientemente de su tipo

---

## Reto 2 (Gina)
<img width="887" height="630" alt="image" src="https://github.com/user-attachments/assets/250f37d3-ba06-49c7-b18f-d7f656bf5624" />

**Patron de diseño**: Creacional

**Patron utilizado**: Builder

**Justificacion**: Porque la hamburguesa tiene partes opcionales, entonces este
patron nos ayuda a separar los diferentes objetos (ingredientes) que se usaran
para la construccion de una hamburguesa final.

**Aplicacion**: 
 - Hamburguesa: Producto final
 - HamburguesaBuilder: Interfaz Builder
 - Chef: Director
 - HamburguesaPersonalizadaBuilder: Builder concreto

## Nota

Se hicieron commits a la rama `main` debido a que se nos olvido o quisimos hacer pequenas modificaciones
al README, pero en si no se cambio nada del codigo, para el codigo creamos cada uno una rama aparte y cuando
vimos que funcionaba hicimos merge con `main`
