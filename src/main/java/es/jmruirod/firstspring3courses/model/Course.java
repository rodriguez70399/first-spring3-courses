package es.jmruirod.firstspring3courses.model;

/**
 * Clase modelo para un curso
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public class Course 
{
    private int Id;
    private String name;
    private int duration;
    private int price;

    public Course() 
    {

    }

    public Course(int id, String name, int duration, int price) 
    {
        Id = id;
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public int getId() 
    {
        return Id;
    }

    public void setId(int id) 
    {
        Id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getDuration() 
    {
        return duration;
    }

    public void setDuration(int duration) 
    {
        this.duration = duration;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }   
}
