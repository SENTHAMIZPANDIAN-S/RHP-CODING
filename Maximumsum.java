import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int mx=Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE;

        for(int j=0;j<m;j++){
            if(a[0][j]>mx){
                smx=mx;
                mx=a[0][j];
            }
        else if(a[0][j]>smx){
              smx=a[0][j];
            }
        }
        for(int i=1;i<n;i++){
            int nmx=Integer.MIN_VALUE;
            int nsmx=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(a[i-1][j]==mx)a[i][j]+=smx;
                else a[i][j]+=mx;
                if(a[i][j]>nmx){
                    nsmx=nmx;
                    nmx=a[i][j];
                }else if(a[i][j]>nsmx){
                    nsmx=a[i][j];
                }
            }
            mx=nmx;
            smx=nsmx;
        }
        System.out.println(mx);
    }
}
