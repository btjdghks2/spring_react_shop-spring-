package com.example.Spring_react_shop.ReController;

import com.example.Spring_react_shop.REntity.RSEntity;
import com.example.Spring_react_shop.RService.Rservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class JController {

    private final Rservice rservice;

    @GetMapping("/admin")
    public String Dashboard() {
        return "";
    }

    @PostMapping("/admin/productcreate")
    public ResponseEntity<?> save(@RequestBody RSEntity rsEntity) throws IllegalAccessException {
        return new ResponseEntity<>(rservice.save(rsEntity), HttpStatus.OK);
    }

    @GetMapping("/admin/productall")
    public ResponseEntity<?> findall() {
        return new ResponseEntity<>(rservice.productall(),HttpStatus.OK);
    }

    @GetMapping("/admin/productdetail/{id}")
    public ResponseEntity<?> probyId(@PathVariable Long id) {
        return new ResponseEntity<>(rservice.probyid(id), HttpStatus.OK);
    }

    @PutMapping("/admin/productdetail/{id}/update/")
    public ResponseEntity<?> ductupdate(@PathVariable Long id,@RequestBody RSEntity rsEntity) {
        return new ResponseEntity<>(rservice.productupdate(id,rsEntity),HttpStatus.OK);
    }

    @DeleteMapping("/admin/productdetail/{id}/delete")
    public ResponseEntity<?> ductdelete(@PathVariable Long id){
        return new ResponseEntity<>(rservice.productdelete(id),HttpStatus.OK);
    }



}
