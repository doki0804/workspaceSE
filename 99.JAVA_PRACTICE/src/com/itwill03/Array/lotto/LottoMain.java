package com.itwill03.Array.lotto;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("-----로또번호6개생성[중복번호허용안됨]-----");
		int[] lottoNumber = { 0, 0, 0, 0, 0, 0 };
		/*
		 * QUIZ:중복체크
		 */
		
		for (int i=0 ;i< lottoNumber.length; i++) {
			lottoNumber[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					i-=1;
				}
			}
			System.out.print(lottoNumber[i] + " ");
		}
		
		/*
		System.out.println();
		int i=0;
		int j=0;
		while(i<5) {
			lottoNumber[i]=(int)(Math.random()*45)+1;
			j=0;
			while(j<i) {
				if(lottoNumber[i]==lottoNumber[j]) {
					i-=1;
				}else {
					j++;
				}
			}
			System.out.print(lottoNumber[i] + " ");
			i++;
		}
		*/
	}

}