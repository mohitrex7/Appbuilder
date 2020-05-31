package application.example.appbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Animation uptodown;
    RelativeLayout line1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        line1=(RelativeLayout) findViewById(R.id.line1);
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        line1.setAnimation(uptodown);
    }
    public void clickToContinue(View view)
    {
        EditText myuser= (EditText)findViewById(R.id.myuser);
        EditText mypass= (EditText)findViewById(R.id.mypass);

        String user=myuser.getText().toString();
        String pass=mypass.getText().toString();

        String duser="admin";
        String dpass="password";

        if(user.equals(duser)  && pass.equals(dpass))
        {
            Intent intent=new Intent(getApplicationContext(),myNavigation.class);
            startActivity(intent);
        }
        else
            Toast.makeText(getApplicationContext(),"Invalid User/Password",Toast.LENGTH_LONG).show();

    }
}
