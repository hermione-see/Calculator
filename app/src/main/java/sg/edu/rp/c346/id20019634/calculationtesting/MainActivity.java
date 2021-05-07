package sg.edu.rp.c346.id20019634.calculationtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btnAdd;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        btnAdd = findViewById(R.id.buttonAdd);
        btnMinus = findViewById(R.id.buttonMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.result);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = num1.getText().toString();
                String strNum2 = num2.getText().toString();

                int numb1 = Integer.parseInt(strNum1);
                int numb2 = Integer.parseInt(strNum2);

                int result = numb1 + numb2;

                tvResult.setText("" + result);

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = num1.getText().toString();
                String strNum2 = num2.getText().toString();

                int numb1 = Integer.parseInt(strNum1);
                int numb2 = Integer.parseInt(strNum2);

                int result = numb1 - numb2;

                tvResult.setText("" + result);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = num1.getText().toString();
                String strNum2 = num2.getText().toString();

                int numb1 = Integer.parseInt(strNum1);
                int numb2 = Integer.parseInt(strNum2);

                int result = numb1 * numb2;

                tvResult.setText("" + result);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = num1.getText().toString();
                String strNum2 = num2.getText().toString();

                int numb1 = Integer.parseInt(strNum1);
                int numb2 = Integer.parseInt(strNum2);

                int result = numb1/numb2;

                tvResult.setText("" + result);
            }
        });

    }
}