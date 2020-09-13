package com.belajar.gunungindonesia;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class GunungListAdapter extends RecyclerView.Adapter<GunungListAdapter.Holder> {

    private final List<Gunung> namaGunungList;

    public GunungListAdapter(List<Gunung> gunungList) {
        namaGunungList = gunungList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_gunung, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int position) {
        final Gunung gunung = namaGunungList.get(position);
        holder.tvMountainName.setText(gunung.getNamaGunung());
        Glide.with(holder.ivMountainImage.getContext())
                .load(gunung.getImageUrl())
                .into(holder.ivMountainImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToDetailActivity(view, gunung.getNamaGunung(), gunung.getImageUrl(), gunung.getTinggiGunung(), gunung.getDeskripsiGunung());

            }
        });

    }

    private void goToDetailActivity(View view, String namaGunung, String imageUrl, String tinggiGunung, String deskripsiGunung) {
        Intent intent = new Intent(view.getContext(), DetailGunungActivity.class);
        intent.putExtra("namaGunung", namaGunung);
        intent.putExtra("imageurl", imageUrl);
        intent.putExtra("tinggiGunung", tinggiGunung);
        intent.putExtra("deskripsiGunung", deskripsiGunung);

        view.getContext().startActivity(intent);

    }

    @Override
    public int getItemCount() {
        return namaGunungList.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        ImageView ivMountainImage;
        TextView tvMountainName;


        public Holder(@NonNull View itemView) {
            super(itemView);
            ivMountainImage = itemView.findViewById(R.id.iv_mountain_image);
            tvMountainName = itemView.findViewById(R.id.tv_mountain_name);
        }
    }
}
