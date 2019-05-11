import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.contact.MainActivity
import com.example.contact.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.halaman_tambah_teman.*

class AddFriendFragment: Fragment() {

    companion object{
        fun newInstance(): AddFriendFragment{
            return AddFriendFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.halaman_tambah_teman, container,false )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Save.setOnClickListener {
            (activity as MainActivity).tampilMyFriendFragment()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
    }

