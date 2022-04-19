package com.example.szallasz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private void loadFragment(Fragment fragment, String tag){
        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment,tag);
        fragmentTransaction.commit();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar mainToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mainToolbar);

        loadFragment(new HomeFragment(),"home");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_home:
                loadFragment(new HomeFragment(),"home");
                return true;
            case R.id.action_logout:
                showMessage("Kijelentkezés");
                return true;
            case R.id.action_account:
                loadFragment(new LoginFragment(),"login");
                return true;
            case R.id.action_history:
                loadFragment(new HistoryFragment(),"history");
                return true;
            case R.id.action_exit:
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                return true;
        }


        return true;
    }

    private void showMessage(String message) {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}