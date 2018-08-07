import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplymath {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s= Integer.parseInt(br.readLine());

        String str = br.readLine();
        String mul = "";
System.out.println("               ");

        for(int i = str.length() - 1; i >= 0; i--)
        {
            mul = mul + str.charAt(i);
        }
        int a[]=new int[str.length()];

        for(int i=0;i<str.length();i++)
        {
           int  d=multi(Integer.parseInt(String.valueOf(mul.charAt(i))),s);
            a[i]= d*(int)(Math.pow(10,i));
            System.out.println(a[i]);
        }
System.out.println("..................................");
      int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);


    }
    static int multi(int c, int s){

return c*s;


    }
static void  printpatter(){

}

}