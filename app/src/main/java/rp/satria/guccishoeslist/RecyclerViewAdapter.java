package rp.satria.guccishoeslist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Shoes> mData;

    public RecyclerViewAdapter(Context mContext, List<Shoes> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_shoes,parent,false);
        return new MyViewHolder(view);
    }

    public void onBindViewHolder(MyViewHolder holder, final int position){

//        holder.tv_shoes_ID.setText(""+mData.get(position).getID());
        holder.tv_shoes_NAMA.setText(mData.get(position).getNama());
        holder.tv_shoes_TIPE.setText(mData.get(position).getTipe());
//        holder.tv_shoes_UKURAN.setText(mData.get(position).getUkuran());
//        holder.karakter_img_thumbnail.setImageResource(mData.get(position).getThumbnail());
//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(mContext,Karakter_Activity.class);
//
//
//                //lempar data ke karakter activity
//                intent.putExtra("Nama",mData.get(position).getName());
//                intent.putExtra("Biodata",mData.get(position).getBiodata());
//                intent.putExtra("Description",mData.get(position).getDescription());
//                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
//                //start activity
//                mContext.startActivity(intent);
//            }
//        });
    }

    public int getItemCount(){
        return mData.size();
    }

    public  static class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView tv_shoes_ID;
        TextView tv_shoes_NAMA;
        TextView tv_shoes_TIPE;
        TextView tv_shoes_UKURAN;
        CardView cardView;

        public  MyViewHolder(View itemView) {
            super(itemView);


//            tv_shoes_ID = (TextView) itemView.findViewById(R.id.shoes_id) ;
            tv_shoes_NAMA = (TextView) itemView.findViewById(R.id.shoes_name) ;
            tv_shoes_TIPE = (TextView) itemView.findViewById(R.id.shoes_tipe) ;
//            tv_shoes_UKURAN = (TextView) itemView.findViewById(R.id.shoes_ukuran) ;
//            karakter_img_thumbnail = (ImageView) itemView.findViewById(R.id.karakter_img) ;
            cardView = (CardView) itemView.findViewById(R.id.cardview_id) ;
        }
    }

}
