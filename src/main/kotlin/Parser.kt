import java.io.File

class Parser (filePath :String) {
    val nodeNumbers :MutableList<List<Int>> = mutableListOf()
    val nodes :MutableList<List<Node>> = mutableListOf()
    init {
        val reader = File(filePath).readLines()

        for (line in reader) {
            val splitted = line.split(" ")
            val toAppend = mutableListOf<Int>()
            for (t in splitted) {
                toAppend.add(t.toInt())
            }
            nodeNumbers.add(toAppend as List<Int>)
        }

        nodes.add(listOf(Node(nodeNumbers[0][0],null)))

        var rowCounter = 1
        while (rowCounter < nodeNumbers.size) {
            val toAppend = mutableListOf<Node>()
            val currentRow = nodeNumbers[rowCounter]
            for (n in 0..currentRow.size-1) {

                // If the rowcounter is 1, we are in the second row, so as parents we simply add the first element.
                if (rowCounter == 1) {
                    toAppend.add(Node(currentRow[n], nodes[0]))
                    continue
                }

                // Else
                // If n is the first of the row
                if (n == 0) {
                    toAppend.add(Node(currentRow[n], listOf(nodes[rowCounter-1][0])))
                    continue
                }

                // If n is last of its row
                if (n == currentRow.size-1) {
                   toAppend.add(Node(currentRow[n], listOf(nodes[rowCounter-1][n-1])))
                   continue
                }
                toAppend.add(Node(currentRow[n], listOf(nodes[rowCounter-1][n-1], nodes[rowCounter-1][n])))
            }
            nodes.add(toAppend)
            rowCounter++
        }
    }

    fun LastLine () :List<Node> {
        return nodes[nodes.size-1]
    }
}

