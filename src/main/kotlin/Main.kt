
fun main () {

    //TODO: Write collector from the problems file
    val nodes = Parser("/home/nicola/Desktop/numbers").LastLine()
    var biggest = nodes[0]
    for (n in 1..<nodes.size-1) {
        if (nodes[n].updatedValue > biggest.updatedValue) {
            biggest = nodes[n]
        }
    }
    println("Winner : ${biggest.value}")
    println("Chain value: ${biggest.updatedValue}")
    println("Chain of nodes: ")
    biggest.PrintChain()

}