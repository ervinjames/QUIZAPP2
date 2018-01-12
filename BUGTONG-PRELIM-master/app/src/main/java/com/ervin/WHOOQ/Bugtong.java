package com.ervin.WHOOQ;

public class Bugtong {
    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 50;          //Array maximum size
    public final int TOTAL_SIZE = 50;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 1;           /*Scoring Rule:
                                                if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public Bugtong() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][50];
        answer = new String [MAX_SIZE];

        bugtong[0] = "The country which has no official language";
        choices[0][0] = "A. United States of America";
        choices[0][1] = "B. Canada";
        choices[0][2] = "C. Ireland";
        choices[0][3] = "D. South Africa";
        answer[0] = "A";

        bugtong[1] = "Which of the following is not a US State?";
        choices[1][0] = "A. Arizona";
        choices[1][1] = "B. Wyoming";
        choices[1][2] = "C. District of Columbia";
        choices[1][3] = "D. Colombo";
        answer[1] = "D";

        bugtong[2] = "Ceylon is the former name of this free sovereign country.";
        choices[2][0] = "A. Lebanon";
        choices[2][1] = "B. India";
        choices[2][2] = "C. Sri Lanka";
        choices[2][3] = "D. Finland";
        answer[2] = "C";

        bugtong[3] = "Which is not a European Country?";
        choices[3][0] = "A. Kosovo";
        choices[3][1] = "B. Swaziland";
        choices[3][2] = "C. Romania";
        choices[3][3] = "D. Croatia";
        answer[3] = "B";

        bugtong[4] = "All of the following are the Capital cities of the world except:";
        choices[4][0] = "A. Paris";
        choices[4][1] = "B. Oslo";
        choices[4][2] = "C. Bangkok";
        choices[4][3] = "D. Barcelona";
        answer[4] = "D";

        bugtong[5] = "Which of the following country in African region is considered Arabic?";
        choices[5][0] = "A. Ghana";
        choices[5][1] = "B. Egypt";
        choices[5][2] = "C. Sudan";
        choices[5][3] = "D. Kenya";
        answer[5] = "B";

        bugtong[6] = "Which of the following country uses the American Dollar as a currency?";
        choices[6][0] = "A. US Virgin Islands";
        choices[6][1] = "B. American Samoa";
        choices[6][2] = "C. Cook Islands";
        choices[6][3] = "D. Guam";
        answer[6] = "B";


        bugtong[7] = "Which of the following country uses the American Dollar as a currency?";
        choices[7][0] = "A. US Virgin Islands";
        choices[7][1] = "B. American Samoa";
        choices[7][2] = "C. Cook Islands";
        choices[7][3] = "D. Guam";
        answer[7] = "B";

        bugtong[8] = "Oslo";
        choices[8][0] = "A. Norway";
        choices[8][1] = "B. Croatia";
        choices[8][2] = "C. Samoa";
        choices[8][3] = "D. Ceylon";
        answer[8] = "A:;

        bugtong[9] = "Rio De Janeiro";
        choices[9][0] = "A. URUGUAY";
        choices[9][1] = "B. PARAGUAY";
        choices[9][2] = "C. BRAZIL";
        choices[9][3] = "D. ESTONIA";
        answer[9] = "B";

        bugtong[10] = "Saint Lucia";
        choices[10][0] = "A. Americas";
        choices[10][1] = "B. Europe";
        choices[10][2] = "C. Africa";
        choices[10][3] = "D. Asia and the Pacific";
        answer[10] = "A";

        bugtong[11] = "Ghana";
        choices[11][0] = "A. Americas";
        choices[11][1] = "B. Europe";
        choices[11][2] = "C. Africa";
        choices[11][3] = "D. Asia and the Pacific";
        answer[11] = "C";

        bugtong[12] = "Angola";
        choices[12][0] = "A. Americas";
        choices[12][1] = "B. Europe";
        choices[12][2] = "C. Africa";
        choices[12][3] = "D. Asia and the Pacific";
        answer[12] = "C";

        bugtong[13] = "I Feel it Coming was a song from whom?";
        choices[13][0] = "A. The Weeknd";
        choices[13][1] = "B. Selena Gomez";
        choices[13][2] = "C. Machine Gun Kelly";
        choices[13][3] = "D. Drake";
        answer[13] = "A”;

        bugtong[14] = "Shape of You”;
        choices[14][0] = "A. ED SHEERAN”;
        choices[14][1] = "B. HAILEY BALDWIN”;
        choices[14][2] = "C. P!NK”;
        choices[14][3] = "D. RIHANNA”;
        answer[14] = "A";

        bugtong[15] = "LET ME LOVE YOU“;
        choices[15][0] = "A. ARIANA GRANDE“;
        choices[15][1] = "B. DJ SNAKE“;
        choices[15][2] = "C. JUSTIN BEIBER“;
        choices[15][3] = "D. DJ KHALED“;
        answer[15] = "B";

        bugtong[16] = "COOL DOWN”;
        choices[16][0] = "A. KOLOHE KAI“;
        choices[16][1] = "B. ZAYN”;
        choices[16][2] = "C. TAYLOR SWIFT”;
        choices[16][3] = "D. BARBARA STREISSAND";
        answer[16] = "A”;

        bugtong[17] = "WHY TRY?”;
        choices[17][0] = "A AEROSMITH”;
        choices[17][1] = "B. ARIANA GRANDE”;
        choices[17][2] = "C. LELE PONS”;
        choices[17][3] = "D. SAM SMITH“;
        answer[17] = "B”;

        bugtong[18] = "THAT’S WHAT I LIKE”;
        choices[18][0] = "A. BRUNO MARS ”;
        choices[18][1] = "B. TAYLOR SWIFT”;
        choices[18][2] = "C. CARDI B“;
        choices[18][3] = "D. ED SHEERAN”;
        answer[18] = "A";

        bugtong[19] = "THINK OF LAURA”;
        choices[19][0] = "A. CHRISTOPHER CROSS”;
        choices[19][1] = "B. LONGER”;
        choices[19][2] = "C. DIARY”;
        choices[19][3] = "D. BREAD”;
        answer[19] = "A";

        bugtong[20] = "LEADER OF THE BAND“;
        choices[20][0] = "A. AIR SUPPLY“;
        choices[20][1] = "B. DAN FOGELNERG“;
        choices[20][2] = "C. SIA”;
        choices[20][3] = "D. CHICAGO”;
        answer[20] = "B”;

        bugtong[21] = "HARD TO SAY I’M SORRY“;
        choices[21][0] = "A. SIA“;
        choices[21][1] = "B. JASON MRAZ“;
        choices[21][2] = "C. MICHAEL JOHNSON“;
        choices[21][3] = "D. CHICAGO”;
        answer[4] = "D”;

        bugtong[22] = "SNOOPY AND CHARLIE BROWN”;
        choices[22][0] = "A. SUGAR”;
        choices[22][1] = "B. GRAIN “;
        choices[22][2] = "C. MILK”;
        choices[22][3] = "D. PEANUTS”;
        answer[22] = "D”;

        bugtong[23] = "THE GREAT TSUNAMI HIT THAILAND WAS IN THE YEAR OF?”;
        choices[23][0] = "A. 2005”;
        choices[23][1] = "B. 2004“;
        choices[23][2] = "C. 2003”;
        choices[23][3] = "D. 2002”;
        answer[23] = "B”;

        bugtong[24] = "THE OLD CAPITAL CITY OF JAPAN”;
        choices[24][0] = "A. OSAKA”;
        choices[24][1] = "B. SEYTO“;
        choices[24][2] = "C. NARA”;
        choices[24][3] = "D. KYOTO”;
        answer[24] = "D”;

        bugtong[25] = "COUNTRY WHICH FACES GREENHOUSE EFFECT AND POLLUTION”;
        choices[25][0] = "A. TAIWAN”;
        choices[25][1] = "B. SHANGHAI“;
        choices[25][2] = "C. CHINA”;
        choices[25][3] = "D. HONG KONG”;
        answer[25] = "C”;
    }

    public String getBugtong(int index){
        return bugtong[index];
    }

    public String getChoices(int index, int choice){
        return choices[index][choice];
    }

    public String getAnswer(int index){
        return answer[index];
    }

    public int getRandomIndex(){
        return 0 + new java.util.Random().nextInt(MAX_SIZE-1);
    }
}
