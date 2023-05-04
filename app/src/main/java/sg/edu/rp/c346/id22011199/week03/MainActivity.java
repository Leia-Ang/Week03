package sg.edu.rp.c346.id22011199.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // Step 1 - Declare variables
    TextView tvDisplay;
    Button buttonDisplay;
    EditText etInput;

    ToggleButton tbtn;

    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        buttonDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.EditTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);


        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();

                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    String maleResponse="He says" + stringResponse;
                    tvDisplay.setText(stringResponse);



                } else{
                    // Write the code when female selected
                    String femaleResponse="She says" + stringResponse;
                    tvDisplay.setText(stringResponse);

                }




            }
        });




        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                // get state of the toggle button
                boolean isChecked = tbtn.isChecked();
                if(isChecked) {
                    etInput.setEnabled(true);
                }else {
                    etInput.setEnabled(false);
                }
                //when toggle button is unchecked, disable the EditText
                //when the toggle button is checked, enable the editText







            }
        });


    }
}