// Inicializa contadores se não existirem
if (!localStorage.getItem('artigos')) {
    const dados = {
        1: { views: 0, comments: 0, favs: 0 },
        2: { views: 0, comments: 0, favs: 0 }
    };
    localStorage.setItem('artigos', JSON.stringify(dados));
}

// Atualiza a página de listagem
function atualizarLista() {
    const dados = JSON.parse(localStorage.getItem('artigos'));
    for (const id in dados) {
        document.getElementById(`views-${id}`).textContent = dados[id].views;
        document.getElementById(`comments-${id}`).textContent = dados[id].comments;
        document.getElementById(`favs-${id}`).textContent = dados[id].favs;
    }
}
atualizarLista();

// Incrementa visualizações ao clicar no link
function incrementViews(id) {
    const dados = JSON.parse(localStorage.getItem('artigos'));
    dados[id].views += 1;
    localStorage.setItem('artigos', JSON.stringify(dados));
}
