package com.nipunhedaoo.JPAHibernate.course.springdatajpa;

import com.nipunhedaoo.JPAHibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpa extends JpaRepository<Course, Integer> {

}
