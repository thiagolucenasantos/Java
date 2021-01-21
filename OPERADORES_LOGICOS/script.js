// && e  ( compara os valores boleanos e retorna se é verdadeiro ou falso, só retorna verdadeiro se as duas comparações foram verdadeiras)

// || ou (compara os valores somente será falso caso as duas comparações sejam falsas)

// ! Negativo ( inverte o resultado, se é verdadeiro fica falso, se é falso fica verdadeiro)



/////   OPERADOR LOGICO  &&     ======================================

var a = false;
var b = true;

var c = a && b;

console.log(c);


var idade = 40;

var maior20 = idade >= 20;
var menor30 = idade <=30;

var entre = maior20 && menor30;

console.log("idade", idade);

console.log("Maior ou igual a vinte", maior20);

console.log("Menor ou igual a trinta", menor30);

console.log("Entre vinte e trinta", entre);

/////   OPERADOR LOGICO  OU    ======================================


var idade = 30;

var menor10 = idade <= 10;
var maior50 = idade <= 50;

var gratuidade = menor10 || maior50;

console.log("idade", idade);

console.log("Menor que 10", menor10);

console.log("Maior que 50", maior50);

console.log("Tem direito a gratuidade", gratuidade);

/////   OPERADOR LOGICO  !   ======================================


var x = 6;
console.log(!(x > 3 && x < 10));