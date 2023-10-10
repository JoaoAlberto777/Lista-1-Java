public class Q4 {
    public static void main(String args[]){
        int N = 11;
        boolean primo = true;
        for(int i = 2; i < N ; i++)
        if(N % i == 0){
            primo = false;
            break;
        }
        
        if(primo){
            System.out.println("O número " + N + " é primo");
        }else{
            System.out.println("O número" + N + "Não é primo");
        }
            
    }
}
    

