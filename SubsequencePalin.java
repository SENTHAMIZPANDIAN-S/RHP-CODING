import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] l=new int[26];
        int[] r=new int[26];
        for(int i=0;i<s.length();i++){
            r[s.charAt(i)-'a']++;
        }
        long ans=0;
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            r[x]--;
            for(int j=0;j<26;j++){
                ans+=(long)l[j]*r[j];
            }
            l[x]++;
        }
        System.out.println(ans);
    }
}
