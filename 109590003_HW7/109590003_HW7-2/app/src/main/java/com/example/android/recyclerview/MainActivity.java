/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.recyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.LinkedList;

/**
 * Implements a basic RecyclerView that displays a list of generated words.
 * - Clicking an item marks it as clicked.
 * - Clicking the fab button adds a new word to the list.
 */
public class MainActivity extends AppCompatActivity {
    private String[] name = new String[5];
    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<String> mWordList2 = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        // Put initial data into the word list.
        name[0] = "威靈頓牛排";
        name[1] = "香蕉太妃糖布丁";
        name[2] = "約克夏布丁";
        name[3] = "奶油麵包布丁";
        name[4] = "香辣牛排沙拉";
        for (int i = 0; i < 5; i++) {
            mWordList.addLast(name[i]);
        }
        mWordList2.addLast("威靈頓牛排是一道英國菜，將牛柳塗上鵝肝醬（或鴨肝醬），再蓋上酥皮烤焗而成。這道菜式的名稱相傳是以威靈頓公爵命名。 \n" +
                "俗稱「酥皮焗牛柳」。上好的菲力牛柳，大火煎上色。包上一層有鵝肝醬的蘑菇泥(Duxelles)，再包一層火腿後，用酥皮包裹並刷勻蛋黃液，入烤箱焗熟。");
        mWordList2.addLast("若是常常收看料理節目的話，一定不會對「地獄廚神」稱號的名廚高登・拉姆齊陌生。 \n" +
                "他在他的官網上公開了三種布丁的作法，這三種都是在他的餐廳中推出的甜點。 \n" +
                "讓我們來看看第一種：香蕉太妃糖布丁");
        mWordList2.addLast("若是常常收看料理節目的話，一定不會對「地獄廚神」稱號的名廚高登・拉姆齊陌生。 \n" +
                "他在他的官網上公開了三種布丁的作法，這三種都是在他的餐廳中推出的甜點。 \n" +
                "讓我們來看看第一種：約克夏布丁");
        mWordList2.addLast("若是常常收看料理節目的話，一定不會對「地獄廚神」稱號的名廚高登・拉姆齊陌生。 \n" +
                "他在他的官網上公開了三種布丁的作法，這三種都是在他的餐廳中推出的甜點。 \n" +
                "讓我們來看看第一種：奶油麵包布丁");
        mWordList2.addLast("Gordon shows how to cook steak perfectly - and turns it into a spicy beef salad. From Gordon's Ultimate Cookery Course. ");

        // Create recycler view.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mWordList, mWordList2);
        // Connect the adapter with the recycler view.
        mRecyclerView.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    /**
     * Inflates the menu, and adds items to the action bar if it is present.
     *
     * @param menu Menu to inflate.
     * @return Returns true if the menu inflated.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Handles app bar item clicks.
     *
     * @param item Item clicked.
     * @return True if one of the defined items was clicked.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // This comment suppresses the Android Studio warning about simplifying
        // the return statements.
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
