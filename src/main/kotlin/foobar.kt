fun main() {
    val num = IntArray(100) { it + 1 }

    for (i in 99 downTo 0) {
        when {
            isPrime(num[i]) -> continue
            num[i] % 3 == 0 && num[i] % 5 == 0 -> print("FooBar ,")
            num[i] % 3 == 0 -> print("Foo ,")
            num[i] % 5 == 0 -> print("Bar ,")
            else -> print("${num[i]} ,")
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
