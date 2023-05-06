// Variaveis, Constantes e Tipos de Dados em Scala

// Funcao main
// def main(args: Array[String]) =
@main def main() =

    // Declara e atribui o valor da variavel do tipo Int
    var a: Int = 10;

    // O tipo da variavel e definido por inferencia
    var b = 20;

    // Usamos val para criar constantes e nao variaveis
    val nome = "Bob"
    val sobrenome: String = "Silva"

    // Imprime o valor das variaveis
    println("Primeira variavel: " + a); println("Segunda variavel: " + b);
    println("Nome Completo: " + nome + " " + sobrenome)
