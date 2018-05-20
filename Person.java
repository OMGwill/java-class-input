public class Person
{
   private String name;
   private int age;

   /**
      Default Constructor.
   */
   public Person()
   {
      this.name = "";
      this.age = 0;
   }
   
   /**
      Create a person with a given name and age.
      @param name the name
      @param age the age
   */
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }

   /**
      Get the name.
      @return the name
   */
   public String getName()
   {   
      return name;
   }
   
   /**
      Change the name.
      @param name the name
   */
   public void setName(String name)
   {   
      this.name = name;
   }
   
   /**
      Get the age.
      @return the age
   */
   public int getAge()
   {   
      return age;
   }
   
   /**
      Change the age.
      @param age the age
   */
   public void setAge(int age)
   {   
      this.age = age;
   }
   
   
   /**
      Convert person to string form.
   */
   public String toString()
   {
      return "Name: " + name + "\t" + "Age: " + age;
   }
}	