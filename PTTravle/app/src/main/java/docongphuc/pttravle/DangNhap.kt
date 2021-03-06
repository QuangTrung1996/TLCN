package docongphuc.pttravle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView

/**
 * Created by Admin on 25/9/2017.
 */
class DangNhap : Fragment(){
    val sharedprperences : String="taikhoan";
    val UserName : String="phuc";
    val PassWord:String="congphuc";
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view =inflater!!.inflate(R.layout.frm_dangnhap,container,false);
        var username=view.findViewById<EditText>(R.id.TenDN);
        var passw=view.findViewById<EditText>(R.id.Pass)
        var dn=view.findViewById<Button>(R.id.DangNhapTK);

        var Luu=view.findViewById<CheckBox>(R.id.LuuTT);
        dn.setOnClickListener( {
            if (Luu.isChecked) {
                //Toast.makeText(this.context, ""+TenDN.text.toString(), Toast.LENGTH_SHORT).show();
                if (username.text.toString().trim().equals("phuc") && passw.text.toString().trim().equals("123")) {

                    addtaikhoan();
                    doctaikhoan()
                    xoaTK()
                }
            }
        });

        return view;
    }
    fun addtaikhoan()
    {
        val sharedpreferences=this.activity.getSharedPreferences(sharedprperences,android.content.Context.MODE_PRIVATE);
        val editor=sharedpreferences.edit();
        editor.putString(UserName,"phu");
        editor.putString(PassWord,"deo");
        editor.apply()

    }
    fun doctaikhoan(){
        val sharedpreferences=this.activity.getSharedPreferences(sharedprperences,android.content.Context.MODE_PRIVATE);
        val editor=sharedpreferences.edit();
        val username :String=sharedpreferences.getString(UserName,null);
        val pass : String=sharedpreferences.getString(PassWord,null)
        if (username!==null)
        {
            var anhdaidien: CircleImageView = activity.findViewById<CircleImageView>(R.id.profile_image);
            anhdaidien.setImageResource(R.drawable.anhdaidien);
            Toast.makeText(this.activity, "abcd", Toast.LENGTH_SHORT).show();
        }
    }
    fun xoaTK(){
        val sharedpreferences=this.activity.getSharedPreferences(sharedprperences,android.content.Context.MODE_PRIVATE);
        val editor=sharedpreferences.edit();
        editor.clear();
        editor.apply();
    }
}