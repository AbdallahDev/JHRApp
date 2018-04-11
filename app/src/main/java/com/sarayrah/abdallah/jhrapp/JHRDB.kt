package com.sarayrah.abdallah.jhrapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class JHRDB(context: Context) : SQLiteOpenHelper(context, "jhr.db", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        //bellow is the deputy table creation and insertion
        p0?.execSQL("CREATE TABLE deputy ( id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(50), info TEXT, image INTEGER )")
        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
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
                        "<p><strong>تاريخ الميلاد</strong>: أحد 4 نوفمبر 1945<p>\n" +
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

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "يحيى محمد محمود السعود",
                "<p><strong>الاسم: </strong>يحيى محمد محمود السعود</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 17 يوليو 1965<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو مجلس امانة عمان الكبرى لمنطقة اليرموك.</li>\n" +
                        "<li>عضو مجلس امانة عمان الكبرى لمنطقة المدينة.</li>\n" +
                        "<li>رئيس مجلس ادارة رابطة اهالي حي الطفايلة</li>\n" +
                        "<li>الرئيس الفخري لنادي جعفر الطيار</li>\n" +
                        "<li>رئيس لجنة رعاية مسجد الراشدين</li>\n" +
                        "<li>رئيس اللجنة القانونية بأمانة عمان</li>\n" +
                        "<li>رئيس فخري لنادي عمية الطفيلة الرياضي</li>\n" +
                        "<li>رئيس الاتحاد الاردني لبناء الاجسام</li>\n" +
                        "<li>نائب رئيس لجنة وقف مسجد ابو درويش</li>\n" +
                        "<li>الرئيس الفخري لملتقى الطفيلة الثقافي</li>\n" +
                        "<li>رئيس اللجنة الشعبية لتطوير وتحديث حي الطفايلة</li>\n" +
                        "<li>رئيس الهئية الادارية لحزب الوسط الاسلامي_فرع عمان</li>\n" +
                        "</ul>",
                R.mipmap.yahya_saud_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "موسى علي محمد الوحش",
                "<p><strong>الاسم: </strong>موسى علي محمد الوحش</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 18 نوفمبر 1952 <p>\n",
                R.mipmap.mosa_wahesh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عمر صبحي شحادة قراقيش",
                "<p><strong>الاسم: </strong>عمر صبحي شحادة قراقيش</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 1 يوليو 1967<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>دير مالي و اداري.</li>\n" +
                        "<li>مدير مكتب محاسبة و دراسات جدوى - خبراء ضرائب.</li>\n" +
                        "</ul>",
                R.mipmap.omar_karakeash_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عزيز محمد علي سلمان العبيدي",
                "<p><strong>الاسم: </strong>عزيز محمد علي سلمان العبيدي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 25 مايو 1961<p>\n",
                R.mipmap.aziz_obeidi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عبد علي محمد عليان المحسيري",
                "<p><strong>الاسم: </strong>عبد علي محمد عليان المحسيري</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 6 نوفمبر 1971<p>\n",
                R.mipmap.abdul_mehsiri_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "قيس خليل يعقوب زيادين",
                "<p><strong>الاسم: </strong>قيس خليل يعقوب زيادين</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 6 أبريل 1984<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محامي مزاول.</li>\n" +
                        "</ul>",
                R.mipmap.qais_ziadin_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "خالد رمضان محمد عواد",
                "<p><strong>الاسم: </strong>خالد رمضان محمد عواد</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المهندس</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: أعزب</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 21 أغسطس 1956<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو نقابة المهندسين الاردنيين.</li>\n" +
                        "<li>عضو نقابة المقاولين.</li>\n" +
                        "</ul>",
                R.mipmap.khaled_awad_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "صالح عبدالكريم شحادة العرموطي",
                "<p><strong>الاسم: </strong>صالح عبدالكريم شحادة العرموطي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 1 يناير 1950<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>نقيب المحاماة لمدة 4 دورات</li>\n" +
                        "<li>مزاول مهنة المحاماة</li>\n" +
                        "</ul>",
                R.mipmap.saleh_armouti_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "منصور سيف الدين مراد سجاجه",
                "<p><strong>الاسم: </strong>منصور سيف الدين مراد سجاجه</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 1 يناير 1948<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>قيادة اتحادات شبابية وطلابية</li>\n" +
                        "</ul>",
                R.mipmap.mansour_sjaja_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "خميس حسين خليل عطية",
                "<p><strong>الاسم: </strong>خميس حسين خليل عطية</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 8 أكتوبر 1966<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو مجلس النواب الثامن عشر</li>\n" +
                        "<li>نائب رئيس مجلس النواب السابع عشر</li>\n" +
                        "<li>رئيس اللجنة المشتركة (الإدارية والقانونية) لقانوني اللامركزية والبلديات في مجلس النواب السابع عشر</li>\n" +
                        "<li>رئيس كتلة مبادرة النيابية في مجلس النواب السابع عشر</li>\n" +
                        "<li>رئيس اللجنة الإدارية في مجلس النواب السابع عشر</li>\n" +
                        "<li>عضو هيئة المديرين في شركة حسين عطية  وأولاده ذ.م.م. سابقا</li>\n" +
                        "<li>نائب المدير العام لمؤسسة حسين عطية للأبنية والمقاولات (1990-2012)</li>\n" +
                        "<li>عضو منتخب لمجلس أمانة عمان الكبرى 2007-2011.</li>\n" +
                        "<li>عضو منتخب لمجلس أمانة عمان الكبرى 2003-2007.</li>\n" +
                        "<li>رئيس اللجنة المحلية لمنطقة العبدلي 2007-2011</li>\n" +
                        "<li>عضو اللجنة المحلية للعديد من المناطق في أمانة عمان الكبرى.</li>\n" +
                        "<li>رئيس اللجنة الاستشارية لنادي الحسين الرياضي.</li>\n" +
                        "<li>عضو في العديد من المؤسسات الإنسانية والاجتماعية والجمعيات الخيرية.</li>\n" +
                        "</ul>",
                R.mipmap.khamis_atieh_ic_launcher_round))


        //bellow is the committee table creation and insertion
        p0?.execSQL("CREATE TABLE committee ( committee_id INTEGER PRIMARY KEY AUTOINCREMENT, committee_name VARCHAR(50))")

        p0?.execSQL("insert into committee (committee_name) values(?)", arrayOf(
                "اللجنة القانونية"))

        p0?.execSQL("insert into committee (committee_name) values(?)", arrayOf(
                "اللجنة المالية"))

        p0?.execSQL("insert into committee (committee_name) values(?)", arrayOf(
                "لجنة الاقتصاد والاستثمار"))

        p0?.execSQL("insert into committee (committee_name) values(?)", arrayOf(
                "لجنة الشؤون الخارجية"))


        //bellow is the committee_deputy table creation and insertion
        p0?.execSQL("CREATE TABLE `committee_deputy` ( `committee_id` INTEGER NOT NULL, `deputy_id` INTEGER NOT NULL )")

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(
                "اللجنة القانونية"))

        p0?.execSQL("insert into committee (committee_name) values(?)", arrayOf(
                "اللجنة المالية"))

        p0?.execSQL("insert into committee (committee_name) values(?)", arrayOf(
                "لجنة الاقتصاد والاستثمار"))

        p0?.execSQL("insert into committee (committee_name) values(?)", arrayOf(
                "لجنة الشؤون الخارجية"))

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}