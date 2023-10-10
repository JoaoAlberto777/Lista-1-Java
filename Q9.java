import java.util.Scanner;
public class Q9 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float salario;
        float NovoSalario = 0;
        System.out.print("Informe seu salario: ");
        salario = sc.nextFloat();
        System.out.println("Salario antigo: " + salario);

        if(salario <= 280){
            NovoSalario = salario + (salario * 0.20f);
            System.out.println("Aumento percentual de 20%");
            System.out.println("Valor aumentado: R$" + (NovoSalario - salario));
            System.out.println("Seu novo salário é de: R$" + NovoSalario);
        }else if(salario > 280 && salario < 700){
            NovoSalario = salario + (salario * 0.15f);
            System.out.println("Aumento percentual de 15%");
            System.out.println("Valor aumentado: R$" + (NovoSalario - salario));
            System.out.println("Seu novo salário é de: R$" + NovoSalario);

        }else if(salario > 700 && salario < 1500){
            NovoSalario = salario + (salario * 0.10f);
            System.out.println("Aumento percentual de 10%");
            System.out.println("Valor aumentado: R$" + (NovoSalario - salario));
            System.out.println("Seu novo salário é de: R$" + NovoSalario);

        }else if(salario >= 1500){
            NovoSalario = salario + (salario * 0.05f);
            System.out.println("Aumento percentual de 5%");
            System.out.println("Valor aumentado: R$" + (NovoSalario - salario));
            System.out.println("Seu novo salário é de: R$" + NovoSalario);
        }




    }
}
