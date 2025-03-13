class StringDemo4{
  
  public static void main(String args[]){
  
  StringBuffer sb = new StringBuffer("Hello");
  System.out.println(sb);
  sb.append("Duniya!");
  System.out.println(sb);
  /* Hello
HelloDuniya!*/
  
  StringBuffer sb1 = new StringBuffer("Hello");
  System.out.println(sb1);
  sb1.append("CDAC");
  System.out.println(sb1); 
  /* 
Hello
HelloCDAC */
  
  String s = "Hello";
  System.out.println(s);
  s.concat("Bhai!");
  System.out.println(s);
  s=s.concat("Bhai!");
  System.out.println(s);   
  /* o/p :
  Hello
HelloDuniya!
Hello
HelloCDAC
Hello
Hello
HelloBhai! */
  

  
  }
  
}

/* o/p :

Hello
HelloDuniya!
Hello
Hello
HelloCDAC

*/