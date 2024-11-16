package az.turingacademy.taskspumble;

import java.util.Random;


public class RandomPlaceApp {
    public static void main(String[] args) {

        String[] students = {"Rəvan Ağayev", "Gülər Əbilova", "Yetər Nəbiyeva", "Dilbər Mirzəyeva", "Ruslan Çərkəzov", "Sənubər Abbasova", "Fəxri Babayev",
                    "Lalə Həmidova", "Günay İskəndərova", "Ramina Səlimova", "Tural Nəzərov", "Rəvan Əliyev", "İbrahim Ələkbərov", "Ella Piriyeva", "Aynur Məmmədova",
                    "Ömər Ələkbərov", "Famil Məmmədov", "Rəna Mehdiyeva", "ƏliMurad", "Seyran Xəlilzadə","Məhəmməd Hüseybov", "Pərvin Bədəlova", "Nicat Məcidov"};

        Random placeNumber = new Random();

        int totalSeats = students.length;

        String[] seatPlace = new String[totalSeats];

        boolean[] takenSeat = new boolean[totalSeats];

        for (String student : students) {
            int seat;
            do {
                seat = placeNumber.nextInt(totalSeats);
            } while (takenSeat[seat]);

            takenSeat[seat] = true;
            seatPlace[seat] = student;
        }

        System.out.println("Today's seat places are:");
        for (int i = 0; i < seatPlace.length; i++) {
            System.out.println("Seat " + (i + 1) + ": " + seatPlace[i]);
        }

    }
}
