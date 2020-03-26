package fajardo.mcm.edu.ph.dataattempt1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView w1 , w2 ,w3;
    forPrompts gen;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w1 = findViewById(R.id.textView);
        w2 = findViewById(R.id.textView2);
        w3 = findViewById(R.id.textView3);
        button = findViewById(R.id.button);

        //Random r = new Random();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] verBs = getBaseContext().getResources().getStringArray(R.array.Verbs);
                String[] subj = getBaseContext().getResources().getStringArray(R.array.Subj);

                String ra = verBs [new Random().nextInt(verBs.length)];
                String ra2 = subj [new Random().nextInt(subj.length)];

                // Arrays.asList(VerBs); Array List method na wala nko nasabtan haahaah
                // List list = Arrays.asList(); nakuha na unsaon
                // List verbilist = Arrays.asList(R.array.Verbs);
                // List subjlist = Arrays.asList(R.array.Subj);

                gen = new forPrompts("Scenery" , "kahit ano lol" , "oof-");

                gen.setCategory(String.valueOf(R.array.Categories));
                gen.setWords(String.valueOf(ra));
                gen.setWords1(String.valueOf(ra2));

                w2.setText(gen.getWords());
                w3.setText(gen.getWords1());

            }
        });




    }
}
