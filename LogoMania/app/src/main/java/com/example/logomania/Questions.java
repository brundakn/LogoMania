package com.example.logomania;

public class Questions {
    private String mQuestions[] = {
            "Guess the Logo ?" ,
            "You can Guess the Logo ?" ,
            "Can you guess this one ?" ,
            "Guess the Logo ?" ,
            "You can Guess the Logo ?" ,
            "Can you guess this one ?" ,  
            "Guess the Logo ?" ,
            "You can Guess the Logo ?" ,
            "Can you guess this one ?",
            "Guess the Logo ?" ,
            "You can Guess the Logo ?" ,
            "Can you guess this one ?" ,
            "Guess the Logo ?" ,
            "You can Guess the Logo ?" ,
            "Can you guess this one ?" ,
    };
    private String mChoice[] []={
            {"Bank of Baroda","Syndicate","Karur Vysya Bank"},
            {"Mercedes","BMW","Audi"},
            {"Pogo","Disney","Cartoon Network"},
            {"Pixel","Dream Works","Kindle"},
            {"Indian post","Professional Courier","Express Courier"},
            {"PNB","Syndicate Bank","Kotak Bank"},
            {"Kwality Walts","Dairy Day","Amul"},
            {"Kurkure","Lays","Bingo"},
            {"Cadbury","Parle","Nestle"},
            {"Pizza hut","Oven Story","Dominoes"},
            {"Essar","Reliance","Shell"},
            {"Sony","Sony Ericsson","Nokia"},
            {"Cafe Coffee Day","Espresso Express","Starbucks"},
            {"Subway","Burger King","Mc Donalds"},
            {"Baskin Robins","Polar Bear","Takobell"}
    };
    private String mImages[] = {
            "bankofbaroda" ,
            "bmw" ,
            "cartoonnetwork" ,
            "dreamworks" ,
            "indianpost",
            "kotak",
            "kwalitywalts",
            "lays",
            "nestle",
            "pizzahut",
            "shell",
            "sonyericsson",
            "starbucks",
            "subway",
            "takobell"
    };
    private String mQuestionsType[] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton"
    };
    private String mCoorectAnswers[] = {
            "Bank of Baroda" ,
            "BMW" ,
            "Cartoon Network" ,
            "Dream Works" ,
            "Indian post",
            "Kotak Bank",
            "Kwality Walts",
            "Lays",
            "Nestle",
            "Pizza hut" ,
            "Shell",
            "Sony Ericssion",
            "Starbucks",
            "Subway",
            "Takobell"
    };

    public String getQuestions(int q) {
        String questions = mQuestions[q];
        return questions;
    }

    public String[] getChoice(int q) {
        String[] choice = mChoice[q];
        return choice;
    }

    public String getImages(int q) {
        String img = mImages[q];
        return img;
    }

    public String getType(int q) {
        String type = mQuestionsType[q];
        return type;
    }

    public int getLength() {
        return mQuestions.length;
    }

    public String getCoorectAnswers(int q) {
        String correct = mCoorectAnswers[q];
        return correct;
    }
}
