// Função para confirmar a exclusão de um produto
function confirmarExclusao(event) {
    if (!confirm("Tem certeza que deseja excluir este produto?")) {
        event.preventDefault(); // Cancela a ação se o usuário clicar em "Cancelar"
    }
}

// Adiciona o evento de confirmação a todos os links de exclusão
document.querySelectorAll('a[href*="deletar"]').forEach(function(link) {
    link.addEventListener('click', confirmarExclusao);
});