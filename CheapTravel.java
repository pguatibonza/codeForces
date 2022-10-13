import java.util.Scanner;
//https://codeforces.com/problemset/problem/466/A
public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int x=n/m;
        int total=0;
        if(b<m*a){
            total=b*x;
        }
        else{
            total=x*m*a;
        }

        if(b<a*(n-x*m)){
            total+=b;
        }
        else{
            total+=a*(n-x*m);
        }
        System.out.println(total);
    }
    
}
