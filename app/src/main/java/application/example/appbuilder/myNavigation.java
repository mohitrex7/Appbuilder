package application.example.appbuilder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class myNavigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_navigation);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        drawerLayout=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START);
            //Toast.makeText(getApplicationContext(),"yoyo",Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.viewgallery){
            Intent intent=new Intent(getApplicationContext(),MyNewGallery.class);
            startActivity(intent);
            drawerLayout.closeDrawers();
            return false ;
        }else if(id==R.id.contactus){
            Intent intent=new Intent(this,ContactUs.class);
            startActivity(intent);
            //Toast.makeText(getApplicationContext(),"ok 1",Toast.LENGTH_LONG).show();
            drawerLayout.closeDrawers();
            return false ;
        }else if(id==R.id.ourlocation){
            Intent intent=new Intent(getApplicationContext(),OurLocation.class);
            startActivity(intent);
            drawerLayout.closeDrawers();
            return false ;
        }else if(id==R.id.testimonial){
            Intent i=new Intent(this,Test.class);
            startActivity(i);
            drawerLayout.closeDrawers();
            return false ;
        }
        return false;
    }
    public void viewGallery(View view)
    {
        Intent intent=new Intent(getApplicationContext(),MyNewGallery.class);
        startActivity(intent);
    }
    public void contactUs(View view){
        Intent intent=new Intent(this,ContactUs.class);
        startActivity(intent);
    }
    public void testimonial(View view){
        Intent i=new Intent(this,Test.class);
        startActivity(i);
    }
    public  void location(View view){
        Intent intent=new Intent(getApplicationContext(),OurLocation.class);
        startActivity(intent);
    }
    public void social(View view)
    {
        Toast.makeText(getApplicationContext(),"Social Media",Toast.LENGTH_LONG).show();
    }
}
