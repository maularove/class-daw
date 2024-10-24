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
- Alcance: Function scope (o global si se declara fuera)

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
- Alcance: Block scope.

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
- Alcance: Block scope.

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
<br>

- **_concat()_**
<br>
combina dos o más arrays 

```js
let verduras = ["zanahorias", "calabacín", "lechuga"];
let alimentos = frutas.concat(verduras);

console.log(alimentos) // ["fresa", "manzana", "naranja", "pera", "plátano", "zanahoria", "calabacín", "lechuga"]
```
<br>

- **_fill()_**
<br>
remplaza de un número de array a otro por el elemento que queramos

```js
frutas.fill("uva", 2, 4); // 0 1 (2 3) 4 5

console.log(frutas); // ["manzana", "pera", "uva", "uva", "fresa"]
```
<br>

- **_includes()_**
<br>
comprueba si un array contiene un elemento (boolean)

```js
let contienePlatano = frutas.includes("plátano");

console.log(contienePlatano); // true
```
<br>

- **_indexOf() && lastIndexOf()_**
<br>
devuelve el índice de la primera ocurrencia de un elemento en el array

```js
// indexOf()
let indice = frutas.indexOf("naranja")

console.log(indice) // 2

// lastIndex()
let indice = frutas.indexOf("fresa")

console.log(indice) // 4
```
<br>

- **_join()_**
<br>
une todos los elementos de un array en un string

```js
let frutasJuntas = frutas.join(", ");

console.log(frutasJuntas); // "fresa, plátano, naranja, pera, manzana" 
```
<br>

- **_reverse()_**
<br>
invierte el orden de los elementos de un array

```js
frutas.reverse();

console.log(frutas); // ["fresa", "plátano", "naranja", "pera", "manzana"]
```
<br>

- **_slice()_**
<br>
copia una parte de un array convirtiéndolo en uno nuevo

```js
let frutas2 = frutas.slice(1, 3)

console.log(frutas2) // ["pera", "naranja"]
```
<br>

- **_splice()_**
<br>
añade o elimina elementos de un array

```js
// borrará los elementos desde la posición 1 a la 3
// pondrá estos dos nuevos elementos en el medio
frutas.splice(1, 3, "uva", "sandia");

console.log(frutas) // ["manzana", "uva", "sandía", "fresa"]
```
<br>

- **_split()_**
<br>
divide un string en un array de substrings

```js
let manzana = "manzana";
let letras = manzana.split("");

console.log(letras); // ["m", "a", "n", "z", "a", "n", "a"]
```
<br>

- **_sort()_**
<br>
ordena los elementos de una array alfabéticamente

```js
frutas.sort();

console.log(frutas); // ["fresa", "manzana", "naranja", "pera", "plátano"]
```
<br>

### Métodos para recorrer Arrays
```js
let colores = ["rojo", "verde", "azul", "amarillo", "naranja"];
``` 
<br>

- **_forEach()_**
<br>
ejecuta una función por cada elemento del array

```js
colores.forEach((color, index) => {
    console.log(`${index + 1}. ${color}`);
});
// "1. rojo", "2. verde", "3. azul", "4. amarillo", "5. naranja"
```
<br>

- **_map()_**
<br>
crea un nuevo array con los resultados de la función aplicada a cada elemento del array

```js
let coloresMayusculas = colores.map((color) => color.toUpperCas());

console.log(coloresMayusculas);
// ["ROJO", "VERDE", "AZUL", "AMARILLO", "NARANJA"]
```
<br>

- **_filter()_**
<br>
crea un nuevo array con los elementos que cumplen la condición

```js
let coloresCortos = colores.filter((color) => color.length <= 4);

console.log(coloresCortos);
// ["rojo", "azul"]
```
<br>

- **_find()_**
<br>
devuelve el primer elemento que cumple una funcion

```js
let color = colores.find((color) => color === "verde");

console.log("color");
// "verde"
```
<br>

- **_findIndex()_**
<br>
devuelve la posición del primer elemento que cumple la función

```js
let indice = colores.findIndex((color) => color === "verde");

console.log(indice)
// 1
```
<br>

- **_reduce()_**
<br>
aplica una función acumuladora a cada elemento del array, de izquierda a derecha, para reducirlo a un único valor

```js
let numeros = [1, 2, 3, 4, 5];
let suma = numeros.reduce((total, num) => total + num, 0)

console.log(suma) // 15
// callback: (total, num) => total + num
// total -> (es el valor inicial)
// 0 -> (el valor de total es 0)
```
<br>

- **_some()_**
<br>
comprueba si al menos un elemento cumple la condición

```js
let contieneAzul = colores.some((color) => color === "azul");

console.log(contieneAzul) // true
```

---
<br>

## 7. Objetos
 ```js
let persona = {
  nombre: "Ana",
  edad: 25,
  ciudad: "Madrid",
};

persona.nombre = "María";    // Añade el campo "nombre" al objeto y si ya existe lo sobreescribe.
persona["nombre"] = "María"; // Añade el campo "nombre" al objeto y si ya existe lo sobreescribe.
 ```

 ---
 <br>

 ## 8. Spread Operator
 Se utiliza para expandir elementos de un array u objeto en otro array u objeto

```js
// ...colores -> copia del array
let colores = ["rojo", "verde", "azul"];
let colores2 = ["amarillo", "naranja", ...colores];

console.log(colores2);
// ["amarillo", "naranja", "rojo", "verde", "azul"]
```

---
<br>

## 9. Rest Parameter
Permite a una función aceptar un número indefinido de argumentos como un array

```js
function sumar(...numeros) {
    return numeros.reduce((total, num) => total + num, 0)
}

console.log(sumar(1, 2, 3, 4, 5)); //12
// sume todos los números de arriba que le vayas poniendo
```

---
<br>

## 10. For...in & For...of
- **_For...in:_**
<br>
Itera sobre las propiedades de un objeto

```js
let colores = ["rojo", "verde", "azul"];
for (let index in colores) {
  console.log(colores[index]);
}
```
<br>

- **_For...of:_**
<br>
Itera sobre los elementos de cualquier objeto iterable (array, string, map, set, etc...)

```js
let colores = ["rojo", "verde", "azul"];
for (let color of colores) {
  console.log(color);
}
```

---
<br>

## 11. Arrow functions
```js
// Función tradicional
function sumar(a, b) {
  return a + b;
}

// Arrow function
let sumar = (a, b) => a + b;
```

---
<br>

## 12. Synchronous vs Asynchronous
- **_Synchronous:_**
<br>
El código se ejecuta en secuencia, línea por línea, asegurándose que la operación se complete antes de que comience la siguiente.

```js
console.log("Primero");
console.log("Segundo");
console.log("Tercero");
```
<br>

- **_Asynchronous:_**
<br>
El código asíncrono permite que ciertas operaciones se inicien y se completen en el futuro, sin bloquear la ejecucción del código que sigue.

```js
console.log("Primero");
setTimeout(() => console.log("Tercero"), 1000);
console.log("Segundo");
```
