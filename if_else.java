 class if_else {
     public static void main(String args[])
     {
         String name=args[0];
         String college=args[1];
         if(name.equals("Ayushi") || college.equals("DBIT"))
         {
             System.out.println("You are welcomed");
         }
         else if (name.equals("Ayushi") && college.equals("DBIT"))
         {
             System.out.println("Welcome");
             
         }
         else{
             System.out.println("Please go out");
         }
     }
    
    
}