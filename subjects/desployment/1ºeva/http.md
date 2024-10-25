# EL Protocolo HTTP

Se usa para `enviar` y `recibir` datos en la web.
<br>

## 1. Características
- **_Sencillo:_**
<br>
modo texto, fácil de usar

- **_Extensible:_**
<br>
se pueden enviar más metadatos que los que están por defecto.
<br>
_ej. nº de página_

- **_Sin estado:_**
<br>
cada petición es independiente / suele tener problemas. 
<br>
_ej problema. carrito de la compra_

---
<br>

## 2. Ventajas
- **_Cache:_**
<br>
controlar el cache en las páginas mejora la velocidad

- **_Autentificación:_**
<br>
permite `identificar` al usuario

- **_Proxys:_**
<br>
permite de forma permanente usar proxies

- **_Sesiones:_**
<br>
podemos mantener el estado entre peticiones mediante cookies

- **_Formatos:_**
<br>
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
<br>
ej. **text/html**, **text/xml**, **application/json**, **application/pdf** 

- `Accept-Language` => idioma en el que queremos los datos

- `Host` => el dominio al que se está enviando la petición
<br>
es útil porque permite tener alojados varios dominios en un mismo servidor

