/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author seemin
 */
public class AnalysisHelper {
    
     

 public void getAvgNumOfLikesPerComment() {
     // To Find Average number of likes per comment
 
 Map < Integer, Comment > comments = DataStore.getInstance().getComments();
 int likesNumber = 0;
 int commentsNumber = comments.size();
 for( Comment c: comments.values())
 {
     likesNumber +=c.getLikes();
 }
     System.out.println("average number of likes per comment: "  + likesNumber / commentsNumber);
 }
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes:  " + max + "\n" 
            + users.get(maxId));
    }
    
    // To find 5 comments which have the most likes
    
    
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most liked comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
  

// Find the post with most liked comments.
public void postWithMostLikedComments(){
        Map<Integer, Integer> postLikesCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
    
        for (Post post : posts.values()) {
            for (Comment c : post.getComments()) {
                int likes = 0;
                if (postLikesCount.containsKey(post.getPostId())) {
                    likes = postLikesCount.get(post.getPostId());
                }
                likes += c.getLikes();
                postLikesCount.put(post.getPostId(), likes);
            }
        }
        int max = 0;
        int maxLikesPostId = 0;
        for (int id : postLikesCount.keySet()) {
            if (postLikesCount.get(id) > max) {
                max = postLikesCount.get(id);
                maxLikesPostId = id;
            }
        }
        System.out.println("Post with most liked Comments : " + max + "\n" 
            + posts.get(maxLikesPostId) );
   
    }       

//3) . Find the post with most comments.

public void postWithMostComments(){
        Map<Integer, Integer> postCommentsCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
    
        for (Post post : posts.values()) { 
            int comments=0;
            for (Comment c : post.getComments()){
               /* if (postCommentsCount.containsKey(post.getPostId())) {
                    comments = postCommentsCount.get(post.getPostId());
                }*/
                comments ++;
               
            }
             postCommentsCount.put(post.getPostId(), comments);
        }
        int max = 0;
        int maxCommentsPostId = 0;
        for (int id : postCommentsCount.keySet()) {
            if (postCommentsCount.get(id) > max) {
                max = postCommentsCount.get(id);
                maxCommentsPostId = id;
            }
        }
        System.out.println("Post with most comments: " + max + "\n" 
            + posts.get(maxCommentsPostId));
   
    }
    
   
    

//4) . Top 5 inactive users based on total posts number.

 public void getInactiveUsersbyPosts() {
        Map<Integer, Integer> postsCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
    int x = 1;
        for (Post post : posts.values())  {
                
                if (postsCount.containsKey(post.getUserId())) {
                    int p = postsCount.get(post.getUserId())+1;
                    postsCount.put(post.getUserId(), p);
                }
                else{
                    
                postsCount.put(post.getUserId(), x);
            }
        }
      Comparator<Entry<Integer, Integer>> valueComparator = new Comparator<Entry<Integer,Integer>>() {
            
            @Override
            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };
        
        Set<Entry<Integer, Integer>> entries = postsCount.entrySet();
        List<Entry<Integer, Integer>> listOfEntries = new ArrayList<>(entries);// Sort method needs a List, so let's first convert Set to List in Java
        
        
        Collections.sort(listOfEntries, valueComparator);// sorting HashMap by values using comparator
        
        
        // copying entries from List to Map
        
        System.out.println("Top 5 inactive users based on total posts number ");
       
        int i = 6;
          
            for(Entry<Integer, Integer> entry : listOfEntries){
           
          
            System.out.println("User Id is" +entry.getKey()+ "and number of posts are" + entry.getValue());
           i--;
            if((i <0)){
               break;
           }
        }
    }
    
///5). Top 5 inactive users based on total comments they created.

    public void getInactiveUsersbyComments() {
        Map<Integer, Integer> commentsCount = new HashMap<>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
    int x = 1;
        for (Comment comment : comments.values())  {
                
                if (commentsCount.containsKey(comment.getUserId())) {
                    int p = commentsCount.get(comment.getUserId())+1;
                    commentsCount.put(comment.getUserId(), p);
                }
                else{
                    
                commentsCount.put(comment.getUserId(), x);
            }
        }
      Comparator<Entry<Integer, Integer>> valueComparator = new Comparator<Entry<Integer,Integer>>() {
            
            @Override
            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };
        
        Set<Entry<Integer, Integer>> entries = commentsCount.entrySet();
        List<Entry<Integer, Integer>> listOfEntries = new ArrayList<>(entries);// Sort method needs a List, so let's first convert Set to List in Java
        
        
        Collections.sort(listOfEntries, valueComparator);// sorting HashMap by values using comparator
        
        
        // copying entries from List to Map
        
        System.out.println("Top 5 inactive users based on total comments ");
       
        int i = 6;
          
            for(Entry<Integer, Integer> entry : listOfEntries){
           
          
            System.out.println("User Id is" +entry.getKey()+ "and number of comments are" + entry.getValue());
           i--;
            if((i <0)){
               break;
           }
        }
    }
  
    
    public void getTopFiveInactiveUsersOverallBasedonSumOfCommentsLikesAndPosts() {

            
            List<Map.Entry<Integer, Integer>> list = checkName("asc");
            
            System.out.print("(VI) Top 5 Inactive user based on sum of likes,comments,posts are: \n");
            for (int i = 0; i < list.size() && i < 5; i++) {
            int userid = list.get(i).getKey();
            int totalSum = list.get(i).getValue();
            System.out.println("UserID " +userid + ": " + totalSum );
        } 
           
    }
    
   
    
        public void getTopFiveActiveUsersOverallBasedonSumOfCommentsLikesAndPosts() {

        List<Map.Entry<Integer, Integer>> list = checkName("dsc");
            
            
            System.out.print("(VII) Top 5 Active user based on sum of likes,comments,posts are: \n");
            for (int i = 0; i < list.size() && i < 5; i++) {
            int userid = list.get(i).getKey();
            int totalSum = list.get(i).getValue();
            System.out.println("UserID "+userid + ": " + totalSum );
        }     
            
    }
    
        
     public List<Entry<Integer,Integer>> checkName(final String order){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        Map<Integer, Integer> totalCount = new HashMap<>();

        for (Comment c : comments.values()) {                
            totalCount.put(c.getUserId(), totalCount.getOrDefault(c.getUserId(), 0) + c.getLikes() + 1);   
        }

        for (Post p : posts.values()) {
            totalCount.put(p.getUserId(), totalCount.getOrDefault(p.getUserId(), 0) + 1);
        }
            
        Set<Map.Entry<Integer,Integer>> entrySet = totalCount.entrySet();
            
           
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
        Comparator<Entry<Integer, Integer>> cmp = new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> a, Entry<Integer, Integer> b) {
                if(order.equals("asc")){
                    return a.getValue() - b.getValue();  
                }else{
                    return b.getValue() - a.getValue();
                }     
            }
        };       
        Collections.sort(list, cmp);     
        return list;
    }  
}
 


