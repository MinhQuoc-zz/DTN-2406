package com.vti.controller;

import com.vti.entity.Article;
import com.vti.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/articales")
public class ArticalController {
    @Autowired
    private IArticleService articleService;

    @GetMapping
    public List<Article> getAllArticales(){
        return articleService.getAllArticles();
    }
}
