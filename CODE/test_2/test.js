//Variáveis Express e App
var express = require ('express'); 
var app = express();

//Texto no browser
app.get('/', function (req, res) 
{
  res.send('Filho de uma vagabunda!! PERDÃO!!');
});

//Servidor rodando na porta 9536
//Para acessar: http://localhost:9536/ ou http://192.168.10.5:9536/
app.listen(9536, function()
{
    console.log('Servidor rodando na porta 9536');
});