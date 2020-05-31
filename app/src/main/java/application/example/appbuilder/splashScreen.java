package application.example.appbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class splashScreen extends AppCompatActivity {

    LinearLayout l1,l2;
    Button login;
    Animation uptodown,downloadtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        login=(Button) findViewById(R.id.login);
        l1=(LinearLayout) findViewById(R.id.l1);
        l2=(LinearLayout) findViewById(R.id.l2);
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downloadtoup= AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downloadtoup);
    }
    public void returntologin(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Login.class);
        startActivity(intent);
    }
}
