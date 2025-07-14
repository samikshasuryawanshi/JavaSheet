class HollowRhombus{

    public static void Hollow_Rhombus(int n ){
        for(int i =1;i<=n;i++){
            //spaces
            int spaces = n-i;
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");
            }

            //hollow rectangle
            for(int j =1;j<=n;j++){
                if( i ==1 || j ==1 || i== n || j==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Hollow_Rhombus(5);
    }
}