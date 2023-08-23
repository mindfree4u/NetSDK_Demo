package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * class of time
 * \else
 * 时间类
 * \endif
 */
public class NET_TIME implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * 年
	 * \endif
	 */
	public long				dwYear;
	
	/**
	 * \if ENGLISH_LANG
	 * Month
	 * \else
	 * 月
	 * \endif
	 */
	public long				dwMonth;
	
	/**
	 * \if ENGLISH_LANG
	 * Day
	 * \else
	 * 日
	 * \endif
	 */
	public long				dwDay;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour
	 * \else
	 * 时
	 * \endif
	 */
	public long				dwHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute
	 * \else
	 * 分
	 * \endif
	 */
	public long				dwMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Second
	 * \else
	 * 秒
	 * \endif
	 */
	public long				dwSecond;

	public void setTime(long dwYear, long dwMonth, long dwDay, long dwHour, long dwMinute, long dwSecond) {
		this.dwYear = dwYear;
		this.dwMonth = dwMonth;
		this.dwDay = dwDay;
		this.dwHour = dwHour;
		this.dwMinute = dwMinute;
		this.dwSecond = dwSecond;
	}

	public void parseTime(String timeFormat){
		String depart[] = timeFormat.split(" ");
		if(depart.length != 2) {
			return;
		} else {
			String left[] = depart[0].split("-");
			String right[] = depart[1].split(":");
			if(left.length != 3 || right.length != 3){
				return;
			} else {
				this.dwYear = Integer.parseInt(left[0]);
				this.dwMonth = Integer.parseInt(left[1]);
				this.dwDay = Integer.parseInt(left[2]);
				this.dwHour = Integer.parseInt(right[0]);
				this.dwMinute = Integer.parseInt(right[1]);
				this.dwSecond = Integer.parseInt(right[2]);
			}
		}
	}

	public String toString() {
		 String time = String.format("%04d-%02d-%02d %02d:%02d:%02d", 
				 dwYear,dwMonth,dwDay,
				dwHour,dwMinute,dwSecond);
		 return time;
	 }
}
