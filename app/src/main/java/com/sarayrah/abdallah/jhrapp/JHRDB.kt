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

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "احمد محمد علي الصفدي",
                "<p><strong>الاسم: </strong>احمد محمد علي الصفدي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 16 سبتمبر 1967<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ضابط متقاعد من الخدمات الطبية الملكية</li>\n" +
                        "<li>عضو لجنة الخدمات العامة والسياحة والاثار</li>\n" +
                        "</ul>",
                R.mipmap.ahmed_safadi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "خير عبدالله عياد ابو صعيليك",
                "<p><strong>الاسم: </strong>خير عبدالله عياد ابو صعيليك</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 9 يونيو 1971<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو مجلس ادارة صندوق التقاعد - نقابة المهندسين الاردنيين</li>\n" +
                        "<li>رئيس لجنة دعم الصناعة الوطنية - نقابة المهندسين الاردنيين</li>\n" +
                        "<li>عضو مجلس ادارة الهيئة الاردنية لدعم الصناعة الوطنية</li>\n" +
                        "<li>عضو مجلس الادارة - شركة الالبسة الاردنية</li>\n" +
                        "<li>مستشار كلية الهندسة- جامعة العلوم والتكنولوجيا</li>\n" +
                        "<li>رئيس اللجنة الدائمة للمياه - مؤسسة المواصفات والمقاييس</li>\n" +
                        "<li>العضوية في منظمات المجتمع المدني</li>\n" +
                        "<li>رئيس جمعية ابو صعيليك الخيرية</li>\n" +
                        "</ul>",
                R.mipmap.khair_saileik_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "أحمد سليمان عوض الرقب",
                "<p><strong>الاسم: </strong>أحمد سليمان عوض الرقب</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 8 مارس 1970<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو حزب جبهة العمل الاسلامي</li>\n" +
                        "</ul>",
                R.mipmap.ahmed_reqeb_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "احمد ابراهيم سلامة الهميسات",
                "<p><strong>الاسم: </strong>احمد محمد علي الصفدي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 28 يوليو 1968<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مساعد مدير اداري في الأمانة العامة لمجلس النواب</li>\n" +
                        "<li>أمين سر اللجان ومساعد مدير الشؤون الأدارية</li>\n" +
                        "<li>نائب رئيس بلدية الرصيفة</li>\n" +
                        "<li>رئيس لجنة الحريات العامة وحقوق المواطنين</li>\n" +
                        "<li>رئيس اللجنة الادارية</li>\n" +
                        "<li>عضو لجنة التربية والتعليم والثقافة والشباب</li>\n" +
                        "<li>مقرر لجنة التحقيق النيابية المتعلقة بأمانة عمان الكبرى</li>\n" +
                        "<li>عضو لجنة إعادة الأرقام الوطنية</li>\n" +
                        "<li>عضو لجنة الصداقة البرلمانية الأردنية _ السعودية</li>\n" +
                        "<li>عضو لجنة الصداقة البرلمانية الأردنية _الإماراتية</li>\n" +
                        "<li>عضو لجنة الصداقة البرلمانية الأردنية _ الفلسطينية</li>\n" +
                        "</ul>",
                R.mipmap.ahmed_hamesat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "رمضان محمد فلاح الحنيطي",
                "<p><strong>الاسم: </strong>احمد محمد علي الصفدي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 20 مايو 1967<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عقيد متقاعد من جهاز الامن العام</li>\n" +
                        "</ul>",
                R.mipmap.ramadan_hunaiti_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "نصار حسن سالم القيسي",
                "<p><strong>الاسم: </strong>نصار حسن سالم القيسي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 25 ديسمبر 1971<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>طبيب امتياز في وزارة الصحة 1995</li>\n" +
                        "<li>طبيب مقيم واختصاصي جلدية وتناسلية وعقم - الخدمات الطبية الملكية-مدينة الحسين الطبية ومستشفى الملكة عالية 1995-1998</li>\n" +
                        "<li>اخصائي جلدية وتناسلية وعقم - وزارة الصحة - مستشفى البشير</li>\n" +
                        "<li>اخصائي جلدية وتناسلية وعقم - وزارة الصحة مركز صحي وادي السير</li>\n" +
                        "<li>عالمية في مجال تكنولوجيا العلومات والاستثمارات-الاردن /قطر /امريكا</li>\n" +
                        "<li>مدير عام ونائب رئيس هيئة المديرين وشريك في شركة المبدع للدعاية والاعلام</li>\n" +
                        "<li>مدير عام وعضو مجلس ادارة وشريك في شركة القيسي للاسكان</li>\n" +
                        "<li>رئيس مجلس ادارة وشريك في شركة حول العالم للاستثمارات الدولية</li>\n" +
                        "<li>رئيس مجلس ادارة وشريك في شركة جريدة مدينة الاعلان</li>\n" +
                        "<li>رئيس مجلس ادارة وشريك في شركة الدانوب للاسكان</li>\n" +
                        "<li>رئيس مجلس ادارة وشريك الغبيا للمجمعات التجارية</li>\n" +
                        "<li>مؤسس في شركة تهامه للاستثمارات المالية</li>\n" +
                        "<li>مساعدا لرئيس مجلس النواب في البرلمان الخامس عشر</li>\n" +
                        "<li>رئيس اللجنة الكويتية الاردنية</li>\n" +
                        "<li>عضو البرلمان الاوروبي المتوسط</li>\n" +
                        "</ul>",
                R.mipmap.nassar_qaisi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "فضيل منور فضيل النهار المناصير العبادي",
                "<p><strong>الاسم: </strong>فضيل منور فضيل النهار المناصير العبادي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المهندس</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 8 أكتوبر 1961<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير بلدية ورئيس قسم هندسي - بلدية ناعور</li>\n" +
                        "<li>مدير ادارة مباني وزارة الاشغال العامة والاسكان</li>\n" +
                        "<li>مستشار امين عام وزارة الاشغال العامة والاسكان</li>\n" +
                        "<li>مدير مناطق بلدية ناعور الجديدة</li>\n" +
                        "<li>مفتش قرارات اللجان المحلية - دائرة الابنية - امانة عمان الكبرى</li>\n" +
                        "<li>مدير مناطق المقابلين واليرموك - امانة عمان الكبرى</li>\n" +
                        "<li>مدير تطوير صحن عمان - امانة عمان الكبرى</li>\n" +
                        "<li>عضو منظمة السلام للاغاثة وحقوق الانسان الدولية</li>\n" +
                        "<li>عضو ومشارك في العديد من التجمعات واللجان والهيئات</li>\n" +
                        "</ul>",
                R.mipmap.fadil_abadi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "احمد سلامة فالح اللوزي",
                "<p><strong>الاسم: </strong>احمد سلامة فالح اللوزي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 27 ديسمبر 1947<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>سنة خدمة في القوات المسلحة الاردنية</li>\n" +
                        "<li>سنوات سفير في الخارجية</li>\n" +
                        "<li>عضو مجلس في الجامعة الاردنية لمدة 3 سنوات</li>\n" +
                        "<li>موجة في كلية الاركان و كلية الدفاع</li>\n" +
                        "</ul>",
                R.mipmap.ahmed_lozi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "تامر شاهر سيد محمد بينو",
                "<p><strong>الاسم: </strong>تامر شاهر سيد محمد بينو</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 26 مايو 1975<p>\n",
                R.mipmap.tamer_pino_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مصطفى عبدالرحمن مازن العساف",
                "<p><strong>الاسم: </strong>مصطفى عبدالرحمن مازن العساف</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 3 أغسطس 1958<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>باحث - دائرة الافتاء العام</li>\n" +
                        "<li>مدرس غير متفرغ - قسم التاريخ - الجامعة الاردنية</li>\n" +
                        "<li>مدرس في المدارس الخاصة</li>\n" +
                        "</ul>",
                R.mipmap.mostafa_assaf_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حسن مفلح عودة الله العجارمة",
                "<p><strong>الاسم: </strong>حسن مفلح عودة الله العجارمة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المهندس</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 11 يناير 1959<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>القوات المسلحة سلاح الجو 1986 لغاية 1992</li>\n" +
                        "<li>امانة عمان الكبرى 1992 لغاية 1995</li>\n" +
                        "<li>امانة عمان الكبرى 2000 لغاية 2016</li>\n" +
                        "<li>المجلس الاعلى للعلوم والتكنولوجيا 1996</li>\n" +
                        "</ul>",
                R.mipmap.hasan_ajarma_ic_launcher_round))



        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "بركات كامل عبدالكريم النمر المهيرات العبادي",
                "<p><strong>الاسم: </strong>بركات كامل عبدالكريم النمر المهيرات العبادي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 15 ديسمبر 1953<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير التنمية المحلية - وزارة الداخلية</li>\n" +
                        "<li>مدير الدراسات والابحاث - وزارة التنمية السياسية</li>\n" +
                        "<li>متصرف: ذيبان</li>\n" +
                        "<li>مساعد محافظ: مادبا - عجلون - الزرقاء - جرش</li>\n" +
                        "<li>استاذ مساعد - جامعة العلوم التطبيقية الخاصة</li>\n" +
                        "</ul>",
                R.mipmap.barakat_abadi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "رياض محمد عرسان العزام",
                "<p><strong>الاسم: </strong>رياض محمد عرسان العزام</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المهندس</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 19 فبراير 1960<p>\n",
                R.mipmap.riad_azzam_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "راشد محمد سليمان الشوحه",
                "<p><strong>الاسم: </strong>راشد محمد سليمان الشوحه</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 17 يوليو 1958<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>دائرة الاحوال المدنية والجوازات</li>\n" +
                        "</ul>",
                R.mipmap.rashed_shouha_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عبدالمنعم صالح شحادة العودات",
                "<p><strong>الاسم: </strong>عبدالمنعم صالح شحادة العودات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 1 يوليو 1973<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>يمارس مهنة المحاماة كمحامي علامات تجارية</li>\n" +
                        "<li>محامي مزاول مجاز في الترافع امام كافة المحاكم</li>\n" +
                        "<li>عضو لجنة شؤون المهنة في نقابة المحامين</li>\n" +
                        "<li>عضو لجنة تقدير الاتعاب في نقابة المحامين</li>\n" +
                        "<li>عضو لجنة اعداد الادلة المساعدة لتاسيس الشركات</li>\n" +
                        "<li>وكيل لمجموعة من الشركات العالمية في مجال حماية حقوق الملكية الفكرية</li>\n" +
                        "<li>شارك في الكثير من المؤتمرات ومنها مؤتمر INTA)) لحماية العلامات التجارية</li>\n" +
                        "<li>محاضر في العديد من الدورات التدريبية لموظفي دائرة الجمارك</li>\n" +
                        "<li>خبير معتمد من قبل المحاكم الاردنية</li>\n" +
                        "<li>محكم معتمد من قبل العديد من القضايا</li>\n" +
                        "</ul>",
                R.mipmap.abdulmoneim_oudat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمود عطالله يونس طيطي",
                "<p><strong>الاسم: </strong>محمود عطالله يونس طيطي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 1 فبراير 1973<p>\n",
                R.mipmap.mahmoud_titi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ابراهيم حسين العلي بني هاني",
                "<p><strong>الاسم: </strong>ابراهيم حسين العلي بني هاني</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 15 نوفمبر 1946<p>\n",
                R.mipmap.ibrahim_hani_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "نضال محمود احمد الطعاني",
                "<p><strong>الاسم: </strong>نضال محمود احمد الطعاني</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 24 أبريل 1965<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عيادة خاصة من عام 1992</li>\n" +
                        "<li>عضو مجلس نقابة اطباء الاسنان لعدة دورات</li>\n" +
                        "</ul>",
                R.mipmap.nidal_taani_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "جودت ابراهيم ناصر الدرابسة",
                "<p><strong>الاسم: </strong>جودت ابراهيم ناصر الدرابسة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 20 سبتمبر 1962<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>دورة كلية عسكرية</li>\n" +
                        "<li>دورة مظلي</li>\n" +
                        "<li>دورة صيانة للضباط</li>\n" +
                        "<li>دورة قادة سرايا</li>\n" +
                        "</ul>",
                R.mipmap.joudat_darabsa_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "خالد موسى عيسى العبدالله ابو حسان",
                "<p><strong>الاسم: </strong>خالد موسى عيسى العبدالله ابو حسان</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 11 سبتمبر 1975<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مؤسس ومدير عام شركة الرواسي لادارة المشاريع الترفيهية والتي تملك مجموعة شركات</li>\n" +
                        "<li>مدير عام الشركة الاردنية لمراكز التسوق</li>\n" +
                        "</ul>",
                R.mipmap.khaled_hassan_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "فواز محمود مفلح الزعبي",
                "<p><strong>الاسم: </strong>فواز محمود مفلح الزعبي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 7 نوفمبر 1950<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو كتلة التضامن</li>\n" +
                        "<li>عضو اللجنة القانونية بمجلس النواب</li>\n" +
                        "<li>لجنة الخدمات العامة السياحة والاثار بمجلس النواب :عضو لجنة الخدمات العامة السياحة والاثار بمجلس النواب</li>\n" +
                        "<li>عمل في التجارة</li>\n" +
                        "<li>عضو كتلة جبهة العمل الوطني البرلماني الوطني</li>\n" +
                        "<li>عضو اللجنة المالية والاقتصادية</li>\n" +
                        "<li>عضو لجنة الطاقة والثروة المعدنية</li>\n" +
                        "</ul>",
                R.mipmap.fawaz_zoubi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عبدالله قاسم محمد عبيدات",
                "<p><strong>الاسم: </strong>عبدالله قاسم محمد عبيدات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 12 ديسمبر 1968<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>الأمين العام لهيئة تنظيم العمل الإشعاعي والنووي</li>\n" +
                        "<li>مساعد المدير العام لهيئة العمل الإشعاعي والنووي</li>\n" +
                        "<li>مدير تطبيق مشروع تطبيق الأنظمة والقوانين في البريد الأردني</li>\n" +
                        "<li>مدير العلاقات العامة والإعلام في هيئة الطاقة النووية</li>\n" +
                        "<li>رئيس قسم الخدمات العامة والإسكان في شركة توزيع الكهرباء</li>\n" +
                        "<li>رئيس قسم الإدارة في شركة توزيع الكهرباء</li>\n" +
                        "<li>عمل كإداري في مؤسسة النقل العام</li>\n" +
                        "<li>عمل كإداري في شركة النقل البري</li>\n" +
                        "<li>عمل مدرس في دولة اليمن الشقيق</li>\n" +
                        "</ul>",
                R.mipmap.abdullah_obaidat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "وائل موسى يوسف رزوق",
                "<p><strong>الاسم: </strong>وائل موسى يوسف رزوق</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 20 يوليو 1973<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو اتحاد نقابة اطباء الاسنان الاوروبية</li>\n" +
                        "<li>عضو نقابة اطباء الاسنان العرب</li>\n" +
                        "</ul>",
                R.mipmap.wael_razouk_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حسني محمد فندي الشياب",
                "<p><strong>الاسم: </strong>حسني محمد فندي الشياب</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 15 نوفمبر 1967<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>طبيب أسنان / وزارة الصحة مستشفى الأميرة بسمة</li>\n" +
                        "<li>عضو نقابة أطباء الأسنان الأردنية</li>\n" +
                        "</ul>",
                R.mipmap.hosny_shyab_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مصطفى فؤاد محمد الخصاونة",
                "<p><strong>الاسم: </strong>مصطفى فؤاد محمد الخصاونة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 15 سبتمبر 1969<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محامي مزاول من 1993 وحتى تاريخة</li>\n" +
                        "<li>عضو هيئة تدريسي</li>\n" +
                        "<li>عميد كلية الحقوق - جامعة الزرقاء</li>\n" +
                        "</ul>",
                R.mipmap.mostafa_alkhasawneh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "يوسف محمد يوسف الجراح",
                "<p><strong>الاسم: </strong>يوسف محمد يوسف الجراح</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 13 مايو 1978<p>\n",
                R.mipmap.yousef_jarrah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عيسى علي عيسى خشاشنة",
                "<p><strong>الاسم: </strong>عيسى علي عيسى خشاشنة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 5 يونيو 1960<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عميد طبيب مستشار اطفال</li>\n" +
                        "<li>مدير مستشفى سابق</li>\n" +
                        "<li>رئيس قسم الاطفال في الخدمات الطبية</li>\n" +
                        "</ul>",
                R.mipmap.issa_khashashna_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مجحم حمد حسين الصقور",
                "<p><strong>الاسم: </strong>مجحم حمد حسين الصقور</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 1 يناير 1960<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رئيس بلدية الكريمة</li>\n" +
                        "</ul>",
                R.mipmap.hamed_saqour_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ماجد محمود حسن قويسم",
                "<p><strong>الاسم: </strong>ماجد محمود حسن قويسم</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 14 يونيو 1957<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>التعليم منذ عام 1979 - 1999</li>\n" +
                        "</ul>",
                R.mipmap.wael_razouk_ic_launcher_round))


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

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 1))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 2))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 3))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 4))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 5))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 6))
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}