/**Base node class for max depth path problem.
 * @param value holds the initial value
 * @param parents holds the parents of the node, if there are any.*/
class Node ( val value :Int, val parents :List<Node>?) {

    /**@param updatedValue holds the value of the node updated adding its biggest parent value
     * @param chosenParent holds the chosenParent in case of multiple parent choice
     * Both params are initted below*/
    var updatedValue :Int = value
    var chosenParent :Node? = null

    init {
        var biggestParent :Node? = null
        if (parents != null) {
              for (p in parents) {
                  if (p.value > biggestParent?.updatedValue ?:0) {
                      biggestParent = p
                  }
              }
        }
        chosenParent = biggestParent
        updatedValue += chosenParent?.updatedValue ?:0
    }


    /**Prints the chain of values that brought to this one.
     * Prints value and recursively calls back its parent. **/
    fun PrintChain () :Unit? {
        println(value)
        return chosenParent?.PrintChain() ?:null
    }

}