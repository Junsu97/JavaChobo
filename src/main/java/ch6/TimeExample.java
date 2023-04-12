package ch6;

import java.util.Arrays;

public class TimeExample {
    public static void main(String[] args) {
        Time[] t = new Time[3];
        t[0] = new Time();
        t[1] = new Time();
        t[2] = new Time();

        t[0].hour = 17;
        t[0].minute = 50;
        t[0].second = 24;

        t[1].hour = 6;
        t[1].minute = 50;
        t[1].second = 30;

        t[2].hour = 11;
        t[2].minute = 20;
        t[2].second = 33;

        for(int i = 0; i < t.length; i++){
            System.out.printf("t[%d].hour: %d\n",i,t[i].hour);
            System.out.printf("t[%d].minute: %d\n",i,t[i].minute);
            System.out.printf("t[%d].second: %d\n",i,t[i].second);
        }
    }
}
