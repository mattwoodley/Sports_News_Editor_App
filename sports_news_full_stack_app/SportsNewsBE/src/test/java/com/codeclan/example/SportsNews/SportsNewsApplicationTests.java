package com.codeclan.example.SportsNews;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.models.Journalist;
import com.codeclan.example.SportsNews.repositories.Articles.ArticleRepository;
import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import com.codeclan.example.SportsNews.repositories.Journalists.JournalistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SportsNewsApplicationTests {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	JournalistRepository journalistRepository;

	@Autowired
	ArticleRepository articleRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getName() {
		Category football = new Category("Football");
		assertEquals("Football", football.getName());
	}

	@Test
	public void getJournalistFirstName() {
		Journalist journalist1 = new Journalist("John", "Burn", "url");
		assertEquals("John", journalist1.getFirstName());
	}

	@Test
	public void getJournalistSurname() {
		Journalist journalist1 = new Journalist("John", "Burn", "url");
		assertEquals("Burn", journalist1.getSurname());
	}

	@Test
	public void getJournalistImage() {
		Journalist journalist1 = new Journalist("John", "Burn", "url");
		assertEquals("url", journalist1.getImage());
	}

	@Test
	public void articleHasDate() {
		Category football = new Category("Football");
		Journalist journalist1 = new Journalist("John", "Burn", "url");
		Article footballArticle = new Article("football" , "Summary", "Full Story", "2019-04-04", "url", 5,football, journalist1 );
		assertEquals("2019-04-04", footballArticle.getDateCreated());
	}

	@Test
	public void canAddArticleToCategory() {

		Category football = new Category("Football");
		Journalist journalist1 = new Journalist("John", "Burn", "url");
		Article footballArticle = new Article("football", "Summary", "Full Story", "2019-04-04", "url", 5,football, journalist1 );
		football.addArticle(footballArticle);
		assertEquals(1, football.getArticles().size());
	}
//
//	@Test
//	public void canAddArticleToCategoryAndJournalistRepoThenSave() {
//
//		Category football = new Category("Football");
//		categoryRepository.save(football);
//
//		Category baseball = new Category("Baseball");
//		categoryRepository.save(baseball);
//
//		Journalist journalist1 = new Journalist("John", "Burn", "url");
//		journalistRepository.save(journalist1);
//
//		Journalist journalist2 = new Journalist("Gordon", "Doe", "url");
//		journalistRepository.save(journalist2);
//
//		Article articleFootball1 = new Article("Football", "About football", "Long story about football", "2019-04-04", "url", 7, football, journalist2);
//		articleRepository.save(articleFootball1);
//
//		Article articleFootball2 = new Article("Football", "About football", "The winner", "2019-04-04", "url", 5, football, journalist1);
//		articleRepository.save(articleFootball2);
//
//		Article articleBaseball1 = new Article("Baseball", "About baseball", "Great team of great people", "2019-04-04", "url", 2, baseball, journalist1);
//		articleRepository.save(articleBaseball1);
//
//		football.addArticle(articleFootball1);
//		football.addArticle(articleFootball2);
//		categoryRepository.save(football);
//
//		journalist1.addArticle(articleFootball2);
//		journalist1.addArticle(articleBaseball1);
//		journalistRepository.save(journalist1);
//		journalist2.addArticle(articleFootball1);
//		journalistRepository.save(journalist2);
//	}

	@Test
	public void canFindArticlesByCategoryId(){
     	List<Article> found = categoryRepository.findArticlesByCategory(1L);
     	assertEquals(3, found.size());
	}


	@Test
	public void canFindByDateAscending() {
		List<Article> articles = articleRepository.findAll(Sort.by(Sort.Direction.DESC, "dateCreated"));
		assertEquals("2019-04-01",articles.get(7).getDateCreated());
	}
}
