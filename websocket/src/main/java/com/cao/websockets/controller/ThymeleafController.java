package com.cao.websockets.controller;

import com.cao.websockets.entity.Blogger;
import com.cao.websockets.service.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/abc")
public class ThymeleafController {

    //页面请求
    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid) {
        ModelAndView mav=new ModelAndView("/socket");
        mav.addObject("cid", cid);
        return mav;
    }
    // 跳转websocket页面
    @GetMapping("/index")
    public String websocket() {
        return "index";
    }

}
