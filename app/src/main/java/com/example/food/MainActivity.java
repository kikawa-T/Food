package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String foodname[] = {"りんご", "ばなな", "パイナップル", "イチゴ"};
    int foodprice[]  = {100, 1000, 500, 2000};

    /*private  static  final String[] foods = {
            "りんご", "ばなな", "パイナップル", "イチゴ"
    };*/

    public  class Food {
        long id;
        private String name;
        private  int price;
        private int imageId;
        private  int countButton;

        public  long getId() {
            return id;
        }

        public  void setId(long id) {
            this.id = id;
        }

        public  String getName() {
            return name;
        }


        public  void  setName(String name) {
            this.name = name;
        }

        public  int getPrice() {
            return price;
        }

        public  void setPrice(int price) {
            this.price = price;
        }

        public int getImageId(){
            return imageId;
        }

        public  void setImageId(int imageId) {
            this.imageId = imageId;
        }
        public int getCountButton() {
            return countButton;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       listView = (ListView)findViewById(R.id.listView);

       /* ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
        listView.setAdapter(arrayAdapter);*/

        ArrayList<Food> list = new ArrayList<>();
        MyAdapter myAdapter = new MyAdapter(MainActivity.this);

        myAdapter.setFoodList(list);
        listView.setAdapter(myAdapter);

        Food food = new Food();
        food.setName(foodname[0]);
        food.setPrice(foodprice[0]);
        food.setImageId(R.drawable.item1);
        list.add(food);

        Food food1 = new Food();
        food1.setName(foodname[1]);
        food1.setPrice(foodprice[1]);
        food1.setImageId(R.drawable.item2);
        list.add(food1);

        Food food2 = new Food();
        food2.setName(foodname[2]);
        food2.setPrice(foodprice[2]);
        food2.setImageId(R.drawable.item3);
        list.add(food2);



        /*ImageView iv = findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.item1);*/

        /*myAdapter.notifyDataSetChanged();
        food.setName(foodname[1]);
        food.setPrice(foodprice[1]);
        list.add(food);
        Food food1 = new Food();
        food1.setName(foodname[1]);
        food1.setPrice(foodprice[1]);
        list.add(food1);*/
        myAdapter.notifyDataSetChanged();
    }
}