// Loop While

// Funcao que recebe uma string (de tamanho '*' (n)) como argumento
// @main def principal(args: String*) =

//     var i = 0

//     while i < args.length do
//         if i != 0 then
//             print(" ")
//         print(args(i))
//         i += 1
//     println()


// Outro modo de escrever (mais recomendado)
@main def principal(args: String*) = {

    var i = 0;

    while (i < args.length) {
        if (i != 0) {
            print(" ");
        }
        print(args(i));
        i += 1;
    }
    println();
}