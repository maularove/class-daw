# COMANDOS CLAVE

instalar angular:
```bash
npm install -g @angular/cli
```

<br>

crear proyecto angular:
```bash
ng new mi-proyecto
```

<br>

ejecutar proyecto angular:
```bash
ng serve -o
ng serve --open

ng serve
ng build
```

<br>

generar:
```js
// generar módulo
ng g m './src/app/Modules/modulo1'

// generar componente
ng g c './src/app/Modules/modulo1/components/component1'

// generar interfaz
ng g i './src/app/Modules/modulo1/interfaces/modulo1.interface'
```

<br>

ternaria en boton:
```html
// si unidades menor igual a 0, poner danger, sino primary
<button class="btn btn-primary" [ngClass]="art.unidades <= 0 ? 'btn-danger' : 'btn-primary'">Ver Detalles</button></td>
```

<br>

select con event:
```js
// HTMl
(change)="mostrar($event)">

// TS
mostrar(event: Event) {
    const category = (event.target as HTMLSelectElement).value;
    if (category === 'Todos') {
      this.articles = ARTICLES;
    } else {
      this.articles = ARTICLES.filter(article => article.categoria === category);
    }
  }
```