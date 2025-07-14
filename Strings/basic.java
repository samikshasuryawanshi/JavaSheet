
import java.util.Scanner;

class basic{

    public static String printChar(String str,int si,int ei){
        // for(int i=0;i<str.length();i++){
        //     System.out.print(str.charAt(i) + " ");
        // }
        // System.out.println();

        String substr ="";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        char arr [] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        //input string
        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next(); //stores only single word
        // name = sc.nextLine(); //takes the whole sentence including spaces
        // System.out.println( name);



    //    String name = "helloWorld";
    //   System.out.println( name.substring(0, 5));
    //    System.out.println( printChar(name,0,5));

    StringBuilder sb = new StringBuilder("");
    for(char ch = 'a';ch<='z';ch++){
        sb.append(ch);
    }
    System.out.println(sb);
    }
}