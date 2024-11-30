# APUNTES EXAMEN

## 1. FLEX
```scss
// de izquierda a derecha
flex-direction: row;

// de arriba a abajo
flex-direction: column;

// si no cabe el elemento llevarlo abajo
flex-wrap: wrap;

// ajustar elementos 
justify-content:flex-start;
justify-content:flex-end;
justify-content:center;
justify-content:space-between;
justify-content:space-around;
justify-content:space-evenly;
```
![Descripción de la imagen](https://logongas.es/lib/exe/fetch.php?media=clase:daw:diw:1eval:flex-justify-content.png)

<br>

---

```scss
// espacio sobrante se distribuye
align-content:flex-start;
align-content:flex-end;
align-content:center;
align-content:strech;
align-content:space-between;
align-content:space-around;
```
![Descripción de la imagen](https://logongas.es/lib/exe/fetch.php?media=clase:daw:diw:1eval:flex-align-content.png)

<br>

---

```scss
// espacio entre los elementos
gap: 15px 10px;
```
![Descripción de la imagen](https://logongas.es/lib/exe/fetch.php?media=clase:daw:diw:1eval:grid-gap.png)

<br>

---

```scss
// elementos se justifican hacia arriba, abajo, ocupando todo el espacio, etc...
align-items:flex-start;
align-items:flex-end;
align-items:center;
align-items:stretch;
align-items:baseline;
```

![Descripción de la imagen](https://logongas.es/lib/exe/fetch.php?media=clase:daw:diw:1eval:flex-align-items.png)

<br>

---

```scss
// permite que crezca el item si hay mas espacio
flex-grow: 1;
```
<br>

---

## 2. GRID

```scss
// layout
.l-page {

    display: grid;
    outline: 1px solid black;
    grid-template-areas:
        "div1 div1 div1 div1"
        "div2 div3 div4 div4"
        "div2 div3 div6 div7"
        "div5 div3 div6 div8";

    &__div1 {
        grid-area: div1;
        outline: 1px solid black;
    }

    &__div2 {
        grid-area: div2;
        outline: 1px solid black;
    }

    &__div3 {
        grid-area: div3;
        outline: 1px solid black;
    }

    &__div4 {
        grid-area: div4;
        outline: 1px solid black;
    }

    &__div5 {
        grid-area: div5;
        outline: 1px solid black;
    }

    &__div6 {
        grid-area: div6;
        outline: 1px solid black;
    }

    &__div7 {
        grid-area: div7;
        outline: 1px solid black;
    }

    &__div8 {
        grid-area: div8;
        outline: 1px solid black;
    }
}
```

<br>


```html
// html
<div class="l-page">
        <div class="l-page__div1">s</div>
        <div class="l-page__div2">s</div>
        <div class="l-page__div3">s</div>
        <div class="l-page__div4">s</div>
        <div class="l-page__div5">s</div>
        <div class="l-page__div6">s</div>
        <div class="l-page__div7">s</div>
        <div class="l-page__div8">s</div>
    </div>
```


