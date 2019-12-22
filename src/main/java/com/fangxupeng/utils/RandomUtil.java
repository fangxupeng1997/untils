package com.fangxupeng.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	/**
	 * 随机数生成类
	 */
	
	//方法1：，例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		
		Random random = new Random();
		
		int i = random.nextInt(max-min+1)+min;

		return i;

	}
	
	
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		
		//创建一个数组存放随机数
		int[] array = new int[subs];
		//创建一个set集合，不重复存入随机数
		Set<Integer> set = new HashSet<Integer>();
		//循环3个随机数
		while(set.size()!=subs) {
			int random = random(min, max);
			set.add(random);
		}
		
		int z=0;
		for (Integer n : set) {
			array[z] = n;
			z++;
		}
	
		return array;
	}
	
	
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: TODO返回1个1-9,a-Z之间的随机字符。 (8分)
	 * @return
	 * @return: char
	 */
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		
		String str ="123456789qwertyuiopsdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		char c = str.charAt(random(0,str.length()-1));
		
		return c;
	
	}
	
	/**
	 * 
	 * @Title: randomString 
	 * @Description: TODO返回参数length个字符串(5分)
	 * @param length
	 * @return
	 * @return: String
	 */
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		
		String str ="";
		for (int i = 0; i <length; i++) {
			str+= randomCharacter();
		}
		
		return str;


	}
	
}
