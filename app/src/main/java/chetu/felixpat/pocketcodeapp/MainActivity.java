package chetu.felixpat.pocketcodeapp;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;



public class MainActivity extends AppCompatActivity {

    ImageView c,cpp,java,python,html,others;
    String api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadIcons();
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               nextFragment("c");


            }
        });

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment("cpp");


            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment("java");

            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment("python");

            }
        });
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment("html");


            }
        });
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nextFragment("others");

            }
        });

    }


    public void nextFragment(String api)
    {
        Intent intent = new Intent(getApplicationContext(), HolderActivity.class);
        intent.putExtra("name",api);
        startActivity(intent);

    }

    public void loadIcons()
    {

        c = findViewById(R.id.main_activity_c);
        cpp = findViewById(R.id.main_activity_cpp);
        java = findViewById(R.id.main_activity_java);
        python = findViewById(R.id.main_activity_python);
        html = findViewById(R.id.main_activity_html);
        others = findViewById(R.id.main_activity_others);

        Picasso.with(this)
                .load(R.drawable.c)
                .into(c);
        Picasso.with(this)
                .load(R.drawable.cppf)
                .into(cpp);
        Picasso.with(this)
                .load(R.drawable.java)
                .into(java);
        Picasso.with(this)
                .load(R.drawable.python)
                .into(python);
        Picasso.with(this)
                .load(R.drawable.html)
                .into(html );
        Picasso.with(this)
                .load(R.drawable.others)
                .into(others );

    }


}
