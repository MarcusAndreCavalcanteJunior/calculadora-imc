public class CalculadoraImc {

    /*As variaveis abaixo podem ser usadas aqui fora do metodo ou usadas
    como parametro dendo do metodo calcular do objeto IndiceMassaCorporal
    vai depender do contexto isso é o foco dessa aula.
    double peso;
    double altura;
    Mas tome cuidado caso vc precise por exemplo calcular o IMC de varias
    pessoas ? Vantagem de usar parâmetros em vez de atributos que vc
    pode chamar diversas vezes com valores diferentes sem precisar criar
    novos objetos ou alterar atributos. Esse tipo de dado geralmente vem
    de algum banco de dados SQL, formularios ou API fica a dica futura.*/

    IndiceMassaCorporal calcular(double peso,  double altura) {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;


        return imc;
    }
}
