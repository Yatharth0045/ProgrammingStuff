/*
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Eg [1,2,1,2]
Eg [1,2,3,4,5,3,5,6]
Eg [40,50,60,10,20,30]

*/

boolean almostIncreasingSequence(int[] sequence) 
{
    int count=0;
    for(int i=0;i<sequence.length-1;i++)
    {
        if(sequence[i]>=sequence[i+1])
        {
            if(i-1!=-1 && i+2!=sequence.length)
            {
               if(sequence[i-1]>=sequence[i+1] && sequence[i]>=sequence[i+2])
                {
                    return false;
                } 
            }
            
            count++;
        }
    }
    if(count<=1)
    {
        return true;
    }
    else
    {
        return false;
    }
}


/*
if(sequence[i-1]>=sequence[i+1] && sequence[i]>=sequence[i+2])
            {
                return false;
            }
*/
