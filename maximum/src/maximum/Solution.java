package maximum;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 수 입력
		int T = sc.nextInt();
		
		// 테스트 케이스 수 만큼 최댓값 배열 만들기
		int[] max = new int[T];
		
		
		// 각 테스트 케이스 마다 10개의 수 받아 배열 만들기
		for (int i=0; i<T; i++) {
			int[] arr = new int[10];
			for (int j=0; j<10; j++) {
				arr[j] = sc.nextInt();
			}
			
			// 최댓값 받아 max 배열에 저장하기
			max[i] = 0;
			for (int j=0; j<10; j++) {
				if (arr[j]>max[i]) {
					max[i]=arr[j];
				}
			}
		}
		
		// 문제에서 요구하는대로 테스트 케이스 번호, 최댓값 순으로 출력
		for (int i=0; i<T; i++) {
			System.out.println("#" + (i+1) + " " + max[i]);
		}
		
	}
}
