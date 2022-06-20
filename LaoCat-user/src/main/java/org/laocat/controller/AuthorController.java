package org.laocat.controller;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import org.laocat.auth.JwtUtil;
import org.laocat.core.response.structure.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LaoCat
 * @date 2022/6/16
 * @description TODO
 */
@RestController
@AllArgsConstructor
public class AuthorController {

    private final JwtUtil jwtUtil;

    @GetMapping("author")
    public ResponseEntity<Object> author(@RequestParam String token) {
        return ResponseEntity.success(JSON.toJSON(jwtUtil.getClaimByToken(token)));
    }
}