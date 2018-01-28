import java.util.*

object TwoSumTest{
    @JvmStatic
    fun main(args: Array<String>){
        var hashTable = Hashtable<Int, Boolean>();
        TwoSum().calculate(hashTable)
    }
}