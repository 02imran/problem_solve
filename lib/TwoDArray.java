public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 0}, { 3, 4, 5, 9, 10} };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}

			System.out.println();
		}
    }
    
}
