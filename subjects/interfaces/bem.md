# BEM ( Bloque Elemeto Modificador )
## 1. ¿¿Qué es _BEM_??

Bem es una metodología de desarrollo web que nos permite estructurar y organizar nuestro código CSS de una forma más sencilla y ordenada.  
BEM se basa en la creación de bloques, elementos y modificadores.

---
<br>

## 2. Estructura
- **_BLOQUE:_** componente principal
<br>

- **_ELEMENTO:_** parte de un bloque
<br>

- **_MODIFICADOR:_** variante de un bloque o elemento
<br>

```html
<div class="l-block">
    <div class="c-block"></div>

    <div class="c-block">
        <div class="c-block__element">
        <div class="c-block__element">
    </div>

    <div class="c-block c-block--modifier">
        <div class="c-block__element c-block__element--modifier">
        <div class="c-block__element c-block__element--modifier">
    </div>

    <div class="g--modifier"></div>
</div>
```

---
<br>

## 3. Bloques
- Los bloques son los componentes principales de la aplicación.
<br>

- Pueden ser los siguientes:
    - **_COMPONENTES:_** header, navbar, sidebar, footer, etc...
    - **_LAYOUTS:_** container, grid, flex, etc...

```scss
.c-block {
    background-color: red;
    color: white;
    padding: 10px;
}

.l-block {
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 10px;
}
```

---
<br>

## 4. Elementos
- Los elementos son las partes de un bloque. 
<br>

- Se definen con dos guiones bajos  ``__``
<br>

```scss
.block__element {
    // estilos
}
```

---
<br>

## 5. Modificadores
- Los modificadores son las variantes de un bloque o elemento.
<br>

- Se definen con dos guiones medios ``--``
<br>

- Existen los modificadores globales, se definen con ``g--``

```scss
.block--modifier {
    // Estilos
}

.block__element--modifier {
    // Estilos
}

.g--modifier {
    // Estilos
}
```

---
<br>

## 6. Estructura de ficheros
```
/css
   main.css
/scss
   /01_utilities
       _css-variables.scss
       _sass-variables.scss
       _functions.scss
       _mixins.scss
  /02_base
      _override.scss
      _reset.scss
      _typography.scss
  /03_layout
      _cada_uno_de_los_layouts.scss
  /04_components
      _cada_uno_de_los_componentes.scss
  /05_pages
      _estilos_especificos_de_una_pagina_concreta.scss
  /06_global
      _cada_una_de_los_modificadores_globales.scss
  main.scss
```


