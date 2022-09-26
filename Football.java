import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cadena=sc.nextLine();
        int contador=1;
        boolean flag=true;
        int i=1;

        while(i<cadena.length() && flag){
            char p =cadena.charAt(i);
            if(p==cadena.charAt(i-1)){
                contador+=1;
                if(contador==7){
                    System.out.println("YES");
                    flag=false;
                }
            }
            else{
                contador=1;
            }
            i++;
        }
        if(flag){
            System.out.println("NO");
        }
         
        
    }
}
