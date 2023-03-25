import java.util.Scanner;

class Matrix{
    int row,coloumb;
    float mat[][];
    
    Matrix(int a[][]){
        this.row=a.length;
        this.coloumb=a[0].length;
        this.mat=new float[this.row][this.coloumb];
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.coloumb;j++){
                this.mat[i][j]=a[i][j];
            }
        }
        
    }
   
    Matrix(){
        this.row=2;
        this.coloumb=2;
        mat=new float[this.row][this.coloumb]; 
    }
    
    Matrix (int r,int c){
        this.row=r;
        this.coloumb=c;
        mat=new float[this.row][this.coloumb];
    } 
    
    void readMatrix(){
        Scanner sc = new Scanner(System.in);

        System.out.println ( "The 2-d matrix has  row" +this.row+" And coloumb"+this.coloumb);
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.coloumb;j++){
                this.mat[i][j]=sc.nextFloat();
            }
        }
    }
    
    float [][] transpose(){
        float [][] transpose_matrix = new float[this.coloumb][this.row];
        for(int i=0;i<this.coloumb;i++){
            for(int j=0;j<this.row;j++){
                transpose_matrix[i][j] = mat [j][i];
            }
            
        }
        return transpose_matrix;
    }
   
    float [][] matrixMultiplication(Matrix secound){
        float [][] ans_matrix = new float [this.row][this.coloumb];
        System.out.println("Matrix multiplication of:");
        displayMatrix();
        System.out.println("and");
        secound.displayMatrix();
        float[][] result = new float[row][secound.coloumb];
        if (coloumb == secound.row) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < secound.coloumb; j++) {
                    ans_matrix[i][j] = 0;
                    for (int k = 0; k < coloumb; k++) {
                        ans_matrix[i][j] += mat[i][k] * secound.mat[k][j];
                    }
                }
            }
        } else {
            System.out.println("Error: Matrices cannot be multiplied!");
        }
        
            return ans_matrix;
        }
    
    void displayMatrix(float [][]a){
        System.out.println("The matix is:");
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.coloumb;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    void displayMatrix(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumb; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    float Maximum_of_Array(){
        float max=0;
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.coloumb;j++){
                if(max<this.mat[i][j]){
                    max = this.mat [i][j];
                }
            }
        }
        return max;
    }
    float Average_of_Array(){
        float average=0;
        int n = this.row*this.coloumb;
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.coloumb;j++){
                average += mat [i][j];
                average /=n;
            }
        }
        return average;
    }
    
    
    
}

class MatrixMain{
    public static void main(String args[]){
        
        //This is a defualt constructor called and display defualt matrix.
        /*Which is defualt matrix: |0.0 0.0|
         *                         |0.0 0.0|
         */
        Matrix m = new Matrix();
        System.out.println("This is an defualt  matrix from :");
        m.displayMatrix();

        Matrix mat1,mat2;
        System.out.println("");
        

        //we pass an 2-d matrix to copy this matrix in another matrix.
        int arr [][] ={{1,2,3},{4,5,6}};
        mat1 = new Matrix(arr);
        System.out.println("This is an copy matrix from arr:");
        mat1.displayMatrix();


        mat2=new Matrix(3,3);
        System.out.println("This is an read values for an float matrix:");
        mat2.readMatrix();
        System.out.println("This is an float matrix:");
        mat2.displayMatrix();
        System.out.println("This is an transpose matrix of float matrix:");
        float transpose[][] = mat2.transpose();
        mat2.displayMatrix(transpose);
        System.out.println("The maximum value of an float matrix:");
        float maximum_value = mat2.Maximum_of_Array();
        float avg1 = mat2.Average_of_Array();
        System.out.println(maximum_value);
        System.out.println("The average value of an float matrix:");
        System.out.println(avg1);

        System.out.println("The 2 matrix multiplication:");
        mat1 = new Matrix(3, 3);
        mat2 = new Matrix(3, 3);

        //Read two matrix
        System.out.println("Enter value of an float matrix 1:");
        mat1.readMatrix();
        System.out.println("Enter value of an float matrix 2:");
        mat2.readMatrix();
        
        //Multiplication of two matrix.
        float a[][] =mat1.matrixMultiplication(mat2);
        mat1.displayMatrix(a);
    }
}
