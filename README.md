# DOSW Lab 2 - Retos 1 y 2

## Integrantes
- Gina Sofia Garcia Zapata
- Juan Diego Patino Munoz

## Reto 1

**problema**: El problema consiste en crear un sistema para una tienda el cual genera un recibo, dependiendo los objetos
comprados y el usuario (longevidad) el recibo sera mas barato o mas caro.

**solucion**: Se crean las clases para cada concepto del problema (producto, carrito,
comprador, recibo) y cada una se asignan diferentes atributos, por ejemplo uno de los
mas importantes es el tipo del cliente (Customer.type) el cual especifica
la longevidad del cliente, tambien el metodo abstracto 'getDiscountRate' el cual
indica cuanto de descuento se le debe hacer a cada cliente (Frequent o New)
