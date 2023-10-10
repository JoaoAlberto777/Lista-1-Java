public class Q6 {
    public static void main(String args[]){
        
        for(int j = 1; j <=10; j++){
            int fat = 1;
            for(int i = j; i>1; i--){
            fat = fat * i;
       }
        System.out.println("Fatorial de " + j + ":"  + fat);
  }
 }
}
