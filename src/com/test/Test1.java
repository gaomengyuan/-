package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 杈撳叆涓�琛屽瓧绗︼紝鍒嗗埆缁熻鍑哄叾涓嫳鏂囧瓧姣嶃�佺┖鏍笺�佹暟瀛楀拰鍏跺畠瀛楃鐨勪釜鏁�
		 * 
		 * */
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int len = 0, ben=0, num = 0, space = 0, others = 0,ch=0, sum=0;
		String a = "";
        byte[]str = null;
        System.out.println("璇疯緭鍏:");
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
		System.out.println("灏忓啓瀛楁瘝涓暟:"+len);
		System.out.println("澶у啓瀛楁瘝涓暟:"+ben);
		System.out.println("鏁板瓧涓暟:"+num);
		System.out.println("绌烘牸涓暟:"+space);
		System.out.println("姹夊瓧涓暟:"+ch/2);
		System.out.println("瀛楃涓暟:"+others);
		System.out.println("鎬讳釜鏁�:"+sum);
		System.out.println("123456");

		System.out.println("456123123123");

		System.out.println("456123123");
		System.out.println("456123123");
	}	
}
