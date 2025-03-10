// Array Initialization & Traversing 
import java.util.ArrayList;
public class Basicsofarray{
    public static void main(String[] args){
        int arr[] = { 1, 2, 3, 4, 5 };                  // 1. Fixed Size
        int n = arr.length;                             // Linear Traversal
        for(int i=0;i<n;i++){                           // we can use while/foreach and for loop
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> arr1 = new ArrayList<>();    // 2. Dynamic Size
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        int o = arr1.size();                             //in dynamic it's size not length
        for(int i=0;i<o;i++){
            System.out.print(arr1.get(i) + " ");         //we need to use arrayname.get() 
        }
        System.out.println();
        // Array are of two types on the basis of Dimensions : 1. One-Dimensional 2. Multi-Dimensional
        // Defining number of rows and columns in matrix
        // Array Declaration
        int[][] arr2 = {
            {1,2,3}, 
            {4,5,6}, 
            {7,8,9}
        };
        // Traversing over all the rows
        for (int i = 0; i < 3; i++) {
            // Traversing over all the columns of each row
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


