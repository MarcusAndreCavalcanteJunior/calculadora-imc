public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.85;
        paciente.peso = 155.0;

        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        if (imc.estaComObesidade()) {/*//Refatoramos o código fizemos uma
mudaça sem alterar o funcionamento dele é o que chamamos de refatoração
chamando o metodo imc.estaComObesidade() do objeto e classe
IndiceMassaCorporal sem alterar o resultado do programa deixando muito
mais legivel e fácil de dar manutenção agora.*/
            System.out.printf("Paciente com altura de %.2f e peso de %.2f" +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
