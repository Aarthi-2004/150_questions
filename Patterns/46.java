// 12345
//  2345
//   345
//    45
//     5
class Pattern2{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i <= j){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
