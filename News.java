package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class NewsDetails
{
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    @Override
    public String toString() {
        return "NewsDetails{" +
                "newsId=" + newsId +
                ", postedByUser='" + postedByUser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public NewsDetails(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

public class News {
    public static void main(String[] args)
    {
        List <NewsDetails> news= Arrays.asList(new NewsDetails(23,"good","thumsup","ok")
        ,new NewsDetails(23,"goodmorning","so","hello"),
                new NewsDetails(23,"ram","to","hi"));
        System.out.println(news);
        long count=  news.stream().filter(p->p.getComment().equals("budget")).count();
        System.out.println(count);

        Optional<NewsDetails> l=news.stream().max(Comparator.comparing(NewsDetails::getComment));

        System.out.println(l);
        //List Details=news.stream().filter(d->d.getNewsId().)
    }

}
