package com.AM.whatsbug.activities;

import android.annotation.TargetApi;
import android.app.SearchManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;
import android.widget.Toast;

import com.AM.whatsbug.R;
import com.AM.whatsbug.adapters.CustomAdapter;
import com.AM.whatsbug.model.Search;
import com.AM.whatsbug.model.Searchmodel;

public class SearchActivity extends AppCompatActivity {

    private CustomAdapter customAdapter;
    ListView listView;
    Cursor cursor;
    Searchmodel studentRepo ;
    private final static String TAG= SearchActivity.class.getName().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        studentRepo = new Searchmodel(this);
        cursor=studentRepo.getStudentList();
        customAdapter = new CustomAdapter(SearchActivity.this,  cursor, 0);
        listView = (ListView) findViewById(R.id.lstStudent);
        listView.setAdapter(customAdapter);

        if(cursor==null) insertDummy();
    }

    private void insertDummy(){
        Search search= new Search();

        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Aeromonas hydrophila";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Alcaligenes faecalis";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Rod ] [ Arrangement Chains ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Bacillus cereus";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Rod ] [ Arrangement Chains ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Bacillus megaterium";
        studentRepo.insert(search);


        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Rod ] [ Arrangement Chains ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Bacillus subtilisg";
        studentRepo.insert(search);


        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Citrobacter freundii";
        studentRepo.insert(search);


        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Enterobacter aerogenes";
        studentRepo.insert(search);


        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Enterobacter cloacae";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Coccus ] [ Arrangement Chains ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Enterococcus faecalis";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Escherichia coli";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Klebsiella pneumoniae";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Coccus ] [ Arrangement Chains ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Lactococcus lactis";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Coccus ] [ Arrangement Clusters ] [ Pigments Yellow ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Micrococcus luteus";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Proteus mirabilis";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Proteus vulgaris";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments Blue/Green ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Pseudomonas aeruginosa";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments Yellow ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Pseudomonas fluorescens";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Salmonella typhimurium";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments Reddish orange ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Serratia marcescens";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Shigella dysentriae ";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Negative ] [ Morphology Rod ] [ Arrangement Single ] [ Pigments - ]";
        search.email="[Motility] [Catalase] [Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [H2S] [Starch] [Glucose] [Lactose] [Sucrose] [Mannitol] [Obligate aerobes/Facultative anaerobes] [Nitrate] [reduction]";
        search.name="Shigella flexneri";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Coccus ] [ Arrangement Clusters ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Staphylococcus aureus";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Coccus ] [ Arrangement Clusters ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Staphylococcus epidermidis";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Coccus ] [ Arrangement Chains ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Streptococcus pneumoniae";
        studentRepo.insert(search);

        studentRepo = new Searchmodel(this);
        search.age="[ Gram Positive ] [ Morphology Coccus ] [ Arrangement Chains ] [ Pigments - ]";
        search.email="[Motility] [Endospores] [Starch] [Hemolysis] [Catalase]\t[Oxidase] [Indole] [MR] [VP] [Citrate] [Urease] [Nitrate reduction] [Glucose] [Lactose] [Sucrose] [H2S] [Mannose] [Mannitol] [Obligate aerobes/Facultative anaerobes]";
        search.name="Streptococcus pyogenes";
        studentRepo.insert(search);

    }

    @Override
    public void onResume(){
        super.onResume();

    }

    @Override
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.options_menu, menu);


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            SearchManager manager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            SearchView search = (SearchView) menu.findItem(R.id.search).getActionView();
            search.setSearchableInfo(manager.getSearchableInfo(getComponentName()));

            search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                @Override
                public boolean onQueryTextSubmit(String s) {
                    Log.d(TAG, "onQueryTextSubmit ");
                    cursor=studentRepo.getStudentListByKeyword(s);
                    if (cursor==null){
                        Toast.makeText(SearchActivity.this,"No records found!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(SearchActivity.this, cursor.getCount() + " records found!",Toast.LENGTH_LONG).show();
                    }
                    customAdapter.swapCursor(cursor);

                    return false;
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    Log.d(TAG, "onQueryTextChange ");
                    cursor=studentRepo.getStudentListByKeyword(s);
                    if (cursor!=null){
                        customAdapter.swapCursor(cursor);
                    }
                    return false;
                }

            });

        }

        return true;

    }

}
