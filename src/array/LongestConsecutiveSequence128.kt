package array

fun main(args: Array<String>) {

}

class LongestConsecutiveSequence128 {
    companion object {
        fun longestConsecutive(nums: IntArray): Int {
            if (nums.isEmpty()) return 0
            if (nums.size == 1) return 1
            val set = HashSet<Int>()
            var longest = 0
            nums.forEach { set.add(it) }
            for (i in nums) {
                // check the beginning element (left element)
                if (!set.contains(i - 1)) {
                    var length = 1
                    // check the consecutive element exists (right element)
                    while (set.contains(i + length)) {
                        length += 1
                    }
                    longest = Math.max(length, longest)
                }
            }
            return longest
        }
    }
}

