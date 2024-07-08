fun main() {
    val cap = 3
    val n = 2
    val deliveries = intArrayOf(2, 4)
    val pickups = intArrayOf(4, 2)

    var answer : Long = 0
    var curDpoint = n - 1
    var curPpoint = n - 1

    while (curDpoint != 0 && curPpoint != 0) {
        var curCap = cap
        var dDist = 0
        var pDist = 0
        var flag = false
        // 배달 거리 구하기
        while (curCap > 0) {
            if (curDpoint == 0) break
            if (deliveries[curDpoint] > 0) {
                if (!flag) {
                    dDist = curDpoint
                    flag = true
                }
                deliveries[curDpoint]--
                curCap--
            }
            else
                curDpoint--
        }
        // 수거 거리 구하기
        curCap = cap
        flag = false
        while (curCap > 0) {
            if (curPpoint == 0) break
            if (pickups[curPpoint] > 0) {
                if (!flag) {
                    pDist = curPpoint
                    flag = true
                }
                pickups[curPpoint]--
                curCap--
            }
            else
                curPpoint--
        }
        // 최댓값 선택
        if (dDist < pDist) dDist = pDist
        answer += (dDist + 1) * 2
    }
    println(answer)
}

main()