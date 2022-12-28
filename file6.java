public class Animal
{
  private String name;
  private int age;
  private double height;
  public Animal(String name, int age, double height)
    {
    this.name = name;
    this.age = age;
    this.height = height;
    }
  public void display()
    {
    return "Name: "+this.getName()+"\tAge: "+this.getAge()+"years \tHeight: "+this.getHeight()+" m";
    }
}
    
