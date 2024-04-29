package com.iuh.registerservice.controller;


import com.iuh.registerservice.dto.RegisterRqRp;
import com.iuh.registerservice.service.RegisterService;
import jakarta.ws.rs.POST;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    public RegisterService registerService;

    @PostMapping("/add")
    public ResponseEntity<RegisterRqRp> addNewRegister(@RequestBody RegisterRqRp registerRqRp){
        return new ResponseEntity<>(registerService.addNewRegister(registerRqRp), HttpStatus.OK);
    }
    @PostMapping("/delete")
    public ResponseEntity<RegisterRqRp> removeRegister(@RequestBody RegisterRqRp registerRqRp){
        return new ResponseEntity<>(registerService.removeRegister(registerRqRp), HttpStatus.OK);
    }
    @GetMapping("/getByUserName/{username}")
    public ResponseEntity<List<RegisterRqRp>> getCourseByUserName(@PathVariable String username){
        return new ResponseEntity<>(registerService.getListRegisterByUserName(username), HttpStatus.OK);
    }
    @PostMapping("/getRegister/{hocky}")
    public ResponseEntity<List<RegisterRqRp>> getCourseByUserNameAndHocKy(@RequestBody RegisterRqRp registerRqRp,@PathVariable int hocky){
        System.out.println(registerRqRp);
        System.out.println(hocky);
        return new ResponseEntity<>(registerService.getListRegisterByUserNameAndHocKyDangKy(registerRqRp.getUserName(),hocky), HttpStatus.OK);
    }
}
