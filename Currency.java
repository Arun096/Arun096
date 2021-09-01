import java.util.Scanner;
public class Currency
{
    public static void main(String[] args)
    {
        type ob=new type();
        ob.dollartorupee();
        ob.rupeetodollar();
        ob.eurotorupee();
        ob.rupeetoeuro();
        ob.yentorupee();
        ob.rupeetoyen();
    }
}
class type
{
    Scanner sc=new Scanner(System.in);
    double usd,inr;
    double euro,yen;
    void dollartorupee()
    {
        System.out.print("enter dollars:");
        usd=sc.nextInt();
        inr=usd*67;
        System.out.println("dollars=" +usd+"rupees=" +inr);
        System.out.println();
    }
    void rupeetodollar()
    {
        System.out.print("enter rupees:");
        inr=sc.nextInt();
        usd=(inr/67);
        System.out.println("rupees=" +inr+"dollars=" +usd);
        System.out.println();
    }
    void eurotorupee()
    {
        System.out.print("enter euros:");
        euro=sc.nextInt();
        inr=euro*79;
        System.out.println("euros=" +euro+"rupees=" +inr);
        System.out.println();
    }
    void rupeetoeuro()
    {
        System.out.print("enter rupees:");
        inr=sc.nextInt();
        euro=(inr/79);
        System.out.println("rupees=" +inr+"euros=" +euro);
        System.out.println();
    }
    void yentorupee()
    {
        System.out.print("enter yens:");
        yen=sc.nextInt();
        inr=yen*0.6;
        System.out.println("yens=" +yen+"rupees=" +inr);
        System.out.println();
    }
    void rupeetoyen()
    {
        System.out.print("enter rupees:");
        inr=sc.nextInt();
        yen=(inr/0.6);
        System.out.println("rupees=" +inr+"yens="+yen);
        System.out.println();
    }
    
}
