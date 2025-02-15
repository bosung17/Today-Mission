package restavg;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 수 입력
		int T = sc.nextInt();
		
		// 테스트 케이스 수 만큼 평균값 배열 만들기
		double[] avg = new double[T];
		
		// 각 테스트 케이스마다 10개의 수 입력
		for (int i=0; i<T; i++) {
			int[] arr = new int[10];
			for (int j=0; j<10; j++) {
				arr[j] = sc.nextInt();
			}
			
			// 입력받은 10개의 수가 들어있는 배열 오름차순 정렬
			Arrays.sort(arr);
			
			// 최댓값과 최솟값을 제외한 수들의 평균 출력 (int는 소수점 아래를 버리기 때문에 반올림 위해 0.5 더함)
			double sum = 0;
			for (int j=1; j<9; j++) {
				sum += arr[j];
				avg[i] = (sum/8 + 0.5);
			}
		}
		
		// 문제에서 요구한대로 테스트 케이스 번호와 나머지들의 평균값 출력
		for (int i=0; i<T; i++) {
			System.out.println("#" + (i+1) + " " + (int) avg[i]);
		}
		
	}
}
