/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.

*/
class checkPalindrome{
    public static void main(String[] args){
        String s="ajayaja";
        System.out.println(checkPalindrome(s));
    }

    static boolean checkPalindrome(String inputString) {
        StringBuffer s=new StringBuffer(inputString);
        s=s.reverse();
        return inputString.equals(s.toString());
    }
}