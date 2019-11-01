package chetu.felixpat.pocketcodeapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import chetu.felixpat.pocketcodeapp.fragments.ArtsTutorialFragment;
import chetu.felixpat.pocketcodeapp.fragments.CppEditorFragment;
import chetu.felixpat.pocketcodeapp.fragments.CppTechNewsFragment;
import chetu.felixpat.pocketcodeapp.fragments.CppTutorialFragment;
import chetu.felixpat.pocketcodeapp.fragments.EditorFragment;
import chetu.felixpat.pocketcodeapp.fragments.ElectronicsTutorialFragment;
import chetu.felixpat.pocketcodeapp.fragments.HtmlEditorFragment;
import chetu.felixpat.pocketcodeapp.fragments.HtmlTechNewsFragment;
import chetu.felixpat.pocketcodeapp.fragments.HtmlTutorialFragment;
import chetu.felixpat.pocketcodeapp.fragments.JavaEditorFragment;
import chetu.felixpat.pocketcodeapp.fragments.JavaTechNewsFragment;
import chetu.felixpat.pocketcodeapp.fragments.JavaTutorialFragment;
import chetu.felixpat.pocketcodeapp.fragments.OthersTutorialFragment;
import chetu.felixpat.pocketcodeapp.fragments.PythonEditorFragment;
import chetu.felixpat.pocketcodeapp.fragments.PythonTechNewsFragment;
import chetu.felixpat.pocketcodeapp.fragments.PythonTutorialFragment;
import chetu.felixpat.pocketcodeapp.fragments.TechNewsFragment;
import chetu.felixpat.pocketcodeapp.fragments.TutorialFragment;

public class HolderActivity extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    ImageView header;
    AppBarLayout appBarLayout;
    int imageId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holder);

        Intent in =getIntent();
        Bundle bundle = in.getExtras();
        String name = bundle.getString("name");
        appBarLayout = (AppBarLayout) findViewById(R.id.activity_holder_appbar);
        tabLayout = (TabLayout) findViewById(R.id.activity_holder_tablayout);
        viewPager = (ViewPager) findViewById(R.id.activity_holder_viewpager);
        header = (ImageView) findViewById(R.id.activity_holder_header);





        switch(name){
            case "c":
                imageId = R.drawable.c;
                viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
                viewPagerAdapter.addFragments(new TutorialFragment(),"Tutorials");
                viewPagerAdapter.addFragments(new EditorFragment(),"Editors");
                viewPagerAdapter.addFragments(new TechNewsFragment(),"TechNews");
                break;
            case "cpp":
                imageId = R.drawable.cppf;
                viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
                viewPagerAdapter.addFragments(new CppTutorialFragment(),"Tutorials");
                viewPagerAdapter.addFragments(new EditorFragment(),"Editors");
                viewPagerAdapter.addFragments(new TechNewsFragment(),"TechNews");
                break;
            case "java":
                imageId = R.drawable.java;
                viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
                viewPagerAdapter.addFragments(new JavaTutorialFragment(),"Tutorials");
                viewPagerAdapter.addFragments(new JavaEditorFragment(),"Editors");
                viewPagerAdapter.addFragments(new JavaTechNewsFragment(),"TechNews");
                break;
            case "python":
                imageId = R.drawable.python;
                viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
                viewPagerAdapter.addFragments(new PythonTutorialFragment(),"Tutorials");
                viewPagerAdapter.addFragments(new PythonEditorFragment(),"Editors");
                viewPagerAdapter.addFragments(new PythonTechNewsFragment(),"TechNews");
                break;
            case "html":
                imageId = R.drawable.html;
                viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
                viewPagerAdapter.addFragments(new HtmlTutorialFragment(),"Tutorials");
                viewPagerAdapter.addFragments(new HtmlEditorFragment(),"Editors");
                viewPagerAdapter.addFragments(new HtmlTechNewsFragment(),"TechNews");
                break;
            case "others":
                imageId = R.drawable.others;
                viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
                viewPagerAdapter.addFragments(new OthersTutorialFragment(),"MBA");
                viewPagerAdapter.addFragments(new ArtsTutorialFragment(),"Arts");
                viewPagerAdapter.addFragments(new ElectronicsTutorialFragment(),"Electronics");
                break;
        }
        Picasso.with(this)
                .load(imageId)
                .into(header);


        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}
