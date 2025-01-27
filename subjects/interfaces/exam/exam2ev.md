# APUNTES 2º EVALUACIÓN

## 1. Transformaciones
rotar elemento
```js
// rotarlo 20 grados
div {
    transform: rotate(20deg);
}
```


distorsiona elemento 
```js
// 20 deg => eje x
// 10 deg => eje y 
div {
    transform: skew(20deg, 10deg);
}
```
<br>

---

## 2. Transiciones

se usan sobre todo para hacer cambios en los eventos de:
<br>

- `:hover`
<br>

- `:focus`
<br>

- _etc.._

```js
transaction: propiedadCSS duration timing-function delay;
```
<br>

ejemplo boton 
```js
/CSS
<style>
   .c-button {
            padding: 10px 20px 10px 20px;
            background-color: #ffffff;
            border: 1px solid #bbd4f7;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.5s, box-shadow 0.5s;
        }

        .c-button:hover {
            background-color: #bbd4f7;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        } 
</style>

------------------------------

/HTML
<button class="c-button">boton</button>
```