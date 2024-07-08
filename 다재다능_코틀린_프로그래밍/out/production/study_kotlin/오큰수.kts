import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { i -> i.toInt() }
    val NGE = IntArray(N) { i -> 0 }

    // Stack
    // peek 보다 작은 값이 들어오면 push
    // peek 보다 큰 값이 들어오면 pop 해주면서 오큰수로서 설정
    val stk = Stack<Pair<Int, Int>>() // Pair(value, index)
    for ((index, number) in numbers.withIndex()) {
        while (!stk.isEmpty() && stk.peek().first < number) {
            NGE[stk.peek().second] = number
            stk.pop()
        }
        stk.add(Pair(number, index))
    }
    for (i in NGE.indices) {
        if (NGE[i] == 0) NGE[i] = -1
    }
    for (i in NGE)
        print("$i ")
}