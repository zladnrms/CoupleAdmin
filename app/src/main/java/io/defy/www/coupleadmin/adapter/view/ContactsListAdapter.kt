package io.defy.www.coupleadmin.adapter.view
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.defy.www.coupleadmin.R
import io.defy.www.coupleadmin.adapter.model.ContactsDataModel
import io.defy.www.coupleadmin.adapter.presenter.ContactsAdapterPresenter
import io.defy.www.coupleadmin.model.data.ContactsData
import kotlinx.android.synthetic.main.recyclerview_contact.view.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by kim on 2017-09-16.
 */
class ContactsListAdapter(var context: Context, var lists : ArrayList<ContactsData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(), ContactsDataModel, ContactsAdapterView {

    private var presenter : ContactsAdapterPresenter

    init {
        Log.i("MessageList", "Init!")
        presenter = ContactsAdapterPresenter()
        presenter?.attachView(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var v = LayoutInflater.from(context).inflate(R.layout.recyclerview_contact, parent, false)

        return Item(v)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        lists.let {

        }
        holder?.itemView?.tv_phoneNumber?.text = lists[position].phone_number
        holder?.itemView?.tv_nickname?.text = lists[position].display_name
        holder?.itemView?.tv_date?.text = lists[position].date.toString()
        holder?.itemView?.tv_type?.text = lists[position].type.toString()
        holder?.itemView?.tv_duration?.text = lists[position].duration.toString()

        //holder?.itemView?.tv_date?.text = toSimpleString(lists[position].date)
    }


    class Item(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindData(_list: String) {
            //itemView.tv_nickname.text = _list
        }
    }

    override open fun refresh() {
        notifyDataSetChanged()
    }

    override fun add(data: ContactsData) {
        lists.add(data)
    }

    override fun clear() {
        lists.clear()
    }

    override fun remove(position: Int) {
        lists.removeAt(position)
    }

    fun toSimpleString(date: Date?) = with(date ?: Date()) {
        SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this)
    }
}