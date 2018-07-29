package io.defy.www.coupleadmin.view

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import io.defy.www.coupleadmin.R
import io.defy.www.coupleadmin.adapter.view.ContactsListAdapter
import io.defy.www.coupleadmin.contract.ContactsContract
import io.defy.www.coupleadmin.model.data.ContactsData
import io.defy.www.coupleadmin.presenter.ContactsPresenter
import kotlinx.android.synthetic.main.activity_contacts.*

class ContactsActivity : AppCompatActivity(), ContactsContract.View {

    private var presenter : ContactsPresenter? = null
    private var adapter : ContactsListAdapter? = null

    private var pref : SharedPreferences?  = null
    private var editor : SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        pref = this.getSharedPreferences(getString(R.string.preference_contacts), Context.MODE_PRIVATE);
        editor = pref?.edit()

        presenter = ContactsPresenter()
        presenter?.attachView(this)

        contactsList.layoutManager = LinearLayoutManager(this)
        contactsList.hasFixedSize()
        adapter = ContactsListAdapter(this, ArrayList<ContactsData>())
        contactsList.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        presenter?.getCallLog(baseContext)
    }
}
