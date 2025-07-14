import java.util.PriorityQueue;
class Basic{

    static  class Student implements Comparable<Student> {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student s2) {
            return this.age - s2.age; // Compare by age
        }
    }


    public static void main(String[] args) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(); 

         pq.add(new Student("Alice", 22));
            pq.add(new Student("Bob", 20));
            pq.add(new Student("Charlie", 25));

            while(!pq.isEmpty()){
                System.out.println(pq.peek()); // Peek at the top element
                pq.remove(); // Remove the top element
            }
    }
}