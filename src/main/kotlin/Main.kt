
fun main () {

    //TODO: Write collector from the problems file
    val a = Node(3,null)
    val b = Node(7, listOf(a))
    val c = Node(4, listOf(a))
    val d = Node(2, listOf(b))
    val e = Node(4, listOf(b,c))
    val f = Node(6, listOf(c))
    val g = Node(8, listOf(d))
    val h = Node(5, listOf(d,e))
    val i = Node(9, listOf(e,f))
    val j = Node(3, listOf(f))

    val wins = Winners(listOf(g,h,i,j))
    wins.PrintFinals()
    wins.ActualWinnerChain()
    wins.TotalSum()
}