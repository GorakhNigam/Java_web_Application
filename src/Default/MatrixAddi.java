
public class MatrixAddi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][] = new int[3][3];
		int y[][] = new int[3][3];
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				x[i][j] = i+j;
				y[i][j] = i+j+5;
				System.out.print(x[i][j]+y[i][j]+" ");
			}
		System.out.println();
		}
	}

}
