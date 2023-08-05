// Listas
// Listas em Scala sao objetos imutaveis e devem ter dados do mesmo tipo.

def main(args: Array[String]) = {

    // Cria uma lista de strings
    val frutas: List[String] = List("laranja","melancia","abacaxi","goiaba")

    // Cria uma lista de numeros
    val numeros: List[Int] = List(1,2,3,4)

    // Cria uma variavel escalar
    val nums = Nil

    println("Tamanho da lista de frutas: " + frutas.length)
    println("Head da lista de frutas: " + frutas.head)
    println("Tail da lista de frutas: " + frutas.tail)
    println("Reverse da lista de frutas: " + frutas.reverse)
    println("Verifica se a lista de frutas esta vazia: " + frutas.isEmpty)
    println("Primeiro elemento da lista de numeros: " + numeros(0))
    println("Segundo elemento da lista de numeros: " + numeros(1))
    println("Soma da lista de numeros: " + numeros.sum)
    println("Valor maximo da lista de numeros: " + numeros.max)
    println("Valor minimo da lista de numeros: " + numeros.min)

}