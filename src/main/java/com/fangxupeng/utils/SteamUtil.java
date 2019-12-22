package com.fangxupeng.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SteamUtil {
	/**
	 * 
	 * @Title: read 
	 * @Description: һ���ж�ȡ�ļ�������list������
	 * @param inputStream
	 * @return
	 * @throws Exception
	 * @return: List<String>
	 */
	public static List<String> read(InputStream inputStream) throws Exception{
		
		BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
		List<String> list = new ArrayList<String>();
		String str="";
		while((str=read.readLine())!=null) {
			list.add(str);
		}
		return list;
	}
}
