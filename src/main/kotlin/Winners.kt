class Winners (val winners :List<Node>) {

    fun PrintFinals () {
        for (w in winners) {
            println("${w.value} -> ${w.updatedValue}")
        }
    }

    fun ActualWinnerChain () {
        val w = winners.maxBy {
            it.updatedValue
        }
        w.PrintChain()
    }

    fun TotalSum () {
        val w = winners.maxBy {
            it.updatedValue
        }
        println(w.updatedValue)
    }




}