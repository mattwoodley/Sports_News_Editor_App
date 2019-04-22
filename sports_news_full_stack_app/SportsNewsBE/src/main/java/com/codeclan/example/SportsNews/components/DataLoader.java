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


        Journalist journalistFootball1 = new Journalist("John", "Burn", "images/journalist1.jpg");
        journalistRepository.save(journalistFootball1);

        Journalist journalistFootball2 = new Journalist("Joe", "Bradshaw", "images/journalist2.jpg");
        journalistRepository.save(journalistFootball2);

        Journalist journalistFootball3 = new Journalist("Gordon", "Doe", "images/journalist3.jpg");
        journalistRepository.save(journalistFootball3);

        Journalist journalistBasketball1 = new Journalist("Laura", "Savvas", "images/journalist4.jpg");
        journalistRepository.save(journalistBasketball1);

        Journalist journalistBasketball2 = new Journalist("Andrew", "Alloia", "images/journalist5.jpg");
        journalistRepository.save(journalistBasketball2);

        Journalist journalist1Formula1 = new Journalist("Ted", "Kravitz", "images/journalist6.jpg");
        journalistRepository.save(journalist1Formula1);

        Journalist journalist2Formula1 = new Journalist("Suzi", "Perry","images/journalist7.jpg");
        journalistRepository.save(journalist2Formula1);

        Journalist journalistRugby = new Journalist("Brian", "Moore", "images/journalist8.jpg");
        journalistRepository.save(journalistRugby);

        Journalist journalistTennis = new Journalist("Katrina", "Adams", "images/journalist8.jpg");
        journalistRepository.save(journalistTennis);

        Journalist journalistGolf = new Journalist("Kelly", "Tilgman", "images/journalist9.jpg");
        journalistRepository.save(journalistGolf);


        Article articleFootball1 = new Article(
                "Benitez pleased with important Magpies win",
                "Newcastle manager Rafael Benitez said he 'wants to compete' after watching his team beat Southampton at St James's Park.",
                "Ayoze Perez made the difference, scoring all three goals as they saw off a spirited second-half performance from the Saints." +
                        "" +
                        "Benitez, who is out of contract in the summer, said nothing had changed in regard to his job situation and suggested he still needs assurances before deciding his future." +
                        "" +
                        "We are in the same position as we were before,he said. When I came here, I could see the potential of the club to be challenging, certainly for seventh to 10th in the table but looking higher." +
                        "" +
                        "But when you analyse the transfer fees and wage bills of other teams, we're not competing." +
                        "" +
                        "I am the manager until 30 June. We can see the potential. When you see the teams between seventh and 15th, we have to compete with them." +
                        "" +
                        "Benitez suggested earlier in the week that he wanted to manage in the Champions League again, which will leave Newcastle fans nervous that he will not renew his contract when it expires." +
                        "" +
                        "For now though, this win propelled Newcastle into 12th place in the Premier League table, 10 points above the relegation zone and almost certainly safe for another season." +
                        "" +
                        "Mathematically, we will have to wait and see what happens,Benitez said. But I think we will be safe."+
                        "" +
                        "For Southampton, an improved second-half performance yielded only substitute Mario Lemina's goal and they sit just five points above Cardiff in 18th with four games to play.",
                "2019-04-01", "images/football1.jpg", 7, football, journalistFootball3);
        articleRepository.save(articleFootball1);

        Article articleFootball2 = new Article(
                "Manchester City 1-0 Tottenham: 'Gripping and nervy in a different way'",
                "Manchester City and Tottenham delivered an all-time classic in the Champions League on Wednesday night. It gave this Premier League sequel an impossible act to follow.",
                "Yet, even though it was settled by teenager Phil Foden's early header as opposed to the goal-laden European encounter, this was gripping, nervy and engrossing in its own way within the context of the title and top four." +
                        "" +
                        "It was a game that cranked up almost unbearable levels of tension in the last 15 minutes as City protected a victory that could prove the difference between winning and losing the title they secured with a historic 100 points last season." +
                        "" +
                        "Liverpool's brilliant stride-for-stride campaign alongside City means margins for error have been eradicated from this title race. One slip, not necessarily even a defeat, may prove fatal for either team." +
                        "" +
                        "As the physical and mental exertions - maybe even the wounds - of the crushing midweek exit to Spurs that ended City's hopes of an unprecedented quadruple kicked in, Pep Guardiola's side mined every reserve they have to keep their destiny in their own hands.City were not at their best but this demonstrated that they possess more than what simply meets the eye. They have heart and resilience to set alongside the obvious quality." +
                        "" +
                        "This was the steely side of Manchester City, the day finesse was set on one side in search of the big domestic prize." +
                        "" +
                        "It is a fair bet that those conducting the Etihad Stadium clean-up as supporters dispersed into the sunshine will have collected their fair share of chewed fingernails - it was that sort of game with that sort of conclusion." +
                        "" +
                        "While City's fans turned their ire - tinged with mild panic - on referee Michael Oliver, they may also have reason to be thankful he ignored very presentable penalty claims as Kyle Walker looked to have handled under pressure from Dele Alli in the second half." +
                        "" +
                        "Guardiola was lavish in his praise of City's players afterwards. He knew the hazards this fixture presented on a variety of levels and to come through with a vital victory renews momentum with only four league games left." +
                        "" +
                        "In soaring temperatures, City's players needed to shrug off the fatigue in mind and body, the crushing disappointment of such a painful loss, and focus on a game they simply had to win - and do it instantly against a high-quality side who were also playing for high stakes amid the jeopardy of a fight for a place in the top four." +
                        "" +
                        "Guardiola showed faith in 18-year-old Foden and was rewarded with that early header, greeted with a thunderous roar by supporters who knew their team needed them." +
                        "" +
                        "Lots has been said, unfairly, about the loyalty of City's fans after the empty seats at the FA Cup semi-final against Brighton (financial restraints and the manner in which they followed their team in droves down the divisions seem to be ignored in the argument against them), but the atmosphere at the Etihad has been superb in the past two games." +
                        "" +
                        "They helped City get over the line and push them towards a potentially pivotal Manchester derby at Old Trafford knowing victory there could take them a long way towards a second successive title.The key contributors on the pitch against Spurs were the precocious Foden, goalkeeper Ederson and the perpetual motion that is Bernardo Silva." +
                        "" +
                        "Foden's introduction was seamless. He played with the fearlessness and joy of youth allied to the winner's streak that will surely make him a future star for City and England." +
                        "" +
                        "Ederson, an outstanding goalkeeper, often drifts under the radar as City's gems elsewhere take the attention, but this was a match-winning performance as he saved from Son Heung-min, Christian Eriksen and Lucas Moura when Spurs applied pressure." +
                        "" +
                        "As for Silva, if any City player could be excused for betraying a hint of lethargy after the efforts of Wednesday it was the Portuguese." +
                        "" +
                        "He was non-stop for 96 minutes in defeat and similar in victory. When you add his superb ability on the ball and his constant improvement, he is the full modern football package." +
                        "" +
                        "Even Aymeric Laporte, at fault for goals on Wednesday, redeemed himself with a perfectly timed challenge on the rampaging Son when he looked certain to score." +
                        "" +
                        "The roar from City fans that greeted referee Oliver's final whistle was a reflection of the importance of this win and its symbolism." +
                        "" +
                        "It would have been easy for City to go under after the suffering of Wednesday, although it should be stressed Spurs drove through similar barriers themselves, the difference being they emerged victorious." +
                        "" +
                        "The scenery now moves to Cardiff, where Liverpool travel on Sunday, then on to Old Trafford on Wednesday, with City still in control as they know victory in all their games will bring them the title." +
                        "" +
                        "This season has been two superpowers slugging it out. The decisive is yet to be landed, but in this game City showed guts in their search for glory to end a week shot through with pain with the pleasure of victory.",
                "2019-04-02", "images/football2.jpg", 5, football, journalistFootball1);
        articleRepository.save(articleFootball2);

        Article articleFootball3 = new Article(
                "Scott McKenna rose to head Aberdeen's goal",
                "Aberdeen leapfrogged Kilmarnock into third place in the Scottish Premiership thanks to Scott McKenna's goal as the hosts ended the game with eight men.",
                "Centre-half Kirk Broadfoot was sent off when his foot struck the face of goalkeeper Joe Lewis in front of goal during a bruising first half." +
                        "" +
                        "Scott McKenna headed in a Graeme Shinnie corner after 66 minutes." +
                        "" +
                        "Stuart Findlay was then shown a second yellow card with six minutes remaining and Rory McKenzie a straight red.McKenna's goal was enough to extend the run of league victories for Derek McInnes' side at Rugby Park to 10 games." +
                        "" +
                        "Steve Clarke's Kilmarnock, who started the day ahead of the Dons on goal difference after a run of six games unbeaten, remain a point short of equalling their record points tally set last season.The first half between sides whose managers have been touted for the Scotland head coach vacancy would be defined by controversy." +
                        "" +
                        "Michael Devlin fouled Eamonn Brophy near the halfway line in an incident reminiscent of the one between the sides at Pittodrie earlier this season when the Aberdeen defender was red carded for a foul on Greg Stewart." +
                        "" +
                        "This time, there were more Aberdeen defenders in close proximity and referee Steven McLean brandished a yellow." +
                        "" +
                        "That controversy would pale in comparison to the incident that resulted in Broadfoot being sent off." +
                        "" +
                        "The Kilmarnock defender was through on goal, but his control let him down and he lunged in on Lewis, his studs catching the goalkeeper in the face." +
                        "" +
                        "Referee McLean was in no doubt and showed a straight red, much to the frustration of Broadfoot, who left the field kicking a water bottle." +
                        "" +
                        "The home fans were furious. Minutes earlier, Sam Cosgrove - already on a yellow - put in a late challenge on Greg Taylor. The Dons striker escaped with just a talking to from the referee." +
                        "" +
                        "Cosgrove - who was getting involved in far too many incidents - was subbed off at half-time." +
                        "" +
                        "As for the football, the first half was largely a scrappy non-event littered with fouls, a header from McKenna going wide of a post being as close as Aberdeen had come, while Kilmarnock's Eamonn Brophy forced Lewis into a near-post save." +
                        "" +
                        "That McKenna header was a warning from Aberdeen and, as Graeme Shinnie swung in a corner, the Scotland centre-half headed home to give the Dons the lead." +
                        "" +
                        "The Kilmarnock fans kept up their support to the end, even when they saw their side reduced to nine men - Findlay shown a second yellow for a foul on Shinnie." +
                        "" +
                        "Substitute James Wilson's fierce shot was well saved by goalkeeper Daniel Bachmann before, incredibly, Kilmarnock would end the match with just eight men - McKenzie sent off for retaliating angrily after a challenge in midfield.This was a huge win for Aberdeen in the race for Europe." +
                        "" +
                        "Steve Clarke has done some amazing things with Kilmarnock since he arrived in Scottish football, but one team he has failed to conquer are Aberdeen - and so it continues." +
                        "" +
                        "A 10th league win in a row at Rugby Park is a remarkable stat. It also keeps up the incredible away form the Dons have shown this season." +
                        "" +
                        "More importantly, this puts Aberdeen clear in third place and firmly in the ascendancy in the race for a Europa League spot." +
                        "" +
                        "But so much of the attention will focus on the refereeing decisions. The Kilmarnock fans booed off McLean at the end." +
                        "" +
                        "Should he have sent off Cosgrove? Possibly. The sending off of Broadfoot was also debatable. Yes, he seemed to catch Lewis with his studs. But it was probably more reckless than excessive force so perhaps a yellow card would have sufficed." +
                        "" +
                        "The proximity of those decisions - they happened within minutes of each other - meant the home fans felt particularly hard done by.",
                "2019-04-03", "images/football3.jpg", 2, football, journalistFootball1);
        articleRepository.save(articleFootball3);

        Article articleTennis1 = new Article(
                "Fed Cup: How Scotland can thrive after World Group promotion",
                "Anne Keothavong was a playing member of Scotland's Fed Cup team when they made the trip to Sweden for the 2012 World Group play-off.",
                "Ayoze Perez made the difference, scoring all three goals as they saw off a spirited second-half performance from the Saints." +
                        "" +
                        "Benitez, who is out of contract in the summer, said nothing had changed in regard to his job situation and suggested he still needs assurances before deciding his future." +
                        "" +
                        "We are in the same position as we were before, he said. When I came here, I could see the potential of the club to be challenging, certainly for seventh to 10th in the table but looking higher." +
                        "" +
                        "But when you analyse the transfer fees and wage bills of other teams, we're not competing." +
                        "" +
                        "I am the manager until 30 June. We can see the potential. When you see the teams between seventh and 15th, we have to compete with them." +
                        "" +
                        "Benitez suggested earlier in the week that he wanted to manage in the Champions League again, which will leave Newcastle fans nervous that he will not renew his contract when it expires." +
                        "" +
                        "For now though, this win propelled Newcastle into 12th place in the Premier League table, 10 points above the relegation zone and almost certainly safe for another season." +
                        "" +
                        "Mathematically, we will have to wait and see what happens, Benitez said. But I think we will be safe." +
                        "" +
                        "For Southampton, an improved second-half performance yielded only substitute Mario Lemina's goal and they sit just five points above Cardiff in 18th with four games to play.",
                "2019-04-04", "images/fedcup_getty2.jpg", 1, tennis, journalistTennis);
        articleRepository.save(articleTennis1);


        Article articleRugby1 = new Article(
                "Israel Folau: Australia full-back's future to be decided at hearing on 4 May",
                "Israel Folau's future will be decided at a hearing on 4 May after the full-back was sacked by Rugby Australia.",
                "Israel Folau's future will be decided at a hearing on 4 May after the full-back was sacked by Rugby Australia following a social media post in which he said hell awaits gay people." +
                        "" +
                        "The 30-year-old requested a code of conduct hearing after his dismissal." +
                        "" +
                        "It will be heard behind closed doors in Sydney by a three-member panel." +
                        "" +
                        "Wallabies coach Michael Cheika has said Folau, who won 73 caps and was expected to play at this year's World Cup, was unlikely to be selected again." +
                        "" +
                        "Folau, who signed a four-year deal with Sydney-based Super Rugby side the Waratahs in March and had a contract with Rugby Australia until 2022, escaped punishment for similar comments last year." +
                        "" +
                        "Rugby Australia said he had committed a high-level breach of the Professional Players' Code of Conduct warranting termination of his employment contract." +
                        "" +
                        "The governing body has also set aside Sunday, 5 May if the hearing goes into a second day." +
                        "" +
                        "In addition to his rugby union career, Folau has also played professional rugby league and Australian rules football." +
                        "" +
                        "Last week, Australian rugby league's governing body ruled out Folau returning to the National Rugby League.",
                date5, "images/folau_reuters.jpg", 0, rugby, journalistRugby);
        articleRepository.save(articleRugby1);

        Article articleGolf1 = new Article(
                "RBC Heritage: CT Pan wins first PGA Tour title with one-shot win",
                "Chinese Taipei's CT Pan won his first PGA Tour title with a one-shot victory at the RBC Heritage in South Carolina.",
                "Chinese Taipei's CT Pan won his first PGA Tour title with a one-shot victory at the RBC Heritage in South Carolina." +
                        "" +
                        "The 27-year-old world number 113, two adrift overnight, had only one bogey in a four under 67 for a 12-under total." +
                        "" +
                        "Irishman Shane Lowry, who led after both the first two rounds, finished in a tie for third, two back, after a 70." +
                        "" +
                        "World number one Dustin Johnson was one ahead into the last day but ended eight off the pace after an errant 77, with Ian Poulter seven under after a 73." +
                        "" +
                        "The gusting winds of earlier in the event had reduced to a stiff breeze at Hilton Head on Sunday and in the early stages of Johnson's round, four other players had joined him at 10 under." +
                        "" +
                        "Lowry made three birdies in his first six holes to open a two-shot lead, but missed a short par putt at the ninth and then took four from the left of the 12th green for a double bogey to slip three behind." +
                        "" +
                        "American Matt Kuchar, winner in 2014, holed an eight-foot birdie putt at the last to set the target at 11 under but Pan, making his 79th start on the PGA Tour, calmly parred his final two holes to remain at 12 under." +
                        "" +
                        "It left Lowry, in the penultimate group, needing to hole his second shot from 180 yards at the 460-yard par four 18th to tie, but he finished with a par." +
                        "" +
                        "Pan is only the second player from Chinese Taipei to triumph on the PGA Tour, following TC Chen at the 1987 Genesis Open." +
                        "" +
                        "The final group petered out tamely, Johnson dropped seven shots in five holes on the back nine and finished in a tie for 28th, while Poulter shared 10th after making only two birdies.",
                date5, "images/ct_pan_getty.jpg", 0, golf, journalistGolf);
        articleRepository.save(articleGolf1);

        Article articleRugby2 = new Article(
                "Billy Vunipola: Fan confrontation 'scary', says Saracens forward",
                "Billy Vunipola says being confronted by a Munster fan after Saracens' Champions Cup semi-final win was quite scary",
                "He was warned by his club and the Rugby Football Union this week for defending Israel Folau's social media post in which he said hell awaits gay people." +
                        "" +
                        "People say I put my foot in it so I have to deal with it, Vunipola said." +
                        "" +
                        "The number eight told BBC Radio 5 Live: It's not something I'm afraid of. I probably have to expect that it's going to keep happening." +
                        "" +
                        "It was quite a motivating factor that people were booing me. I wanted to back up my words and show my team-mates that I did not mean to distract them." +
                        "" +
                        "The fan who confronted Vunipola was quickly led away by stewards." +
                        "" +
                        "European Professional Club Rugby, the tournament organisers, said: Following the regrettable incident at the Ricoh Arena, the spectator in question is currently being detained by the stadium authorities." +
                        "" +
                        "La Rochelle edge Sale in Challenge Cup semi-final" +
                        "Harlequins fall short against Clermont Auvergne" +
                        "Last week Vunipola was criticised for 'liking' an Instagram post from Australia winger Folau which warned gay people that hell awaited them unless they repented." +
                        "" +
                        "Folau later had his contract cancelled by Rugby Australia." +
                        "" +
                        "Vunipola defended his views, writing on Instagram: There just comes a point when you insult what I grew up believing in that you just say enough is enough. Man was made for woman to procreate, that was the goal no?" +
                        "" +
                        "Vunipola said after the game on Saturday: It was probably insensitive, but also something I strongly believe in." +
                        "" +
                        "I'll probably not be as honest as I have been about things that probably hurt a lot of people. I know that now." +
                        "" +
                        "I'm not going to change the happy-go-lucky person I am. My faith is what got me to this position. It's something I'll stick by." +
                        "" +
                        "It's been awesome having friends supporting me, whether they agree with me or not." +
                        "",
                date7, "images/billy_vunipola_getty.jpg", 1, rugby, journalistRugby);
        articleRepository.save(articleRugby2);

        Article articleBaseball2 = new Article("Baseball", "Yello baseball", "Doing great stuff", date3, "images/baseball1.jpg", 0, basketball, journalistFootball3);
        articleRepository.save(articleBaseball2);

        football.addArticle(articleFootball1);
        football.addArticle(articleFootball2);
        tennis.addArticle(articleTennis1);
        rugby.addArticle(articleRugby1);
        rugby.addArticle(articleRugby2);
        golf.addArticle(articleGolf1);

        categoryRepository.save(football);
        categoryRepository.save(tennis);
        categoryRepository.save(rugby);
        categoryRepository.save(golf);

        journalistFootball1.addArticle(articleFootball2);
        journalistFootball1.addArticle(articleFootball3);
        journalistRepository.save(journalistFootball1);
        journalistFootball3.addArticle(articleFootball1);
        journalistRepository.save(journalistFootball3);


    }
}
