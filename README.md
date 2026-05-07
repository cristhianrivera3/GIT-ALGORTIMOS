# Proyecto de Algoritmos - Suma de Dos Números

## Descripción del Proyecto
Programa en Java que solicita dos números enteros no negativos al usuario, valida que sean correctos y muestra su suma. El proyecto está desarrollado colaborativamente por 3 integrantes.

## Estructura del Programa

### 1. Método `saludarUsuario()` - Integrante 1
Saluda al usuario al iniciar el programa.
Pseudocódigo:

Función saludarUsuario()
Escribir "¡Hola! Bienvenido al programa."
Fin Función


### 2. Método `pedirNumeros()` - Integrante 2 (Tu método)
Solicita al usuario dos números enteros no negativos y los valida.
Pseudocódigo:

Función pedirNumeros()
Definir a, b Como Entero
Escribir "--- Ingreso de números ---"

Escribir "Ingrese el primer número entero no negativo (a):"
Leer a
Mientras a < 0 Hacer
Escribir "Error: El número no puede ser negativo. Ingrese nuevamente (a):"
Leer a
Fin Mientras

Escribir "Ingrese el segundo número entero no negativo (b):"
Leer b
Mientras b < 0 Hacer
Escribir "Error: El número no puede ser negativo. Ingrese nuevamente (b):"
Leer b
Fin Mientras

Retornar [a, b]
Fin Función



### 3. Método `suma()` - Integrante 3
Calcula la suma de dos números con validación de no negativos.
Pseudocódigo:

Función suma(Entero a, Entero b)
Si a < 0 O b < 0 Entonces
Lanzar excepción "Los números deben ser no negativos"
Fin Si
Retornar a + b
Fin Función

### 4. Método `main()`
Integra todos los métodos y ejecuta el programa principal.

Pseudocódigo:

Función main()
Llamar saludarUsuario()
numeros = Llamar pedirNumeros()
a = numeros[0]
b = numeros[1]

Escribir "--- Números ingresados ---"
Escribir "a = ", a
Escribir "b = ", b

resultado = Llamar suma(a, b)
Escribir "--- Resultado ---"
Escribir "La suma es: ", resultado
Fin Función

Ejemplo de Ejecución
¡Hola! Bienvenido al programa.

--- Ingreso de números ---
Ingrese el primer número entero no negativo (a): 2
Ingrese el segundo número entero no negativo (b): 3

--- Números ingresados ---
a = 2
b = 3

--- Resultado ---
La suma es: 5

Versión
Fecha: 6 de mayo de 2026

Versión: 1.0

Estado: Completado
