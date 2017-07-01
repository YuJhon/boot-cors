package com.jhon.rain.controller;

import org.springframework.web.bind.annotation.*;

/**
 * <p>功能描述</br> TODO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CorsOriginController
 * @date 2017/7/1 19:44
 */
@RestController
@RequestMapping("/cors")
public class CorsOriginController {

    //@CrossOrigin(origins = "http://127.0.0.1:8082")
    @GetMapping("/hello")
    public String crosMethodData(){
        return "You Are Success Accessed!";
    }
}
