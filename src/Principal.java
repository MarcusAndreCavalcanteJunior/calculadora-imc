public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
/*Foi adcionado uma variavel local no metódo main do tipo Paciente
*e iremos chamar ela joao para não confundir o nome de paciente da
*CalculadoraImc, mesmo elas podendo ter qualquer nome só para não
*confundir e referenciamos o objeto criado a variavel joao alteramos
*a variaveis de instância a atribuimos elas a joao.  */
        Paciente joao = new Paciente();

        joao.peso = 98;
        joao.altura = 1.85;

        IndiceMassaCorporal imc = calculadoraImc.calcular(joao);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f" +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
