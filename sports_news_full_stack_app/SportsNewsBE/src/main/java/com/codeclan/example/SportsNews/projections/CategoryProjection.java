package com.codeclan.example.SportsNews.projections;

import com.codeclan.example.SportsNews.models.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedArticle", types = Category.class)
public interface CategoryProjection {
    Long getId();
    String getName();

}
