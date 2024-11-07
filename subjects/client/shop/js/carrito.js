class Carrito {

    constructor(id) {
        this.id = id;
        this.articulos = [];
    }

    anyadeArticulos(articulo) {

        var position = this.articulos.findIndex(a => a.codigo == articulo.codigo);

        if (position == -1)
            this.articulos.push(articulo);
        else
            this.articulos[pos].unidades++;
    }

    borraArticulo(codigo) {
        var position = this.articulos.findIndex(a => a.codigo == codigo);
        this.articulos.splice(position, 0);

    }

    modificaUnidades(codigo, operacion) {
        let position = this.articulos.findIndex(a => a.codigo == codigo);
        // this.articulos.splice(pos, 1);
        // this.verCarrito()
        let articulo = this.articulos[pos];
        articulo.unidades += operacion;
        if (articulo.unidades == 0) {
            this.articulos.splice(pos, 1)
        }
    }

    contadorCarrito() {
    }

    verCarrito() {

        var miHtml = `<table class='table table-bordered table-striped'>
                        <tr>
                            <td>
                            <td>nombre
                            <td>descripcion
                            <td>precio
                            <td>unidades
                            <td>total`

        var total = 0;
        miCarrito.articulos.forEach(a => {
            var totalLinea = a.unidades * a.precio
            miHtml += `<tr><img src="assets/${a.codigo}.jpg" width="40px" height="40px">
                        <td>${a.nombre}
                        <td>${a.descripcion}
                        <td>${a.precio}
                        <td>${a.unidades}
                        <td>${a.total}
                        <td><button class="btn btn-primary incrementer" id=${a.codigo}>+</button>
                            <button class="btn btn-warning decrementer" id=${a.codigo}>-</button>
                            <button class="btn btn-danger" id=${a.codigo}>+</button>`

            total += totalLinea;
        });

        miHtml = "</table>"

        document.getElementById("dialogContent").innerHTML = miHtml;
        document.getElementById("total").innerHTML = total + "€";

        //evento borrar
        Array.from(document.getElementsByClassName("btn btn-danger")).forEach(btn => btn.addEventListener("click", () => this.borraArticulo))
    }
}