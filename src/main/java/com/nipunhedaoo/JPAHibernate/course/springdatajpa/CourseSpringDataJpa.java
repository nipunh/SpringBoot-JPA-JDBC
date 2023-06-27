package com.nipunhedaoo.JPAHibernate.course.springdatajpa;

import com.nipunhedaoo.JPAHibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpa extends JpaRepository<Course, Integer> {
    List<Course> findByAuthor(String author);
}
