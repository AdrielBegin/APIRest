
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adriel.pereira
 */
@RestController
public class CarroController {
    
  @RequestMapping(value="/carros", method = RequestMethod.GET)  
    public String HelloWord(){
        return "Hello Word";
    }
}
