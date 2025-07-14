 class FunctionsBasic{
    // public static void HelloWorld(){
    //     System.out.println("Hello World!");
    //     return; //if there is int in place of void so we willl return some integer value
    // }

    //first the main code compile and then it will go to the function which we called at main functio


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|| WAYS TO WRITE FUNCIONS IN YOUR CODE ||>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // public static void CalculateSum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = a+b;
    //     System.out.println("The sum is :" + sum);
    // }

    // public static void main(String[] args) {
    //     CalculateSum();
    // }

    // public static void CalculateSum(int a , int b){
    //     int sum = a+b;
    //     System.out.println("The sum is :" + sum);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     CalculateSum(a,b);
    // }

    // public static int CalculateSum(int a , int b){
    //     int sum = a+b;
    //     return sum; 
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //    int sum =  CalculateSum(a,b);
    //    System.out.println("The sum is :" + sum);
    // }


    // public static void CalculateSum(int a , int b){
    //     int sum = a+b;
    //     System.out.println(sum);
    // }
    // public static void main(String[] args) {
    //     CalculateSum(5,7);
    // }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FUNCTION OVERLOADING>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //DIFFERENT PARAMETERS
    // public static int sum(int a, int b){
    //     return a+b;
    // }

    // public static int sum(int a, int b,int c){
    //     return a+b+c;
    // }



    //DIFFERENT DATA TYPES
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static float sum(float a , float b){
    //     return a+b;
    // }


    // public static void main(String[] args) {
    //    System.out.println(sum(4,5));
    //    System.out.println(sum(4.5f,5.3f));
    // }


    public static void update(int marks[],int nonChangable){
        nonChangable = 5;
        for(int i = 0; i<marks.length; i++){
            marks[i] ++;
        }
    }


    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nonChangable = 10;

        update(marks, nonChangable);

        for(int i = 0;i<marks.length;i++){
            System.out.println("marks is : " +marks[i]);
        }
    }




}