
class Node ( val value :Int, val parents :List<Node>?) {

    var updatedValue :Int = value
    var chosenParent :Node? = null

    init {
        var biggestParent :Node? = null
        if (parents != null) {
              for (p in parents) {
                  if (p.updatedValue > (biggestParent?.updatedValue ?: 0)) {
                      biggestParent = p
                  }
              }
        }
        chosenParent = biggestParent
        updatedValue += chosenParent?.updatedValue ?:0
    }


    fun PrintChain () :Unit? {
        println(value)
        return chosenParent?.PrintChain()
    }

}