package com.example.basselhamieh.voice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img= (ImageView) findViewById(R.id.bassel);
        //img.animate().translationX(100).setDuration(15000);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
      /*  Intent intent = new Intent(this, Edit.class);
        EditText editText = (EditText) findViewById(R.id.title);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
 */    }
}
