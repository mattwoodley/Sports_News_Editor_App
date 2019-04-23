package com.codeclan.example.SportsNews.repositories.Categories;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.projections.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Long>, CategoryRepositoryCustom {

    public List<Article> findArticlesByCategory(Long categoryId);


}
