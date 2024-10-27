# EL Protocolo HTTP

Se usa para `enviar` y `recibir` datos en la web.
<br>

## 1. Características
- **_Sencillo:_**
modo texto, fácil de usar

- **_Extensible:_**
se pueden enviar más metadatos que los que están por defecto.
_ej. nº de página_

- **_Sin estado:_**
cada petición es independiente / suele tener problemas. 
_ej problema. carrito de la compra_

---
<br>

## 2. Ventajas
- **_Cache:_**
controlar el cache en las páginas mejora la velocidad

- **_Autentificación:_**
permite `identificar` al usuario

- **_Proxys:_**
permite de forma permanente usar proxies

- **_Sesiones:_**
podemos mantener el estado entre peticiones mediante cookies

- **_Formatos:_**
permite indicar el formato de lo que se `envía`, `pide` y `retorna`

---
<br>

## 3. Formato
### Petición:
```http
GET /index.html HTTP/1.1
Host: www.fpmislata.com
Accept-Language: fr
```
<br>

- `GET` => método donde pide datos
<br>
ej. GET, PUT, POST, DELETE

- `/index.html` => **ruta** dentro del servidor del documento que estamos pidiendo

- `HTTP/1.1` => versión del control

- `Host: www.fpmislata.com` => cabecera indica nombre del host al que va dirigida

- `Accept-Language: fr` => en que idioma lo devuelve
<br>

### Respuesta:
```http
HTTP/1.1 200 OK
Content-Length: 29769
Content-Type: text/html; charset=utf-8

<!DOCTYPE html... (los 29769 bytes de la página)
```
<br>

- `HTTP/1.1` => versión del protocolo de la respuesta

- `200 OK` => muestra si la petición es **_existosa / no existosa_**

- `Content-Length: 29769` => _cabecera llamada **Content-Length**_
<br>
indica **_bytes_** que ocupan los datos que devuelve

- `Content-Type: text/html; charset=utf-8` => _cabecera llamada **Content-Type**_
<br>
indica el formato **MIME type** de los datos que devuelve y su codificación

- `<!DOCTYPE html...` => los datos que se han pedido

---
<br>

## 4. Cabeceras HTTP

Están las que se envían en `petición` && las que se retornan en la `respuesta`
<br>

### Petición
- `Accept` => formato **MIME type** que queremos que devuelva.

ej. **text/html**, **text/xml**, **application/json**, **application/pdf** 

- `Accept-Language` => idioma en el que queremos los datos

- `Host` => el dominio al que se está enviando la petición

es útil porque permite tener alojados varios dominios en un mismo servidor

- `Content-Type` => formato de los datos que envían al servidor.
formatos suelen ser: **_uft-8_** / **_ISO-8859-1_**
_ej. text/html, text/xml, application/json_

### Respuesta
- `Content-Type` => formato de los datos que envían al servidor.
formatos suelen ser: **_uft-8_** / **_ISO-8859-1_**
_ej. text/html, text/xml, application/json_

- `Content Language` => idioma de los datos que se retornan

- `Content-Length` => tamaño de los datos en bytes

- `Cache-Control` => Cuanto tiempo pueden estar cacheados los datos

---
<br>

## 5. Estados HTTP
indica si una petición ha tenido éxito o no. 
<br>
Sus principales son:

- `200-299`: la petición ha tenido éxito

- `300-399`: redirección de los datos

- `400-499`: datos enviados por el cliente no son correctos

- `500-599`: se ha producido un error en el servidor

---
<br>

## 6. Métodos
indican que acción queremos hacer con los datos.

- `GET` => obtener datos

- `POST` => añadir los datos

- `PUT` => actualizar datos

- `DELETE` => borrar datos

ej. 
```http
// obtener fichero index.html

GET /index.html HTTP/1.1
Host: www.fpmislata.com
Accept-Language: fr
```

---
<br>

## 7. REST 
aprovecha al máximo las capacidades de HTTP en lugar de reinventar procesos o estructuras que ya están bien definidas en el protocolo
<br>
formato usado en datos de forma general: `JSON`

### operaciones a realizar
```javascript
| Método HTTP | Descripción                                             | Método CRUD | Método SQL |
|-------------|---------------------------------------------------------|-------------|------------|
| GET         | Usado para leer datos del servidor                      | Read        | SELECT     |
| POST        | Usado para añadir datos al servidor                     | Create      | INSERT     |
| PUT         | Usado para actualizar datos en el servidor              | Update      | UPDATE     |
| DELETE      | Usado para borrar datos del servidor                    | Delete      | DELETE     |
```
<br>

### estructura de la url
```javascript
| Descripción           | URL                | Método HTTP | JSON Enviado       | JSON Retornado      |
|-----------------------|--------------------|-------------|--------------------|---------------------|
| Obtener un libro      | /libro/{idLibro}   | GET         | Ninguno            | Libro leído         |
| Listado de libros     | /libro             | GET         | Ninguno            | Array de Libros     |
| Añadir un libro       | /libro             | POST        | Libro a insertar   | Libro insertado     |
| Actualizar un libro   | /libro/{idLibro}   | PUT         | Libro a actualizar | Libro actualizado   |
| Borrar un libro       | /libro/{idLibro}   | DELETE      | Ninguno            | Ninguno             |
```

---
<br>

## 8. Servidor REST en NodeJS
modificar nuestro servidor en NodeJS para poder leer y modificar cosas relacionadas con HTTP.

- leer cabeceras

- aceptar varios métodos

- retornar varios códigos de estado

- devolver cabeceras

```js
const express = require('express')
const app = express()
const port = 80
  
app.get('/', (request, response) => {
  response.set('Content-Type', 'text/plain');
  response.status(200);
 
  if (request.header('Accept-Language').startsWith("ca-ES")) {
    response.send("Hola mon");
  } else if (request.header('Accept-Language').startsWith("en-EN")) {
    response.send("Hello World");
  } else  {
    response.send("Hola mundo");
  }
 
   
});
app.post('/', (request, response) => {
  response.status(200);
  response.send('Hello from post!');
});
app.delete('/', (request, response) => {
  response.status(200);
  response.send('Hello from delete!');
});
app.delete('/libro/38', (request, response) => {
  response.status(200);
  response.send('Borrado libro 38');
});
app.delete('/libro/39', (request, response) => {
  response.status(404);
  response.send('El libro 39 no existe');
});
  
app.listen(port, (err) => {
  console.log(`server is listening on ${port}`)
})
```