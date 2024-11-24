# LA WEB
la web son páginas (HTML, Imagen, XML, JSON, etc...) que se interconectan entre ellas por enlaces (urls).

![Esquema web](https://logongas.es/lib/exe/fetch.php?cache=&w=873&h=299&tok=f0e8c2&media=clase:daw:daw:1eval:esquema_web.png)

<br>

---


Servidor `TCP-IP` responde usando el protocolo `HTTP` devolviendo datos

---
<br>

En una app web hay 3 tipos de código:
<br>

___código de visualización:___
<br> 
HTML, CSS, Imágenes, Videos, etc...
<br>

___código en el cliente:___ 
<br>
el JS que se ejecuta en el navegador

___código en el servidor:___
<br>
programa específico de la app que se ejecuta en el servidor web
<br>

---

## 1. Chrome DevTools
herramienta que depura la página web
<br>

---

## 2. Desplegar
- ___generación de la aplicación a instalar:___
    - obtener código fuente
    - compliar código fuente
    - probar app
    - analizar calidad código

- ___programas a instalar:___
    - sistema operativo
    - servidor web
    - base de datos
    - la app
    - servidor de envío de correos
    - etc...

- ___hosts:___
    - se puede tener base datos y server web en distintos hosts
    - host puede estar en máquinas _físicas_ / _virtuales_ 
    - cada máquina puede estar en proveedores distintos (Amazon AWS, Microsoft Azure, Google Cloud, etc...)

- ___administración:___
    - creación copias de seguridad
    - logs
    - seguridad en recuperación de datos en caso de fallo

- ___Fiabilidad:___
    - permitir aplicación siga funcionando aunque falle algún host

- ___Microservicios:___
    - app se divide en micro-apps (microservicios)
    - se multiplican las complicaciones anteriores por nº de microservicios que tengamos

<br>

---

## 3. Herramientas relacionadas con el despliegue

herramientas para clase:
- `Script de Bash`

- `Git`

- `Docker`

- `Git Actions`

- `NodeJS`
<br>

otras herramientas y servicios:
- `Kubernetes`

- `Vagrant`

- `AWS`

- `Ansible`

- `Jenkins`

- `...`
<br>

---

## 4. Conceptos Generales
`VPS` =>
<br>
máquina virtual que alquilas en una empresa
<br>

`empresa de hosting` =>
<br>
empresa que alquila hosts: _VPS_ / _máquina real_
<br>

`balanceador de carga` => 
<br>
software que administra las peticiones a los host para que ninguno se sobrecargue. 
<br>
ni enviarla a uno que no funcione.
<br>

`escalabilidad` => 
<br>
diseñar app para que se alquilen y desalquilen hosts en función de la carga del sistema
<br>

`Tolerancia a fallos` => 
<br>
diseñar app que funcione aunque algún host falle
<br>

`IAAS` (infraestructura como servicio) =>
<br>
HOSTS ✔️ / SOFTWARE ❌
<br>
empresa hosting solo ofrece Host
<br>
nosotros instalamos todo el software, incluyendo sistema operativo y administrarlo todo 
<br>

`PAAS` (plataforma servicio) =>
<br>
HOSTS ✔️ / SOFTWARE ✔️
<br>
empresa hosting ofrece Host
<br>
también ofrece software genérico, incluyendo sistema operativo, servidor web, servidor de correo, balanceador de carga, etc...
<br>
solo necesitamos instalar código específico
<br>

`SAAS` (software como servicio) =>
<br>
desarrolladores nunca usan sass
<br>
empresa hosting ofrece hasta la app instalada
<br>
ej. Google Docs (Google), MS Office 365 (Microsoft), DropBcx...
<br>

### IAAS vs PAAS

| Modelo       | Versatilidad                  | Facilidad de uso                |
|--------------|-------------------------------|----------------------------------|
| IAAS         | ➕ versatil      | ➕ complicado de hacer y administrar |
| PAAS         | ➖ versatil    | ➖ complicado de usar      |

<br>

---

## 5. NodeJS
lenguaje de programación basado en JS
<br>
de lenguaje encriptado (mas similar a bash que a java)
<br>

### Instalación de NodeJS
instalar node en ___ubuntu___
```js
// configurar proxy que usa CIPFP Mislata
// editar /etc/apt/apt.conf
Acquire::http::proxy "http://172.16.0.9:8080/";
Acquire::https::proxy "http://172.16.0.9:8080/";
```
<br>

instalar node en ___windows___
```bash
sudo apt update
sudo apt install nodejs
sudo apt install npm
```
<br>

configurar el proxy para el gestor de paquetes node
```bash
npm config set proxy http://172.16.0.9:8080
npm config set https-proxy http://172.16.0.9:8080
```
<br>

iniciar proyecto node
```js
// instala package.json
npm init
```
<br>

instalar 
```js
// instalar librería _jQuery_ de JS
npm install jquery

// instalar paquete de forma global
// se guarda en /usr/bin
npm install typescript -g

// instalar todo de nuevo si no está la carpeta (node_modules)
npm install
```
<br>

ejecutar código
```js
#!/usr/bin/env node
 
console.log('Hola Mundo');
```
hay que usar esto
```js
node index.js
```
se puede usar todo lo que sabemos de JS en node
<br>

---

## 6. Unicode
estándar de codificación
<br>

`objetivo` => permitir representación de todos los caracteres utilizados en los sistemas de escritura, además de _símbolos_ y _emojis_
<br>

asigna ___nº único___ a cada carácter (punto de código)
<br>

son desde U+0000 hasta U+10FFFF (2.097.152 de caracteres)
<br>

además de unicode hay:
<br>

### ASCII
desarrollado en los `60s`
<br>

diseñado principalmente para manejar textos en inglés 
<br>
(no hay acentos ni caracteres especiales de otros idiomas)
código 7 bits
<br>

128 caracteres diferentes
<br>
incluyendo mayúsculas, minúsculas del alfabeto en inglés, números, algunos símbolos de puntuación y caracteres de control (salto de línea, tabulador...)
<br>

### ANSI
amplían estandar ASCII a 8 bits
<br>

hay distintas codificaciones ANSI en los nuevos 128 caracteres para distintos idiomas como ruso o griego
<br>

### Windows
tiene su propio estándar que es muy similar al ANSI
<br>

### UTF-8 (Unicode Transformation Format - 8 bits)
esquema de codificación variable
<br>

utiliza entre ___1___ y ___4___ bytes para representar cada carácter Unicode.
<br>

__altamente eficiente:__
<br>
para textos en idiomas que utilizan caracteres latinos comunes
ya que estos se representan en un solo byte 
<br>

la más usada debido a =>
<br>
- su ___compatibilidad___ con sistemas más antiguos que utilizan ASCII
<br>
- capacidad para ___codificar___ cualquier carácter Unicode
<br>
- eficiencia en ___almacenamiento___ para la mayoria de lenguajes occidentales

| Code Point Range | Byte 1   | Byte 2   | Byte 3   | Byte 4   |
|------------------|----------|----------|----------|----------|
| U+0000..007F     | 0xxxxxxx |          |          |          |
| U+0080..07FF     | 110xxxxx | 10xxxxxx |          |          |
| U+0800..FFFF     | 1110xxxx | 10xxxxxx | 10xxxxxx |          |
| U+10000..10FFFF  | 11110xxx | 10xxxxxx | 10xxxxxx | 10xxxxxx |
