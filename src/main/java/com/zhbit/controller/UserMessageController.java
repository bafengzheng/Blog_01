package com.zhbit.controller;


import com.zhbit.entity.UserMessage;
import com.zhbit.service.interfaces.UserMessageService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

@RequestMapping("/userMessage")
@CrossOrigin(origins="*")
public class UserMessageController {
    @Autowired
    private UserMessageService userMessageService;

    @RequestMapping(value = "/get",method = RequestMethod.POST)
    @ResponseBody
    public UserMessage getUserMessageByUserName(@RequestBody String user_name){
        JSONObject tmp= JSONObject.fromObject(user_name);
        UserMessage userMessage = userMessageService.getUserMessageByUserName(tmp.getString("user_name"));
        return userMessage;
    }



}
