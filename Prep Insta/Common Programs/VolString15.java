/* 15.Java Program to check a character is a Vowel or Consonant */

   public class VolString15 
   {
      public static void main(String[] args)
        {
   
            char c = 'f';
   
            if(isVowel(c))
            System.out.println(c + " is a vowel");
   else
        System.out.println(c + " is a conspnant ");
		
		
    }
	
	static boolean isVowel(char c)
	{
	
	   c = Character.toUpperCase(c);
	   return(c=='A'|| c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
	
}

