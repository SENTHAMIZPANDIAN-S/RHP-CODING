import java.util.*;
class Main{
    static List<List<Integer>> g;
    static int[] col;
    static int dfs(int x,HashSet<Integer> st){
        st.add(col[x]);
        if(g.get(x).size()==0) return st.size();
        return dfs(g.get(x).get(0),st);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        g=new ArrayList<>();
        for(int i=0;i<=n;i++) g.add(new ArrayList<>());
        col=new int[n+1];
        for(int i=1;i<=n;i++){
            int p=sc.nextInt();
            g.get(p).add(i);
        }
        for(int i=1;i<=n;i++){
            col[i]=sc.nextInt(); 
        }
        int q=sc.nextInt();
        int mod=1e7;
        int sum=0;
        while(q-->0){
            int x=sc.nextInt();
            int ans=1;
            for(int v:g.get(x)){
                ans=Math.max(ans,1+dfs(v,new HashSet<>()));
            }
            sum=(sum+ans)%mod;
        }
        System.out.println(sum);
    }
}
