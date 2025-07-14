class Binarystring{
    public static void PRintBinStrin(int n , int lastPlace , String str){
        if(n == 0){
            System.out.println(str + " ");
            return;
        }
        PRintBinStrin(n-1, 0, str+"0");
        if(lastPlace == 0){
            PRintBinStrin(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        PRintBinStrin(3,1, "");
    }
}