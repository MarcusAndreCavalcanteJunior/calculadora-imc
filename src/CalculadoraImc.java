public class CalculadoraImc {

/*Abaixo iremos passar o objeto Paciente como parâmetro para o metódo
calcular e abaixo referênciamos o objeto paciente com as variaveis
do tipo peso e altura no metódo abaixo.
Qual a vantagem de passar o objeto Paciente inteiro em vez de passar
os dois double separados? Enxugar o código e facilitar futuras
manutenções ou novas funcionalidades creio eu ?Exato! E tem mais um
detalhe prático — imagina que amanhã o Paciente ganha um novo atributo
como idade e você precisa usá-lo no cálculo.
Se o método recebesse doublepeso, double altura você teria que alterar
a assinatura do método para adicionar double idade. Já passando o objeto
Paciente inteiro, é só usar paciente.idade dentro do método —sem mudar
nada na assinatura. */
    IndiceMassaCorporal calcular(Paciente paciente) {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;


        return imc;
    }
}
