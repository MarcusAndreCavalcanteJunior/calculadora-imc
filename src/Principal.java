public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        /*São da variavel de instacia do CalcularImc iremos passar os parametros
        abaixo
        calculadoraImc.altura = 1.85;
        calculadoraImc.peso = 155.0;
        (1.85, 98) e nesse trecho do código abaixo ele não vai para o código fonte
        sempre preste atenção de onde ele é e onde esta sendo atribuido.
        E para não deixar tão poluido com rótulo o normal pe criar as variaveis
        como faremos abaixo para ele atribuir o valor que informado.*/
        double peso = 98;
        double altura = 1.85;

        IndiceMassaCorporal imc = calculadoraImc.calcular(peso, altura);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f" +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
