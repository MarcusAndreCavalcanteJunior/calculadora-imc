public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.85;
        paciente.peso = 155.0;
        /*agora o imc não é mais um double é o tipo peso
        IndiceMassaCorporal . Para retornar um objeto basta vc criar
        a classe que vai representar ela nesse caso o IndiceMassaCorporal
        Basta criar a classe para representar esse objeto no caso o
         IndiceMassaCorporal com os atributos vc tbm pode ter métodos aqui
         em outra aula isso será abordado, e nesse caso está servindo como uma
         estrutura de dados é um objeto para carregar dados não sendo sempre o
         ideal, se vc puder adcionar metódos aqui vc deixa sua classe mais rica
         */
        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        if (imc.resultado >= 30) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f" +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
