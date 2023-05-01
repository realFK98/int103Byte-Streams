package bytestrems2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB5 {

    public static void main(String[] args) {
        Student s = new Student("075", "wishira");

        // System.out.println("hello"); // stackjeral
        // SayHello obj = new SayHello();
        // obj.say(); //obj
        // say();// posidoral programing

        try {
            FileOutputStream file = new FileOutputStream("object.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, e);

        } catch (IOException e) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            FileInputStream file = new FileInputStream("object.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student ss = (Student) input.readObject();
            System.out.println(ss);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, e);

        } catch (IOException e) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, e);

        }
    }
}

// public static void say() {
// System.out.println("hello");
// }
