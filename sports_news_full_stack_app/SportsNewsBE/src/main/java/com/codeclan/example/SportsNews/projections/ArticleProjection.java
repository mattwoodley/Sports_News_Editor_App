package com.codeclan.example.SportsNews.projections;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "embedJournalist", types = Article.class)
public interface ArticleProjection {
 String getHeadline();
 String getSummary();
 String getFullStory();
 Date getDateCreated();
 String getImage();
 int getReadCount();
 Category getCategory();
 Journalist getJournalist();



}
