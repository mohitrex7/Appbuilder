package application.example.appbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }
    public void submitForm(View view)
    {
        Toast.makeText(getApplicationContext(),"Submitted",Toast.LENGTH_LONG).show();
    }
}
