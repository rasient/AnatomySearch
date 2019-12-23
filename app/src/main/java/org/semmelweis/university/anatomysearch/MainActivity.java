package org.semmelweis.university.anatomysearch;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ortiz.touchview.TouchImageView;

import java.util.Objects;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    private Integer currentFragmentKey;
    private AutoCompleteTextView searchAutoCompleteTextView;
    private TextView textView;
    private TouchImageView touchImageView;
    private TouchImageView touchImageSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchAutoCompleteTextView=findViewById(R.id.search_autocomplete);
        searchAutoCompleteTextView.setOnItemClickListener((parent, v, position, id) -> hideKeyboardAndSearch());

        findViewById(R.id.search_cancel).setOnClickListener(v -> {
            searchAutoCompleteTextView.setText("");
            currentFragmentKey = null;
        });

        textView=findViewById(R.id.search_textview);
        touchImageView=findViewById(R.id.search_touchimageview);
        touchImageSelector=findViewById(R.id.select_touchimageview);
        touchImageSelector.setOnTouchImageViewListener(() -> touchImageView.setZoom(touchImageSelector));

        initAutoCompleteTextView(searchAutoCompleteTextView);
    }

    private void initAutoCompleteTextView(AutoCompleteTextView searchAutoCompleteTextView) {
        searchAutoCompleteTextView.setOnKeyListener((v, keyCode, event) -> {
            // If the event is a key-down event on the "enter" button
            if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                    (keyCode == KeyEvent.KEYCODE_ENTER)) {
                hideKeyboardAndSearch();
                return true;
            } else if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                    (keyCode != KeyEvent.KEYCODE_ENTER)) {
                currentFragmentKey = null;
            }
            return false;
        });
        searchAutoCompleteTextView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, SearchConstant.fragmentMap.keySet().toArray()));
    }

    private void hideKeyboardAndSearch() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        Objects.requireNonNull(imm).hideSoftInputFromWindow(searchAutoCompleteTextView.getWindowToken(), 0);
        showImageAndWritePart(null);
    }

    private void showImageAndWritePart(String arrow) {
        String text = searchAutoCompleteTextView.getText().toString();
        TreeMap<Integer,SearchDto> fragmentMap=SearchConstant.fragmentMap.get(text);
        if (fragmentMap != null) {
            Integer fragmentKey = arrow == null || currentFragmentKey == null || (SearchConstant.ARROW_UP.equals(arrow) && fragmentMap.lowerKey(currentFragmentKey) == null)  || (SearchConstant.ARROW_DOWN.equals(arrow) && fragmentMap.higherKey(currentFragmentKey) == null) ? fragmentMap.firstKey() :
                    (SearchConstant.ARROW_UP.equals(arrow) ? fragmentMap.lowerKey(currentFragmentKey) : fragmentMap.higherKey(currentFragmentKey));
            textView.setText(Objects.requireNonNull(fragmentMap.get(fragmentKey)).getPictureName());
            touchImageView.setImageResource(fragmentKey);
            touchImageSelector.setImageResource(Objects.requireNonNull(fragmentMap.get(fragmentKey)).getSelectorImageId() == null ? R.drawable.blank : fragmentMap.get(fragmentKey).getSelectorImageId());
            currentFragmentKey=fragmentKey;
        } else {
            textView.setText("N/A");
            touchImageView.setImageResource(R.drawable.blank);
            touchImageSelector.setImageResource(R.drawable.blank);
        }
    }
}
