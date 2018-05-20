import java.io.*;
import java.util.*;

public class PersonDemo  
{
    public static void main() throws FileNotFoundException
    {
        //creates an array of person type and scanner to read data.txt
        Person [] array = new Person[10];
        Scanner in = new Scanner(new File("data.txt"));
        
        //variables
         int count = 0;
         int number;
         
        //while data.txt has a next line..
         while (in.hasNextLine())
         {   
            // first integer is 1, 2, or 3 which corresponds to person, student, or instructor
             number = in.nextInt();
             
                //if the number is 1, create a person object and store in array, increment count, read next line
                if (number == 1)
                {
                    array[count] = new Person(in.next(),in.nextInt());
                    count++;
                    in.nextLine();
                }
                
                //if the number is 2, create a student object and store in array, increment count, read next line
                if (number == 2)
                {
                    array[count] = new Student(in.next(),in.nextInt(),in.nextInt(),in.next());
                    count++;
                    in.nextLine();
                }
                
                //if the number is 3, create an instructor object and store in array, increment count, read next line
                if (number == 3)
                {
                    array[count] = new Instructor(in.next(),in.nextInt(),in.nextInt());
                    count++;
                    in.nextLine();
                }
                
        }
        
        //close file
        in.close();
        
        
        System.out.println("A list of People from the data file:\n");
        
        //implements polymorphism using the toString method override from the corresponding class
        for(int i = 0; i < count; i++)
        {
            System.out.println(array[i].toString());
        }
    }
}
