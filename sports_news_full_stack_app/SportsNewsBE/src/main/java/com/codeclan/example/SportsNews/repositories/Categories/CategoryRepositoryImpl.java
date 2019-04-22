package com.codeclan.example.SportsNews.repositories.Categories;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepositoryCustom{
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Article> findArticlesByCategory(Long categoryId) {
        List<Article> result = null;
        org.hibernate.Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Article.class);

//            cr.createAlias("category", "category");
            cr.add(Restrictions.eq("category.id", categoryId));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
