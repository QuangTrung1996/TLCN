package docongphuc.pttravle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Admin on 26/9/2017.
 */
class frm_DiaDiemLeHoi : Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view =inflater!!.inflate(R.layout.frm_diadiemlehoi,container,false);
        return view;
    }
}