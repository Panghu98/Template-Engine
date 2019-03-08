package com.example.demo.controller;

import com.example.demo.domain.ServerSettings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author panghu
 * @Title: FreeNarkController
 * @ProjectName FreeMark
 * @Description: TODO
 * @date 19-3-7 下午2:50
 */
@Controller
@Slf4j
@RequestMapping(value = "/freemarker")
public class FreeMarkController {

    @Autowired
    private ServerSettings serverSettings;

    /**
     * @param mv
     * @return
     * @Title: toDemo
     * @Description: 跳转freemarker页面
     */
    @RequestMapping(value = "/toDemo")
    public ModelAndView toDemo(ModelAndView mv) {
        log.info("====>>跳转freemarker页面");
        mv.addObject("name", "jack");
        mv.setViewName("freemarker");
        return mv;
    }

    @GetMapping(value = "/hello")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("settings", serverSettings);
        return "freemark/index";
    }

}