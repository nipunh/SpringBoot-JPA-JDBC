package com.nipunhedaoo.JPAHibernate.course;

import com.nipunhedaoo.JPAHibernate.course.Course;
import com.nipunhedaoo.JPAHibernate.course.jdbc.CourseJdbcRepository;
import com.nipunhedaoo.JPAHibernate.course.jpa.CourseJpaRepository;
import com.nipunhedaoo.JPAHibernate.course.springdatajpa.CourseSpringDataJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository jpaRepository;

    @Autowired
    private CourseSpringDataJpa courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now!", "nipunhedaoo"));
        repository.insert(new Course(2, "Learn Azure Now!", "nipunhedaoo"));
        repository.insert(new Course(3, "Learn Node Now!", "nipunhedaoo"));
        repository.delete(3);
        System.out.println(repository.select(2));
        jpaRepository.insert(new Course(4, "Learn JS Now!", "nipunhedaoo"));
        System.out.println(jpaRepository.findById(1));

        System.out.println( "Total number of entries :" + courseSpringDataJpaRepository.count());
        System.out.println( courseSpringDataJpaRepository.findByAuthor("nipunhedaoo"));

    }
}
