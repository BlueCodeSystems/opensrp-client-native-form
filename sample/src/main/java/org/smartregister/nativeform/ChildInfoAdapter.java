package org.smartregister.nativeform;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ChildInfoAdapter extends ArrayAdapter<ChildInfo> {
    public ChildInfoAdapter(Context context, ArrayList<ChildInfo> childInfos){
        super(context, 0, childInfos);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_child, parent, false);
        }
//        convertView  = (convertView == null) ? LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false) : LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, true);


        // Get the data item for this position
       ChildInfo childInfo = getItem(position);

        // Lookup view for data population
        TextView tvProvince = (TextView) convertView.findViewById(R.id.tvProvince);
        TextView tvDistrict = (TextView) convertView.findViewById(R.id.tvDistrict);
        TextView tvWard = (TextView) convertView.findViewById(R.id.tvWard);
        TextView tvCompound = (TextView) convertView.findViewById(R.id.tvCompound);
        TextView tvVillage = (TextView) convertView.findViewById(R.id.tvVillage);
        TextView tvHealthFacility = (TextView) convertView.findViewById(R.id.tvHealthFacility);
        TextView tvHouseholdID = (TextView) convertView.findViewById(R.id.tvHouseholdID);
        // Populate the data into the template view using the data object

        tvProvince.setText(childInfo.getProvince());
        tvDistrict.setText(childInfo.getDistrict());
        tvCompound.setText(childInfo.getCompound());
        tvWard.setText(childInfo.getWard());
        tvVillage.setText(childInfo.getVillage());
        tvHealthFacility.setText(childInfo.getHealthFacility());
        tvHouseholdID.setText(childInfo.getHouseholdID());


        // Return the completed view to render on screen
        return convertView;
    }
}
