import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int m,k,t,i,f,n;
        n=5;
        Scanner input=new Scanner(System.in);
        System.out.println("İNG notunuzu girin:");
        i=input.nextInt();
        if(i<0||i>100) {
            i = 0;
            n--;
            System.out.println(n);
            System.out.println(i);;

        }
        System.out.println("Matematik notunuzu girin:");
        m=input.nextInt();
        if(m<0||m>100){
            m=0;
            n--;
            System.out.println(n);
            System.out.println(m);}

        System.out.println("Kimya notunuzu girin:");
        k=input.nextInt();
        if(k<0||k>100) {
            k = 0;
            n--;
        }
        System.out.println("Turkce notunuzu girin:");
        t=input.nextInt();
        if(t<0||t>100){
            t=0;
            n--;
            System.out.println(n);}

        System.out.println("Fizik notunuzu girin:");
        f=input.nextInt();
        if(f<0||f>100){
            f=0;
            n--;
            System.out.println(n);}

        double avarage=(m+i+f+k+t)/n;
        if(avarage<=55){
            System.out.print("Kaldınız seneye tekrar alınız!!");
            System.out.print(avarage);
        }else{
            System.out.print("Tebrikler gectiniz!");
            System.out.print(avarage);
        }



    }
}