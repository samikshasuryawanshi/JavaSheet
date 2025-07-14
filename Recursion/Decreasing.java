
public class Decreasing{
    // 10 9 8 7 6 5 4 3 2 1 Print
    public static void PrintDec1(int n ){
        if(n == 1){
        System.out.println(n);
        return ;
        }
        System.out.print(n + " ");
        PrintDec1(n-1);
    }

    //another way
    public static void PrintDec2(int n){
        System.out.print(n + " ");
        if(n > 1){
            PrintDec2(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        PrintDec2(n);
    }
}