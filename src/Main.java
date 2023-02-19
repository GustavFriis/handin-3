import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // Randoms rando = new Randoms();
        // rando.repeater(10);
        // rando.cprChecker();

        Article gustav = new Article("Gustav", "Monster");
        Article tobias = new Article("Tobias", "Java");
        Article simone = new Article("Simone","Databases");
        Article oskar = new Article("Oskar","Reddit");
        Article daniel = new Article("Daniel","Gaming");

        ArrayList<Article> articles = new ArrayList();
        articles.add(gustav);
        articles.add(tobias);
        articles.add(simone);
        articles.add(oskar);
        articles.add(daniel);
        // System.out.println(articles);

        Square square1 = new Square(10,20);
        Square square2 = new Square(5,10);

        ArrayList<Square> squareArrayList = new ArrayList<>();
        squareArrayList.add(square1);
        squareArrayList.add(square2);

        Collections.sort(squareArrayList);
        // System.out.println(squareArrayList);

        RedditPost redditPost1 = new RedditPost("Gustav","reddit");
        RedditPost redditPost2 = new RedditPost("Tobias","PCMasterace frfr");
        RedditPost redditPost3 = new RedditPost("Oskar","AITA for murdering pigeon");
        // System.out.println(redditPost);

        RedditFrontPage frontPage = new RedditFrontPage();
        frontPage.addToArray(redditPost1);
        frontPage.addToArray(redditPost2);
        frontPage.addToArray(redditPost3);

        frontPage.printArray();
        frontPage.deleteRedditPost(2);
        frontPage.printArray();
    }
}