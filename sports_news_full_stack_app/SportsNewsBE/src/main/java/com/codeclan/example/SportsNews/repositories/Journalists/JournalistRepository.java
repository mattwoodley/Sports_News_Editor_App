package com.codeclan.example.SportsNews.repositories.Journalists;


import com.codeclan.example.SportsNews.models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistRepository extends JpaRepository<Journalist, Long> {
}
