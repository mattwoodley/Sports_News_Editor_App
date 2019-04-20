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

        Article articleFootball2 = new Article(
                "Manchester City 1-0 Tottenham: 'Gripping and nervy in a different way'",
                "Manchester City and Tottenham delivered an all-time classic in the Champions League on Wednesday night. It gave this Premier League sequel an impossible act to follow.",
                "Yet, even though it was settled by teenager Phil Foden's early header as opposed to the goal-laden European encounter, this was gripping, nervy and engrossing in its own way within the context of the title and top four.\n" +
                        "\n" +
                        "It was a game that cranked up almost unbearable levels of tension in the last 15 minutes as City protected a victory that could prove the difference between winning and losing the title they secured with a historic 100 points last season.\n" +
                        "\n" +
                        "Liverpool's brilliant stride-for-stride campaign alongside City means margins for error have been eradicated from this title race. One slip, not necessarily even a defeat, may prove fatal for either team.\n" +
                        "\n" +
                        "As the physical and mental exertions - maybe even the wounds - of the crushing midweek exit to Spurs that ended City's hopes of an unprecedented quadruple kicked in, Pep Guardiola's side mined every reserve they have to keep their destiny in their own hands.City were not at their best but this demonstrated that they possess more than what simply meets the eye. They have heart and resilience to set alongside the obvious quality.\n" +
                        "\n" +
                        "This was the steely side of Manchester City, the day finesse was set on one side in search of the big domestic prize.\n" +
                        "\n" +
                        "It is a fair bet that those conducting the Etihad Stadium clean-up as supporters dispersed into the sunshine will have collected their fair share of chewed fingernails - it was that sort of game with that sort of conclusion.\n" +
                        "\n" +
                        "While City's fans turned their ire - tinged with mild panic - on referee Michael Oliver, they may also have reason to be thankful he ignored very presentable penalty claims as Kyle Walker looked to have handled under pressure from Dele Alli in the second half.\n" +
                        "\n" +
                        "Guardiola was lavish in his praise of City's players afterwards. He knew the hazards this fixture presented on a variety of levels and to come through with a vital victory renews momentum with only four league games left.\n" +
                        "\n" +
                        "In soaring temperatures, City's players needed to shrug off the fatigue in mind and body, the crushing disappointment of such a painful loss, and focus on a game they simply had to win - and do it instantly against a high-quality side who were also playing for high stakes amid the jeopardy of a fight for a place in the top four.\n" +
                        "\n" +
                        "Guardiola showed faith in 18-year-old Foden and was rewarded with that early header, greeted with a thunderous roar by supporters who knew their team needed them.\n" +
                        "\n" +
                        "Lots has been said, unfairly, about the loyalty of City's fans after the empty seats at the FA Cup semi-final against Brighton (financial restraints and the manner in which they followed their team in droves down the divisions seem to be ignored in the argument against them), but the atmosphere at the Etihad has been superb in the past two games.\n" +
                        "\n" +
                        "They helped City get over the line and push them towards a potentially pivotal Manchester derby at Old Trafford knowing victory there could take them a long way towards a second successive title.The key contributors on the pitch against Spurs were the precocious Foden, goalkeeper Ederson and the perpetual motion that is Bernardo Silva.\n" +
                        "\n" +
                        "Foden's introduction was seamless. He played with the fearlessness and joy of youth allied to the winner's streak that will surely make him a future star for City and England.\n" +
                        "\n" +
                        "Ederson, an outstanding goalkeeper, often drifts under the radar as City's gems elsewhere take the attention, but this was a match-winning performance as he saved from Son Heung-min, Christian Eriksen and Lucas Moura when Spurs applied pressure.\n" +
                        "\n" +
                        "As for Silva, if any City player could be excused for betraying a hint of lethargy after the efforts of Wednesday it was the Portuguese.\n" +
                        "\n" +
                        "He was non-stop for 96 minutes in defeat and similar in victory. When you add his superb ability on the ball and his constant improvement, he is the full modern football package.\n" +
                        "\n" +
                        "Even Aymeric Laporte, at fault for goals on Wednesday, redeemed himself with a perfectly timed challenge on the rampaging Son when he looked certain to score.\n" +
                        "\n" +
                        "The roar from City fans that greeted referee Oliver's final whistle was a reflection of the importance of this win and its symbolism.\n" +
                        "\n" +
                        "It would have been easy for City to go under after the suffering of Wednesday, although it should be stressed Spurs drove through similar barriers themselves, the difference being they emerged victorious.\n" +
                        "\n" +
                        "The scenery now moves to Cardiff, where Liverpool travel on Sunday, then on to Old Trafford on Wednesday, with City still in control as they know victory in all their games will bring them the title.\n" +
                        "\n" +
                        "This season has been two superpowers slugging it out. The decisive is yet to be landed, but in this game City showed guts in their search for glory to end a week shot through with pain with the pleasure of victory.",
                date1, "url", 5, football, journalistFootball1);
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
