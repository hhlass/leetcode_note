package com.hhl.easy

import com.hhl.all_interface.Solution

import scala.collection.mutable
import scala.util.Random

/**
 * Author : huanghanlin
 * Description :
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * Date : Created in 2019/11/1 14:10
 * Copyright : www.fangwei.com
 */
class TwoSum extends Solution {
	override def solve(): Unit = {
		//构建一个随机的11位数组
		val nums = for (_ <- 0 to 10) yield {
			Random.nextInt(10)
		}
		println(nums)
		println(doit(nums.toArray, 10))
	}
	
	private def doit(nums: Array[Int], target: Int): (Int, Int) = {
		val map = new mutable.HashMap[Int, Int]()
		for (i <- nums.indices) {
			if (map.contains(target - nums(i))) return (map(target - nums(i)), i)
			else map.put(nums(i), i)
		}
		(-1, -1)
	}
	
}
