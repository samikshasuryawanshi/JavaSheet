public class OOPS{
//     public static void main(String[] args) {
//     //    pen p1 = new pen();
//     //    p1.setColor("blue");
//     //    System.out.println(p1.color);
//     //    p1.setSize(5);
//     //    System.out.println(p1.size);

//     //    student s1 = new student();
//     //    s1.setName("Samiksha");
//     //    System.out.println(s1.name);

//     //    s1.setRollNumber(78);
//     //    System.out.println(s1.rollNumber);

//     //    s1.setAge(20);
//     //    System.out.println(s1.age);




//        /////////////
//     //    bankAccount myAcc = new bankAccount();
//     //    myAcc.username = "Samiksha";
//     //   //myAcc.password = "123456";
//     //    System.out.println(myAcc.username);
//     //    myAcc.setPassword("abcd");
//     //    System.out.println(myAcc.getpassowrd());


//     //constructor
//     // Student s1 = new Student();
//     // s1.name = "Samiksha";
//     // s1.roll = 78;
//     // s1.age = 20;
//     // s1.marks[0] = 100;
//     // s1.marks[1] = 80;
//     // s1.marks[2] = 85;

//     // Student s2 = new Student(s1);
//     // System.out.println(s2.name);
//     // System.out.println(s2.marks[0]);
//     // s1.marks[2] = 100;

//     // for(int i =0;i<3;i++){
//     //     System.out.println(s2.marks[i]);
//     // }

//     //<<<<<<<INHERITANCE>>>>>>>>>>>>>>>>>>>>

//     // Fish shark = new Fish();
//     // shark.eat();


//     // Dog d = new Dog();
//     // d.eat();
//     // d.bark();


//     // Fish fish = new Fish();
//     // fish.eat();
//     // fish.swim();
//     // Mammal mammalian = new Mammal();
//     // mammalian.eat();
//     // mammalian.walk();
//     // bird b = new bird();
//     // b.fly();

// >>>>>>>>POLYMORPHISM>>>>>>>>>>>>>>>>>>>>>>
// public static void main(String[] args) {
//   Calculator clc = new Calculator();
//   System.out.println(clc.sum(1, 2));
//   System.out.println(clc.sum((float)1.5,(float)6.7));  
//   System.out.println(clc.sum(1, 2,5)); 

//    Dog d = new Dog();
//    d.eat();

// }


//>>>>>>>>ABSRTACTION>>>>>>>>>>>>>>
// public static void main(String[] args) {
// //     Horse h = new Horse();
// //     h.eat();
// //     h.walk();

// //     h.changeColor();
// //     System.out.println(h.color);

// //    Chicken mc = new Chicken();
// //     mc.eat();
// //     mc.walk();


// //     mc.changeColor();
// //     System.out.println(mc.color);

// //Abstrat class >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// //   Mustang ms = new Mustang();
// //   //Animal->Horse->Mustang




// //Interface>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// //in total abstraction
// //   Queen q = new Queen();
// //   q.move();


// // in multiple inheritance
// Beer b = new Beer();
// b.grass();
// b.meat();

// }


//Static keyWord>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// public static void main(String[] args) {
//     Student s1 = new Student();
//     s1.sclName = "rmv";

//     Student s2 = new Student();
//     System.out.println(s2.sclName);

//     Student s3 = new Student();
//     s3.sclName = "abc";
// }


//Super keyWord>>>>>>>>>>>>>>>>>>>>>>>>>>>>
public static void main(String[] args) {
    Horse h = new Horse();
    System.out.println(h.color);
}
}




// class pen{
//     String color;
//     int size;

//     void setColor(String newColor){
//         color = newColor;
//     }
//     void setSize(int newSize){
//         size = newSize;
//     }
// }

// class Student{
//     String name;
//     int roll;
//     int age;
//     int marks[];


    //Shallow copy constructor
    // Student(Student s1){
        // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;
        // this.age = s1.age;
    //     this.marks = s1.marks;
    // }


    //Deep copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.age = s1.age;

    //     for(int i =0;i<marks.length;i++){
    //         this.marks[i] = s1.marks[i];
    //     }
    // }


    // Student(){
    //     marks = new int[3];
    //     System.out.println("Constructor is called");
    // }
    // Student(String name){
    //     marks = new int[3];
    //     this.name = name;
    // }
    // Student(int roll){
    //     marks = new int[3];
    //     this.roll = roll;
    // }

    // void setName(String newName){
    //     name = newName;
    // }
    // void  setRollNumber(int newRollNumber){
    //     rollNumber = newRollNumber;
    // }
    // void setAge(int newAge){
    //     age = newAge;
    // }
// }


// class bankAccount{
//    public String username; // or we can set it into default as well...
//    private String password; 

//    String getpassowrd(){
//     return password;
//    }
//    void setPassword(String pwd){
//      password = pwd;
//    }
// }

// ///INHERITANCE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// /////base class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eating...");
//     }

//     void breathe(){
//         System.out.println("Breatheing...");
//     }
// }


//>>>>>>>>>>>>>>>>>>>>>>>Single level inheritance>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swimming...");
//     }
// }

//>>>>>>>>>>>>>>>>>>>>>>>Multiple level inheritance>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// class Mammal extends Animal{
//     int legs;
// }
// class Dog extends Mammal{
//     String breed;
//     void bark(){
//         System.out.println("Barking...");
//     }
// }



//>>>>>>>>>>>>>>>>>>>>>>>Hierachical inheritance>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swimming...");
//     }
// }

// class Mammal extends Animal{
//     void walk(){
//         System.out.println("Walking...");
//     }
// }

// class bird extends Animal{
//     void fly(){
//         System.out.println("Flying...");
//     }
// }



//>>>>>>>>>>>>>>>>>>>>>PLYMORPHISM>>>>>>>>>>>>>
//FUNCTION OVERLOADING

// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float a, float b){
//         return a+b;
//     }

//     int sum(int a,int b, int c){
//         return a+b+c;
//     }
// }

//METHOD OVERRIDING
// class Animal{
//     void eat(){
//         System.out.println("Eating...");
//     }
// }

// class Dog extends Animal{
//     void eat(){
//         System.out.println("Eating meat...");
//     }
// }


//>>>>>>>>>>>>>>>>>>>ABSRRACTIONS>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// abstract  class Animal{
//     String color;
//     Animal(){ //constructor
        
//         System.out.println("Animal constructor is called");
//     }
//     void eat(){ //non abstract
//         System.out.println("Eating...");
//     }
//     abstract void walk(); //abstract
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("horse is called");
//     }
//     void changeColor(){
//         color = "white";
//     } 
//     void walk(){
//         System.out.println("Walks on 4 legs...");
//     }
// }

// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang is called");
//     }
// }
// class Chicken extends Animal{
//      void changeColor(){
//         color = "Dark brown";
//     } 
//     void walk(){
//         System.out.println("Walks on 2 legs...");
//     }
// }

//Total abstraction>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// interface ChessPlayer{
//     void move(); // by default it is abstrct and public
// }

// class Queen implements ChessPlayer{
//   public void move(){
//         System.out.println("Queen moves in 4 direction...");
//     }
// }

// class Rook implements ChessPlayer{
//   public void move(){
//         System.out.println("Rook moves in 4 direction...");
//     }
// }
// class Pawn implements ChessPlayer{
//   public void move(){
//         System.out.println("Queen moves in left , right and diagonal...");
//     }
// }


//multiple inheritance using interface>>>>>>>>>>>>>>>>>>>>>>

interface Herb{
    void grass();
}
interface Carn{
    void meat();
}

class Beer implements Herb,Carn{
    public void grass(){
        System.out.println("Beer eats grass");
    }
    public void meat(){
        System.out.println("Beer eats meat");
    }
}


//Static keyWord

class Student{
    String name;
    String roll;

    static String sclName ;

    void setName(String name){
        this.name = name;
    }

}

//Super keyword
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "red";
         // call parent constructor
        System.out.println("Horse constructor is called");
    }
}

