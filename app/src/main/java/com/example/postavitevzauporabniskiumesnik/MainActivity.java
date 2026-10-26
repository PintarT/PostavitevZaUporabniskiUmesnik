package com.example.postavitevzauporabniskiumesnik;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_COUNT = "state_count";

    private int mCount = 0;
    private TextView mShowCount;
    private MaterialButton mButtonZero;
    private MaterialButton mButtonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mShowCount = findViewById(R.id.show_count);
        MaterialButton buttonToast = findViewById(R.id.button_toast);
        mButtonZero = findViewById(R.id.button_zero);
        mButtonCount = findViewById(R.id.button_count);

        buttonToast.setOnClickListener(v -> showToast());
        mButtonCount.setOnClickListener(v -> countUp());
        mButtonZero.setOnClickListener(v -> resetZero());

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt(STATE_COUNT, 0);
        }

        updateUI();
    }

    private void showToast() {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    private void countUp() {
        mCount++;
        updateUI();
    }

    private void resetZero() {
        mCount = 0;
        updateUI();
    }

    private void updateUI() {
        if (mShowCount != null) {
            mShowCount.setText(String.valueOf(mCount));
        }

        if (mCount == 0) {
            if (mButtonZero != null) {
                mButtonZero.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(this, R.color.btn_gray)));
            }
            if (mButtonCount != null) {
                mButtonCount.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(this, R.color.primary_blue)));
            }
        } else {
            if (mButtonZero != null) {
                mButtonZero.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(this, R.color.btn_pink)));
            }
            if (mButtonCount != null) {
                mButtonCount.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(this, R.color.btn_green)));
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_COUNT, mCount);
    }
}