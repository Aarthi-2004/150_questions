//        1
//       12
//      123
//     1234
//    12345
class Pattern2{
    public static void main(String[] args){
        int n = 5;
        for(int i = n; i >= 1; i--){
            int k=1;
            for(int j = n; j >= 1; j--){
                if(i + j <= (n + 1)){
                    System.out.print(k + " ");
                    k++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}