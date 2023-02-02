package com.mahedi.teacher.service;

import com.mahedi.teacher.entity.Teacher;


import java.util.List;


public interface TeacherService {

    List<Teacher>getAllTeacher();
    void saveTeacher(Teacher teacher);

    Teacher getTeacherById(long id);
    void deletebyId(long id);
}
