/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.

*/


class LuckyTicket{
    public static void main(String[] args) {
        int n=123024;
        System.out.println(isLucky(n));
    }

    static boolean isLucky(int n) {
        int digits=0;
        int num=n;
        while(num!=0)
        {
            num=num/10;
            digits++;
        }
        int count=digits/2;
        int sum1=0,sum2=0;
        for(int i=1;i<=digits/2;i++)
        {
            sum1=sum1+n%10;
            n=n/10;
        }
        for(int i=1;i<=digits/2;i++)
        {
            sum2=sum2+n%10;
            n=n/10;
        }
        if(sum1==sum2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}