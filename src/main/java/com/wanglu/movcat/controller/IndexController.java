package com.wanglu.movcat.controller;

import com.wanglu.movcat.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private VarietyService varietyService;

    /**
     * 首页
     * @return
     */
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("varietyList", varietyService.getVariety());
        return "/index";
    }
}
