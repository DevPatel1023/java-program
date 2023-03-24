import java.util.Scanner;

class Matrix{
    int row,coloumb;
    float mat[][];
    
    Matrix(int a[][]){
        this.row=a.length;
        this.coloumb=a[0].length;
        this.mat=new float[this.row][this.coloumb];
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                this.mat[i][j]=a[i][j];
            }
        }
        
    }
   
    Matrix(){
        this.row=0;
        this.column=0;
        mat=new float[this.row][this.column]; 
    }
    
    Matrix (int r,int c){
        this.row=r;
        this.column=c;
        mat=new float[this.row][this.column];
    } 
    
    void readMatrix(){
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.coloumb;j++){
                System.out.println ( "Enter Element at row" +i+"And at coloumb"+j);
                this.mat[this.row][this.coloumb]=sc.nextFloat();
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

            return ans_matrix;
        }
    
    void displayMatrix(float [][]a){
        System.out.println("The matix is:");
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    void displayMatrix(){
        
    }
    float Maximum_of_Array(){
        float max=0;
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                if(ans<this.mat[i][j]){
                    ans = this.mat [i][j];
                }
            }
        }
        return ans;
    }
    float Average_of_Array(){
        float average=0;
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.column;j++){
                average += mat [i][j];
                average /=this.row*this.coloumb ;
            }
        }
        return average;
    }
    
    
    
}

class MatrixMain{
    
}
