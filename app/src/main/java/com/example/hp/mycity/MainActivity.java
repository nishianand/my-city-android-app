package com.example.hp.mycity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.content.Intent;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    public void clickEducation(View view){
        Intent intent=new Intent(getApplicationContext(), My_City2.class);
        startActivity(intent);
    }
    public void clickMed(View view){
        Intent intent=new Intent(getApplicationContext(), My_City3.class);
        startActivity(intent);
    }
    public void clickPark(View view){
        Intent intent=new Intent(getApplicationContext(), My_City4.class);
        startActivity(intent);
    }
    public void clickTravel(View view){
        Intent intent=new Intent(getApplicationContext(), My_City5.class);
        startActivity(intent);
    }
    public void clickPrayer(View view){
        Intent intent=new Intent(getApplicationContext(), My_City6.class);
        startActivity(intent);
    }
    public void clickOfficial(View view){
        Intent intent=new Intent(getApplicationContext(), My_City7.class);
        startActivity(intent);
    }
    public void clickUnofficial(View view){
        Intent intent=new Intent(getApplicationContext(), My_City8.class);
        startActivity(intent);
    }
    public void clickMenu(View view){
        Intent intent=new Intent(getApplicationContext(), My_City9.class);
        startActivity(intent);
    }
    public void clickBank(View view){
        Intent intent=new Intent(getApplicationContext(), My_City10.class);
        startActivity(intent);
    }
    public void clickSurvey(View view){
        Intent intent=new Intent(getApplicationContext(), My_City11.class);
        startActivity(intent);
    }














    private DrawerLayout drawer;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        setContentView( R.layout.fragment_home);

        Toolbar toolbar = findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );

        drawer = findViewById ( R.id.drawer_layout );
        NavigationView navigationView = findViewById ( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener ( this );

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle ( this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener ( toggle );
        toggle.syncState ( );

        if (savedInstanceState == null) {
            getSupportFragmentManager ( ).beginTransaction ( ).replace ( R.id.fragment_container, new MessageFragment ( ) ).commit ( );
            navigationView.setCheckedItem ( R.id.nav_message );
        }
        //super.onCreate ( savedInstanceState );
        //setContentView ( R.layout.activity_main );

        BottomNavigationView bottomNav = findViewById ( R.id.bottom_navigation );
        bottomNav.setOnNavigationItemSelectedListener ( navListener );

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager ( ).beginTransaction ( ).replace ( R.id.fragment_container, new HomeFragment ( ) ).commit ( );
        }

    }

    @Override
    public boolean onNavigationItemSelected ( @NonNull MenuItem item ) {
        switch (item.getItemId ( )) {
            case R.id.nav_message:
                getSupportFragmentManager ( ).beginTransaction ( ).replace ( R.id.fragment_container, new MessageFragment ( ) ).commit ( );
                break;


            case R.id.nav_home:
                getSupportFragmentManager ( ).beginTransaction ( ).replace ( R.id.fragment_container, new HomeFragment ( ) ).commit ( );
                break;
            case R.id.nav_share:
                Toast.makeText ( this, "Share", Toast.LENGTH_SHORT ).show ( );
                break;

        }

        drawer.closeDrawer ( GravityCompat.START );
        return true;
    }

    @Override
    public void onBackPressed () {
        if (drawer.isDrawerOpen ( GravityCompat.START )) {
            drawer.closeDrawer ( GravityCompat.START );
        } else {
            super.onBackPressed ( );
        }
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener ( ) {
        @Override
        public boolean onNavigationItemSelected ( @NonNull MenuItem item ) {
            Fragment selectedFragment = null;

            switch (item.getItemId ( )) {
                case R.id.nav_home:
                    selectedFragment = new HomeFragment ( );

                    break;
                case R.id.nav_favorites:
                    selectedFragment = new FavoritesFragment ( );
                    break;
                case R.id.nav_search:
                    selectedFragment = new MapsFragment ( );
                    break;
            }

            assert selectedFragment != null;
            getSupportFragmentManager ( ).beginTransaction ( ).replace ( R.id.fragment_container, selectedFragment ).commit ( );

            return true;
        }
    };



}

















