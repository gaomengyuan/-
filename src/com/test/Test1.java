package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
		 * 
		 * */
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int len = 0, ben=0, num = 0, space = 0, others = 0,ch=0, sum=0;
		String a = "";
        byte[]str = null;
        System.out.println("������A:");
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
		System.out.println("Сд��ĸ����:"+len);
		System.out.println("��д��ĸ����:"+ben);
		System.out.println("���ָ���:"+num);
		System.out.println("�ո����:"+space);
		System.out.println("���ָ���:"+ch/2);
		System.out.println("�ַ�����:"+others);
		System.out.println("�ܸ���:"+sum);
		System.out.println("123456");
		System.out.println("456123");
	}	
}
