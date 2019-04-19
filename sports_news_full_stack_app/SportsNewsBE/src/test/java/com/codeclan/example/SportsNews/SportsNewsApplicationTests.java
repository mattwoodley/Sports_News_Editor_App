package com.codeclan.example.SportsNews;

import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.models.Journalist;
import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SportsNewsApplicationTests {

	@Autowired
	CategoryRepository categoryRepository;

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
}
