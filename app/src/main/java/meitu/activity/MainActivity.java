package meitu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.meitu.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, TextWatcher {
    private static final String TAG = "MainActivity";
    private Button btStart;
    private EditText etPassword;
    private AutoCompleteTextView etUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btStart = findViewById(R.id.bt_start);
        btStart.setOnClickListener(this);
        etPassword = findViewById(R.id.et_password);
        etUserName = findViewById(R.id.ed_username);
        etPassword.addTextChangedListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_start:
                switchOn();
                break;
            default:
                break;
        }
    }

    private void switchOn() {
        Toast.makeText(this, "点击登录", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, LoaginActivity.class));
        finish();
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Log.d(TAG, "beforeTextChanged: 调用");
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.d(TAG, "onTextChanged: 调用");

    }

    @Override
    public void afterTextChanged(Editable s) {
        String username = etUserName.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        if (!TextUtils.isEmpty(username) & !TextUtils.isEmpty(password)) {
            btStart.setEnabled(true);
        } else {
            btStart.setEnabled(false);
        }
    }
}
