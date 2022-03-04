package nl.biancavanschaik.prefabtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView answerView = findViewById(R.id.my_answer);
        answerView.setText("The answer is: " + getTheAnswer());
    }

    int getTheAnswer() {
        return new AppLib().intFromJNI();
    }
}