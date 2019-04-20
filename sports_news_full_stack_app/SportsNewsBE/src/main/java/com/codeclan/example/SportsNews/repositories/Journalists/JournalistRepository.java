package com.codeclan.example.SportsNews.repositories.Journalists;


import com.codeclan.example.SportsNews.controllers.JournalistController;
import com.codeclan.example.SportsNews.models.Journalist;
import com.codeclan.example.SportsNews.projections.JournalistProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = JournalistProjection.class)
public interface JournalistRepository extends JpaRepository<Journalist, Long>, JournalistRepositoryCustom{
}
