package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        while (true) {
            System.out.println("Type the movie name: ");
            String movieName = x.nextLine();

            System.out.println("Type the movie TYPE: ");
            String type = x.nextLine();
            if ("QqeE".contains(type)) {
                break;
            }


            Movie movie = Movie.getMovie(type, movieName);
            movie.watchMovie();

        }


    }
    }


