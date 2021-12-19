package pl.hamsterinside.hamsterproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class WebController {
        @RequestMapping(value = "/index")
        public String index() {
            return "index";
        }

        @RequestMapping(value = "/hamtaro")
        public String hamtaro(){
        String message = "wow";
            return "hamtaro";
        }
    }

