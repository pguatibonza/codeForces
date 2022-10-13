import java.util.Scanner;

//https://codeforces.com/problemset/problem/327/A
public class FlippingGame {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);  
        int n = sc.nextInt();
        int unos=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==1){
                unos+=1;
            }
        }
        int max=0;
        int sum=0;
        if (unos==n){
            System.out.println(unos-1);
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    sum+=1;
                }
                else{
                    sum-=1;
                }
                if(sum>max){
                    max=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
            System.out.println(max+unos);
        }
        
        
    }

}
