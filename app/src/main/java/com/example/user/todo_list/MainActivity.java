package com.example.user.todo_list;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    Button btnSubmit;
    Button btnFinished;
    EditText editTodo;
    TextView textToday;
    TextView textQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnFinished = (Button) findViewById(R.id.btnFinished);
        editTodo = (EditText) findViewById(R.id.editTodo);
        textToday = (TextView) findViewById(R.id.textToday);
        textQuestion = (TextView) findViewById(R.id.textQuestion);

        btnSubmit.setOnClickListener(submit);
        btnFinished.setOnClickListener(finished);
    }

    View.OnClickListener submit = new View.OnClickListener() {
        public void onClick(View v) {
            // onclick submit button
            String todo = editTodo.getText().toString();
            textToday.setText(todo);
            editTodo.setText("");
        }
    };
    View.OnClickListener finished = new View.OnClickListener() {
        public void onClick(View v) {
            // onclick finished todo button
            String todo = "";
            textToday.setText(todo);
        }
    };
}
