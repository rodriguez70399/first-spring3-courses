package es.jmruirod.firstspring3courses.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.jmruirod.firstspring3courses.model.Course;

/**
 * Implementación de la interfaz CourseServiceInterface que gestiona la lógica de los cursos.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class CourseServiceInterfaceImplemented implements CourseServiceInterface
{
    private List<Course> courseList;

    /**
     * Constructor de la clase. Inicializa la lista de cursos con datos de ejemplo.
     */
    public CourseServiceInterfaceImplemented() 
    {
        this.courseList = new ArrayList<>();
        this.courseList.add(new Course(1, "Java 17", 20, 20));
        this.courseList.add(new Course(2, "JavaScript", 10, 20));
        this.courseList.add(new Course(3, "Python", 5, 10));
        this.courseList.add(new Course(4, "Angular", 30, 30));
    }

    @Override
    public List<Course> create(Course course) 
    {
        this.courseList.add(course);
        return this.courseList;       
    }

    @Override
    public List<Course> delete(int id) 
    {
        this.courseList.removeIf(course -> course.getId() == id);
        return this.courseList;
    }

    @Override
    public Course findById(int id) 
    {
        return courseList.stream().filter(course -> course.getId() == id)       
        .findFirst().orElse(null);
    }

    @Override
    public void updateDuration(int id, int duration) 
    {
        this.courseList.get(this.courseList.indexOf(findById(id))).setDuration(duration);
    }
}