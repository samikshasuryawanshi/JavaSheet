class ReverseString{
    public static void main(String args[]){
        String name = "Heloo";
        String reversedName = "";

        for(int i = name.length()-1;i>=0;i--){
            reversedName = reversedName + name.charAt(i);
        }
        System.out.println(reversedName);
    }
}