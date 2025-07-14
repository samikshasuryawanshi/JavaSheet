import java.util.*;

class toCompressed{
    //without stringBuilder
    // public static String compress(String str){
    //     String newstr = "";
    //     for(int i = 0;i < str.length() ; i++){
    //         Integer count=1;
    //         while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         newstr += str.charAt(i) ;
    //         if(count > 1){
    //             newstr += count.toString();
    //         }
    //     }
    //     return newstr;
    // }

    //with StringBuilder 
    // public static String compress(String str){
    //     StringBuilder newStr = new StringBuilder("");
    //     for(int i =0;i<str.length();i++){
    //         Integer count = 1;
    //         while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         newStr.append(str.charAt(i));
    //         if(count > 1){
    //             newStr.append(str.charAt(i));
    //         }
    //     }
    //     return  newStr.toString();
    // }

    //>>>>>>>>>>>>>>DELTE MORE THAN 2 CHARCTER CONSECUTIVELY APPEAR

    //  public static String makeFancyString(String s) {
    //     StringBuilder ans = new StringBuilder();
    //     for (char c : s.toCharArray()) {
    //         int n = ans.length();
    //         if (n < 2 || c != ans.charAt(n - 1) || c != ans.charAt(n - 2)) {
    //             ans.append(c);
    //         }
    //     }
    //     return ans.toString();
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String str = sc.nextLine();
    //     // System.out.println(makeFancyString(str));
    //     // String str = "aabbcc";
    //     System.out.println(compress(str));
    // }

      public static String makeFancyString(String s) {
        StringBuilder newStr = new StringBuilder("");
        for(int i =0;i<s.length();i++){
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(s.charAt(i));
            if(count > 1){
                 newStr.append(s.charAt(i));
            }
        }
        return newStr.toString();
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(makeFancyString(str) );
    }
}