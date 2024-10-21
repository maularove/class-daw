# CSS
## 1. Cómo añadimos CSS en nuestro html

en CSS: 
```css
//importamos
<link rel="stylesheet" href="main.css">

// dentro del css
body {
    margin: 0;
}
```
<br>

podemos ponerlo en uso de dos formas:
en el HTML:
```html
//etiqueta style
<style>
body {
  background-color: #FF00FF;
}
 
h1 {
  color: #FE56A2;
  margin-left: 40px;
}
</style>

//atributo
<h1 style="color:blue;text-align:center;">This is a heading</h1>
```

---
<br>

## 2. Selectores
por preferencia:
- **_STYLE_**: en el html, directo.

- **_ID_**: casos concretos. 

- **_CLASS_**: objetos generales.

- **_STYLE_**: en general.
<br>

en html: 
```html
<p style="color:red" id="parrafo" class="c-parrafo">Hola</p>
```
<br>

en css:
```css
// general
* {
    margin: 0;
}

// id
#parrafo {
    color: red;
}

.c-parrafo {
    background-color: red;
}
//
```

---
<br>

## 3. Modelo de caja
- **_WIDTH_**: ancho del elemento.

- **_PADDING_**: espacio entre el contenid del elemento y su borde (relleno).

- **_MARGIN_**: espacio exterior alrededor del elemento

- **_BORDER_**: el borde del elemento
<br>

```css
.mi_caja {
  width: 80px;
  padding: 5px;
  border: 5px solid red;
  margin: 10px;
}
```
<br>

![imagen importancia botones](../../images//wmbp.png)

---
<br>




