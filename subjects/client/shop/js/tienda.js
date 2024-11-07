let criterios = ["Sin ordenar", "Ascendente por precio", "Descendente por precio"]

function creaListaCriterios() {
    let criteriList = document.getElementById('criteriosOrdenacion')

    // OPTION 1 --
    criterios.forEach(element => {
        let option = document.createElement('option')
        option.value = element;
        option.textContent = element;
        criteriList.appendChild(option);
    })

    criteriList.addEventListener("change", (event) => {
        let selectedCriterio = event.target.value;
        pintaArticulos(selectedCriterio);
    })

    // OPTION 2 --
    criterios.forEach((c, i) => {
        op = document.createElement("option")
        op.value = i;
        op.text = c;
        criteriList.appendChild(op);
    })

    criteriList.addEventListener("change", () => pintaArticulos(criteriList.value));
}

function pintaArticulos(orden) {

    let divContent = document.getElementById('contenedor');
    divContent.innerHTML = "";
    // let copiaArticulos = listaArticulos.slice();

    let copiaArticulos = [...listaArticulos]; // + moderna (usar en las prácticas)
    let copyArticles = listaArticulos.slice(); // son lo  mismo

    switch (orden) {
        case "Ascendente por precio":
            copiaArticulos.sort((a, b) => a.precio - b.precio);
            break;
        case "Descendente por precio":
            copiaArticulos.sort((a, b) => b.precio - a.precio);
            break;
        default:
            copiaArticulos;
            break;
    }

    copiaArticulos.forEach(article => {

        let articulo = document.createElement("div");
        articulo.classList.add("col");
        let url = "./assets/" + article.codigo + ".jpg";
        articulo.innerHTML =
            `
            <div class="card">
                <img src="${url}" class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">${article.nombre}</h5>
                    <p class="card-text">${article.descripcion}</p>
                    <b><p class="card-text text-center">${article.precio}€</p></b>
                </div>
                <button id="${article.codigo}" class="btn-success">comprar</button>
            </div>`
        divContent.appendChild(articulo);
    });

    Array.from(document.getElementsByClassName("btn-success")).forEach(btn => btn.addEventListener("click", ponArticuloEnCarrito));
}

function ponArticuloEnCarrito() {

    articulo = listaArticulos.find(a => a.codigo == this.id)
    miCarrito.anyadeArticulo({
        "codigo": articulo.codigo,
        "nombre": articulo.nombre,
        "descripcion": articulo.descripcion,
        "precio": articulo.precio,
        "unidades": 1
    })
}

function verCarro() {
    if (miCarrito.articulos.lenght == 0)
        alert("el carrito está vacío")
    else
        miCarrito.verCarrito();
    document.getElementById("miDialogo").showModal()
}

function efectuaPedido() {
}

window.onload = () => {
    creaListaCriterios();
    pintaArticulos();

    document.getElementById("fotoCarro").addEventListener("click", verCarro)

    miCarrito = new Carrito("3478");
}