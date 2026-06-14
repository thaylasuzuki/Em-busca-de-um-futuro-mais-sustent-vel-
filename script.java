//faz com que as mensagens apareçam
function mostrarMensagem() {
    alert(
        "A agricultura sustentável permite produzir mais alimentos preservando os recursos naturais para as futuras gerações."
    );
}
//topicos sobre a agricultura sustentável
const curiosidades = [
    "A agricultura utiliza cerca de 70% da água doce consumida no mundo.",
    "O plantio direto pode reduzir significativamente a erosão do solo.",
    "Drones ajudam produtores a monitorar lavouras com maior precisão.",
    "A agricultura sustentável contribui para a redução dos gases de efeito estufa.",
    "A rotação de culturas melhora naturalmente a fertilidade do solo."
];
//faz com que os topicos apareçam
const botao = document.getElementById("curiosidadeBtn");
const texto = document.getElementById("curiosidade");

botao.addEventListener("click", () => {
    const aleatoria =
        curiosidades[Math.floor(Math.random() * curiosidades.length)];

    texto.innerHTML = aleatoria;
});
//denomina os titulos de cada beneficios do agro sustentável 
new Chart(ctx,{
 type:'bar',
 data:{
 labels:[
 'Água',
 'Solo',
 'Energia',
 'Produção'
 ],

 datasets:[{
 label:'Sustentabilidade',
 data:[90,85,80,95]
 }]
 }
});
//mostra mais curiosidades 
const curiosidades = [
 "O Brasil é um dos maiores produtores agrícolas do mundo.",
 "Drones conseguem identificar pragas antes mesmo de serem visíveis."
];