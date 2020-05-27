package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main { 
	static class Pair{
		int start,end;
		int cost;
		public Pair(int start, int end, int cost) {
			this.start = start;
			this.end = end;
			this.cost = cost;
		}
	}

	static int[][] startBus;
	static int[][] endBus;
	static int[][] costBus;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());//������ ����
		int m = Integer.parseInt(st.nextToken());//������ ����
		int tmp = m;
		
		startBus = new int[m+1][n+1];//������ �������� ��� �迭
		endBus = new int[m+1][n+1];//������ ������ ��� �迭
		costBus = new int[n+1][n+1]; //���������� �������� ���� ���� �ּҺ���� ����
		
		for(int i=1; i<=m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			startBus[i][s] = 1;
			endBus[i][e] = 1;
			costBus[s][e] = c;
		}
	}
	
}