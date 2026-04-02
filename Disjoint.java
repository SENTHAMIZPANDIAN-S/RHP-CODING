import java.util.*;
class Main{
    private static int[] p,s;
    private static int find(int x){
        if(p[x]==x)return x;
        return p[x]=find(p[x]);
    }
    private static void union(int a,int b){
        a=find(a);
        b=find(b);
        if(a==b)return;
        if(s[a]<s[b]){
            int t=a;
            a=b;
            b=t;
        }
        p[b]=a;
        s[a]+=s[b];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        p=new int[n+1];
        s=new int[n+1];
        for(int i=1;i<=n;i++){
            p[i]=i;
            s[i]=1;
        }
        while(q-->0){
            int u=sc.nextInt();
            int v=sc.nextInt();
            union(u,v);
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(find(i)==i)ans=Math.max(ans,s[i]);
        }
        System.out.println(ans);
    }
}
