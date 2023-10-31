package Lab10;
import java.util.*;
class NonSquareException extends Exception{
    public NonSquareException(String str){
        super(str);
    } 
}

public class Q5{
    static void validate(int m, int n)throws NonSquareException{
        if(m != n)
            throw new NonSquareException("Not A Square Matrix");
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter no. of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int n = sc.nextInt();
        int arr[][]= new int[m][n];
        for(int i=0; i<m; i++)
                for(int j=0; j<n; j++)
                    arr[i][j]=sc.nextInt();
        
        validate(m, n);
        System.out.println("Matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println("");
            }   
        }catch(NonSquareException e){
            System.out.println("Exception occured: " + e);  
        }
        
    }
}
