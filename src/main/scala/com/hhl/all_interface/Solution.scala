package com.hhl.all_interface

/**
 * Author : huanghanlin
 * Description :
 * Date : Created in 2019/11/1 14:13
 * Copyright : www.fangwei.com
 */
trait Solution {
	
	def run(): Unit = {
		val st = System.currentTimeMillis()
		solve()
		val et = System.currentTimeMillis()
		println(et - st)
	}
	
	def solve()
}
