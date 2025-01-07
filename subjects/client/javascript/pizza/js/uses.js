
function lista() {
    let listt = document.getElementById('lista')
    listt.innerHTML = "";

    pizzas.forEach(e => {
        let option = document.createElement("option");
        option.value = e.codigo;
        option.text = e.nombre;

        listt.appendChild(option);

        listt.onchange = () => mostrarPizza(listt.value);
    })
}

function mostrarPizza(codePizza) {
    const pizzaSeleccionada = pizzas.find(pizza => pizza.codigo == codePizza)
    let ingredientt = document.getElementById('ingredientes')
    ingredientt.innerHTML = ""
    let total = 0;

    pizzaSeleccionada.ingredientes.forEach(a => {

        let ingredienteP = document.createElement("p");
        ingredienteP.textContent = `${a.ingrediente}`;
        ingredientt.appendChild(ingredienteP); // Agrega el ingrediente sin sobrescribir
    })

    // foto pizza
    let imagePizza = document.getElementById('fotopizza')
    imagePizza.innerHTML = ""
    if (codePizza !== "P0")
        imagePizza.innerHTML = `<img src="./assets/${codePizza}.jpg" style="margin: 15px; width: 200px; height: 100px;"></img>`

    // mostrar el importe
    let importt = document.getElementById('importe')
    total = pizzaSeleccionada.ingredientes.reduce((acc, ingrediente) => acc + Number(ingrediente.precio), 0);
    importt.innerHTML = `Importe: ${total}`;
}

window.onload = () => {
    // alert("Welcome to the greatest italian restaurant");
    lista();
    mostrarPizza('P0');
}