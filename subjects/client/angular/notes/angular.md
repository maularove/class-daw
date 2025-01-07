# ANGULAR

=> es un framework JavaScript
<br>

=> construido sobre TypeScript de código abierto
<br>

=> desarrollado por Google
<br>

=> una de las plataformas más populares para el desarrollo web frontend


## 1. VENTAJAS DE ANGULAR

`Modularidad` =>
<br>

se basa en una arquitectura modular que facilita organización y mantenimiento del código
<br>
<br>

`Enrutamiento` =>
<br>

proporciona sistema de enrutamiento robusto para navegar entre diferentes secciones de la aplicación
<br>
<br>

`Data Binding` =>
<br>

facilita la conexión entre ___interfaz de usuario___ y ___datos de la app___ mediante data binding
<br>
<br>

`Directivas` =>
<br>

proporciona conjunto de directivas que permiten modificar el comportamiento de los elementos HTML
<br>
<br>

`Inyección de dependencias` =>
<br>

facilita inyección de dependencias en los componentes y servicios
<br>
<br>

`Testing` =>
<br>

proporciona herramientas para facilitar las pruebas de las apps

<br>

---

## 2. INSTALAR ANGULAR

actualizar npm
```js
npm install -g npm
```
<br>

instalar CLI (Command Line Interface) de angular
```js
npm install -g @angular/cli
```
<br>

comprobar versión
```js
ng version
```
<br>

crear proyecto angular
```js
ng new mi-app
```
<br>

situarnos en la carpeta del espacio de trabajo, como my-app
```js
cd mi-app
```
<br>

inicia servidor, observa sus archivos y reconstruye la app
<br>
___--open___ abre automáticamente el navegador

```js
ng serve --open
```
<br>

también podemos ejecutar el proyecto con:

```js
npm start   
``` 

<br>

---

## 3. Modo Producción

angular => permite trabajar en local en un modo de desarrollo 
<br> 

cuando esté el proyecto finalizado, genera los archivos neresarios para la ejecución del proyecto en un servidor web
<br>


| Command    | Description                                                                                       | Output Folder         | Serving Behavior                |
|------------|---------------------------------------------------------------------------------------------------|-----------------------|---------------------------------|
| ng serve   | Para desarrollos rápidos, locales e iterativos. También para compilar, observar y servir la app desde un servidor de desarrollo CLI local. | No output folder; elements are kept in memory. | Serves the app for faster development experience. |
| ng build   | Compila la app e implementa los elementos de compilación.                                              | Outputs to `dist/`.   | Generates files once and does not serve them.   |

<br>

---

## 4. Módulos

clase con decorador `@NgModule`, que agrupa componentes, directivas, pipes y otros servicios relacionados.
<br>

___¿¿que es un decorador?? 
<br>
(función especial que se usa para agregar metadatos a una clase, propiedad o método)___

<br>

crear módulo de forma manual

```js
ng g m mi-modulo
```

<br>

---

## 5. Componentes

bloques básicos de construcción de las páginas web en Angular.
<br>

- parte visual ___HTML___

- parte funcional ____TypeScript____

### Ciclo de vida de los componentes:

`ngOnChanges:`
<br>
se ejecuta =>
<br>
cuando se detecta un cambio en las propiedades de entrada del componente

<br>

`ngOnInit:`
<br>
se ejecuta 1 vez =>
<br>
después de que el componente ha sido inicializado y sus propiedades han sido establecidos

<br>

`ngDoCheck:`
<br>
se ejecuta =>
<br>
después de cada detención de cambios
permite realizar comprobaciones personalizadas

<br>

`ngAfterContentInit:`
<br>
se ejecuta una vez =>
<br>
después de que el contenido del componente (plantillas hijas) haya sido inicializado.

<br>

`ngAfterContentChecked:`
<br>
se ejecuta =>
<br>
después de cada detección de cambios en el contenido del componente.

<br>

`ngAfterViewInit:`
<br>
se ejecuta una vez =>
<br>
después de que la vista del componente (DOM) haya sido realizado

<br>

`ngAfterViewChecked:`
<br>
se ejecuta =>
<br>
después  de cada detección de cambios en la vista del componente.

<br>

`ngOnDestroy:`
<br>
se ejecuta =>
<br>
antes de que el componente sea destruido
permite realizar tareas de limpieza