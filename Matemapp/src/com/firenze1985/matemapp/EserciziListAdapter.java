/**
 * 
 */
package com.firenze1985.matemapp;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
 
public class EserciziListAdapter extends BaseExpandableListAdapter {

	private Context context;
	private List<String> listDataHeader; // header titles
	// child data in format of header title, child title
	private HashMap<String, List<String>> listDataChild;

	public EserciziListAdapter(Context context,
			List<String> listDataHeader,
			HashMap<String, List<String>> listChildData) {
		this.context = context;
		this.listDataHeader = listDataHeader;
		this.listDataChild = listChildData;
	}

	@Override
	public Object getChild(int groupPosition, int childPosititon) {
		return this.listDataChild.get(this.listDataHeader.get(groupPosition))
				.get(childPosititon);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, final int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {

		final String childText = (String) getChild(groupPosition, childPosition);

		if (convertView == null) {
			LayoutInflater infalInflater = (LayoutInflater) this.context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(R.layout.child_item, null);
		}

		TextView txtListChild = (TextView) convertView
				.findViewById(R.id.laptop);
		if ((childPosition % 2) == 0)
		{
			txtListChild.setBackgroundColor(Color.parseColor("#CCCCDD"));
		}
		else
		{
			txtListChild.setBackgroundColor(Color.parseColor("#DDCCCC"));
		}		
		HashMap<String, Integer> mappaParolaModifica = new HashMap<String, Integer>();
		// rendi in grassetto i titoli di esercizi e compiti
		// non sapendo a priori quanti esercizi per argomento inserisco, faccio fare una iterazione fino a 20 sicuro che,
		// per ogni argomento, non metterò mai più di 20 esercizi o compiti
		for (int i = 0; i < 20; i++) {
			int numEs = i + 1;
			mappaParolaModifica.put("Esercizio "+numEs+":", Typeface.BOLD);
			mappaParolaModifica.put("Compito "+numEs+":", Typeface.BOLD);
		}

		ModificaTesto.inserisciTestoPersonalizzato(null, txtListChild, childText, mappaParolaModifica);
		return convertView;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return this.listDataChild.get(this.listDataHeader.get(groupPosition))
				.size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return this.listDataHeader.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return this.listDataHeader.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {

		String headerTitle = (String) getGroup(groupPosition);
		if (convertView == null) {
			LayoutInflater infalInflater = (LayoutInflater) this.context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = infalInflater.inflate(R.layout.group_item, null);
		}

		TextView lblListHeader = (TextView) convertView
				.findViewById(R.id.laptop);
		lblListHeader.setTypeface(null, Typeface.BOLD);
		lblListHeader.setText(headerTitle);

		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}
}
