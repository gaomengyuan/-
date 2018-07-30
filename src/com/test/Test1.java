package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 计算一个字符串中数字、大写英文、小写英文、中文、空格、其他字符的个数以及字符串的位数
		 *123
		 * */
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int len = 0, ben=0, num = 0, space = 0, others = 0,ch=0, sum=0;
		String a = "";
        byte[]str = null;
        System.out.println("请输入字符串:");
        try {
			a = s.readLine();
		} catch (IOException e) {
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
		System.out.println("小写英文的个数:"+len);
		System.out.println("大写英文的个数:"+ben);
		System.out.println("数字的个数:"+num);
		System.out.println("空格的个数:"+space);
		System.out.println("中文的个数:"+ch/2);
		System.out.println("其他字符的个数:"+others);
		System.out.println("输入字符的总数:"+sum);
	}	
}
