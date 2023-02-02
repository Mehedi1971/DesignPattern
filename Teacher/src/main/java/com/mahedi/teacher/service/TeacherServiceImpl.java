package com.mahedi.teacher.service;

import com.mahedi.teacher.entity.Teacher;
import com.mahedi.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeacher() {
        System.out.println(teacherRepository.findAll());
        return teacherRepository.findAll();
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        System.out.println("gfhg"+teacherRepository.save(teacher));
        this.teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(long id) {
        Optional<Teacher> optional=teacherRepository.findById(id);
        Teacher teacher=optional.get();
        return teacher;
    }

    @Override
    public void deletebyId(long id) {
        this.teacherRepository.deleteById(id);
    }
}
