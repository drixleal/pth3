/**
 * Requisito 7: Adicionar uma nova recomendação à lista.
 */
function addRecommendation() {
  // Pega o valor do campo de texto da recomendação
  let recommendationText = document.getElementById("recommendation-text").value;
  let recommenderName = document.getElementById("recommender-name").value;

  // Verifica se o campo de texto está vazio
  if (recommendationText.trim() === "") {
    alert("Please enter a recommendation.");
    return;
  }

  // Pega o container onde as recomendações são exibidas
  const recommendationContainer = document.querySelector(
    ".recommendation-cards"
  );

  // Cria os novos elementos para o cartão de recomendação
  const newCard = document.createElement("div");
  newCard.classList.add("recommendation-card");

  const paragraph = document.createElement("p");
  paragraph.textContent = '"' + recommendationText + '"'; // Adiciona aspas

  const span = document.createElement("span");
  // Usa o nome fornecido ou "Anonymous" se estiver vazio
  span.textContent = "- " + (recommenderName.trim() || "Anonymous");

  // Adiciona o parágrafo e o span ao novo cartão
  newCard.appendChild(paragraph);
  newCard.appendChild(span);

  // Adiciona o novo cartão de recomendação ao container
  recommendationContainer.appendChild(newCard);

  // Limpa os campos do formulário
  document.getElementById("recommendation-text").value = "";
  document.getElementById("recommender-name").value = "";

  // Requisito 9: Exibe o pop-up de confirmação
  showPopup();
}

/**
 * Requisito 9: Exibe e fecha o pop-up de confirmação.
 */
function showPopup() {
  const popup = document.getElementById("popup");
  popup.style.display = "block";
}

function closePopup() {
  const popup = document.getElementById("popup");
  popup.style.display = "none";
}

// Opcional: Fechar o pop-up se o usuário clicar fora do conteúdo
window.onclick = function (event) {
  const popup = document.getElementById("popup");
  if (event.target == popup) {
    popup.style.display = "none";
  }
};
