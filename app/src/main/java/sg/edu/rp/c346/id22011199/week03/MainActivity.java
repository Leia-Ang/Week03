package sg.edu.rp.c346.id22011199.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Step 1 - Declare variables
    TextView tvDisplay;
    Button buttonDisplay;
    EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        buttonDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.EditTextInput);
    }
}