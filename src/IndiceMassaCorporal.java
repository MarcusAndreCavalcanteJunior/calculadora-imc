public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;
/*Podemos deixar essa classe IndiceMassaCorporal mais rica atribuindo a ela
certos comportamentos e não deixando a classe e o objeto
IndiceMassaCorporal somente como uma estrutura de dados por isso
adcionamos o metodo estaComObesidade() e não deixando ela uma classe
anêmica e usando a regra do metodo assim evitando a duplicação de código
conforme o programa for crescendo*/
    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return resultado < 18.5;
    }
}
