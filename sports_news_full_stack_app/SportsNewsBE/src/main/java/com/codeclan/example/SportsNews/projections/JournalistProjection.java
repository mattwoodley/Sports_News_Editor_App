package com.codeclan.example.SportsNews.projections;

import com.codeclan.example.SportsNews.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "embedArticle", types= Journalist.class)
public interface JournalistProjection {
    String getFirstName();
    String getSurname();
    String getImage();
}
