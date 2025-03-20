package com.vti.service;

import com.vti.entity.Article;
import com.vti.repository.IArticalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticalService implements IArticleService{
    @Autowired
    private IArticalRepository articalRepository;

    @Override
    public List<Article> getAllArticles() {
        return articalRepository.findAll();
    }
}
