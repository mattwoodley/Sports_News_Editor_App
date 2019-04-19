package com.codeclan.example.SportsNews.repositories.Categories;

import com.codeclan.example.SportsNews.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
