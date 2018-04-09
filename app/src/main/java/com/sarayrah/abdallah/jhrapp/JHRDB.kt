package com.sarayrah.abdallah.jhrapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class JHRDB(context: Context) : SQLiteOpenHelper(context, "jhr.db", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE deputy ( id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(50), info TEXT, image INTEGER )")
        val execSQL = p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "اندريه مراد محمود عبدالجليل حواري",
                "<p><strong>الاسم: </strong>اندريه مراد محمود عبدالجليل حواري</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 9 يناير 1982</p>",
                R.mipmap.andre_hawari_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
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
                        "</ul>",
                R.mipmap.khaleel_atieh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
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
                        "</ul>",
                R.mipmap.abdulrahman_owaisha_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
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
                        "</ul>",
                R.mipmap.mohamed_baraisa_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "موسى علي محمد هنطش",
                "<p><strong>الاسم: </strong>موسى علي محمد هنطش</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 1 ديسمبر 1955</p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>موظف سلطة المياه والري </li>\n" +
                        "<li>موظف 22 سنة قطاع خاص</li>\n" +
                        "</ul>",
                R.mipmap.mosa_hantash_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عبدالله علي عودة العكايلة",
                "<p><strong>الاسم: </strong>عبدالله علي عودة العكايلة</p>\n" +
                        "<p><strong>اللقب: </strong>معالي الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 4 نوفمبر 1945p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو هيئة تدريس/ كلية الاقتصاد والعلوم الإدارية / الجامعة الأردنية / أستاذ الإدارة الإسلامية 1982-1984. </li>\n" +
                        "<li>عميد كلية المجتمع الإسلامي 1986- الزرقاء- الأردن.</li>\n" +
                        "<li>عضو لجنة صياغة الميثاق الوطني الأردني 1990.</li>\n" +
                        "<li>مقرر اللجنة المالية في مجلس النواب الأردني 1984-1988.</li>\n" +
                        "<li>رئيس اللجنة المالية في مجلس النواب الأردني 1990-1991/1993-1997.</li>\n" +
                        "<li>عضو مجلس شورى جماعة الإخوان المسلمين في الأردن 1988.</li>\n" +
                        "<li>نائب أمين عام حزب جبهة العمل الإسلامي في الأردن 1993.</li>\n" +
                        "<li>رئيس مجلس أمناء جامعة الزرقاء الأهلية 1994-1998.</li>\n" +
                        "<li>رئيس مجلس إدارة شركة الزرقاء للتعليم والاستثمار/ شركة مساهمة عامة 1997-2001.</li>\n" +
                        "<li>المشاركة في عشرات المؤتمرات والندوات الادارية والسياسية والبرلمانية على المستويات الدولية والاقليمية والعربية والمحلية.</li>\n" +
                        "<li>محاضر في عشرات الدورات الإدارية لاعداد القيادات الإدارية التأسيسية والمتقدمة في الجهازين المدني والعسكري.</li>\n" +
                        "<li>الحقائب الوزارية: 1991: وزير التربية و التعليم</li>\n" +
                        "</ul>",
                R.mipmap.abdullah_akayla_ic_launcher_round))

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}