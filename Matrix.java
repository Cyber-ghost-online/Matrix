import java.util.Scanner;

public class Matrix {
	
// Read Matrix Method
	
	int[][] ReadMat(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of Matrix :");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int mat[][] = new int[row][col];
		System.out.println("Enter "+ row*col + " Elemets");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}
	
// Display Matrix Method
	
	void DispMat(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
// Add 2 Matrix Method
	
	int[][] AddMat(int a[][], int b[][]){
		
		if(a.length != b.length || a[0].length != b[0].length) {
			System.out.println("Order is Different");
			return null;
		}
		
		int c[][] = new int[a.length][a[0].length];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
// Biggest Integer in Matrix
	
	int BigInt(int mat[][]) {
		int big= mat[0][0];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(big<mat[i][j]) {
					big=mat[i][j];
				}
			}
		}
		return big;
	}
	
// Tronspose Matrix
	
	public int[][] transpose(int mat[][]){
		int x[][] = new int[mat[0].length][mat.length];
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j <mat[i].length;j++) {
				x[i][j] = mat[i][j];
			}
		}
		return x;	
	}
	
// Sum of the Matrix
	
	int SumMat(int mat[][]) {
		int sum =0;
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j <mat[i].length;j++) {
			sum = sum+mat[i][j];
			}
		}
		return sum;
	}
	
	
// Sum of Even & Odd Element in Matrix
	
	public int[] sumOfEO(int[][] x){
		int esum=0,osum=0;
		for (int i = 0; i < x.length; i++){
			for (int j = 0; j < x[i].length; j++) {
				if(x[i][j]%2==0)
					esum=esum+x[i][j];
				else
					osum=osum+x[i][j];
			}
		}
		int sum[]= {esum,osum};
		return sum;
	}
	
// RowWise Sum
	
	int[] RowSum(int x[][]) {
		int sum[] = new int[x.length];
		for(int i=0;i<=x.length;i++) {
			for(int j=0;j<=x[i].length;j++) {
				sum[i] = sum[i]+x[i][j];
			}
		}
		return sum;
	}
	
// ColWise Sum
	
	int[] ColSum(int x[][]) {
		int sum[] = new int[x[0].length];
		for(int i=0;i<=x.length;i++) {
			for(int j=0;j<=x[0].length;j++) {
				sum[i] = sum[i]+x[i][j];
			}
		}
		return sum;
	}
	
// Count of Even And Odd Number in a Matrix
	
	int[] CountMat(int mat[][]) {
		int eC=0,oC=0;
		for(int i=0;i<=mat.length;i++) {
			for(int j=0;j<=mat[i].length;j++) {
				if(mat[i][j]%2==0)
					eC++;
				else
					oC++;
			}
		}
		int c[] = {eC,oC};
		return c;
	}
	
// Prime Number in Mertix
	
	static boolean PrimeNumber(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public int CountPrime(int[][] x){
		int count = 0;
		for(int i=0;i<=x.length;i++) {
			for(int j=0;j<=x[i].length;j++) {
				boolean rs = PrimeNumber(x[i][j]);
				if(rs==true)
					count++;
			}
		}
		return count;
	}
	
// RowWise Biggest Element
	
	int[] RowWiseBig(int x[][]) {
		int big[] = new int[x.length];
		for(int i=0;i<=x.length;i++) {
			big[i]=x[i][0];
			for(int j=0;j<x[i].length;j++) {
				if(big[i]<x[i][j])
					big[i]=x[i][j];
			}
		}
		return big;
	}
	
// ColWise Biggest Element
	
	int[] ColWiseBig(int x[][]) {
		int big[] = new int[x[0].length];
		for(int i=0;i<x[0].length;i++) {
			big[i]=x[0][i];
			for(int j=0;j<=x.length;j++) {
				if(big[i]<x[j][i])
					big[i]=x[j][i];
			}
		}
		return big;
	}
	
// RowWise Reverse Metrix
	
	void RowReverse(int x[][]) {
		for(int i=0;i<=x.length;i++) {
			int n = x[i].length-1;
			for(int j=0;j<x[i].length/2;j++) {
				int temp=x[i][j];
				x[i][j]=x[i][n];
				x[i][n]=temp;
				n--;
			}
		}
	}

// ColWise Reverse Element
	
	void ColReverse(int x[][]) {
		for(int i=0;i<=x.length/2;i++) {
			for(int j=0;j<x[i].length;j++) {
				int temp=x[i][j];
				x[i][j]=x[x.length-1-i][j];
				x[x.length-1-i][j]=temp;
			}
		}
	}

// Diagonal Reverse	Element
	
	void DiagonalReverse(int mat[][]) {
		for(int i=0;i<=mat.length/2;i++) {
			 for(int j=0;j<mat[i].length;j++){
			        if(i==j){
			        	int temp=mat[i][j];
			        	mat[i][j]=mat[mat.length-1-i][mat.length-1-j];
			        	mat[mat.length-1-i][mat.length-1-j]=temp;
			        }
			        if(i+j==mat.length-1){
			        	int temp=mat[i][j];
			        	mat[i][j]=mat[j][i];
			        	mat[j][i]=temp;
			        }
			   }
		}
	}

// 90 Degree Rotate the Metrix
	
	int[][] rotate90left(int mat[][]){
		mat=transpose(mat);
		ColReverse(mat);
		return mat;
		}
		
	int[][] rotate90right(int mat[][]){
	   mat=transpose(mat);
	   RowReverse(mat);
	   return mat;
	}
}
