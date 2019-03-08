package com.habibcse009.recylierview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    String countryName[];
    int imgFlag[];
    Context context;

    public CustomAdapter(Context context, String countryName[], int imgFlag[]) {
        this.countryName = countryName;
        this.imgFlag = imgFlag;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item,viewGroup,false);
        MyViewHolder vh=new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder myViewHolder, final int possition) {
        myViewHolder.txtName.setText(countryName[possition]);
        myViewHolder.imgCountryFlag.setImageResource(imgFlag[possition]);
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,countryName[possition],Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,DetailsActivity.class);
                intent.putExtra("name",countryName[possition]);
                intent.putExtra("flag",imgFlag[possition]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return countryName.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        ImageView imgCountryFlag;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.textname);
            imgCountryFlag=itemView.findViewById(R.id.img_flag);

            Typeface tf = Typeface.createFromAsset(context.getAssets(), "aqua.ttf");
            txtName.setTypeface(tf);

        }
    }
}
