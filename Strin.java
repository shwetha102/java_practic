//string reverse
// class Strin{
//   public static void main(String[]args){
//     String name="hi hello how are you";
//     String word[]=name.split(" ");
//     String rev="";
    
//     for(String w:word){
//     StringBuffer d=new StringBuffer(w);
//     d.reverse();
//     rev=rev+d.toString()+" ";
//   }
//     System.out.println(rev);
// }
// }

// import java.util.StringTokenizer;

// public class Strin {
//   public static void main(String[] args) {
//     String str = "This is a test string";
//     StringBuffer sb = new StringBuffer();
//     StringTokenizer st = new StringTokenizer(str);

//     while (st.hasMoreTokens()) {
//       sb.insert(0,st.nextToken() + " ");
//     }
//     System.out.println(sb.toString().trim());
//   }
// }


import java.util.StringTokenizer;

public class Strin{
    public static void main(String[] args) {
        String input = "Hello World! How are you today?";
        StringTokenizer tokenizer = new StringTokenizer(input);
        StringBuilder sb = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            StringBuilder wordReversed = new StringBuilder(word);
            wordReversed.reverse();
            sb.append(wordReversed).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
