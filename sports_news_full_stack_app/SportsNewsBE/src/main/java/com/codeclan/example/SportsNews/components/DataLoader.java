package com.codeclan.example.SportsNews.components;

import com.codeclan.example.SportsNews.models.Article;
import com.codeclan.example.SportsNews.models.Category;
import com.codeclan.example.SportsNews.models.Journalist;
import com.codeclan.example.SportsNews.repositories.Articles.ArticleRepository;
import com.codeclan.example.SportsNews.repositories.Categories.CategoryRepository;
import com.codeclan.example.SportsNews.repositories.Journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    ArticleRepository articleRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        DateFormat sfd = new SimpleDateFormat("dd-MM-yy");
        String newDate= "11-02-2019";
        Date date = null;
        try {
            date = sfd.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat sfd1 = new SimpleDateFormat("dd-MM-yy");
        String newDate1 = "12-02-2019";
        Date date1 = null;
        try {
            date1 = sfd.parse(newDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat sfd2 = new SimpleDateFormat("dd-MM-yy");
        String newDate2 = "13-02-2019";
        Date date2 = null;
        try {
            date1 = sfd.parse(newDate2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DateFormat sfd3 = new SimpleDateFormat("dd-MM-yy");
        String newDate3 = "14-02-2019";
        Date date3 = null;
        try {
            date3 = sfd.parse(newDate3);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat sfd4 = new SimpleDateFormat("dd-MM-yy");
        String newDate4 = "15-02-2019";
        Date date4 = null;
        try {
            date4 = sfd.parse(newDate4);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Category football = new Category("Football");
        categoryRepository.save(football);

        Category basketball = new Category("Basketball");
        categoryRepository.save(basketball);

        Category formula1 = new Category("Formula 1");
        categoryRepository.save(formula1);

        Category rugby = new Category("Rugby");
        categoryRepository.save(rugby);

        Category tennis = new Category("Tennis");
        categoryRepository.save(tennis);

        Category golf = new Category("Golf");
        categoryRepository.save(golf);


        Journalist journalistFootball1 = new Journalist("John", "Burn", "url");
        journalistRepository.save(journalistFootball1);

        Journalist journalistFootball2 = new Journalist("Joe", "Bradshaw", "url");
        journalistRepository.save(journalistFootball2);

        Journalist journalistFootball3 = new Journalist("Gordon", "Doe", "url");
        journalistRepository.save(journalistFootball3);

        Journalist journalistBasketball1 = new Journalist("Laura", "Savvas", "url");
        journalistRepository.save(journalistBasketball1);

        Journalist journalistBasketball2 = new Journalist("Andrew", "Alloia", "url");
        journalistRepository.save(journalistBasketball2);

        Journalist journalist1Formula1 = new Journalist("Ted", "Kravitz", "url");
        journalistRepository.save(journalist1Formula1);

        Journalist journalist2Formula1 = new Journalist("Suzi", "Perry","url");
        journalistRepository.save(journalist2Formula1);

        Journalist journalistRugby = new Journalist("Brian", "Moore", "url");
        journalistRepository.save(journalistRugby);

        Journalist journalistTennis = new Journalist("Katrina", "Adams", "url");
        journalistRepository.save(journalistTennis);

        Journalist journalistGolf = new Journalist("Kelly", "Tilgman", "url");
        journalistRepository.save(journalistGolf);


        Article articleFootball1 = new Article(
                "Benitez pleased with important Magpies win",
                "Newcastle manager Rafael Benitez said he 'wants to compete' after watching his team beat Southampton at St James's Park.",
                "Ayoze Perez made the difference, scoring all three goals as they saw off a spirited second-half performance from the Saints.\n" +
                        "\n" +
                        "Benitez, who is out of contract in the summer, said nothing had changed in regard to his job situation and suggested he still needs assurances before deciding his future.\n" +
                        "\n" +
                        "\"We are in the same position as we were before,\" he said. \"When I came here, I could see the potential of the club to be challenging, certainly for seventh to 10th in the table but looking higher.\n" +
                        "\n" +
                        "\"But when you analyse the transfer fees and wage bills of other teams, we're not competing.\n" +
                        "\n" +
                        "\"I am the manager until 30 June. We can see the potential. When you see the teams between seventh and 15th, we have to compete with them.\"\n" +
                        "\n" +
                        "Benitez suggested earlier in the week that he wanted to manage in the Champions League again, which will leave Newcastle fans nervous that he will not renew his contract when it expires.\n" +
                        "\n" +
                        "For now though, this win propelled Newcastle into 12th place in the Premier League table, 10 points above the relegation zone and almost certainly safe for another season.\n" +
                        "\n" +
                        "\"Mathematically, we will have to wait and see what happens,\" Benitez said. \"But I think we will be safe.\"\n" +
                        "\n" +
                        "For Southampton, an improved second-half performance yielded only substitute Mario Lemina's goal and they sit just five points above Cardiff in 18th with four games to play.",
                date, "url", 7, football, journalistFootball3);
        articleRepository.save(articleFootball1);

        Article articleFootball2 = new Article("Football", "About football", "The winner", date1, "url", 5, football, journalistFootball1);
        articleRepository.save(articleFootball2);

        Article articleBaseball1 = new Article("Baseball", "About baseball", "Great team of great people", date4, "url", 2, basketball, journalistFootball1);
        articleRepository.save(articleBaseball1);

        Article articleBaseball2 = new Article("Baseball", "Yello baseball", "Doing great stuff", date3, "url5", 0, basketball, journalistFootball3);
        articleRepository.save(articleBaseball2);

        football.addArticle(articleFootball1);
        football.addArticle(articleFootball2);
        categoryRepository.save(football);

        journalistFootball1.addArticle(articleFootball2);
        journalistFootball1.addArticle(articleBaseball1);
        journalistRepository.save(journalistFootball1);
        journalistFootball3.addArticle(articleFootball1);
        journalistRepository.save(journalistFootball3);


    }
}
