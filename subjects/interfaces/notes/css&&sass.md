# INTRODUCCIÓN AL CSS Y SASS

## 1. Arquitectura CSS
Objetivos de un CSS:
<br>

- **_PREDECIBLE_**: escribir reglas claras
<br>

- **_REUTILIZABLE_**: no escribir código redundante
<br>

- **_MANTENIBLE_**: fácil de leer
<br>

- **_ESCALABLE_**: fácil crecimiento sin afectar el rendimiento

---
<br>

## 2. Reset CSS

Navegadores por defecto tienen ciertas propiedades.
<br>

Debemos poner **_propiedades propias_** para tenerlos por iguale en todos los navegadores
<br>

recomendados siguientes CSS:
<br>
[normalize.css](https://necolas.github.io/normalize.css/)
<br>
[reset.css](https://meyerweb.com/eric/tools/css/reset/)

---
<br>

## 3. Introducción Prepocesadores CSS (SASS)
SASS es un prepocesador de CSS
<br>

Añade funcionalidades al CSS para optimizarlo

### 3.1 Instalación
```scss
npm install -g sass
```

### 3.2 Variables
SASS:
```scss
$font-main: Helvetica, sans-serif;
$primary-color: #E4A23F;
 
 
body {
  font-family: $font-main;
  color: $primary-color;
}
```
convertido en CSS:
```css
body {
  font-family: Helvetica, sans-serif;
  color: #E4A23F;
}
```

### 3.3 Bucles
SASS:
```scss
$colors: (
   "rojo": #FF0000, 
   "verde": #00FF00, 
   "azul": #0000FF
);

// for
@for $i from 1 through 3 {
  .item-#{$i} {
    width: 2em * $i;
  }
}

// each
@each $name, $color in $colors {
  .background-#{$name} {
    background-color: $color;
  }
}

// while
$i: 1;
@while $i <= 3 {
  .item-#{$i} {
    width: 2em * $i;
  }
  $i: $i + 1;
} 
```

### 3.4 Selector Padre
SASS:
```scss
AAA {
  color:red;
   
  &__BBB {
    padding:5px;
  }
}
```
convertido en CSS:
```css
AAA {
  color:red;
}
   
AAA__BBB {
  padding:5px;
}
```

### 3.5 Transformación de SASS a CSS
transformación normal:
```scss
sass ./main.scss ./main.css
``` 

transformación automática siempre que guardes:
```scss
sass --watch ./main.scss ./main.css
``` 

se puede crear un .sass en común con todos, los importas y puedes convertirlo todo a un css
```scss
@import "./_c-button.scss";
``` 

