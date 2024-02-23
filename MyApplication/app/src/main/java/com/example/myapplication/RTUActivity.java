package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class RTUActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtuactivity2);

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setNavigationBarColor(ContextCompat.getColor(this,R.color.background));
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.background));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        String[] dataset = {
                "Bagels Cheddar cheese",
                "Bagels Seseme",
                "Bagels Plain",
                "Bagels Cinnamon raisin",
                "Bagels Blueberry",
                "Bagels Everything",
                "Bagels Multigrain",
                "Bagels Jalapeno cheddar",
                "Montreal Bagels",
                "Byblos Cheddar cheese",
                "Byblos Seseme",
                "Byblos Cinnamon raisin",
                "Byblos Plain",
                "Byblos Blueberry",
                "Byblos Everything",
                "Byblos Multigrain",
                "Ozery Bak Mrng rounds Cranberry orange",
                "Ozery Bak Mrng rounds Apple cinnamon",
                "Oakrun farm crumpets",
                "Comp cornbread loaf bread",
                "Doughnuts Sugar",
                "Doughnuts Plain",
                "Doughnuts Cinnamon",
                "Gumdrop loaf",
                "Blueberry Loaf",
                "Apple cinnamon loaf",
                "Lemon loaf",
                "Lemon loaf sliced",
                "Banana loaf",
                "Sliced banana",
                "Two bite cinnamon rolls",
                "Coconut macaroon bites",
                "Fudge Brownie Bites",
                "Fudge brownie bites big",
                "Cinnamon Rolls Big",
                "Lemon squares",
                "7 layer squares",
                "Brownie squares",
                "PetitFr Donut raspberry",
                "Angel food cake",
                "Angel food cake mini",
                "Golden Pound Cake",
                "Iced Pound Cake",
                "Dessert Shells",
                "School Safe Birthday cake",
                "School Safe Brownie",
                "School Safe Banana chocolate chip",
                "School Safe Blueberry",
                "Raisin Tarts",
                "Pecan Tarts",
                "Panjimi naan original",
                "Panjimi Naan Garlic",
                "Panjimi mini naan",
                "Comp naan rounds original",
                "Compliments Appetizer Flat Bread",
                "Panache mini naan",
                "Panache naan",
                "Panache roasted garlic naan",
                "Panache Caramiz Onion",
                "Comp pita white mini",
                "Comp pita small greek",
                "Comp pita small white",
                "Fanpocket pita small original",
                "Fanpocket pita small Whole Wheat",
                "Pizza Crust Circle",
                "Pizza Crust Square",
                "Choco chip Muffins",
                "Carrot Muffins",
                "Blueberry Muffins",
                "Raisin Bran Muffins",
                "Lemon cranberry Muffins",
                "Double Choc Muffins",
                "Banana chocolate chunk Muffins",
                "Variety pack Muffins",
                "Blueberry mini Muffins",
                "Chocolate chip mini Muffins",
                "Carrot mini Muffins",
                "Cinnamon coffee cake",
                "Double Berry Greek yogurt Muffins",
                "West Coast Trail Mix Muffins",
                "NSA BLUEBERRY",
                "NSA Rhubarb Strawberry",
                "NSA Apple",
                "Comp pie Pecan",
                "Comp pie northern spy Apple",
                "Comp pie rhubarb strawberry",
                "Comp pie apple crumble",
                "Comp pie Blueberry",
                "Comp pie Pumpkin",
                "Comp pie Mincemeat",
                "Comp pie cherry pie",
                "TableTalk Apple Caramel",
                "TableTalk Apple Raspberry"
        };

        recyclerView.setAdapter(new RecyclerViewAdapter(dataset, RTUActivity.this));
    }
}