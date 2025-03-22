package com.project.demo.controller;

import com.project.demo.entity.StudentCourseSelection;
import com.project.demo.service.StudentCourseSelectionService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

/**
 * 学生选课：(StudentCourseSelection)表控制层
 *
 */
@RestController
@RequestMapping("/student_course_selection")
public class StudentCourseSelectionController extends BaseController<StudentCourseSelection, StudentCourseSelectionService> {

    /**
     * 学生选课对象
     */
    @Autowired
    public StudentCourseSelectionController(StudentCourseSelectionService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
