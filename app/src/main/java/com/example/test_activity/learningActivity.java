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
                    builder.setMessage(" Facebook's mission is to give people the power to build" +
                            " community and bring the world closer together. People use Facebook " +
                            "to stay connected with friends and family, to discover what's going on " +
                            "in the world, and to share and express what matters to them.");
                    builder.setTitle("FaceBook Description");
                    builder.setCancelable(false);
                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();               }
                if (position ==  1) {
                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("WhatsApp uses the internet to send messages, images, audio " +
                            "or video. The service is very similar to text messaging services," +
                            " however, because WhatsApp uses the internet to send messages, the cost " +
                            "of using WhatsApp is significantly less than texting.");
                    builder.setTitle("Whatsapp Description");
                    builder.setCancelable(false);
                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();               }
                if (position ==  2) {

                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("Twitter is an American microblogging and social networking" +
                            " service on which users post and interact with messages known as" +
                            " tweets.");
                    builder.setTitle("Twitter Description");
                    builder.setCancelable(false);
                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();            }
                if (position ==  3) {

                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("Instagram was started in San Francisco by Kevin Systrom and " +
                            "Mike Krieger, who initially tried creating a platform similar to " +
                            "Foursquare but then turned their attention exclusively to photo sharing. " +
                            "The word Instagram is an amalgam of instant camera and telegram.");
                    builder.setTitle("Instagram Description");
                    builder.setCancelable(false);
                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();             }
                if (position ==  4) {
                    builder = new AlertDialog.Builder(learningActivity.this);
                    builder.setMessage("YouTube is a video sharing service where users can watch, like," +
                            " share, comment and upload their own videos. The video service can be " +
                            "accessed on PCs, laptops, tablets and via mobile phones.");
                    builder.setTitle("Youtube Description");
                    builder.setCancelable(false);
                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    alertDialog = builder.create();
                    alertDialog.show();}
                    if (position ==  5) {
                        builder = new AlertDialog.Builder(learningActivity.this);
                        builder.setMessage("LinkedIn is a social networking website designed for business" +
                                " professionals. It allows you to share work-related information with " +
                                "other users and keep an online list of professional contacts. Like" +
                                " Facebook and MySpace, LinkedIn allows you to create a custom profile.");
                        builder.setTitle("Linkedin Description");
                        builder.setCancelable(false);
                        builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        alertDialog = builder.create();
                        alertDialog.show();}
                        if (position ==  6) {
                            builder = new AlertDialog.Builder(learningActivity.this);
                            builder.setMessage("GitHub is a distributed version-control platform where" +
                                    " users can collaborate on or adopt open source code projects," +
                                    " fork code, share ideas and more.");
                            builder.setTitle("Github Description");
                            builder.setCancelable(false);
                            builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                            alertDialog = builder.create();
                            alertDialog.show();}
                            if (position ==  7) {
                                builder = new AlertDialog.Builder(learningActivity.this);
                                builder.setMessage("What is TikTok? TikTok is a social media platform" +
                                        " for creating, sharing and discovering short videos. The app is" +
                                        " used by young people as an outlet to express themselves through " +
                                        "singing, dancing, comedy, and lip-syncing, and allows users to create " +
                                        "videos and share them across a community.");
                                builder.setTitle("Tiktok Description");
                                builder.setCancelable(false);
                                builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                                alertDialog = builder.create();
                                alertDialog.show();}
                                if (position ==  8) {
                                    builder = new AlertDialog.Builder(learningActivity.this);
                                    builder.setMessage("Viber is a VoIP and instant messaging application with" +
                                            " cross-platform capabilities that allows users to exchange audio and" +
                                            " video calls, stickers, group chats, and instant voice and video" +
                                            " messages.");
                                    builder.setTitle("viber Description");
                                    builder.setCancelable(false);
                                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.cancel();
                                        }
                                    });
                                    alertDialog = builder.create();
                                    alertDialog.show();}
                                    if (position ==  9) {
                                        builder = new AlertDialog.Builder(learningActivity.this);
                                        builder.setMessage("Google is an internet search engine. It uses a " +
                                                "proprietary algorithm that's designed to retrieve and order search " +
                                                "results to provide the most relevant and dependable sources of data" +
                                                " possible.");
                                        builder.setTitle("Google Description");
                                        builder.setCancelable(false);
                                        builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
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
