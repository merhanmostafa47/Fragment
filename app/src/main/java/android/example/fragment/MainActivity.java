package android.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();

        FragmentBody firstFragment =new FragmentBody(ColorAssets.getFirst());
        fragmentManager.beginTransaction().add(R.id.fragment1,firstFragment).commit();

        FragmentBody secondFragment =new FragmentBody(ColorAssets.getSecond());
        fragmentManager.beginTransaction().add(R.id.fragment2,secondFragment).commit();

        FragmentBody thirdFragment =new FragmentBody(ColorAssets.getThird());
        fragmentManager.beginTransaction().add(R.id.fragment3,thirdFragment).commit();
    }
}