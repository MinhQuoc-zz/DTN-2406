package com.vti.repository;

import com.vti.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticalRepository extends JpaRepository<Article, Integer>{

}
