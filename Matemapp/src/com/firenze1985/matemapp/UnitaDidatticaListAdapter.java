package com.firenze1985.matemapp;
import java.util.ArrayList;

import com.firenze1985.matemapp.ElementoListaUnitaDidattica;
import com.firenze1985.matemapp.R;
import com.firenze1985.matemapp.utility.Const;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * @author Administrator
 *
 */
public class UnitaDidatticaListAdapter extends ArrayAdapter<ElementoListaUnitaDidattica> implements View.OnClickListener{

    private ArrayList<ElementoListaUnitaDidattica> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtName;
        TextView txtType;
        ImageView info;
    }

    public UnitaDidatticaListAdapter(ArrayList<ElementoListaUnitaDidattica> data, Context context) {
        super(context, R.layout.elementounitadidattica_layout, data);
        this.dataSet = data;
        this.mContext=context;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        ElementoListaUnitaDidattica dataModel=(ElementoListaUnitaDidattica)object;

        
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
    	ElementoListaUnitaDidattica dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.elementounitadidattica_layout, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.nome);
            viewHolder.txtType = (TextView) convertView.findViewById(R.id.tipo);
            //viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.);
            //viewHolder.info = (ImageView) convertView.findViewById(R.id.item_info);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }
        
        lastPosition = position;

        viewHolder.txtName.setText(dataModel.getNome());
        viewHolder.txtType.setText(dataModel.getTipo());
        if (viewHolder.txtType.getText().equals(Const.COMPLETA))  {
        	viewHolder.txtType.setTextColor(Color.parseColor("#008800"));
        } else if (viewHolder.txtType.getText().equals(Const.NON_COMPLETA))  {
        	viewHolder.txtType.setTextColor(Color.parseColor("#888800"));
        } else if (viewHolder.txtType.getText().equals(Const.ANCORA_DA_COMINCIARE))  {
        	viewHolder.txtType.setTextColor(Color.parseColor("#880000"));
        }
        // Return the completed view to render on screen
        return convertView;
    }
}