package com.suzuma.cokomiqr.Activitys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.suzuma.cokomiqr.R;

/**
 * Created by SuZuMa on 13/03/2017.
 */

public class Main_Activity extends AppCompatActivity {
    //intancia del Drawer
    private DrawerLayout drawerLayout;

    //titulo del drawer
    private String drawerTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();  //Setear el Toolbar como Action Bar
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView=(NavigationView)findViewById(R.id.nav_view);
        if(navigationView!=null ){
            //Añadir caracteristicas
        }
        drawerTitle=getResources().getString(R.string.perfil_item);
        if(savedInstanceState==null){
            //seleccionar Item
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if(!drawerLayout.isDrawerOpen(GravityCompat.START)){
            getMenuInflater().inflate(R.menu.nav_menu,menu);
            return  true;
        }
        return  super.onCreateOptionsMenu(menu);
    }

    private void setToolbar(){
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab=getSupportActionBar();
        if(ab!=null){
            //poner icono del drawe toggle
            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }
}
