package com.example.demo.controller;

import com.example.demo.domain.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author panghu
 * @Title: ThymeleafController
 * @ProjectName Template-Engine
 * @Description: TODO
 * @date 19-3-7 下午9:49
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("hello")
    public String index() {

        return "index";
    }

    @GetMapping("/info")
    public String admin(ModelMap modelMap) {
        modelMap.addAttribute("settings", serverSettings);
        return "admin/info";
    }
}
