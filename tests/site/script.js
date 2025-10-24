$("p").first().html("Esse texto sobrescreve o inicial.");
$("p").first().append(" E esse texto é adicionado ao final do novo texto.");
$("p")
  .last()
  .html(
    $("p").last().html() +
      " Esse texto é adicionado ao final do texto existente."
  );
$("p").find("span").html("");
