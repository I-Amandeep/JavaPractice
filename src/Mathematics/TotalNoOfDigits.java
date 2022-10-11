package Mathematics;
import java.util.*;

public class TotalNoOfDigits {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        long Number=sc.nextLong();
        System.out.println(TotalDigits(Number));

    }

    public static long TotalDigits(long a)
    { int digits=0;
        long temp=a;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }




        return digits;

    }

}