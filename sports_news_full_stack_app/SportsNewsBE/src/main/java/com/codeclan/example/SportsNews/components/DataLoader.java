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

        Category cricket = new Category("Cricket");
        categoryRepository.save(cricket);

        Category tennis = new Category("Tennis");
        categoryRepository.save(tennis);

        Category golf = new Category("Golf");
        categoryRepository.save(golf);



        Journalist journalistFootball1 = new Journalist("John", "Burn", "/images/journalist1.jpg");
        journalistRepository.save(journalistFootball1);

        Journalist journalistFootball2 = new Journalist("Joe", "Bradshaw", "/images/journalist2.jpg");
        journalistRepository.save(journalistFootball2);

        Journalist journalistFootball3 = new Journalist("Gordon", "Doe", "/images/journalist10.jpg");
        journalistRepository.save(journalistFootball3);

        Journalist journalistBasketball1 = new Journalist("Laura", "Savvas", "/images/journalist3.jpg");
        journalistRepository.save(journalistBasketball1);

        Journalist journalistBasketball2 = new Journalist("Andrew", "Alloia", "/images/journalist4.jpg");
        journalistRepository.save(journalistBasketball2);

        Journalist journalist1Formula1 = new Journalist("Ted", "Kravitz", "/images/journalist5.jpg");
        journalistRepository.save(journalist1Formula1);

        Journalist journalist2Formula1 = new Journalist("Suzi", "Perry","/images/journalist6.jpg");
        journalistRepository.save(journalist2Formula1);

        Journalist journalistRugby = new Journalist("Brian", "Moore", "/images/journalist7.jpg");
        journalistRepository.save(journalistRugby);

        Journalist journalistTennis = new Journalist("Katrina", "Adams", "/images/journalist8.jpg");
        journalistRepository.save(journalistTennis);

        Journalist journalistGolf = new Journalist("Kelly", "Tilgman", "/images/journalist9.jpg");

        journalistRepository.save(journalistGolf);

        Journalist journalistCricket = new Journalist("Steve", "Get", "/images/Steve_Get.jpeg");
        journalistRepository.save(journalistCricket);


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
                "2019-04-01", "/images/football1.jpg", 7, football, journalistFootball3);

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
                "2019-04-15", "/images/football2.jpg", 5, football, journalistFootball1);
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
                "2019-04-03", "/images/football3.jpg", 2, football, journalistFootball1);
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
                "2019-04-04", "/images/fedcup_getty2.jpg", 1, tennis, journalistTennis);
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
                "2019-04-05", "/images/folau_reuters.jpg", 0, rugby, journalistRugby);
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
                "2019-04-06", "/images/golfer.jpg", 0, golf, journalistGolf);
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
                "2019-04-07", "/images/billy_vunipola_getty.jpg", 1, rugby, journalistRugby);
        articleRepository.save(articleRugby2);

        Article articleBaseball2 = new Article("Baseball", "Yello baseball", "Doing great stuff", "2019-04-08", "/images/baseball1.jpg", 0, basketball, journalistFootball3);
        articleRepository.save(articleBaseball2);


        Article articleFootBall5 = new Article(
                "Amateur football match in Aberdeen abandoned over 'racial slur'",
                "A university football team walked off the pitch after a racial slur was said to have been used against one of its players during a match.",
                "A university football team walked off the pitch after a racial slur was said to have been used against one of its players during a match." +
                        "" +
                        "The incident involved an amateur first division league game between Aberdeen University Football Club and Kincorth Amateurs at Tullos Primary School on Saturday." +
                        "" +
                        "Aberdeen University Students' Association said it abandoned the game." +
                        "" +
                        "BBC Scotland has asked Kincorth Amateurs for comment." +
                        "" +
                        "Aberdeenshire Amateur Football Association said it was awaiting the referee's report into the game." +
                        "" +
                        "Aberdeen University Students' Association (Ausa) said in a statement: Aberdeen University Football Club walked off the pitch and subsequently abandoned their game against Kincorth AFC due to the use of an extremely offensive racial slur against one of the university players." +
                        "" +
                        "Aberdeen University Students' Association has zero-tolerance policy for discrimination of any form and will take all the necessary actions to support the AUFC (Aberdeen University Football Club) in this matter." +
                        "" +
                        "Police Scotland appealed for any witnesses to contact them." +
                        "",
                "2019-04-20", "/images/ct_pan_getty.jpg", 1, football, journalistFootball2);
        articleRepository.save(articleFootBall5);


        Article articleFootBall6 = new Article(
                "Billy McNeill: Former Celtic captain & manager dies aged 79",
                "Legendary former Celtic captain Billy McNeill - the first Briton to lift the European Cup - has died aged 79",
                "Legendary former Celtic captain Billy McNeill - the first Briton to lift the European Cup - has died aged 79." +
                        "" +
                        "McNeill led Celtic when they beat Inter Milan 2-1 in 1967 and captained the club to nine successive titles, seven Scottish Cups and six League Cups." +
                        "" +
                        "In two spells as Celtic boss, he won four titles and four cups. He managed Clyde, Aberdeen, Manchester City and Aston Villa too." +
                        "" +
                        "McNeill had been suffering from dementia since 2010." +
                        "" +
                        "Live: reaction & tributes" +
                        "'He was a giant who I'm truly lucky to follow'" +
                        "5 Live Sport Special: The Lisbon Lions remembered" +
                        "Celtic say he died on Monday night surrounded by his family and loved ones." +
                        "" +
                        "A statement from the McNeill family said he fought bravely to the end, showing the strength and fortitude he always has done throughout his life." +
                        "" +
                        "It added: We would also like to note our love and appreciation to our mother, Liz, for the care, devotion and love she gave to our father throughout his illness. No one could have done any more." +
                        "" +
                        "Whilst this is a very sad time for all the family and we know our privacy will be respected, our father always made time for the supporters so please tell his stories, sing his songs and help us celebrate his life." +
                        "" +
                        "Big goals in big games - McNeill the player" +
                        "Born in Bellshill, North Lanarkshire, McNeill was initially farmed out by Celtic to junior side Blantyre Victoria before making his debut on 23 August 1958." +
                        "" +
                        "More than 800 appearances later, the Scottish Cup final win against Airdrie on 3 May 1975 was the imposing centre-back's farewell game." +
                        "" +
                        "Among his many career highs was scoring the winner in the 1965 Scottish Cup final, ending an eight-year trophy drought for Celtic. He also found the net in the 1969 and 1972 finals." +
                        "" +
                        "The European Cup final of 1967 was the pinnacle, coming in the same season Celtic won a domestic treble, but he was on the losing side three years later when Feyenoord beat Celtic in Milan after extra-time." +
                        "" +
                        "He was capped 29 times for Scotland.",
                "2019-04-21", "/images/statueee.jpg", 1, football, journalistFootball3);
        articleRepository.save(articleFootBall6);

        Article articleTennis3 = new Article(
                "Fed Cup: Australia to face France in November's final",
                "Australia reached their first Fed Cup final for 26 years with a 3-2 win over Belarus in Brisbane",
                "Australia reached their first Fed Cup final for 26 years with a 3-2 win over Belarus in Brisbane." +
                        "" +
                        "Ashleigh Barty and Samantha Stosur beat Victoria Azarenka and Aryna Sabalenka 7-5 3-6 6-2 in the deciding doubles tie to seal victory." +
                        "" +
                        "Barty also won both her singles matches, while US Open champion Stosur lost twice." +
                        "" +
                        "In November's final, Australia will host France, who beat favourites Romania 3-2 on Sunday." +
                        "" +
                        "French Open champion Simona Halep won both of her singles matches for Romania but victories for France's Kristina Mladenovic and Pauline Parmentier - against Mihaela Buzarnescu and Irina-Camelia Begu respectively - meant the tie went into a doubles decider." +
                        "" +
                        "Mladenovic and Caroline Garcia, who had not played together since the 2016 Fed Cup final after a public fall-out, came from behind to beat Halep and Monica Niculescu 5-7 6-3 6-4 and clinch victory for two-time champions France." +
                        "" +
                        "Romania, who beat defending champions the Czech Republic in an epic quarter-final, had been bidding to reach their first final." +
                        "" +
                        "France's most recent Fed Cup title was in 2003, while Australia won the last of their seven titles in 1974." +
                        "" +
                        "Australia's team of Rennae Stubbs, Elizabeth Smylie and Nicole Provis lost 3-0 to Spain in the 1993 final." +
                        "" +
                        "It's super exciting. We all work so hard all year and we're such a tight team, said Stosur. We're going to be giving it our best shot here in November.",
                "2019-04-19", "/images/barty.jpg", 0, tennis, journalistTennis);
        articleRepository.save(articleTennis3);

        Article articleRugby3 = new Article(
                "Pro14: Titles, home draws and European places on the line on final day",
                "The regular season in the Pro14 reaches a climax on Saturday with seven matches in four countries",
                "The regular season in the Pro14 reaches a climax on Saturday with seven matches in four countries." +
                        "" +
                        "Defending champions Leinster have clinched the Conference B title and with it a home game in the play-off semi finals." +
                        "" +
                        "But Glasgow and Munster can both still win Conference A, and there is a battle for third place in Conference B between Benetton, Edinburgh and Scarlets." +
                        "" +
                        "Can Benetton claim a Champions Cup spot for Italy, and will any Welsh region make it into Europe's top tournament?" +
                        "" +
                        "The final weekend - where every game is a local derby - was designed to keep interest high when there was a danger of dead rubbers dominating." +
                        "" +
                        "As it turns out, there's a lot more than just local bragging rights at stake." +
                        "" +
                        "Here's a closer look:",
                "2019-04-21", "/images/gettyimages-1137149800.jpg", 0, rugby, journalistRugby);
        articleRepository.save(articleRugby3);


        Article articleRugby4 = new Article(
                "Rugby Football Union says more cases of positive tests reflects society use",
                "Four Premiership rugby players tested positive for cocaine last season, which the Rugby Football Union say reflects increasing drug use in society",
                "Four Premiership rugby players tested positive for cocaine last season, which the Rugby Football Union say reflects increasing drug use in society." +
                        "" +
                        "There were three more cases in 2017-2018 compared to the previous campaign." +
                        "" +
                        "The positives reflect risks 18-35 year-olds are exposed to when going out socially, RFU's Dr Simon Kemp says." +
                        "" +
                        "We are trying to have a policy which continues to protect the game, but recognises illicit drug use in society is becoming increasingly common." +
                        "" +
                        "Dr Kemp added that the players who tested positive for recreational drug use had found themselves peripheral figures at their clubs." +
                        "" +
                        "These positives are not from players who are typically playing and training every week, the medical chief explained." +
                        "" +
                        "These are players who [have become] somewhat dislocated from their clubs, either through injury or non-selection." +
                        "" +
                        "All of these players were reviewed by an independent specialist psychiatrist, and plans to manage any ongoing problems were created." +
                        "" +
                        "The RFU run an illicit drugs programme independent of the World Anti-Doping Agency (WADA), and carried out 332 tests during the 2017-2018 season, 94% of which were hair samples and have a 3-5 month detection period." +
                        "" +
                        "We are confident that this level of testing, which is over and above what we are required to do under the WADA code, tries to cover off both protecting the reputation and integrity of the game and addressing some of the health issues we know are associated with illicit drug use, Dr Kemp added." +
                        "" +
                        "Under the programme, players are guaranteed anonymity for a first offence, but are fined and required to undergo a rehabilitation programme, which the authorities insist is enough of a deterrent." +
                        "" +
                        "With 300-plus tests, covering three to five months worth of use, if this was a broader problem and it hadn't been a disincentive, we would see more positives, said Premiership Rugby's Phil Winstanley.",
                "2019-04-23", "/images/gettyimages-1127376085.jpg", 0, rugby, journalistRugby);
        articleRepository.save(articleRugby4);


        Article articleRugby5 = new Article(
                "Judgement Day: Alun Wyn Jones and George North set for returns",
                "Alun Wyn Jones and George North are in line to return for Ospreys' crucial Pro14 match against Cardiff Blues",
                "Alun Wyn Jones and George North are in line to return for Ospreys' crucial Pro14 match against Cardiff Blues." +
                        "" +
                        "Neither has played since Wales' Grand Slam-clinching Six Nations win against Ireland on 16 March." +
                        "" +
                        "Both face fitness tests, but lock Jones is set to return after his knee problem while wing North is close after breaking a bone in his hand." +
                        "" +
                        "They have had some contact this week, we will check again on Thursday and Friday, said coach Allen Clarke." +
                        "" +
                        "We need to take that to another level before we finalise selection." +
                        "" +
                        "It would be great if they could come through but we are not in a position to confirm that yet." +
                        "" +
                        "Pro14: What's at stake on final day" +
                        "Ospreys expect Wales duo to stay" +
                        "Jones and North were both injured in the same passage of play early in the 25-7 defeat of Ireland in Cardiff." +
                        "" +
                        "North left the field while Jones played on with a bandaged knee to lead Wales to a fourth Grand Slam in 14 years." +
                        "" +
                        "Saturday's clash with the Blues in the Cardiff Judgement Day double-header will decide who finishes fourth in Conference A and wins a play-off place to qualify for the 2019-20 European Champions Cup." +
                        "" +
                        "Ospreys are one place ahead of the Blues after a run of three wins, and North is keen to play after his lay-off." +
                        "" +
                        "It's been a long few weeks and it was not a straightforward break, he said." +
                        "" +
                        "I have put in a good block of training and I will be up for selection and hopefully I will get my name on the team sheet somehow." +
                        "" +
                        "Coach Clarke added: If you look where we were prior to the Six Nations with the turmoil and off-field distraction we dropped down the ladder of the league table.",
                "2019-04-18", "/images/106562580_awj.jpg", 4, rugby, journalistRugby);
        articleRepository.save(articleRugby5);

        Article articleCricket1 = new Article(
                "One-Day Cup: Ben Slater century sets up Notts win over Warwickshire",
                "Opener Ben Slater hit a century as Nottinghamshire made it three wins out of three in the One-Day Cup, beating Warwickshire by 118 runs at Edgbaston",
                "Opener Ben Slater hit a century as Nottinghamshire made it three wins out of three in the One-Day Cup, beating Warwickshire by 118 runs at Edgbaston." +
                        "" +
                        "Slater made exactly 100 off 115 balls, with 15 fours, to rescue his side after they slumped from 81-0 to 98-4." +
                        "" +
                        "He put on 95 with Steven Mullaney (40) and they eventually totalled 301-9 despite 5-45 from spinner Jeetan Patel." +
                        "" +
                        "Warwickshire struggled to 22-4 and although Liam Banks made 57 and Alex Thomson 55, they were all out for 183." +
                        "" +
                        "One-Day Cup group tables" +
                        "Having opted to bat first, Notts made a positive start through Slater and Joe Clarke (39), with the latter hitting three fours and a six from the final four deliveries of Henry Brookes' fourth over, which cost 23." +
                        "" +
                        "Patel's off-spin, though, checked their progress and he twice took two wickets in the space of three balls, eventually bowling Slater with one that turned and hit off stump, on his way to only the second limited-overs 'five-for' of his career." +
                        "" +
                        "Matt Carter (21 not out) hit two full tosses from Chris Woakes for four to see the total past 300 and then made a breakthrough at the start of Warwickshire's reply by having Ed Pollock lbw for a duck." +
                        "" +
                        "With none of their top four reaching double figures, the home side were never in the hunt, but could take encouragement from the batting of teenager Banks and Thomson, who both achieved maiden fifties for the first team in any format before Luke Fletcher (3-21) had Patel lbw in the 38th over to end the game." +
                        "" +
                        "Both sides are next in action on Friday when Notts are at home to Leicestershire and Warwickshire host Durham",
                "2019-04-17", "/images/106559325_slater_getty.jpg", 0, cricket, journalistCricket);
        articleRepository.save(articleCricket1);

        Article articleCricket2 = new Article(
                "One-Day Cup: Hampshire beat Middlesex by 119 runs as Aiden Markram stars",
                "Aiden Markram hit 88 off 90 balls for Hampshire and then took 3-39 with the ball as they comfortably beat Middlesex by 119 runs in the One-Day Cup",
                "Aiden Markram hit 88 off 90 balls for Hampshire and then took 3-39 with the ball as they comfortably beat Middlesex by 119 runs in the One-Day Cup." +
                        "" +
                        "The win was Hampshire's third from three games in this year's competition." +
                        "" +
                        "Markram's knock and Rilee Rossouw's 64 from 55 balls helped the home side post 301-9, despite Tom Helm's fine 5-71." +
                        "" +
                        "Eoin Morgan's 41 was the visitors' best offering with the bat in reply, as they slipped to 182 all out on their way to a first defeat in the group." +
                        "" +
                        "One-Day Cup group tables" +
                        "Liam Dawson (3-37), Kyle Abbott (3-36) and Markram worked their way through Middlesex's line-up, before Mason Crane sealed the win when he bowled Tim Murtagh in the 36th over." +
                        "" +
                        "Earlier Rossouw, Dawson and Markram had all impressed with the bat for the holders, after openers Tom Alsop (23) and Markram had guided them past 50 without loss." +
                        "" +
                        "The victory put Hampshire top of South Group, while Middlesex, who are in action again against Surrey at The Oval on Thursday, have two wins from their three games.",
                "2019-04-16", "/images/106564515_aidenmarkramrex.jpg", 3, cricket, journalistCricket);
        articleRepository.save(articleCricket2);

        Article articleCricket3 = new Article(
                "Ashton Turner in record fifth successive T20 duck - four of them first ball",
                "Australian Ashton Turner became the first man in Twenty20 history to make five consecutive ducks as he fell first ball in the Indian Premier League",
                "It was the third successive IPL golden duck for the 26-year-old, who batted at number five for Rajasthan Royals." +
                        "" +
                        "Team-mate Ajinkya Rahane, the India batsman, struck their side's highest IPL score with an unbeaten 105." +
                        "" +
                        "Last month Turner hit 84 against India in a one-day international and he has played three ODIs and five T20s." +
                        "" +
                        "His unbeaten one-day innings in Chandigarh broke the run of T20 ducks, which began with a first-ball dismissal in the Big Bash League in February and was followed by a five-ball nought for Australia against India." +
                        "" +
                        "The Royals, captained by Australian Steve Smith and featuring England all-rounder Ben Stokes and newcomer Jofra Archer, lost the match against Delhi Capitals by six wickets with four deliveries left." +
                        "" +
                        "Smith compiled his second successive fifty, though Stokes made only eight and has scored a modest 112 runs in eight innings in this year's event, with a best of 46." +
                        "" +
                        "Archer clipped the stumps with a full toss but the bails stayed in place and he finished with 0-31 from his four overs." +
                        "" +
                        "The 24-year-old Sussex all-rounder took 11 wickets in his 10 matches but he and Stokes now head home to prepare for England's one-day series against Pakistan, beginning on 8 May, which is preceded by a one-off match with Ireland on 3 May." +
                        "" +
                        "Barbados-born Archer, 24, qualified to play for England in March after a change in residency rules." +
                        "" +
                        "He was not selected in a preliminary 15-man World Cup squad but could still be chosen if he impresses in the pre-tournament matches as changes can be made up to 23 May." +
                        "" +
                        "India left-hander Rishabh Pant won Monday's match in Jaipur with a six as the Capitals moved to the top of the table on net run-rate, although they have played a game more than second-placed Chennai Super Kings." +
                        "" +
                        "The Royals are one place off the foot of the table, eight points behind the leaders, with the top four teams qualifying for the play-off phase, which starts on 7 May",
                "2019-04-15", "/images/106550967_ashton_turner_getty.jpg", 12, cricket, journalistCricket);
        articleRepository.save(articleCricket3);


        Article articleRugby6 = new Article(
                "Super League: St Helens 62-16 Hull FC",
                "Adam Swift and Kevin Naiqama scored a hat-trick of tries each as St Helens ran in 11 tries to hammer Hull FC.",
                "Joe Westerman and Carlos Tuimavave gave Hull the lead early on but Saints raced back through two Jonny Lomax tries." +
                        "" +
                        "Naiqama, Swift and Lachlan Coote also crossed before the break but Jez Litten cut the deficit for the hosts." +
                        "" +
                        "Swift completed his hat-trick while Naiqama scored twice more either side of Jack Welsby's try as Saints wrapped up a stunning Easter Monday victory." +
                        "" +
                        "Despite their early setback through Westerman and Tuimavave's tries, Saints soon took control of the game, with Lomax registering two tries on his 200th Saints appearance." +
                        "" +
                        "The win caps off a fine Easter period for Saints, who enjoyed a thumping derby win against Wigan on Friday." +
                        "" +
                        "Their third victory in a row in Super League ensures they maintain their four-point lead on second-placed Warrington at the top of the table with 12 games played." +
                        "" +
                        "Hull also won their respective local derby against city rivals Hull Kingston Rovers, but were undone by a stunning display from the league leaders." +
                        "" +
                        "Naiqama has now scored six tries since joining from NRL side Wests Tigers at the start of this season.",
                "2019-04-17", "/images/106550412_aw3_8555.jpg", 1, rugby, journalistRugby);
        articleRepository.save(articleRugby6);
    }
}