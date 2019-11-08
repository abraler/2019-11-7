import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        int num=Find(a);
        int i = 0;
        int p=0;
        for (; i <a.length() ; i++) {
            if(a.charAt(i)<'0'||a.charAt(i)>'9'){
                p=0;
                continue;
            }
            p++;
            if(p==num){
                break;
            }
        }
        i=i-p;
        for (int j = i+1; j <i+num+1 ; j++) {
            System.out.print(a.charAt(j));
        }
    }

    private static int Find(String a) {
        int q=0;
        int num=0;//记录几个连续
        int max=0;
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)<'0'||a.charAt(i)>'9'){
                num=0;
                continue;
            }
            num++;
            max=Math.max(max,num);
        }
return max;
    }
}