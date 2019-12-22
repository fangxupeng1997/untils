package com.fangxupeng.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	/**
	 * �����������
	 */
	
	//����1�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		
		Random random = new Random();
		
		int i = random.nextInt(max-min+1)+min;

		return i;

	}
	
	
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: ����Сֵmin�����ֵmax֮���ȡsubs�����ظ��������
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		
		//����һ�������������
		int[] array = new int[subs];
		//����һ��set���ϣ����ظ����������
		Set<Integer> set = new HashSet<Integer>();
		//ѭ��3�������
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
	 * @Description: TODO����1��1-9,a-Z֮�������ַ��� (8��)
	 * @return
	 * @return: char
	 */
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		
		String str ="123456789qwertyuiopsdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		char c = str.charAt(random(0,str.length()-1));
		
		return c;
	
	}
	
	/**
	 * 
	 * @Title: randomString 
	 * @Description: TODO���ز���length���ַ���(5��)
	 * @param length
	 * @return
	 * @return: String
	 */
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		
		String str ="";
		for (int i = 0; i <length; i++) {
			str+= randomCharacter();
		}
		
		return str;


	}
	
}
