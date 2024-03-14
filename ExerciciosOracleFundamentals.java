package Java.OracleJavaFundamentals;

import java.util.Scanner;

public class ExerciciosOracleFundamentals {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecione um metodo:");
        System.out.println("conta, planeta, aluno, exame, decode"); //lista de metodos
        switch (in.next()) {    //entrada
            case "conta":   //chamada de metodos
                conta();
                break;
            case "planeta":
                planeta();
                break;
            case "aluno":
                aluno();
                break;
            case "exame":
                exame();
                break;
            case "decode":
                decode();
                break;
            default:
            System.out.println("Invalido");
                break;
            
        }
        in.close();

    }

    // calculo de aprovação de exame
    public static void exame(){
        Scanner in = new Scanner(System.in);
        System.out.println("media"); //entrada
        double m = in.nextDouble();
        System.out.println("faltas");
        int f = in.nextInt();
        in.close();
        if ((m>=90 && f<=3) || (m>=80 && f==0)){    //saida
            System.out.println("aprovado");
        }
        else{
            System.out.println("reprovado");}
    }

    // calculo de aprovação de aluno
    public static void aluno(){
        Scanner in = new Scanner(System.in);
        System.out.println("orador? y-1/n-2"); //entrada
        int o = in.nextInt();
        if (o==1){
            System.out.println("aprovado");
        }
        else{
        System.out.println("media geral");
        double m = in.nextDouble();
        System.out.println("sat");
        double s = in.nextDouble();
        in.close();
            
            if (o==2 && m>=4 && s>=1100){   //saida
                System.out.println("aprovado");
            }
            else if (o==2 && m >=3.5 && s >= 1300){
                System.out.println("aprovado");
            }
            else if (o==2 && m >=3 && s >= 1500){
                System.out.println("aprovado");
            }
            else{
                System.out.println("reprovado");
            }

        }
    }

    // calculo de peso em planetas
    public static void planeta(){
        Scanner in = new Scanner(System.in);
        System.out.print("peso: "); //entrada
        double peso = in.nextDouble();
        System.out.print("planeta: "); //entrada
        System.out.println("1- Mercurio, 2- Venus, 3- Marte, 4- Júpiter, 5- Saturno, 6- Urano, 7- Netuno");
        int p = in.nextInt(); 
        switch (p) { //saida
            case 1:
                System.out.println(peso * 0.38);
                break;
            case 2:
                System.out.println(peso * 0.91);
                break;
            case 3:
                System.out.println(peso * 0.38);
                break;
            case 4:
                System.out.println(peso * 2.36);
                break;
            case 5:
                System.out.println(peso * 0.92);
                break;
            case 6:
                System.out.println(peso * 0.89);
                break;
            case 7:
                System.out.println(peso * 1.13);
                break;
            default:
             System.out.println("Invalido");
                break;
        }
        in.close();
    }

    // calculadora
    public static void conta() {
    Scanner in = new Scanner(System.in);    //entrada
        System.out.println("primeiro numero");
        double one = in.nextDouble();
        System.out.println("segundo numero");
        double two = in.nextDouble();
        System.out.println("operador");
        char o = in.next().charAt(0);

        switch (o) {    //saida
            case '+':
                System.out.println(one + two);
                break;
            case '-':
                System.out.println(one - two);
                break;
            case '*':
                System.out.println(one * two);
                break;
            
            default:
                System.out.println("Invalido");
                break;
        }
        in.close();
}
    //decodificação
    public static void decode(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");        int n = 10;
        String m[] = new String[n];
        for (int i = 0; i < n; i++) { //entrada
            System.out.println("Digite um numero de 1 a 7("+(i+1)+")");
            m[i] = in.next();
        }
        String r[] = new String[n];
        for(int i=0; i<n; i++){ //processamento
            System.out.println(m[i]);
            if(m[i].equals("1")){
                r[i] = "D";
            }
            else if(m[i].equals("2")){
                r[i] = "W";
            }
            else if(m[i].equals("3")){
                r[i] = "E";
            }
            else if(m[i].equals("4")){
                r[i] = "L";
            }
            else if(m[i].equals("5")){
                r[i] = "H";
            }
            else if(m[i].equals("6")){
                r[i] = "O";
            }
            else if(m[i].equals("7")){
                r[i] = "R";
            }
            else{
                System.out.println("invalido");
            }
        }
        for(int i=0; i<n; i++){ //saida
            System.out.print(r[i]);
        }
        in.close();

    }
}
