package subtask6

class Fibonacci {

    // TODO: Complete the following function
    //The Fibonacci numbers are the numbers in the following integer sequence (Fn)

    fun productFibonacciSequenceFor(n: Int): IntArray {

        var a = 0
        var b = 1
        var c = a
        lateinit var result: IntArray
        while (n > a * b) {
            a += b
            c = b
            b += a
        }
        if (a * b == n) result = intArrayOf(a, b, 1)
        if (a * c == n) result = intArrayOf(c, a, 1)
        if (a * b > n && a * c < n) result = intArrayOf(a, b, 0)
        if (a * b > n && a * c > n) result = intArrayOf(c, a, 0)
        return result

        //val array: Array<Int> = arrayOf(1, 2, 0)
        //        while (array[0]*array[1]<n){
        //            array[1]=array[1]+array[0]
        //            array[0]=array[1]-array[0]
        //        }
        //        if (array[0]*array[1]==n) array[2]=1
        //        return array.toIntArray()
    }
}
