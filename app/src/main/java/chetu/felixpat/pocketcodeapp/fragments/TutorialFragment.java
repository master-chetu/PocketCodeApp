package chetu.felixpat.pocketcodeapp.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import chetu.felixpat.pocketcodeapp.R;
import chetu.felixpat.pocketcodeapp.WebActivity;

public class TutorialFragment extends Fragment {


    ListView listView;
    List<String> names;
    View view;
    ArrayAdapter<String> arrayAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_tutorial, container, false);
        names = new ArrayList<>();
        names.add("Tutorials Point");
        names.add("Hacker Rank");
        names.add("C For Free");
        names.add("Study C");

        listView = (ListView) view.findViewById(R.id.fragment_tutorial_list);
        arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,names);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putInt("position",i);
                bundle.putString("name","tutorial");
                bundle.putString("domain","c");
                Intent in = new Intent(getActivity(), WebActivity.class);
                in.putExtra("bundle",bundle);
                startActivity(in);

            }
        });


        return view;
    }

}
