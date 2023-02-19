import java.util.ArrayList;

public class RedditFrontPage {
    ArrayList<RedditPost> redditPostArrayList = new ArrayList<>();

    public void addToArray(RedditPost redditPost){
        redditPostArrayList.add(redditPost);
    }

    public void deleteRedditPost(int indexNumber){
        redditPostArrayList.remove(indexNumber);
    }

    public void printArray(){
        for (RedditPost post: redditPostArrayList){
            System.out.println(post);
        }
    }
}

//edit* thanks for the gold kind stranger