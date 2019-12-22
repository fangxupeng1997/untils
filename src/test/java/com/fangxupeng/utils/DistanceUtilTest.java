/**
 * 
 */
package com.fangxupeng.utils;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;

/**
 * @author 木槿少年
 *
 */
public class DistanceUtilTest {

	/**
	 * Test method for {@link com.fangxupeng.utils.DistanceUtil#getDistance(double, double, double, double)}.
	 * @throws Exception 
	 */
	@Test
	public void testGetDistance() throws Exception {
		
		double j = 116.425249;
		double w = 39.914504;
		
		List<String> read = SteamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		
		for (String str : read) {
			
			String[] split = str.split(",");
			
			double d = DistanceUtil.getDistance(j, w, Double.parseDouble(split[2]), Double.parseDouble(split[3]));
			
			DecimalFormat df = new DecimalFormat("#.00");
			
			System.out.println("该车距离目标的距离为"+df.format(d)+"米");
		}
	}

}
