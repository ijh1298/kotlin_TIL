class node(var x: Int, var y: Int, var num: Int) {
    var lCut = -1
    var rCut = 100001
    var lChild: node? = null
    var rChild: node? = null
}
fun preorder(cur: node?) {
    if (cur != null) print(cur.num)
    if (cur != null) preorder(cur.lChild)
    if (cur != null) preorder(cur.rChild)
}
fun postorder(cur: node?) {
    if (cur != null) postorder(cur.lChild)
    if (cur != null) postorder(cur.rChild)
    if (cur != null) print(cur.num)
}

fun solution() {
    var string = "1234"
    string.drop()
    var answer = arrayOf<IntArray>()
    val nodeinfo = arrayOf(intArrayOf(0, 0))

    val list = mutableListOf<node>()
    var index = 1
    nodeinfo.forEach {
        list.add(node(it[0], it[1], index++))
    }
    list.sortWith(compareByDescending<node> { it.y }.thenBy { it.x }) // y가 큰 순, x가 작은 순으로 정렬
    // 이진 트리 형성
    for ((i, parent) in list.withIndex()) {
        for (c in i + 1 until list.size) {
            if (parent.rChild != null) break // rChild 생겼다면 더 확인 필요 X
            if (parent.y == list[c].y || parent.lCut > list[c].x || parent.rCut < list[c].x) continue
            if (parent.lChild == null && parent.x > list[c].x && list[c].x > parent.lCut) {
                val child = list[c]
                child.lCut = parent.lCut
                child.rCut = parent.x
                parent.lChild = child
            }
            else if (parent.rChild == null && parent.x < list[c].x && list[c].x < parent.rCut) {
                val child = list[c]
                child.lCut = parent.x
                child.rCut = parent.rCut
                parent.rChild = child
            }
        }
    }
    val top = list[0]
    // 전위 순회
    preorder(top)
    println()
    // 후위 순회
    postorder(top)
}

solution()