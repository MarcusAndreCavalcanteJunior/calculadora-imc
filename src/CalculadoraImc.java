public class CalculadoraImc {
/*O nome e a classe Paciente estava muito estensa e meio confusa pois o
* um paciente no mundo real demandaria muitas responsabilidades por isso
* foi alterado o nome da classe e o metodo que estava com nome estenso
* e não fazia sentido e na próxima aula aprenderemos a passar parametros
* para os métodos. Por isso refatoramos essa classe e o metodo
* IndiceMassaCorporal para calcular pois a classe já tem esse comportamento
* e assim sendo mais coeso.*/
    double peso;
    double altura;

    IndiceMassaCorporal calcular() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;


        return imc;
    }
}
