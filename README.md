# Proyecto de Pilas - Curso Estructuras de Datos

El proyecto pretende simular un sistema de gestion de pedidos en una pizzeria y con tal fin se 
crean 5 clases en Java para modelar la situacion.

## Pizza y Nodo
La clase Pizza es la unidad basica del programa y modela una pizza con sus respectivos ingredientes, 
asi como un metodo para imprimirlas de manera amigable para el usuario. El nodo por su parte es un nodo 
que tiene una referencia a la pizza que estaba en la cima de pedidos anteriormente.

## PilaPizza y GestorPedidos
Modela la estructura de datos de una pila con los metodos basicos para insertar, quitar y revisar la 
pizza que se encuentra en la cima de la pila. Por su parte, GestorPedidos controla la logica de como
funciona el flujo de las pizzas en el negocio permitiendo crear las pizzas y moverlas entre pila de pizzas
por producir y la pila de pizzas completadas.

## Menu
Este es el metodo main del proyecto con el interactua el usuario, dependiendo de sus elecciones
se ejecutaran los diferentes metodos controlando el flujo por medio de una estructura de switch.
