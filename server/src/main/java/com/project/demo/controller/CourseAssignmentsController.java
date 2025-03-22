package com.project.demo.controller;

import com.project.demo.entity.CourseAssignments;
import com.project.demo.service.CourseAssignmentsService;
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
 * 课程作业：(CourseAssignments)表控制层
 *
 */
@RestController
@RequestMapping("/course_assignments")
public class CourseAssignmentsController extends BaseController<CourseAssignments, CourseAssignmentsService> {

    /**
     * 课程作业对象
     */
    @Autowired
    public CourseAssignmentsController(CourseAssignmentsService service) {
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
