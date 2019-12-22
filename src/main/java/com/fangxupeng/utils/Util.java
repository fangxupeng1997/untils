package com.fangxupeng.utils;

import java.util.Calendar;
import java.util.Date;

public class Util {
	
	/**
	 * 
	 * @return 
	 * @Title: isNumber 
	 * @Description: �ж��Ƿ�����ֵ����
	 * @return: void
	 */
	public static boolean isNumber(String str) {
		
		String regex = "^(-)?[0-9]+(.[0-9]+)?$";
		
		return str.matches(regex);
		
	}
	
	/**
	 * 
	 * @Title: getAge 
	 * @Description: TODO ��ȡ��ǰ����
	 * @param birthday 
	 * @return
	 * @return: int
	 */
	public static int getAge(Date birthday) {
		// ��ȡ��ǰϵͳ��������
		Calendar c = Calendar.getInstance();
		// ��ȡ��ǰ������
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);// �����ճ�ʼ��������
		int yearBirth = c.get(Calendar.YEAR);
		int monthBirth = c.get(Calendar.MONTH);
		int dateBirth = c.get(Calendar.DAY_OF_MONTH);
		// ���� 1990-02-10 2019-02-08
		int age = yearNow - yearBirth;
		// �����·ݴ���ǰ�·� �������1
		if (monthBirth > monthNow) {
			age--;
		}
		// ����·�һ�²��� ���ڴ��ڵ�ǰ���� �������1
		if (monthBirth == monthNow && dateBirth > dateNow) {
			age--;
		}
		return age;
	}
	
	/**
	 * 
	 * @Title: getMonthEnd 
	 * @Description: ����ָ���·ݵ���ĩ
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getMonthEnd(Date date) {
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//�õ�ǰ�·�+1
		c.add(Calendar.MONTH, 1);
		//�����ڱ���¸����³�
		
		Date init = getMonthInit(c.getTime());
		
		//���³��ٴγ�ʼ������
		c.setTime(init);
		//���ڵ�����-1
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
		
		
	}
	
	
	/**
	 * 
	 * @Title: getMonthInit 
	 * @Description: //���� ָ���·��³�ʱ��
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getMonthInit(Date date) {
		//��ȡ�ĵ�ǰϵͳ��ʱ���������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//�����·ݵ���Ϊ 1
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
	}
	
	
	
	
	
	// ���ظ�ĳһ��ʱ��ε��������

	public static Date random(Date minDate, Date maxDate) {
		// ��ʼ������
		long t1 = minDate.getTime();
		// ����������
		long t2 = maxDate.getTime();
        //����t2 t1֮��ĺ�����
		long t3 = (long) (Math.random() * (t2 - t1 + 1) + t1);

		return new Date(t3);

	}
}