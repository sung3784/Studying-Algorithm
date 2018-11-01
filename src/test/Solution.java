package test;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {

		System.out.println("result : "+solution(1041));
	}
	public static int solution(int N) {
		// write your code in Java SE 8
		int result = 0;
		int temp = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int index = 0;

		while (true) {
			list.add(N % 2);
			if (N == 1) {
				break;
			}
			N = N / 2;

		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				index++;
				
			}
			System.out.print(list.get(i));
		}

		
		if (index > 1) {

			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) == 1) {
					for (int j = i + 1; j<list.size(); j++) {
						
						if (list.get(j) == 0) {
							
							temp++;
							System.out.println(temp);
						} else {
							System.out.println("yayaya");
							if (temp > result) {
								System.out.println("yayaya11111111111");
								result = temp;
								temp = 0;
								System.out.println("ÅÛÇÁ°ª"+temp);
								
							}
							break;

						}
					}

				}

			}
			System.out.println("temp : "+temp);
			
			return result;

		} else {
			return 0;
		}
	}

}
