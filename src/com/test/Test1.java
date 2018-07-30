package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
		 * 
		 * */
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int len = 0, ben=0, num = 0, space = 0, others = 0,ch=0, sum=0;
		String a = "";
        byte[]str = null;
        System.out.println("请输入A:");
        try {
			a = s.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		str = a.getBytes();
		
		for(int j=0;j<str.length;j++){
			char b = (char)str[j];
			if(b>='a' && b<='z'){
				len++;
			}
			else if(b>='A' && b<='Z'){
				ben++;
			}
			else if(b>='0' && b<='9'){
				num++;
			}
			else if(b==' '){
				space++;
			}
			else if(str[j]<0){
				ch++;
			}else{
				others++;
			}
		}
		sum=len+ben+num+space+ch/2+others;
		System.out.println("小写字母个数:"+len);
		System.out.println("大写字母个数:"+ben);
		System.out.println("数字个数:"+num);
		System.out.println("空格个数:"+space);
		System.out.println("汉字个数:"+ch/2);
		System.out.println("字符个数:"+others);
		System.out.println("总个数:"+sum);
		System.out.println("123456");
		System.out.println("456123");
	}	
}
