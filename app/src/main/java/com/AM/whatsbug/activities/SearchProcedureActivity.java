package com.AM.whatsbug.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.AM.whatsbug.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchProcedureActivity extends AppCompatActivity {

    private ListView listView;
    private MyAppAdapter myAppAdapter;
    private ArrayList<Post> postArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedure_search);
        listView= (ListView) findViewById(R.id.listView);
        postArrayList=new ArrayList<>();
        postArrayList.add(new Post("INDOLE TEST",
                "PRINCIPLE:\n" +
                        "Indole test is performed to determine the ability of the organism to split tryptophan molecule into Indole. Indole is one of the metabolic degradation product of the amino acid tryptophan.Bacteria that possess the enzyme tryptophanase are capable of hydrolyzing and deaminating tryptophan with the production of Indole, Pyruvic acid and ammonia.\n" +
                        "\nPROPERTY IT TESTS FOR:\n"+"This test is performed to help differentiate species of the family Enterobacteriaceae.\n" +
                        "\nMEDIA AND REAGENTS USED:\n"+"1.Tryptone broth contains tryptophan." +
                        "\n2.Kovac’s reagent—contains hydrochloric acid, dimethylaminobenzaldehyde, and amyl alcohol—yellow in color.\n" +
                        "\nPROCEDURE:\n"+"1.Inoculate Tryptone broth with the test organism and incubate for 18 to 24 hrs at 37c." +
                        "\n2.Add 15 drops of Kovac’s reagent down the inner wall of the tube.\n" +
                        "\nRESULT INTERPRETATION:\n"+"Development of bright red color at the interface of the reagent and the broth within seconds after adding the reagent is indicative of the presence of Indole and is a positive test"));
        postArrayList.add(new Post("METHYL RED/VOGES‐PROSKAUER (MR/VP)",
                "PRINCIPLE:\n" +
                        "To test the ability of the organism to produce and maintain stable acid end products from glucose fermentation and to overcome the buffering capacity of the system, This is a qualitative test for acid production." +
                        "\nPROPERTY IT TESTS FOR:\n"+"Both tests are used to differentiate species of the family Enterobacteriaceae.\n" +
                        "\nMEDIA AND REAGENTS USED:\n"+"1.Glucose Broth\n"+"2.Methyl Red indicator for MR test\n"+"3.Voges Proskauer reagents‐A: 5% Alpha‐Naphthol & ethanol, B: Potassium Hydroxide; (3:1 ratio) & Deionized Water.\n" +
                        "\nPROCEDURE:\n"+"1.Inoculate the MR/VP broth with a pure culture of the test organism and incubate at 35°for 48 to 72 hrs." +
                        "\n2.Add 5 drops of MR reagent to the broth.\n" +
                        "\nRESULT INTERPRETATION:" +
                        "\n1.Positive result is red (indicating pH below 6)." +
                        "\n2.Negative result is yellow (indicating no acid production)."));
        postArrayList.add(new Post("VOGES PROSKAUER TEST (ACETOIN PRODUCTION)",
                "PRINCIPLE:\n" +
                        "To determine the ability of the organisms to produce neutral end product acetyl methyl carbinol(acetoin) from glucose fermentation.\n" +
                        "\nPROCEDURE:\n"+"1.Innoculatepure culture of the test organism into MR/VP broth and incubate for 24 hrs at 37°c." +
                        "\n2.Aliquot 1 ml of the broth to a sterile test tube and add 0.6ml of VP(A) followed by 0.2ml of VP(B)." +
                        "\n3.Shake the tube gently to expose the medium to atmospheric oxygen and allow the tube to remain undisturbed for 10 to 15 mins.\n"+
                        "\nRESULT INTERPRETATION:"+
                        "\n1.Positive result is Pinkish red color at the surface of the medium" +
                        "\n2.Negative result is Yellow color at the surface of the medium"));
        postArrayList.add(new Post("CITRATE TEST",
                "PRINCIPLE:\n" +
                        "The test organism is cultured in a medium which contains sodium citrate, an ammonium salt and the indicator bromothymol blue. Growth in the medium is shown by turbidity and a change in colour of the indicator from light green to blue, due to alkaline reaction following citrate utilization.\n" +
                        "\nPROCEDURE:\n"+"Inoculum is streaked over the slant of Simmon’s citrate agar in a tube and incubated for 24‐48 hrs."+
                        "\nRESULT INTERPRETATION:"+
                        "\nGrowth on the slant and change in colour to blue of the medium indicates positive result."));
        postArrayList.add(new Post("OXIDATION‐FERMENTATION (OF) TEST(HUGH & LEIFSON)",
                "PRINCIPLE:\n" +
                        "Oxidation‐Fermentation test is used to determine the oxidative or fermentative metabolism of a carbohydrate or its non utilization. Fermentation is a anaerobic process and bacterial fermentersof carbohydrates are usually facultative anaerobes. Oxidation is a aerobic process and bacterial oxidisersare usually strict aerobes.\n" +
                        "\nPROCEDURE:\n"+"1.The method described, sometimes referred to as the Hugh and Leifsontest employs a semi‐solid medium in tubes containing the carbohydrate under test (usually glucose) and a pH indicator." +
                        "\n2.Two tubes are inoculated and one is immediately sealed with paraffin oil to produce anaerobic conditions.\n"+
                        "\nRESULT INTERPRETATION:"+
                        "\n1.Oxidising organisms, eg Pseudomonasspecies, produce an acid reaction in the open tube only." +
                        "\n2.Fermenting organisms, eg Enterobacteriaceae, produce an acid reaction throughout the medium in both tubes." +
                        "\n3.Organisms that cannot break down the carbohydrate aerobically or anaerobically, eg., Alcaligenes faecalis, produce an alkaline reaction in the open tube and no change in the covered tube."));
        postArrayList.add(new Post("MOTILITY TEST",
                "HOW TO PERFORM TEST:\n" +
                        "Stab motility media with inoculating needle.\n" +
                        "\nPROPERTY IT TESTS FOR:\n"+"This test is done to help differentiate species of bacteria that are motile from non‐motile.\n" +
                        "\nMEDIA AND REAGENTS USED:\n"+"1.Motility media contains tryptose\n"+"2.sodium chloride\n"+"3.agar\n"+"4.a color indicator\n"+
                        "\nRESULT INTERPRETATION:" +
                        "\nIf bacteria is motile, there will be growth going out away from the stab line, and test is positive. If bacteria is not motile, there will only be growth along the stab line. A colored indicator can be used to make the results easier to see."));
        postArrayList.add(new Post("LACTOSE FERMENTATION",
                "HOW TO PERFORM TEST:\n" +
                        "Inoculate lactose broth with inoculating loop.\n" +
                        "\nPROPERTY IT TESTS FOR:\n"+"This tests for the bacteria’s ability to ferment lactose.\n" +
                        "\nMEDIA AND REAGENTS USED:\n"+"1.Lactose broth contains beef extract\n"+"2.gelatin peptone\n"+"3.lactose\n"+"4.A phenol red indicator is added to indicate acid production from fermentation\n"+
                        "\nRESULT INTERPRETATION:" +
                        "\n1.A positive result is yellow after indicator is added (indicating lactose fermentation)" +
                        "\n2.A negative result will have no color change or will be reddish."));
        postArrayList.add(new Post("SUCROSE FERMENTATION",
                "HOW TO PERFORM TEST:\n" +
                        "Inoculate sucrose broth with inoculating loop.\n" +
                        "\nPROPERTY IT TESTS FOR:\n"+"1.This test is done to help differentiate species of the family Enterobacteriaceae\n" +
                        "\n2.This tests the bacteria’s ability to ferment sucrose and production of acid end‐product\n"+
                        "\nMEDIA AND REAGENTS USED:\n"+"1.Sucrose broth contains beef extract\n"+"2.gelatin peptone\n"+"3.sucrose\n"+"4.Phenol red indicator is added to indicate an acid end‐product\n"+
                        "\nRESULT INTERPRETATION:" +
                        "\n1.A positive result is yellow after indicator is added (indicating sucrose fermentation)" +
                        "\n2.A negative result has no color change or is reddish."));
        postArrayList.add(new Post("GLUCOSE FERMENTATION & GAS PRODUCTION",
                "HOW TO PERFORM TEST:\n" +
                        "Inoculate sucrose broth with inoculating loop.\n" +
                        "\nPROPERTY IT TESTS FOR:\n"+"1.This test is done to help differentiate species of the family Enterobacteriaceae.\n" +
                        "\n2.This tests for the bacteria’s ability to ferment glucose and produce gas and/or an acid end‐product.\n"+
                        "\nMEDIA AND REAGENTS USED:\n"+"1.Glucose broth contains beef extract\n"+"2.gelatin peptone\n"+"3.glucose\n"+"4.A phenol red indicator is added to indicate an acid end‐product\n"+"5.A Durham tube is added to indicate gas production\n"+
                        "\nRESULT INTERPRETATION:" +
                        "\n1.A positive result for acid is yellow after indicator is added (indicating glucose fermentation)" +
                        "\n2.A positive result for gas is a bubble in the Durham tube" +
                        "\n3.A completely negative result has no color change or reddish color and no bubble"));


        myAppAdapter=new MyAppAdapter(postArrayList,SearchProcedureActivity.this);
        listView.setAdapter(myAppAdapter);
    }

    public class MyAppAdapter extends BaseAdapter {

        public class ViewHolder {
            TextView txtTitle,txtSubTitle;


        }

        public List<Post> parkingList;

        public Context context;
        ArrayList<Post> arraylist;

        private MyAppAdapter(List<Post> apps, Context context) {
            this.parkingList = apps;
            this.context = context;
            arraylist = new ArrayList<Post>();
            arraylist.addAll(parkingList);

        }

        @Override
        public int getCount() {
            return parkingList.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;
            ViewHolder viewHolder;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.item_post, null);
                // configure view holder
                viewHolder = new ViewHolder();
                viewHolder.txtTitle = (TextView) rowView.findViewById(R.id.title);
                viewHolder.txtSubTitle = (TextView) rowView.findViewById(R.id.subtitle);
                rowView.setTag(viewHolder);

            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            viewHolder.txtTitle.setText(parkingList.get(position).getPostTitle() + "");
            viewHolder.txtSubTitle.setText(parkingList.get(position).getPostSubTitle() + "");
            return rowView;


        }

        public void filter(String charText) {

            charText = charText.toLowerCase(Locale.getDefault());

            parkingList.clear();
            if (charText.length() == 0) {
                parkingList.addAll(arraylist);

            } else {
                for (Post postDetail : arraylist) {
                    if (charText.length() != 0 && postDetail.getPostTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
                        parkingList.add(postDetail);
                    }

                    else if (charText.length() != 0 && postDetail.getPostSubTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
                        parkingList.add(postDetail);
                    }
                }
            }
            notifyDataSetChanged();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search_procedure, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        //*** setOnQueryTextFocusChangeListener ***
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String searchQuery) {
                myAppAdapter.filter(searchQuery.toString().trim());
                listView.invalidate();
                return true;
            }
        });

//        MenuItemCompat.setOnActionExpandListener(searchItem, new MenuItemCompat.OnActionExpandListener() {
//            @Override
//            public boolean onMenuItemActionCollapse(MenuItem item) {
//                // Do something when collapsed
//                return true;  // Return true to collapse action view
//            }
//
//            @Override
//            public boolean onMenuItemActionExpand(MenuItem item) {
//                // Do something when expanded
//                return true;  // Return true to expand action view
//            }
//        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
