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
    public List<Article> getArticlesByCategory(Long id) {
        List<Article> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Category.class);
            cr.createAlias("categories", "category");
            cr.add(Restrictions.eq("category.articles.category.id", id));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }
}
