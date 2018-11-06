package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void box(View view) {
        EditText Height = findViewById(R.id.ed_1);
        EditText Width = findViewById(R.id.ed_2);
        EditText Length = findViewById(R.id.ed_3);
        String h = Height.getText().toString();
        String w = Width.getText().toString();
        String l = Length.getText().toString();
        float height = Float.parseFloat(h);
        float width = Float.parseFloat(h);
        float length = Float.parseFloat(h);

        if (height <= 23 && width <= 14 && length <= 13) {
            float check = 3;
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
        } else {
            float check = 5;
            Intent intent = new Intent(this, ResultActivity2.class);
            startActivity(intent);
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}