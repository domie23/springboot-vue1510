package com.project.demo.controller;

import com.project.demo.entity.PerformanceAnalysis;
import com.project.demo.service.PerformanceAnalysisService;
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
 * 成绩分析：(PerformanceAnalysis)表控制层
 *
 */
@RestController
@RequestMapping("/performance_analysis")
public class PerformanceAnalysisController extends BaseController<PerformanceAnalysis, PerformanceAnalysisService> {

    /**
     * 成绩分析对象
     */
    @Autowired
    public PerformanceAnalysisController(PerformanceAnalysisService service) {
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
