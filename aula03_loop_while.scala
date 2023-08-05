// Loop While

// Funcao que recebe uma string (de tamanho '*' (n)) como argumento
@main def principal(args: String*) =

    var i = 0

    while i < args.length do
        println(args(i))
        i += 1