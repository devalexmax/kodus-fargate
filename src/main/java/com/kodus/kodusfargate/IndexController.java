package com.kodus.kodusfargate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

        @GetMapping()
        public ResponseEntity<Response> index() {

            Response response = new Response();

            response.setMessage("Hy microservice!");
            response.setStatus("Ok");

            return ResponseEntity.ok(response);
        }
}
