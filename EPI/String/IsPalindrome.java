package String;

public class IsPalindrome {

    public static void main(String[] args)
    {

        String input = "abac";

        for(int i=0, j=input.length()-1; i<input.length(); i++, j--)
        {
            if(input.charAt(i) != input.charAt(j))
            {
                System.out.println(" not palindrome ");
                break;
            }
        }

        System.out.println(" Palindrome ");

    }
}
