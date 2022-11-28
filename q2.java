class q2{
   public static void main(String args[]){
     String str = "This is a sample sentence.";
        String[] words = str.split("\\s+");
        

        for (int i = 0; i < words.length(); i++) {
            System.out.println(words[i]);
        }
   }
}