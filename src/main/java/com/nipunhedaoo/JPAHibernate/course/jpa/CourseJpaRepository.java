package com.nipunhedaoo.JPAHibernate.course.jpa;

import com.nipunhedaoo.JPAHibernate.course.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
//    @Autowired
   @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(int id){
        return entityManager.find(Course.class, id);
    }

    public void deleteById(int id){
        Course course =  entityManager.find(Course.class, id);
        entityManager.remove(course);
    }


}
