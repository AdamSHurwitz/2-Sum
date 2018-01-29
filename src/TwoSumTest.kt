import java.io.File
import java.util.*

object TwoSumTest {
    @JvmStatic
    fun main(args: Array<String>) {
        var hashSet = HashSet<Long>()
        File("src/data/dataSet.txt")
                .inputStream()
                .bufferedReader()
                .useLines { lines ->
                    lines.forEach {
                        hashSet.add(it.toLong())
                    }
                }
        print("Number of targets with addents in the data set: " + TwoSum().calculate(hashSet, targetRange = Pair(-10000, 10000)))
    }
}