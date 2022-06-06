package com.example.test_activity;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class learningActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Facebook", "Whatsapp", "Twitter", "Instagram", "Youtube","Linkedin", "Github", "Tiktok", "Viber", "Google"};
    String mDescription[] = {"Facebook Description", "Whatsapp Description", "Twitter Description", "Instagram Description", "Youtube Description","Linkedin Description", "Github Description", "Tiktok Description", "Viber Description", "Google Description"};
    int images[] = {R.drawable.facebook, R.drawable.whatsapp, R.drawable.twitter, R.drawable.instagram, R.drawable.youtube,R.drawable.linkdin, R.drawable.github, R.drawable.tiktok, R.drawable.viber, R.drawable.google};

    AlertDialog.Builder builder;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("About Face book");
                    builder.setTitle("FaceBook Description");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int asdf)
                        {
                            finish();
                        }
                    });
                    builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();               }
                if (position ==  1) {
                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("Do You want to change Image");
                    builder.setTitle("Whatsapp Description");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int asdf)
                        {
                            finish();
                        }
                    });
                    builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();               }
                if (position ==  2) {

                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("Do You want to change Image");
                    builder.setTitle("Twitter Description");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int asdf)
                        {
                            finish();
                        }
                    });
                    builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();            }
                if (position ==  3) {

                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("Do You want to change Image");
                    builder.setTitle("Instagram Description");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int asdf)
                        {
                            finish();
                        }
                    });
                    builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();             }
                if (position ==  4) {
                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("Do You want to change Image");
                    builder.setTitle("Youtube Description");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int asdf)
                        {
                            finish();
                        }
                    });
                    builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();}
                    if (position ==  5) {
                        builder = new AlertDialog.Builder(learningActivity.this);
                        builder.setMessage("Do You want to change Image");
                        builder.setTitle("Linkedin Description");
                        builder.setCancelable(false);
                        builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int asdf)
                            {
                                finish();
                            }
                        });
                        builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                dialog.cancel();
                            }
                        });
                        alertDialog = builder.create();
                        alertDialog.show();}
                        if (position ==  6) {
                            builder = new AlertDialog.Builder(learningActivity.this);
                            builder.setMessage("Do You want to change Image");
                            builder.setTitle("Github Description");
                            builder.setCancelable(false);
                            builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int asdf)
                                {
                                    finish();
                                }
                            });
                            builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which)
                                {
                                    dialog.cancel();
                                }
                            });
                            alertDialog = builder.create();
                            alertDialog.show();}
                            if (position ==  7) {
                                builder = new AlertDialog.Builder(learningActivity.this);
                                builder.setMessage("Do You want to change Image");
                                builder.setTitle("Tiktok Description");
                                builder.setCancelable(false);
                                builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int asdf)
                                    {
                                        finish();
                                    }
                                });
                                builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which)
                                    {
                                        dialog.cancel();
                                    }
                                });
                                alertDialog = builder.create();
                                alertDialog.show();}
                                if (position ==  8) {
                                    builder = new AlertDialog.Builder(learningActivity.this);
                                    builder.setMessage("Do You want to change Image");
                                    builder.setTitle("viber Description");
                                    builder.setCancelable(false);
                                    builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int asdf)
                                        {
                                            finish();
                                        }
                                    });
                                    builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which)
                                        {
                                            dialog.cancel();
                                        }
                                    });
                                    alertDialog = builder.create();
                                    alertDialog.show();}
                                    if (position ==  9) {
                                        builder = new AlertDialog.Builder(learningActivity.this);
                                        builder.setMessage("Do You want to change Image");
                                        builder.setTitle("Google Description");
                                        builder.setCancelable(false);
                                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int asdf) {
                                                finish();
                                            }
                                        });
                                        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                dialog.cancel();
                                            }
                                        });
                                        alertDialog = builder.create();
                                        alertDialog.show();
                                    }

            }
        });



    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);


            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
