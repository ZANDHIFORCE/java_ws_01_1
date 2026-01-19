package com.ssafy.ws.step1;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		
		System.out.println("숫자 입력 >>");
		Scanner scann=new Scanner(System.in);
		int n=scann.nextInt();
		int ans=0;
		// 짝수의 합을 위해 반복문과 조건문을 완성해보시오.
		for (int i = ____; ______; i++) {
			if(__________) {
				ans+=i; // ans=ans+i;
			}
		}
		System.out.printf("1부터 %d까지 수 중 짝수의 합 = %d\n",n,ans);
	}

}
