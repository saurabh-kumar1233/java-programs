// public class constructor {
//     public static void main(String args[])
//     {
//         fish b1 =new fish();

//     }

// class fish{
    
//     void eat()
//     {
//         System.out.print("eats");
//     }

//     void swim()
//     {
//         System.out.println("swimming");
//     }
// }
// }

import java.io.*;

class Geek {
    // constructor with one argument
    Geek(String name)
    {
        System.out.println("Constructor with one "
                           + "argument - String : " + name);
    }

    // constructor with two arguments
    Geek(String name, int age)
    {

        System.out.println(
            "Constructor with two arguments : "
            + " String and Integer : " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous..
    Geek(long id)
    {
        System.out.println(
            "Constructor with one argument : "
            + "Long : " + id);
    }
}

class GFG {
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
        Geek geek2 = new Geek("Shikhar");

        // Invoke the constructor with two arguments
        Geek geek3 = new Geek("Dharmesh", 26);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Geek geek4 = new Geek(325614567);
    }
}