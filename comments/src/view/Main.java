package view;

import entities.Comment;
import entities.Post;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("have a nice trip!");
        Comment c2 = new Comment("wow thats awesome");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "traveling to new zeland", "im going to visit this wonderful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);


    }
}