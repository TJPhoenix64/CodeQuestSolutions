import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_22 {

	public static boolean isLower(int row, int col, int[][] elevationArr) {
		int currentElevation = elevationArr[row][col];
		int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };

		for (int i = 0; i < 8; i++) {
			int r = row + dr[i];
			int c = col + dc[i];
			if (exists(r, c, elevationArr)) {
				if (currentElevation > elevationArr[r][c]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean exists(int row, int col, int[][] elevationArr) {
		return (row >= 0 && row < elevationArr.length && col >= 0 && col < elevationArr[0].length);
	}

	@SuppressWarnings("ConvertToTryWithResources")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = Integer.parseInt(sc.nextLine());
		StringBuilder answer = new StringBuilder("");
		for (int i = 0; i < numCases; i++) {
			String[] dimensionArr = sc.nextLine().split(" ");
			int rows = Integer.parseInt(dimensionArr[0]);
			int cols = Integer.parseInt(dimensionArr[1]);
			String[][] gridArr = new String[rows][cols];
			int[][] elevationArr = new int[rows][cols];
			ArrayList<Integer[]> infoList = new ArrayList<>();
			for (int r = 0; r < rows; r++) {
				String input = sc.nextLine();
				String[] rowArr = input.split(" ");
				for (int c = 0; c < cols; c++) {
					gridArr[r][c] = rowArr[c];
					String word = gridArr[r][c];
					int elevation = Integer.parseInt(word.substring(0, word.length() - 1));
					elevationArr[r][c] = elevation;
				}
			}

			for (int r = 0; r < rows; r++) {
				for (int c = 0; c < cols; c++) {
					String word = gridArr[r][c];
					boolean isSafe = word.contains("L");
					if (isSafe) {
						if (isLower(r, c, elevationArr)) {
							Integer[] list = { elevationArr[r][c], r, c };
							infoList.add(list);
						}
					}

				}
			}

			Collections.sort(infoList, (a, b) -> {
				if (!a[0].equals(b[0]))
					return Integer.compare(a[0], b[0]);
				if (!a[1].equals(b[1]))
					return Integer.compare(a[1], b[1]);
				return Integer.compare(a[2], b[2]);
			});

			for (int idx = 0; idx < infoList.size(); idx++) {
				answer.append(infoList.get(idx)[0]).append(" ").append(infoList.get(idx)[1]).append(" ")
						.append(infoList.get(idx)[2]);

				if (idx + 1 != infoList.size()) {
					answer.append("\n");
				}
			}

			if (i + 1 != numCases) {
				answer.append("\n");
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
