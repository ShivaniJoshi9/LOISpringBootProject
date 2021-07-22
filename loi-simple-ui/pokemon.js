
const pokemonServiceUrl = 'http://localhost:8080/api/v1/pokemon';


export function helloWorld() {
    console.log("hello world!");
}

updatePokemon();

function updatePokemon() {
    fetchPokemon().then(createTable);
}

async function fetchPokemon() {
    // http GET sent to Java program
    const response = await fetch(pokemonServiceUrl);

    // WHEN the Response comes back from Java program return json
    return response.json();
}

function createTable(pokemonJson) {
    // create table rows here!!
    console.log(pokemonJson);

    let tableHtml = '<thead><th>Name</th><th>Type</th></thead>'

    pokemonJson.forEach( pokemon => {
        tableHtml += '<tr><td>' + pokemon.name + '</td><td>' + pokemon.type + '</td></tr>';
    });

    document.querySelector('#pokemon-table').innerHTML = tableHtml;
}