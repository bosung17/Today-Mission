package view;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// for문 전에 
		int[] viewSum = new int[10];
		
		// 테스트 케이스 10개
		for (int i=0; i<10; i++) {
			
			// 건물의 개수 N 입력 받기
			int N = sc.nextInt();
			
			// 건물 높이를 입력받는 배열 arr 만들기
			int[] arr = new int[N];
			
			// N개의 건물 높이 입력 받기
			for (int j=0; j<N; j++) {
				arr[j] = sc.nextInt();
			}
			
			
			// 각 건물의 조망권 확보 세대 수(=view) 구하기
			
			// N개 건물의 view를 담기 위한 배열 만들기
			int[] view = new int[N];
			
			// view 배열에 최솟값을 담기 위해 양쪽 2개를 제외한 나머지 건물의 view 최댓값으로 설정
			for (int j=2; j<N-2; j++) {
				view[j] = 255;
			}
			
			// 각 건물의 양옆 2개를 비교하여 차이의 최솟값으로 view 설정
			for (int j=2; j<N-2; j++) {
				
				// j 건물(메인)과 k 건물(주변)의 차이 중 최솟값으로 view 설정
				for (int k = j-2; k<j+3; k++) {
					
					// j와 k가 같아지면 view가 0이 되어 제외
					if (k!=j) {
						
						// 하나라도 차이가 0보다 같거나 작아지면 view는 0
						if (arr[j] - arr[k] <=0) {
							view[j] = 0;
						}
						
						// 차이가 0이 아닌 것들 중 최솟값을 view에 저장
						else if (arr[j] - arr[k] < view[j]) {
							view[j] = arr[j] - arr[k];
						}
					}
				}
			}
			// 첫 for문 밖에서 만든 viewSum에 view배열의 합 저장
			for (int j=0;j<N;j++) {
				viewSum[i] += view[j];
			}
			
		}
		// 문제에서 요구한대로 테스트케이스 번호와 조망권이 확보된 세대의 수 출력
		for (int i=0; i<10; i++) {
			System.out.println("#" + (i+1) + " " + viewSum[i]);
		}
			
	}
}
