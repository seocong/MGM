package com.gam.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {

	private String arrowNbsp;//depth크기만큼 공백 만드는거 저장


	//게시글의 depth의크기만큼 공백을 만드는 기능
	public void setArrowNbsp(String depth) {
		String nbsp="";
		int depthInt=Integer.parseInt(depth);//int형으로 형변환
		for (int i = 0; i < depthInt; i++) {
			nbsp+="&nbsp;&nbsp;&nbsp;&nbsp;";
		}
		//조건?true:false--->3항연산자
		this.arrowNbsp=(depthInt>0?nbsp+"<i class='icon-arrow-right2'>RE:</i>":"");
	}

	public String getArrowNbsp() {
		return arrowNbsp;
	}
	public static String isTwo(String s) {
		return s.length()<2?"0"+s:s;
	}
	//문자열 date형식으로 변환
	//	public static Date setToDates(String mDate) throws ParseException {//mDate-->화면으로부터 12자리 문자열을 받게될 파라미터
	//		//date형식: yyyy-MM-dd hh:mm:ss---> 날짜형식으로 변환하려면 date형식으로 모양을 바꿔줘야한다.
	//		//문자열을 ---> date타입으로 변환해야된다.
	//		int year = Integer.parseInt(mDate.substring(0, 4));
	//		int month = Integer.parseInt(mDate.substring(5, 7));
	//		int day = Integer.parseInt(mDate.substring(8, 10));
	//		Calendar cal1=Calendar.getInstance();
	//		Calendar cal2=Calendar.getInstance();
	//		cal1.
	//		cal2.set(year,month,day);
	//		
	//		return changeDate;
	//	} 

	public static Map<String, Object> getCalendar(String pyear, String pmonth){
		Map<String, Object> calendar= new HashMap<String, Object>();
		//달력의 날짜를 바꾸기 위해서 전달된 year와 month 값을 받는다.
		String pYear=pyear;
		String pMonth=pmonth;

		Calendar cal=Calendar.getInstance();//calendar객체는 new를 사용하지 않는다
		int year=cal.get(Calendar.YEAR);//현재 년도를 구함
		int month=cal.get(Calendar.MONTH)+1;//현재 월을 구함(0월~11월)

		if(pYear!=null){
			year=Integer.parseInt(pYear);
		}
		if(pMonth!=null){
			month=Integer.parseInt(pMonth);
		}

		//달중에 12월을 넘어갔을경우 month는 1월로, 년도는 다음년도로 값을 바꿔준다
		if(month>12){
			month=1;
			year++;
		}
		//달중에 1월을 뒤로 넘어갔을경우 month는 12월로, 년도는 전년도로 값을 바꿔준다
		if(month<1){
			month=12;
			year--;
		}

		//현재 월의 1일에 대한 요일 구하기--> 현재날짜에 대한 정보를 담고 있는 Calendar객체생성
		//                     --> 3월1일로 셋팅을 해서 요일을 구함
		cal.set(year, month-1, 1);//2019년3월1일로 바꿔준다
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);//1일에 대한 요일구함:1(일)~7(토)

		//월의 마지막날 구하기
		int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.put("cal", cal);
		calendar.put("dayOfWeek", dayOfWeek);
		calendar.put("lastDay", lastDay);
		calendar.put("year", year);
		calendar.put("month", month);
		return calendar;
	}
	//지난 8주까지의 금,토,일 날짜 구하기
	public static List<String> eightWeeks(){
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMM");
		List<String> allDate = new ArrayList<String>();
		Calendar cal = Calendar.getInstance();
//		for(int i=1;i<=56;i++) {
//			int week = cal.get(Calendar.DAY_OF_WEEK);
//			if(week==1 | week==7 | week==6) {//금,토,일 인 경우 list에 담아서 return
//				String sToday = fmt.format(cal.getTime());
//				allDate.add(sToday);
//			}
//			cal.add(Calendar.DAY_OF_MONTH, -1); //현재날짜 -1
//		}
		for(int i=0;i<3;i++) {
			String sToday = fmt.format(cal.getTime());
			allDate.add(sToday);
			System.out.println(sToday);
			cal.add(Calendar.MONTH, -1);
		}
		return allDate;
	}
	
	public static String round(int x,int y){
		
		double total =  ((double)x/(double)y)*100;
		String val = String.format("%.2f", total);
		val=val+"%";
		return val;
		
	}
}
