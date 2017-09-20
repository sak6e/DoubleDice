package dice.sakstudio.com.doubledice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rollButton;
    private TextView dice1,dice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] nos={".",":","...","::",":.:",":::"};

        rollButton = (Button)findViewById(R.id.buttonId);
        dice1= (TextView)findViewById(R.id.textView);
        dice2= (TextView)findViewById(R.id.textView2);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand= new Random();
                int randno1= rand.nextInt(nos.length);
                int randno2= rand.nextInt(nos.length);
                dice1.setText(nos[randno1]);
                dice2.setText(nos[randno2]);
            }
        });

    }
}
