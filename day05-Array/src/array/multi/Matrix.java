package array.multi;
/**
 * 수학의 행렬을 나타낼 수 있는
 * 2차원 배열을 선언하고 초기화 후
 * 출력해보는 클래스
 * @author Administrator
 *
 */
public class Matrix {

	public static void main(String[] args) {
		// 1. 선언, 2. 배열 초기화 목록으로 초기화 
		int[][] matrix = { {0, 1, 0}, {1, 1, 1}, {0, 0, 0} };
		
		
		// int[] matrix[0] = {0, 1, 0}; 임,  이름은 matrix[0], type = int[], matrix[0].length = 3
		// int[] matrix[1] = {}일때, matrix.length = 0임
		
		// int[] numbers = {10, 20, 30}; 와 
		// int[] matrix[] = {0, 1, 0}과 개념적으로 같음 // 실제로 이렇게 사용은 불가임
		
		// 3. 출력
		for(int idx = 0; idx < matrix.length; idx++) {
			for(int ind = 0; ind < matrix[idx].length; ind++) {
				// matrix[0].length
				// matrix[1].length ==> matrix[idx].length
				// matrix[2].length
				System.out.printf("%d\t",matrix[idx][ind]);
			}
			System.out.println(); // new line(Enter Key)
		} // end outter for
		
		// 4. 출력(foreach)
		System.out.println("\nforeach 사용==============================\n");
		
		for (int[] numbers : matrix) {
			for(int num : numbers) {
				System.out.printf("%d\t",num);
			}
			System.out.println();
		}
		
	}

}
