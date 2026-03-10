import java.util.Scanner;

public class concatenation {
    public static void main(String[]args){
      Scanner sc =new Scanner(System.in);
      int size=sc.nextInt();
      int n[]=new int[size];
      for(int i=0;i<n.length;i++){
        n[i]=sc.nextInt();
      }
         int new_arr[]=new int[2*size];
         for(int i=0;i<n.length;i++){
          new_arr[i]=n[i];
          new_arr[i+size]=n[i];
         }
         for(int i=0;i<2*n.length;i++){
          System.out.print(new_arr[i] + " ");
         }
    }    
}
