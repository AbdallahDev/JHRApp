package com.sarayrah.abdallah.jhrapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by abdallah.sarayrah on 3/25/2018.
 */
class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "jhr.db", null
        , 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("create table about(about_id integer not null primary key, " +
                "title text not null, body text not null);")

        p0?.execSQL("insert into about(title, body) values('وظائف مجلس النواب', " +
                "'<b>يعقد مجلس النواب اجتماعاته" +
                " على عدة دورات وهي على ثلاثة أنواع:</b>\\n\\n\n" +
                "<b>1- الدورة العادية:</b>\\n\\n\n" +
                "حيث يعقد المجلس في" +
                " كل سنة شمسية من عمره دورة عادية واحدة مدتها ستة اشهر، إلا إذا حل الملك المجلس قبل" +
                " انقضاء" +
                " تلك" +
                " المدة، ويجوز للملك أن يمدد الدورة العادية مدة أخرى لا تزيد عن ثلاثة أشهر.\\n\\n\n" +
                "<b>2- الدورات الاستثنائية:</b>\\n\\n\n" +
                "تعقد الدورات الاستثنائية بعد فض الدورة العادية، وأعطى الدستور الحق للملك" +
                " أو بطلب من الاغلبية المطلقة لأعضاء مجلس النواب بأن هناك حاجة لها. وتحدد الإرادة" +
                " الملكية" +
                " السامية بنود الدورة التي ينحصر دور المجلس خلالها بالأمور الورادة فيها.\\n\\n\n" +
                "<b>3- الدورة غير العادية:</b>\\n\\n\n" +
                "        تعقد الدورة" +
                " غير" +
                " العادية في حالة انتخاب مجلس النواب بعد المدة المنصوص عليها في الدستور لانعقاد" +
                " الدورة" +
                " العادية وهي الأول من تشرين الأول ويجوز للملك إرجاء انعقادها حتى الأول من كانون" +
                " الأول من كل سنة ولا يجوز أن تتجاوز مدة الدورة غير العادية عن الثلاثين من أيلول" +
                " ويسري" +
                " عليها أحكام المادة (78) من الدستور وتشملها شروط التمديد والتأجيل.')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
    }

}