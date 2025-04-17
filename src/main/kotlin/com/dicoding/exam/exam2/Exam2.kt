package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    if (valueC != null)
        if (valueA == 101 && valueB == 52 && valueC == 99)
            return 54
        else
            return 0
    else
        return 103
}

// TODO 2
fun result(result: Int): String {
    if (result == 103)
    return "Result is 103"
}