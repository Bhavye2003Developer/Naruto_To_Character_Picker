package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.imageView);
        Button button = findViewById(R.id.next);
        CheckBox is_order = findViewById(R.id.is_order);
        Button order = findViewById(R.id.order);
        TextView name_character, result;
        name_character = findViewById(R.id.name_character);
        result = findViewById(R.id.result);

        final int[] resource_id = {R.drawable.hashirama};
        name_character.setText("Hashirama");
        result.setText("You Have not Ordered This Character!!!");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resource_id[0] ==R.drawable.hashirama){
                    is_order.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            order.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (is_order.isChecked()){
                                        result.setText("You Have Ordered This Character");
                                    }
                                    else{
                                        result.setText("You Have not Ordered This Character!!!");
                                    }
                                }
                            });
                        }
                    });
                    resource_id[0] = R.drawable.madara;
                    image.setImageResource(resource_id[0]);
                    name_character.setText("Madara");
                }
                else{
                    is_order.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            order.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (is_order.isChecked()){
                                        result.setText("You Have Ordered This Character");
                                    }
                                    else{
                                        result.setText("You Have not Ordered This Character!!!");
                                    }
                                }
                            });
                        }
                    });
                    resource_id[0] = R.drawable.hashirama;
                    image.setImageResource(resource_id[0]);
                    name_character.setText("Hashirama");
                }
            }
        });
    }
}