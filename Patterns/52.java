//Print braces pattern program
// int n=2
// Output:
// { }
// { } {{ }}
import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                for(int k=0;k<j;k++){
                    System.out.print("{");
                }
                System.out.print("{ }");
               
                for(int k=0;k<j;k++){
                    System.out.print("}");
                }
            }
            System.out.println();
        }
    }
}

