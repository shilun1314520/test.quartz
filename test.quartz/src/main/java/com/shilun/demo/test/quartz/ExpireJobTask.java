package com.shilun.demo.test.quartz;

import org.apache.log4j.Logger;

public class ExpireJobTask {
	
	private static final  Logger logger=Logger.getLogger(ExpireJobTask.class);
	
	private static int count=1;
	
	/**
	 * 
	 * @Description:定时调用的方法
	 * @return void
	 * @author  shilun
	 * @time 2017年9月4日 下午5:23:45
	 */
	public void doBiz(){
		System.out.println("这是第"+count+"调用");
		count++;
	}
}
