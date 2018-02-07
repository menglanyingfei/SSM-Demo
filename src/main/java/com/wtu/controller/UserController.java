package com.wtu.controller;

import com.wtu.model.User;
import com.wtu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * User类的控制器, 视图显示
 *
 * menglanyingfei
 * on 2017.11.02 17:34
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        // 应该这样输入/user/showUser?id=1
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "/showUser";

//        return "forward:/jsp/showUser.jsp";
    }

    @RequestMapping("/showUser1")
    public ModelAndView home(HttpServletRequest request, Model model) {
        // 应该这样输入/user/showUser1?id=1
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);

        ModelAndView mav = new ModelAndView();

        mav.setViewName("/showUser");

        return mav;
    }
}
