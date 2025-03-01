async function enviarMensagem() {
    // Pega o número e a mensagem
    const numero = document.getElementById('numero').value;
    const mensagem = document.getElementById('mensagem').value;

    // Chama o backend para gerar o link
    const response = await fetch(`/gerar-link?numero=${numero}&mensagem=${mensagem}`);
    const linkWhatsApp = await response.text();

    // Abre o link do WhatsApp
    window.open(linkWhatsApp, '_blank');
}

function modoEscuro() {
    document.body.classList.toggle('dark-mode');
}