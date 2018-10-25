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
import java.text.ParseException
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
        holder?.itemView?.tv_nickname?.text = "(" + lists[position].display_name + ")"
        holder?.itemView?.tv_date?.text = compareTime(nowTime(), lists[position].date.toString())
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

    fun stringToDate(date : String) : Date {
        val simpleFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val date = simpleFormat.parse(date)

        return date
    }

    /*
     * 얼마 전 게시된 게시물인지 계산 nowTime(), compareTime()
     */
    private fun nowTime(): String {
        // 현재시간을 msec 으로 구한다.
        val now = System.currentTimeMillis()
        // 현재시간을 date 변수에 저장한다.
        val date = Date(now)
        // 시간을 나타냇 포맷을 정한다 ( yyyy/MM/dd 같은 형태로 변형 가능 )
        val sdfNow = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        // nowDate 변수에 값을 저장한다.
        return sdfNow.format(date)
    }

    private fun compareTime(t1: String, t2: String): String {
        val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        var day1: Date? = null
        var day2: Date? = null
        val diff: Long
        var diffDays: Long = 0
        var strbefore = ""
        try {
            day1 = format.parse(t1)
            day2 = format.parse(t2)
            println("day1:$day1,day2 :$day2")
        } catch (e: ParseException) {
            e.printStackTrace()
        }

        val compare = day1!!.compareTo(day2)
        if (compare > 0) {
            diff = day1.time - day2!!.time
            if (diff > 24 * 60 * 60 * 1000) { // 하루 이상 차이나면
                diffDays = diff / (24 * 60 * 60 * 1000)
                strbefore = diffDays.toString() + "일 전"
            } else if (diff < 24 * 60 * 60 * 1000 && diff > 60 * 60 * 1000) { // 하루 이상 안나고 몇 시간 차이나면
                diffDays = diff / (60 * 60 * 1000)
                strbefore = diffDays.toString() + "시간 전"
            } else if (diff < 60 * 60 * 1000 && diff > 60 * 1000) { // 시간 차이 안나고 몇 분 차이나면
                diffDays = diff / (60 * 1000)
                strbefore = diffDays.toString() + "분 전"
            } else if (diff < 60 * 1000) { // 방금 전
                strbefore = "방금 전"
            }
        } else {
            strbefore = "지금"
        }
        return strbefore
    }
}