import java.util.*
import kotlin.collections.HashSet

class TwoSum {
    fun calculate(hashSet: HashSet<Long>, targetRange: Pair<Int, Int>): Int {
        var count = 0;
        var targetRangeList = arrayListOf<Long>()
        for (t in targetRange.first..targetRange.second) {
            targetRangeList.add(t.toLong())
        }
        for (x in hashSet) {
            var targetIndex = 0;
            while (targetIndex < targetRangeList.size) {
                var y = targetRangeList[targetIndex] - x
                if (y != x && hashSet.contains(y)) {
                    targetRangeList.removeAt(targetIndex)
                    count++
                } else {
                    targetIndex++
                }
            }
        }
        return count
    }
}