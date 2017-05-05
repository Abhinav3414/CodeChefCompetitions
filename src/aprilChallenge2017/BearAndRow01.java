package aprilChallenge2017;

import java.util.Scanner;

public class BearAndRow01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < t; i++) {
			String str = scan.nextLine();

			if (str.matches("(0*)(1*)") || str.matches("(0*)") || str.matches("(1*)"))
				System.out.println("0");
			else {
				char strArr[] = str.toCharArray();

				int xx = 0;
				int moveCount = 0;

				while (!String.copyValueOf(strArr).matches("(0*)(1*)")) {

					int flag = 0;
					for (int j = 0; j < str.length() - 1; j++) {
						int oneIndex = -1;

						if (strArr[j] == '1' && strArr[j + 1] == '0') {
							oneIndex = j;
							int zeroIndex = j;
							int stepCount = 0;
							while (j < str.length()) {
								if ((strArr[j] == '0' && j == str.length() - 1)
										|| (strArr[j] == '0' && strArr[j + 1] == '1')) {
									zeroIndex = j;
									flag = 1;
									break;
								}
								j++;
								stepCount++;
							}

							moveCount = moveCount + (stepCount + 1);
							strArr[zeroIndex] = '1';
							strArr[oneIndex] = '0';
						}

						if (flag == 1)
							break;

					} // for closes

				} // while closes

				System.out.println(moveCount);
			}

		}

	}

}
