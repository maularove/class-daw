# JAVASCRIPT
## 1. Añadir Scripts al Html

dos formas para hacerlo:
<br>

- en el mismo html **_( SCRIPTS INTERNOS )_**:
```html
<!DOCTYPE HTML>
<html>
    <body>
        <p>Antes del script...</p>
        <script>
            alert( 'Hello, world!' );
        </script>
    <p>...Después del script.</p>
    </body>
</html>
```
<br>

- o en un js **_( SCRIPTS EXTERNOS )_**:
```html
<script src="./js/script1.js"></script>
```

---
<br>

## 2. Módulos
- Son una forma de organizar el código en archivos independientes.

- Son un archivo que contiene código JavaScript.
<br>

ejemplo:
<br>

**datos.js:**
<br>
lista de datos de artículos 
```js
export const articulos=[
{id:1, nombre:"articulo1"},
{id:2, nombre:"articulo2"},
{id:3, nombre:"articulo3"}
]
```
<br>

**utilidades.js:**
<br>
define una constante y una función que será exportada
```js
const mensaje="Bienvenido a mi Web"
export function verMensaje() {
alert(mensaje);
}
```
<br>

**main.js:**
<br>
importa los otros dos .js
```js
import {articulos} from "./datos.js"
import {verMensaje} from "./utilidades.js"
window.onload=function(){
verMensaje()
alert("Total articulos: " + articulos.length)
}
```

---
<br>

## 3. Variables
### var:
- Alcance: 
<br>
Function scope (o global si se declara fuera)

- Declaración: YES

- Reasignación: YES
<br>

```js
var x = 1;
if (true) {
  var x = 2;      // Esta es la misma variable x, redeclarada.
  // x = 2;       // Esta es la misma variable x, reasignada.
  console.log(x); // 2
}
console.log(x);   // 2
```
<br>

### let:
- Alcance: 
<br>
Block scope.

- Declaración: YES (pero no puede ser redeclarada en el mismo bloque)

- Reasignación: YES
<br>

```js
let x = 1;
if (true) {
  let x = 2;      // Esta es una nueva variable x, solo accesible dentro del bloque.
  // x = 2;       // Esta es la misma variable x, reasignada.
  console.log(x); // 2
}
// let x = 3;     // Error: Identifier 'x' has already been declared.
console.log(x);   // 1
```

### const:
- Alcance: 
<br>
Block scope.

- Declaración: YES (pero no puede ser redeclarada en el mismo bloque)

- Reasignación: NO
<br>

```js
const x = 1;
if (true) {
  const x = 2;    // Esta es una nueva variable x, solo accesible dentro del bloque.
  // x = 2;       // Error: Assignment to constant variable.
  console.log(x); // 2
}
// const x = 3;   // Error: Identifier 'x' has already been declared.
console.log(x);   // 1
```

---
<br>

## 4. Template Literals
```js
let nombre = "Ana";
let saludo = `Hola, ${nombre}!`; // "Hola, Ana!"
```

## 5. Operadores
### **_Aritméticos:_**
```javascript
| Operator | Description                       | Example                          |
|----------|-----------------------------------|----------------------------------|
| +        | Addition                          | 25 + 5 = 30                      |
| -        | Subtraction                       | 25 - 5 = 20                      |
| *        | Multiplication                    | 10 * 20 = 200                    |
| /        | Division                          | 20 / 2 = 10                      |
| %        | Modulus                           | 56 % 3 = 2                       |
| ++       | Increment                         | var a = 10; a++; Now a = 11      |
| --       | Decrement                         | var a = 10; a--; Now a = 9       |
```

### **_Incremento y decremento:_**
```javascript
| Operator | Description                       | Example                          | Result             |
|----------|-----------------------------------|----------------------------------|--------------------|
| var++    | Post Increment                    | var a = 0, b = 10;  a = b++;     | a == 10 and b == 11|
| ++var    | Pre Increment                     | var a = 0, b = 10;  a = ++b;     | a == 11 and b == 11|
| var--    | Post Decrement                    | var a = 0, b = 10;  a = b--;     | a == 10 and b == 9 |
| --var    | Pre Decrement                     | var a = 0, b = 10;  a = --b;     | a == 9  and b == 9 |
```

### **_Asignación:_**
```javascript
| Operator | Example                           | Is equivalent to                 |
|----------|-----------------------------------|----------------------------------|
| =        | x = y                             | x = y                            |
| +=       | x += y                            | x = x + y                        |
| -=       | x -= y                            | x = x - y                        |
| *=       | x *= y                            | x = x * y                        |
| /=       | x /= y                            | x = x / y                        |
| %=       | x %= y                            | x = x % y                        |
```

### Comparación
```javascript
| Operator | Description                       | Example                          |
|----------|-----------------------------------|----------------------------------|
| ==       | Equal to                          | 5 == 10  false                   |
| ===      | Identical (equal and of same type)| 5 === 10 false                   |
| !=       | Not equal to                      | 5 != 10 true                     |
| !==      | Not Identical                     | 10 !== 10 false                  |
| >        | Greater than                      | 10 > 5 true                      |
| >=       | Greater than or equal to          | 10 >= 5 true                     |
| <        | Less than                         | 10 < 5 false                     |
| <=       | Less than or equal to             | 10 <= 5 false                    |
```

### **_Lógicos o booleanos:_**
```javascript
| Operator | Description                       | Example                          |
|----------|-----------------------------------|----------------------------------|
| &&       | Returns true if boths are true    | true && false = false            |
| ||       | Returns true if one is true       | true \|\| false = true           |
| !        | Returns true if it is false       | !true = false                    |
```

### Ternario
```js
let edad = 25;
let mensaje = edad >= 18 ? "Eres mayor de edad." : "Eres menor de edad.";

console.log(mensaje); // "Eres mayor de edad."
```

---
<br>

## 6. Arrays
### **_MÉTODOS DE ARRAYS:_**
```js
let articulos = ["zapatillas", "camisa", "calcetines", "chaqueta"];

// cuenta los elementos dentro del array => resultado(4)
articulos.length;

// muestra el elemento de esa posición del array
// el primer elemento del array es 0 => resultado(camisa)
articulos[1];

// agrega uno / varios elemento al final del array
articulos.push("balón");

// agrega un elemento al principio del array
articulos.unshift("balón");
articulos.unshift("balón", "manoplas");

// elimina el último elemento del array
articulos.pop();

// elimina el primer campo del array
articulos.shift();
```
<br>

### Otros métodos:
```js
let frutas = ["manzana", "pera", "naranja", "plátano", "fresa"];
``` 
<br>

- **_from()_**
<br>
crea un nuervo array a partir de un objeto iterable

```js
// cada letra será un elemento dentro del array
let frutasForm = Array.from("frutas");

console.log(frutasForm) // ["f", "r", "u", "t", "a", "s"]
```
