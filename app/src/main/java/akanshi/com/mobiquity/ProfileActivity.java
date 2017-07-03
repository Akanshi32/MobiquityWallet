package akanshi.com.mobiquity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import com.ramotion.foldingcell.FoldingCell;

public class ProfileActivity extends AppCompatActivity {



            int height, width;
            //private BottomBar bottomBar;
            Integer toggle = 0;
            FloatingActionButton fab;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_profile);
                fab= (FloatingActionButton) findViewById(R.id.fab);



                Display display = getWindowManager().getDefaultDisplay();
                Point size = new Point();
                display.getSize(size);
                height = size.y;
                width = size.x;


                final FoldingCell fc = (FoldingCell) findViewById(R.id.folding_cell);
                // attach click listener to folding cell
                fc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fc.toggle(false);

                         }
                });

                // get our folding cell
// set custom parameters
                fc.initialize(1000, Color.RED, 2);
// or with camera height parameter
                fc.initialize(30, 1000, Color.RED, 2);


                final FoldingCell fc1 = (FoldingCell) findViewById(R.id.folding_cell1);
                // attach click listener to folding cell
                fc1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fc1.toggle(false);
                    }
                });

                // get our folding cell
// set custom parameters
                fc1.initialize(1000, Color.RED, 2);
// or with camera height parameter
                fc1.initialize(30, 1000, Color.RED, 2);


                final FoldingCell fc2 = (FoldingCell) findViewById(R.id.folding_cell2);
                // attach click listener to folding cell
                fc2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fc2.toggle(false);
                    }
                });

                // get our folding cell
// set custom parameters
                fc2.initialize(1000, Color.RED, 2);
// or with camera height parameter
                fc2.initialize(30, 1000, Color.RED, 2);


                final FoldingCell fc3 = (FoldingCell) findViewById(R.id.folding_cell3);
                // attach click listener to folding cell
                fc3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fc3.toggle(false);
                    }
                });

                // get our folding cell
// set custom parameters
                fc3.initialize(1000, Color.RED, 2);
// or with camera height parameter
                fc3.initialize(30, 1000, Color.RED, 2);

                final FoldingCell fc4 = (FoldingCell) findViewById(R.id.folding_cell4);
                // attach click listener to folding cell
                fc4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fc4.toggle(false);
                    }
                });

                // get our folding cell
// set custom parameters
                fc4.initialize(1000, Color.RED, 2);
// or with camera height parameter
                fc4.initialize(30, 1000, Color.RED, 2);

                final FoldingCell fc5 = (FoldingCell) findViewById(R.id.folding_cell5);
                // attach click listener to folding cell
                fc5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fc5.toggle(false);
                    }
                });

                // get our folding cell
// set custom parameters
                fc5.initialize(1000, Color.RED, 2);
// or with camera height parameter
                fc5.initialize(30, 1000, Color.RED, 2);
















               /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);*/
                /*final NestedScrollView scrollView = (NestedScrollView) findViewById(R.id.scroll);
                scrollView.setSmoothScrollingEnabled(true);*/
               /* final FoldingCell fc = (FoldingCell) findViewById(R.id.folding_cell);
                // attach click listener to folding cell
                fc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fc.toggle(false);
                    }
                });

                // get our folding cell
// set custom parameters
                fc.initialize(1000, Color.MAGENTA, 2);
// or with camera height parameter
                fc.initialize(30, 1000, Color.RED, 2);
*/

       /* bottomBar = BottomBar.attachShy((CoordinatorLayout) findViewById(R.id.about_coordinator), findViewById(R.id.about_nested_scrolling), savedInstanceState);
        bottomBar.setMaxFixedTabs(3);
        bottomBar.noTopOffset();
        bottomBar.setItems(R.menu.bottombar_about);
*/
               /* Fragment fragment = null;
                Class fragmentClass;
                fragmentClass = AboutTeamFragment.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.about_fragment_container, fragment).commit();*/
/*
        bottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(int menuItemId) {
                if (menuItemId == R.id.bottom_bar_about_riviera) {
                    Fragment fragment = null;
                    Class fragmentClass;
                    fragmentClass = AboutRivieraFragment.class;
                    try {
                        fragment = (Fragment) fragmentClass.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.about_fragment_container, fragment).commit();
                } else if (menuItemId == R.id.bottom_bar_about_university) {
                    Fragment fragment = null;
                    Class fragmentClass;
                    fragmentClass = AboutUniversityFragment.class;
                    try {
                        fragment = (Fragment) fragmentClass.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.about_fragment_container, fragment).commit();
                } else if (menuItemId == R.id.bottom_bar_about_team) {
                    Fragment fragment = null;
                    Class fragmentClass;
                    fragmentClass = AboutTeamFragment.class;
                    try {
                        fragment = (Fragment) fragmentClass.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.about_fragment_container, fragment).commit();
                } else if (menuItemId == R.id.bottom_bar_about_team2) {
                    Fragment fragment = null;
                    Class fragmentClass;
                    fragmentClass = AboutTeam2Fragment.class;
                    try {
                        fragment = (Fragment) fragmentClass.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.about_fragment_container, fragment).commit();
                }
            }*/

           /* @Override
            public void onMenuTabReSelected(int menuItemId) {
                if (menuItemId == R.id.bottom_bar_about_riviera) {
                    scrollView.fullScroll(NestedScrollView.FOCUS_UP);
                } else if (menuItemId == R.id.bottom_bar_about_university) {
                    scrollView.fullScroll(NestedScrollView.FOCUS_UP);
                } else if (menuItemId == R.id.bottom_bar_about_team) {
                    scrollView.fullScroll(NestedScrollView.FOCUS_UP);
                }
            }
        });
*/

            }

            @Override
            protected void onSaveInstanceState(Bundle outState) {
                super.onSaveInstanceState(outState);
                // bottomBar.onSaveInstanceState(outState);

            }
        }



