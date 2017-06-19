package ru.elleriumsoft.studyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class First extends AppCompatActivity
{
    ExpandableListView expListView;
    ExpandableListAdapter expListAdapter;
    List<String> expListTitle;
    HashMap<String, List<String>> expListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        expListView = (ExpandableListView) findViewById(R.id.expListView);
        expListDetail = ListData.loadData();

        expListTitle = new ArrayList<>(expListDetail.keySet());
        expListAdapter = new ListAdapter(this, expListTitle, expListDetail);

        expListView.setAdapter(expListAdapter);
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expListTitle.get(groupPosition) + " Список раскрыт.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expListTitle.get(groupPosition) + " Список скрыт.",
                        Toast.LENGTH_SHORT).show();

            }
        });

        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(getApplicationContext(),
                        expListTitle.get(groupPosition)
                                + " : " + expListDetail.get(expListTitle.get(groupPosition))
                                .get(childPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
