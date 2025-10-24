// Usamos nossa boa prática: $(document).ready()
$(function () {
  // "Ouvinte" de clique para o link com id="lnk"
  $("#lnk").click(function () {
    $.ajax({
      // 1. A URL (usando a 'page=2' da resolução do professor)
      url: "https://reqres.in/api/users?page=2",
      type: "get",

      // 2. O que fazer antes de enviar
      beforeSend: function () {
        $("#resultado").html("Carregando...");
      },

      // 3. !! A NOSSA CORREÇÃO (A Chave de API) !!
      headers: {
        "x-api-key": "reqres-free-v1",
      },
    })
      .done(function (msg) {
        // 4. O que fazer se der CERTO!
        // 'msg' é a resposta (com 'msg.data' sendo a lista de usuários)

        // Vamos construir a tabela (código do professor):
        var table = "<table border='1'>";

        // Cabeçalho da tabela
        table +=
          "<tr><th>Id</th><th>Email</th><th>Nome</th><th>Sobrenome</th><th>Avatar</th></tr>";

        // .map() é um loop (igual ao $.each) para varrer a lista de usuários
        $.map(msg.data, function (val, i) {
          // Adiciona uma linha <tr> para cada usuário
          table +=
            "<tr>" +
            "<td>" +
            val.id +
            "</td>" +
            "<td>" +
            val.email +
            "</td>" +
            "<td>" +
            val.first_name +
            "</td>" +
            "<td>" +
            val.last_name +
            "</td>" +
            "<td>" +
            val.avatar +
            "</td>" +
            "</tr>";
        });

        table += "</table>";

        // Coloca a tabela pronta dentro da div#resultado
        // (O professor usou .html("") e .append(),
        // mas só .html(table) é mais simples e faz o mesmo)
        $("#resultado").html(table);
      })
      .fail(function (jqXHR, textStatus, msg) {
        // 5. O que fazer se der ERRADO
        console.log("A requisição falhou: " + msg);
        $("#resultado").html("Falha ao carregar o recurso.");
      });
  }); // Fim do .click()
}); // Fim do $(function())
