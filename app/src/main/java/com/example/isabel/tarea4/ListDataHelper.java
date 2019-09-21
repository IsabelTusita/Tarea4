package com.example.isabel.tarea4;

import android.widget.ListView;

import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<oto> provideItems(){
        ArrayList<oto> list = new ArrayList<>();
        list.add(new oto(R.drawable.android, "android",android.R.color.holo_green_dark));
        list.add(new oto(R.drawable.child_care, "child care",android.R.color.holo_blue_dark));
        list.add(new oto(R.drawable.directions_bike, "directions bike",android.R.color.holo_blue_light));
        list.add(new oto(R.drawable.directions_subway, "directions subway",android.R.color.holo_green_light));
        list.add(new oto(R.drawable.local_airport, "local airport",android.R.color.holo_orange_dark));
        list.add(new oto(R.drawable.notifications_active, "notifications active",android.R.color.holo_orange_light));
        list.add(new oto(R.drawable.pan_tool, "pan tool",android.R.color.holo_red_dark));
        list.add(new oto(R.drawable.record_voice_over, "record voice over",android.R.color.holo_red_light));
        list.add(new oto(R.drawable.wb_sunny, "wb sunny",android.R.color.holo_purple));

        return list;
    }
}
