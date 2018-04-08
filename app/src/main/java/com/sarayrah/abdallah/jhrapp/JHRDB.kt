package com.sarayrah.abdallah.jhrapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class JHRDB(context: Context) : SQLiteOpenHelper(context, "jhr.db", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE deputy ( id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(50), info TEXT )")
        p0?.execSQL("insert into deputy(name, info) values(?,?)", arrayOf(
                "اندريه مراد محمود عبدالجليل حواري",
                "<p><strong>الاسم: </strong>اندريه مراد محمود عبدالجليل حواري</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 9 يناير 1982</p>"))

        p0?.execSQL("insert into deputy(name, info) values(?,?)", arrayOf(
                "خليل حسين خليل عطية",
                "<p><strong>الاسم: </strong>خليل حسين خليل عطية</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المهندس</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: ارمل</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 17 مايو 1958</p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عمل في القطاع الخاص وإدارة الأعمال</li>\n" +
                        "</ul>"))

        p0?.execSQL("insert into deputy(name, info) values(?,?)", arrayOf(
                "عبدالرحمن حسين محمد العوايشة",
                "<p><strong>الاسم: </strong>عبدالرحمن حسين محمد العوايشة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 4 يناير 1966</p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ناشط في مجال حقوق الانسان</li>\n" +
                        "<li>ناشط في مجال العمل السياسي والبرلماني</li>\n" +
                        "<li>نائب نقيب اصحاب المخابز</li>\n" +
                        "</ul>"))

        p0?.execSQL("insert into deputy(name, info) values(?,?)", arrayOf(
                "محمد راشد عودة البرايسة",
                "<p><strong>الاسم: </strong>محمد راشد عودة البرايسة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 23 نوفمبر 1973</p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مسؤول العلاقات العامة و الاعلام في بنك تنمية المدن والقرى </li>\n" +
                        "<li>مسؤول العلاقات العامة و الاعلام في وزارة العمل</li>\n" +
                        "</ul>"))

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}