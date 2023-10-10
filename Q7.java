public class Q7 {
    public static void main (String args[]){
        int x = 40;
        System.out.print(x+ " --> ");
        for(int i = x; i >= 1 ;i--){
            if(x % 2 == 0){
                x = x/2;
            }else{
                x = 3 * x + 1;
            }
            System.out.print(x+" --> ");
            if(x == 1){
                break;
            }
        }
    }
}

  