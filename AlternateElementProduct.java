/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.
*/

class AlternateElementProduct{
    public static void main(String[] args)
    {
        int arr[]={3,6,-2,-5,7,3};
        System.out.println(alternateElements(arr));
    }

    static int alternateElements(int[] inputArray) {
        int i=0,mul1=1,mul2=1;
        while(i<inputArray.length)
        {
            if(i%2==0)
            {
                if(inputArray[i]>0)
                {
                    mul1=mul1*inputArray[i];
                }
            }
            else{
                if(inputArray[i]>0)
                {
                    mul2=mul2*inputArray[i];
                }
            }
            i++;
        }
        if(mul1>mul2)
            return mul1;
        else
            return mul2;
    }
    
}