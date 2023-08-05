// Escopo de Variaveis
// A variavel sempre estara no scopo do seu clobo de construcao


@main def printTabela() =

    var i = 1
    // Este bloco e o escopo da variavel i

    while i <= 10 do
        var j = 1
        // Este bloco e o escopo das variaveis i e j

        while j <= 10 do
            val p = (i * j).toString
            // Este bloco e o escopo das variaveis i, j e p
            var k = p.length
            // Este bloco e o escopo das variaveis i, p, e k

            while k < k do
                print(" ")
                k += 1
            print(p)
            j += 1
        // Este bloco e o escopo das variaveis i e j; p e k estao fora de escopo neste bloco
        println()
        i += 1
    // Aqui, somente a variavel i esta em escopo