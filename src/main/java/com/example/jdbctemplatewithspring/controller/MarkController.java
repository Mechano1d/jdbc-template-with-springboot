package com.example.jdbctemplatewithspring.controller;

import com.example.jdbctemplatewithspring.service.MarkService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marks")
@Tag(name = "Marks")
public class MarkController {
    @Autowired
    private MarkService markService;

}
