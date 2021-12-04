import java.util.*;
class WordOps
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = inp.next();
        int  l = word.length();
        int i,upper=0,lower=0;
        int vowels=0,consonants=0;
        char ch;
        for(i=0; i<l; i++)
        {
            ch = word.charAt(i);
            System.out.println(ch+" ");
            if(Character.isLetter(ch) == true)
            {
                
                if(Character.isUpperCase(ch))
                {
                    upper++;
                }
                else if(Character.isLowerCase(ch))
                {
                    lower++;
                }
                ch = Character.toLowerCase(ch);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                {
                  vowels++;
                }
                else
                {
                  consonants++;
                }
            }            
        }
        System.out.println("vowels = "+vowels);
        System.out.println("consonants = "+consonants);
        System.out.println("upper case = "+upper);
        System.out.println("lower case = "+lower);
        inp.close();        
    }
}