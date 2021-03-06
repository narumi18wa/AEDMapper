package jp.itnav.derushio.aedmapper.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import jp.itnav.derushio.aedmapper.R;

/**
 * Created by derushio on 14/12/06.
 */
public class CustomInfoAdapter implements GoogleMap.InfoWindowAdapter {
	/**
	 * GoogleMapの吹き出しを定義するClass
	 */
	private Context mContext;
	private View mInfoWindow;

	private TextView mTitleText;

	public CustomInfoAdapter(Context context) {
		this.mContext = context;
		mInfoWindow = LayoutInflater.from(context).inflate(R.layout.gmap_window_info, null, false);
	}

	@Override
	public View getInfoWindow(Marker marker) {
		return null;
	}
	// 吹き出し無し

	@Override
	public View getInfoContents(Marker marker) {
		setInfo(marker, mInfoWindow);
		return mInfoWindow;
	}
	// 吹き出し有り

	private void setInfo(Marker marker, View view) {
		mTitleText = (TextView) view.findViewById(R.id.textViewTitle);
		mTitleText.setText(marker.getTitle());
	}
}
