package android.example.fragment;

import java.util.ArrayList;

// Class for storing all the color resources in ArrayLists
public class ColorAssets {

    // Lists for all AndroidMe colors
    // Broken down into first, second, third, and all colors

    private static final ArrayList<Integer>first =new ArrayList<Integer>(){{
        add(R.color.color1);
        add(R.color.color2);
        add(R.color.color3);
        add(R.color.color4);
        add(R.color.color5);
        add(R.color.color6);
        add(R.color.color7);
        add(R.color.color8);
        add(R.color.color9);
        add(R.color.color10);
        add(R.color.color11);
        add(R.color.color12);
        add(R.color.color13);
    }};

    private static final ArrayList<Integer>second =new ArrayList<Integer>(){{
        add(R.color.color1);
        add(R.color.color2);
        add(R.color.color3);
        add(R.color.color4);
        add(R.color.color5);
        add(R.color.color6);
        add(R.color.color7);
        add(R.color.color8);
        add(R.color.color9);
        add(R.color.color10);
        add(R.color.color11);
        add(R.color.color12);
        add(R.color.color13);
    }};
    private static final ArrayList<Integer>third =new ArrayList<Integer>(){{
        add(R.color.color1);
        add(R.color.color2);
        add(R.color.color3);
        add(R.color.color4);
        add(R.color.color5);
        add(R.color.color6);
        add(R.color.color7);
        add(R.color.color8);
        add(R.color.color9);
        add(R.color.color10);
        add(R.color.color11);
        add(R.color.color12);
        add(R.color.color13);
    }};

    private static final ArrayList<Integer>all =new ArrayList<Integer>(){{
       addAll(first);
       addAll(second);
       addAll(third);
    }};



    // Getter methods that return lists of all first colors, second colors, and third colors

    public static ArrayList<Integer> getFirst() {
        return first;
    }

    public static ArrayList<Integer> getSecond() {
        return second;
    }

    public static ArrayList<Integer> getThird() {
        return third;
    }

    public static ArrayList<Integer> getAll() {
        return all;
    }
}
