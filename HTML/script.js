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

/* CPF validation (converted from Python validar_cpf) */
function validarCPF(cpf) {
  // remove non-digit characters
  cpf = (cpf || "").replace(/\D/g, "");

  if (cpf.length !== 11) return false;

  // reject CPFs with same digit repeated
  if (/^(\d)\1{10}$/.test(cpf)) return false;

  let soma = 0;
  for (let i = 0; i < 9; i++) {
    soma += parseInt(cpf.charAt(i), 10) * (10 - i);
  }
  let resto = soma % 11;
  let dv1 = resto < 2 ? 0 : 11 - resto;
  if (parseInt(cpf.charAt(9), 10) !== dv1) return false;

  soma = 0;
  for (let i = 0; i < 10; i++) {
    soma += parseInt(cpf.charAt(i), 10) * (11 - i);
  }
  resto = soma % 11;
  let dv2 = resto < 2 ? 0 : 11 - resto;
  if (parseInt(cpf.charAt(10), 10) !== dv2) return false;

  return true;
}

// Connect validator to the test UI
document.addEventListener("DOMContentLoaded", function () {
  const btn = document.getElementById("cpf-validate-btn");
  const input = document.getElementById("cpf-input");
  const result = document.getElementById("cpf-result");
  if (btn && input && result) {
    btn.addEventListener("click", function () {
      const value = input.value;
      const ok = validarCPF(value);
      result.textContent = ok ? "CPF válido." : "CPF inválido.";
      result.style.color = ok ? "green" : "crimson";
    });
    const clearBtn = document.getElementById("cpf-clear-btn");
    if (clearBtn) {
      clearBtn.addEventListener("click", function () {
        input.value = "";
        result.textContent = "";
        clearBtn.classList.remove("visible");
      });
    }

    // show/hide clear button based on input content
    input.addEventListener("input", function () {
      if (input.value && input.value.trim().length > 0) {
        clearBtn && clearBtn.classList.add("visible");
      } else {
        clearBtn && clearBtn.classList.remove("visible");
      }
    });
  }
});
