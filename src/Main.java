
public class Main {

    public static void main(String[] args) {
        String[] materii={"Matematica", "Romana", "Fizaica"};
        int [][] note={{10,10,5},{10,10,10},{10,10,9,8}};
        Student s1 = new Student("Gigel", materii, note);
        System.out.println(s1);
        s1.mediaAnuala();

        int [][] noteS2 = {{10,10,5},{4,4,5},{10,10,9,8}};
        Student s2 = new Student("Ionel",materii, noteS2);
        System.out.println(s2);
        s2.mediaAnuala();

    }

}
