public class Paciente {

    double peso;
    double altura;
/*No método IndiceMassaCorporal alteramos de double para IndiceMassaCorporal
* e na linha abaixo instanciamos ele na linha
*IndiceMassaCorporal imc = new IndiceMassaCorporal(); */
    IndiceMassaCorporal calcularIndiceMassaCorporal() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;


        return imc;//E por fim retornamos ele aqui o imc
    }
}
