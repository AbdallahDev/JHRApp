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
                R.mipmap.majed_qweism_ic_launcher_round))



        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "خالد محمود محمد البكار البشتاوي",
                "<p><strong>الاسم: </strong>خالد محمود محمد البكار البشتاوي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 2 يوليو 1968<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير شركة في القطاع الخاص</li>\n" +
                        "<li>رئيس هيئة مديرين مستشفى ماركا الإسلامي</li>\n" +
                        "<li>أمين صندوق الاتحاد الأردني للرياضة المدرسية</li>\n" +
                        "<li>أمين سر جمعية الطاقة</li>\n" +
                        "<li>نائب امين عام حزب التيار الوطني (سابقاً)</li>\n" +
                        "</ul>",
                R.mipmap.khaled_bashtawi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ابراهيم مشرف الرضوان القرعان",
                "<p><strong>الاسم: </strong>ابراهيم مشرف الرضوان القرعان</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 8 مارس 1968<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>القوات المسلحة الاردنية</li>\n" +
                        "<li>الخدمات الطبية الملكية</li>\n" +
                        "<li>خبرات في الادارة والطب الوقائي</li>\n" +
                        "</ul>",
                R.mipmap.ibrahim_quran_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "معتز محمد موسى ابو رمان",
                "<p><strong>الاسم: </strong>معتز محمد موسى ابو رمان</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 3 ديسمبر 1975<p>\n",
                R.mipmap.moataz_rumman_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "جمال عيسى جريس قموه",
                "<p><strong>الاسم: </strong>جمال عيسى جريس قموه</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المهندس</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 8 نوفمبر 1956<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير تنفيذي لشركة مقاولات لمدة 24 سنة</li>\n" +
                        "</ul>",
                R.mipmap.jamal_gammoh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد ناصر سليم الزعبي",
                "<p><strong>الاسم: </strong>محمد ناصر سليم الزعبي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 21 ديسمبر 1959<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير شؤون الافراد (قوات حفظ السلام)</li>\n" +
                        "<li>مدير سلاح المدفعية الملكي</li>\n" +
                        "<li>ملحق عسكري</li>\n" +
                        "</ul>",
                R.mipmap.mohammed_zoubi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "فوزي شاكر طعيمه داوود",
                "<p><strong>الاسم: </strong>ماجد محمود حسن قويسم</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>30 سنة اختصاصي في العلاج النفسي والممارسات الاكلينيكية</li>\n" +
                        "</ul>",
                R.mipmap.dawzy_dawood_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "علي خلف رضوان الحجاحجة",
                "<p><strong>الاسم: </strong>علي خلف رضوان الحجاحجة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 15 يوليو 1966<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محاسب في شركة الاتصالات الاردنية</li>\n" +
                        "<li>مشرف مالي</li>\n" +
                        "<li>رئيس قسم خدمات المشتركين</li>\n" +
                        "<li>مدير مبيعات</li>\n" +
                        "<li>خبير في التطوير و التدريب الاداري</li>\n" +
                        "<li>تقديم العديد من البرامج الاذاعية والتلفزيونية</li>\n" +
                        "<li>رئيس و عضو و مؤسس لصندوق الجمعيات الخيرية</li>\n" +
                        "</ul>",
                R.mipmap.ali_hajjaja_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مصطفى رمضان عبدالقادر ياغي",
                "<p><strong>الاسم: </strong>مصطفى رمضان عبدالقادر ياغي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 28 سبتمبر 1966<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محام منذ العام 1993</li>\n" +
                        "<li>عضو مجلس بلدية عين الباشا الجديدة دورة (1995-1999) ودورة(2003-2007) بطريق الاقتراع السري المباشر</li>\n" +
                        "<li>محكم دولي وباحث قانوني</li>\n" +
                        "</ul>",
                R.mipmap.mustafa_yaghi_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ابراهيم محمد سلمان ابو السيد",
                "<p><strong>الاسم: </strong>ماجد محمود حسن قويسم</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>31 سنة تدريس</li>\n" +
                        "<li>اداري مدارس خاصة</li>\n" +
                        "</ul>",
                R.mipmap.ibrahim_sayed_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "خالد عبدالرزاق موسى الحياري",
                "<p><strong>الاسم: </strong>خالد عبدالرزاق موسى الحياري</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 13 أكتوبر 1962<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رئيس اتحاد المزارعين</li>\n" +
                        "<li>العضوية في منظمات المجتمع المدني</li>\n" +
                        "<li>اتحاد المزارعين الأردنيين</li>\n" +
                        "</ul>",
                R.mipmap.khaled_hayari_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "فضيه عبدالله فالح ابو قدورة الديات",
                "<p><strong>الاسم: </strong>فضيه عبدالله فالح ابو قدورة الديات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>انثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 4 أغسطس 1969<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>حزب الوسط الاسلامي</li>\n" +
                        "</ul>",
                R.mipmap.fadeyh_dayat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمود احمد السعود العدوان",
                "<p><strong>الاسم: </strong>محمود احمد السعود العدوان</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 30 سبتمبر 1953<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رئيس بلدية</li>\n" +
                        "<li>عضو العديد من الجمعيات الخيرية والنوادي الرياضية</li>\n" +
                        "</ul>",
                R.mipmap.mahmoud_adwan_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عاطف يوسف صالح الطراونة",
                "<p><strong>الاسم: </strong>عاطف يوسف صالح الطراونة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المهندس</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 1 يناير 1954<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>النائب الأول لرئيس مجلس النواب الأردني السادس عشر</li>\n" +
                        "<li>عضو لجنة الصداقة الأردنية الأوكرانية</li>\n" +
                        "<li>مدير عام شركة المقاولات</li>\n" +
                        "<li>نقابة المهندسين الأردنيين مهندس في شركة بترولا العالمية السعودية</li>\n" +
                        "<li>رئيس لجنة الصداقة البرلمانية الأردنية اليونانية</li>\n" +
                        "<li>العمل في قطاع التجارة والمقاولات</li>\n" +
                        "<li>رئيس شركة الضامنون العرب</li>\n" +
                        "<li>مدير هندسة البلديات</li>\n" +
                        "</ul>",
                R.mipmap.atef_tarawneh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "رجا جزاع علي الصرايرة",
                "<p><strong>الاسم: </strong>رجا جزاع علي الصرايرة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 15 فبراير 1961<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>اعمال حرة ومشاريع اقتصادية</li>\n" +
                        "</ul>",
                R.mipmap.raja_sarayra_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عبدالله غانم سليمان الزريقات",
                "<p><strong>الاسم: </strong>عبدالله غانم سليمان الزريقات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 1 يناير 1946<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ضابط متقاعد من القوات المسلحة الأردنية</li>\n" +
                        "<li>مدير مكتب ادارة شركة البوتاس</li>\n" +
                        "</ul>",
                R.mipmap.abdullah_zureikat_ic_launcher_round))



        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "هيثم جريس عودة الزيادين",
                "<p><strong>الاسم: </strong>هيثم جريس عودة الزيادين</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المهندس</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 3 أبريل 1975<p>\n",
                R.mipmap.haitham_ziadin_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مصلح أحمد موسى الطراونة",
                "<p><strong>الاسم: </strong>مصلح أحمد موسى الطراونة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 9 يناير 1971<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>استاذ (بروفسور) في القانون التجاري الدولي</li>\n" +
                        "<li>محام مجان للترافع امام جميع المحاكم - 20 عام</li>\n" +
                        "<li>محكم دولي ومستشار قانون - 20 عام</li>\n" +
                        "</ul>",
                R.mipmap.musleh_tarawneh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد سعد سلامة العتايقة",
                "<p><strong>الاسم: </strong>محمد سعد سلامة العتايقة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 19 يناير 1980<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ضابط متقاعد من القوات المسلحة الأردنية</li>\n" +
                        "<li>طبيب الامراض الباطينة منذ عام 2007-2016</li>\n" +
                        "<li>وزارة الصحة سابقاً</li>\n" +
                        "</ul>",
                R.mipmap.mohammed_ataiqa_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمود خلف حمد النعيمات",
                "<p><strong>الاسم: </strong>محمود خلف حمد النعيمات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 12 أغسطس 1964<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ضابط متقاعد من القوات المسلحة الأردنية</li>\n" +
                        "<li>عضو في نقابة المحامين</li>\n" +
                        "</ul>",
                R.mipmap.mahmoud_naimat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "صداح أحمد محمد الحباشنة",
                "<p><strong>الاسم: </strong>صداح أحمد محمد الحباشنة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 1 ديسمبر 1970<p>\n",
                R.mipmap.sadah_habashneh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "رندة عباطه عبدالله الشعار",
                "<p><strong>الاسم: </strong>رندة عباطه عبدالله الشعار</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الآنسة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: عزباء</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 27 سبتمبر 1982<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>معلمة 3 سنوات</li>\n" +
                        "</ul>",
                R.mipmap.randa_shaar_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "صباح سهو فريج الشعار",
                "<p><strong>الاسم: </strong>صباح سهو فريج الشعار</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتورة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 2 مارس 1969<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>معلمة</li>\n" +
                        "<li>مديرة مدرسة</li>\n" +
                        "<li>مدربة مع منظمة اليونسيف</li>\n" +
                        "<li>منسقة مع الهيئة الدولية الطبية</li>\n" +
                        "<li>باحثة اجتماعية</li>\n" +
                        "</ul>",
                R.mipmap.sabah_shaar_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عبدالله بديع محمد عبدالدايم القرامسة",
                "<p><strong>الاسم: </strong>عبدالله بديع محمد عبدالدايم القرامسة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 10 ديسمبر 1962<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>وزارة التربية والتعليم</li>\n" +
                        "<li>مؤسسة سكة حديد العقبة</li>\n" +
                        "<li>مؤسسة الاتصالات السلكية واللاسلكية</li>\n" +
                        "<li>وزارة البريد والاتصالات</li>\n" +
                        "<li>مؤسسة المناطق الحرة</li>\n" +
                        "<li>سلطة منطقة العقبة الاقتصادية الخاصة</li>\n" +
                        "<li>نائب رئيس جمعية سمو الاميرة رحمة الخيرية</li>\n" +
                        "<li>نائب رئيس جمعية ابناء معان في العقبة</li>\n" +
                        "<li>عضو العقبة الادارية لفرقة معان للفنون الشعبية الناطق الاعلامي للفرقة</li>\n" +
                        "</ul>",
                R.mipmap.abdullah_qaramsah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد ضيف الله سليمان الفلاحات",
                "<p><strong>الاسم: </strong>محمد ضيف الله سليمان الفلاحات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 2 أبريل 1956<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدرسة لغة انجليزية للمرحلة الثانوية</li>\n" +
                        "<li>مدير مقر تدريب لغات شركة ارامكو السعودية</li>\n" +
                        "<li>مدير لوازم مؤسسة سكة حديد العقبة</li>\n" +
                        "<li>مدرسة لغة انجليزية</li>\n" +
                        "<li>جامعة البلقاء التطبيقية / كلية معان</li>\n" +
                        "</ul>",
                R.mipmap.mohamed_falahat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ابراهيم محفوظ عطالله البدور",
                "<p><strong>الاسم: </strong>ابراهيم محفوظ عطالله البدور</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 19 مارس 1978<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>استشاري جراحة اعصاب ودماغ</li>\n" +
                        "</ul>",
                R.mipmap.ibrahim_bdoor_ic_launcher_round))



        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "خالد زاهر العبد الفناطسة",
                "<p><strong>الاسم: </strong>خالد زاهر العبد الفناطسة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 24 نوفمبر 1963<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>امين عام مساعد الاتحاد الدولي لنقابات عمال العرب</li>\n" +
                        "<li>رئيس نقابه المناجم والتعدين الاردنيه</li>\n" +
                        "<li>مستشار عمالي لرئيس مجلس اداره شركه مناجم الفوسفات الاردنيه</li>\n" +
                        "<li>رئيس النقابة العامة للعاملين في المناجم والتعدين الاردنية</li>\n" +
                        "<li>عضو سابق في حزب الجبهة الاردنية الموحدة</li>\n" +
                        "</ul>",
                R.mipmap.khaled_fanatsah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "طارق سامي حنا خوري",
                "<p><strong>الاسم: </strong>طارق سامي حنا خوري</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 1 ديسمبر 1967<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير عام شركة جورج وسامي خوري وشركاه 1988- الآن</li>\n" +
                        "<li>رئيس مجلس إدارة - الشركة العربية للصناعات الغذائية</li>\n" +
                        "<li>رئيس مجلس إدارة - شركة الحكماء للمعدات الطبية</li>\n" +
                        "<li>رئيس مجلس إدارة - شركة أليسار التجارية</li>\n" +
                        "<li>رئيس مجلس إدارة - شركة Q-Vision</li>\n" +
                        "<li>رئيس نادي الوحدات</li>\n" +
                        "</ul>",
                R.mipmap.tariq_khorey_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد جميل محمد الظهراوي",
                "<p><strong>الاسم: </strong>محمد جميل محمد الظهراوي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 31 يناير 1972<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>العمل في القطاع الخاص</li>\n" +
                        "</ul>",
                R.mipmap.mohammad_thahraoy_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد نوح علي معابدة القضاة",
                "<p><strong>الاسم: </strong>محمد نوح علي معابدة القضاة</p>\n" +
                        "<p><strong>اللقب: </strong>معالي الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 8 يونيو 1969<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مرشد ديني بالدفاع المدني</li>\n" +
                        "<li>مدرس في جامعة ال البيت وجامعة البلقاء و جامعة العلوم الاسلامية</li>\n" +
                        "<li>وزير الشباب</li>\n" +
                        "<li>وزير الاوقاف</li>\n" +
                        "</ul>",
                R.mipmap.mohammad_nooh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "سعود سالم علي ابو محفوظ",
                "<p><strong>الاسم: </strong>سعود سالم علي ابو محفوظ</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 15 ديسمبر 1952<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>خبرات واسعة في مجال العمل الخيري والاغاثي والعمل العام والاعلامي والسياسي والسياحي والحزبي الاسلامي والاجتماعي والتربوي</li>\n" +
                        "</ul>",
                R.mipmap.saoud_mahfooth_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "نبيل كامل أحمد الشيشاني",
                "<p><strong>الاسم: </strong>نبيل كامل أحمد الشيشاني</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 10 يناير 1957<p>\n",
                R.mipmap.nabeel_sheshaney_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "قصي احمد عبدالحميد الدميسي",
                "<p><strong>الاسم: </strong>قصي احمد عبدالحميد الدميسي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 30 يونيو 1968<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو سابق في المجلس الاستشاري في لواء الرصيفة</li>\n" +
                        "<li>حاصل على جائزة الملك عبدالله الثاني المعظم للعطاء والتميز</li>\n" +
                        "<li>الدكتوراه الفخرية من الاتحاد العالمي لأشراف آل البيت</li>\n" +
                        "</ul>",
                R.mipmap.qosai_dmesey_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "فيصل نايف جاد الاعور",
                "<p><strong>الاسم: </strong>فيصل نايف جاد الاعورp>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 25 أكتوبر 1968<p>\n",
                R.mipmap.faysal_aoar_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مرزوق حمد عواد الهبارنة الدعجة",
                "<p><strong>الاسم: </strong>مرزوق حمد عواد الهبارنة الدعجة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 2 مايو 1958<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو مجلس بلدية الرصيفة</li>\n" +
                        "<li>عضو مجلس استشاري الرصيفة</li>\n" +
                        "<li>رئيس جمعية الامير فيصل</li>\n" +
                        "<li>عضو جمعية شؤون الحج</li>\n" +
                        "<li>عضو الهيئة الادارية لنادي الرصيفة</li>\n" +
                        "</ul>",
                R.mipmap.marzooq_daaja_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حمود ابراهيم احمد الزواهرة",
                "<p><strong>الاسم: </strong>حمود ابراهيم احمد الزواهرة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 28 مارس 1969<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>خدمة في القوات المسلحة الاردنية</li>\n" +
                        "<li>العمل في القطاع التجاري (السيارات و العقارات)</li>\n" +
                        "</ul>",
                R.mipmap.ibrahim_bdoor_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "موسى بركات سعود الزواهرة",
                "<p><strong>الاسم: </strong>موسى بركات سعود الزواهرة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 1 سبتمبر 1965<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>وكيل متقاعد من دائرة المخابرات العامة</li>\n" +
                        "<li>عضو جمعية المستثمرين الاردنيين/الحرة /الزرقاء</li>\n" +
                        "</ul>",
                R.mipmap.mosa_zoahra_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "نواف مقبل سلمان المعلى الزيود",
                "<p><strong>الاسم: </strong>نواف مقبل سلمان المعلى الزيود</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 5 يناير 1959<p>\n",
                R.mipmap.nawaf_nemat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "علي سالم فاضل الخلايلة",
                "<p><strong>الاسم: </strong>علي سالم فاضل الخلايلة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 17 نوفمبر 1966<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير شركة عقارية</li>\n" +
                        "</ul>",
                R.mipmap.ali_khlaylah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عبدالكريم فيصل ضيف الله الدغمي",
                "<p><strong>الاسم: </strong>عبدالكريم فيصل ضيف الله الدغمي</p>\n" +
                        "<p><strong>اللقب: </strong>معالي المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 5 فبراير 1955<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>وزير العدل - 5 /2 /1996-17 /4 /1997</li>\n" +
                        "<li>وزير العمل/ وزير الشؤون رئاسة الوزراء - 1 /1 /1991-24 /10 /1991</li>\n" +
                        "<li>وزير الشؤون البلدية والقروية والبيئة - 6 /12 /1989-1 /1 /1991</li>\n" +
                        "<li>محامي مزاول</li>\n" +
                        "<li>نائب سابق لعدة دورات ورئيس مجلس نواب سابق</li>\n" +
                        "<li>عضو البرلمان العربي الانتقالي - القاهرة/جامعة الدول العربية</li>\n" +
                        "</ul>",
                R.mipmap.abdkareem_dogmy_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "رائد عقله مفلح الخزاعله",
                "<p><strong>الاسم: </strong>رائد عقله مفلح الخزاعله</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 3 مارس 1971<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير مالي ونائب مدير عام شركة توزيع الغاز الطبيعي - الرياض - المملكة العربية السعودية</li>\n" +
                        "<li>مدير عام شركة الافضلية - الرياض - الحي الدبلوماسي</li>\n" +
                        "<li>مدير تنفيذي لشركة تقنية الالواح - الرياض - المدينة الصناعية</li>\n" +
                        "</ul>",
                R.mipmap.rayed_khazalah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مفلح محمد مفلح الخزاعلة",
                "<p><strong>الاسم: </strong>مفلح محمد مفلح الخزاعلة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 30 أغسطس 1957<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رئيس قسم في وزارة المياه والري</li>\n" +
                        "<li>مدير عام شركة خاصة</li>\n" +
                        "</ul>",
                R.mipmap.mofleh_khazalah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "شعيب خلف المحمد الشديفات",
                "<p><strong>الاسم: </strong>شعيب خلف المحمد الشديفات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 27 يونيو 1973<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ممارسة مهنة المحاماة منذ عام 1995 الى الآن</li>\n" +
                        "</ul>",
                R.mipmap.ibrahim_bdoor_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمود جميل خلف الفراهيد",
                "<p><strong>الاسم: </strong>محمود جميل خلف الفراهيد</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 17 يونيو 1959<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير مركز اصلاح وتاهيل سواقة</li>\n" +
                        "<li>مدير شرطة الكرك</li>\n" +
                        "<li>مدير شرطة شرق عمان</li>\n" +
                        "<li>مدير شرطة محافظة معان</li>\n" +
                        "<li>مدير ادارة الدوريات الخارجية</li>\n" +
                        "<li>محاضر مدرسة الاستخبارات العسكرية</li>\n" +
                        "<li>محاضر باكاديمية الشرطة الملكية</li>\n" +
                        "</ul>",
                R.mipmap.mahmood_fraheed_ic_launcher_round))



        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حسن عصري عبدالقادر السعود",
                "<p><strong>الاسم: </strong>حسن عصري عبدالقادر السعود</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 24 أبريل 1966<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدرس في جامعة مؤتة من 1990 الى 1994 ومن 2000 الى 2009</li>\n" +
                        "<li>مدرس في الجامعة الاردنية من 2009 الى 2016</li>\n" +
                        "<li>مساعد عميد شؤون الطلبة جامعة مؤتة</li>\n" +
                        "<li>نائب عميد شؤون الطلبة في الجامعة الاردنية</li>\n" +
                        "</ul>",
                R.mipmap.hasan_soud_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حسين عطية موسى القيسي",
                "<p><strong>الاسم: </strong>حسين عطية موسى القيسي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 1 يناير 1966<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محامي استاذ مزاول مدة 25 سنة</li>\n" +
                        "</ul>",
                R.mipmap.hoseen_qesey_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "غازي محمد سالم الهواملة",
                "<p><strong>الاسم: </strong>غازي محمد سالم الهواملة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 5 سبتمبر 1970<p>\n",
                R.mipmap.ghazey_hwamleh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عبدالقادر سلمان نوري الفشيكات الازايدة",
                "<p><strong>الاسم: </strong>عبدالقادر سلمان نوري الفشيكات الازايدة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 15 يناير 1961<p>\n",
                R.mipmap.abdqader_azaydah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "نبيل ميخائيل عودة الغيشان",
                "<p><strong>الاسم: </strong>نبيل ميخائيل عودة الغيشان</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 28 ديسمبر 1957<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>صحفي / رئيس تحرير جريدة العرب اليوم</li>\n" +
                        "</ul>",
                R.mipmap.nabeel_geshan_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عدنان سعيد محمد الركيبات",
                "<p><strong>الاسم: </strong>عدنان سعيد محمد الركيبات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 15 مارس 1975<p>\n",
                R.mipmap.mahmood_fraheed_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "زيد محمد فلاح الشوابكة",
                "<p><strong>الاسم: </strong>زيد محمد فلاح الشوابكة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محامي.</li>\n" +
                        "<li>عضو مجلس بلدي مأدبا لدورتين متتاليتين.</li>\n" +
                        "<li>رئيس اللجنة القانونية لمجلس بلدي مأدبا سابقاً.</li>\n" +
                        "</ul>",
                R.mipmap.zeed_shawabkah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد عبدالفتاح محمود هديب",
                "<p><strong>الاسم: </strong>محمد عبدالفتاح محمود هديب</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 1 سبتمبر 1968<p>\n",
                R.mipmap.mohammad_hdeeb_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "هدى حسين محمد العتوم",
                "<p><strong>الاسم: </strong>هدى حسين محمد العتوم</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 12 أكتوبر 1964<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مديرة مدرسة ثانوية</li>\n" +
                        "<li>معلمة ثانوي</li>\n" +
                        "</ul>",
                R.mipmap.huda_otoom_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عقله غمار مفلح الزبون",
                "<p><strong>الاسم: </strong>عقله غمار مفلح الزبون</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 16 يونيو 1963<p>\n",
                R.mipmap.oqlah_zboon_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد حسين محمد ابو سته العياصرة",
                "<p><strong>الاسم: </strong>محمد حسين محمد ابو سته العياصرة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 10 أكتوبر 1962<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>خدمة 30 عام في الخدمات الطبية / المختبرات</li>\n" +
                        "<li>مدير المختبر لمعظم مستشفيات الخدمات الطبية</li>\n" +
                        "<li>رئيس قسم الميكوبيولوجي بالمدينة الطبية</li>\n" +
                        "<li>رئيس شعبة الجودة والرقابة النوعية والاعتمادية</li>\n" +
                        "<li>رئيس لجنة العطاءات / ممثل الخدمات الطبية لدى دائرة اللوازم العامة</li>\n" +
                        "<li>ممثل الخدمات الطبية في لجنة مكافحة المخدرات</li>\n" +
                        "</ul>",
                R.mipmap.mohammad_ayasrah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "كمال احمد محمد الزغول",
                "<p><strong>الاسم: </strong>كمال احمد محمد الزغول</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 22 أغسطس 1972<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رجل اعمال/ مدير عدة مشاريع.</li>\n" +
                        "</ul>",
                R.mipmap.kamal_zgool_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "وصفي هلال عبدالله حداد",
                "<p><strong>الاسم: </strong>وصفي هلال عبدالله حداد</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 20 يونيو 1965<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ضابط متقاعد من الاستخبارات العسكرية</li>\n" +
                        "<li>مساعد ملحق عسكري السفارة الاردنية - بغداد</li>\n" +
                        "<li>موظف بنك القاهرة عمان - الادارة العامة</li>\n" +
                        "<li>مؤسس ورئيس جمعية البيئة السياحية</li>\n" +
                        "<li>منسق لجنة العمل التطوعي لمحافظة عجلون</li>\n" +
                        "<li>رئيس جمعية جبال عرجان الخيرية</li>\n" +
                        "<li>رئيس منتدى عرجان الثقافي</li>\n" +
                        "</ul>",
                R.mipmap.wasfee_haddad_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "صفاء عبدالله محمد المومني",
                "<p><strong>الاسم: </strong>صفاء عبدالله محمد المومني</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتورة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: مطلقة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 1 فبراير 1978<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدرسة في وزارة التربية والتعليم</li>\n" +
                        "<li>مدرسة في جامعة العلوم والتكنولوجيا</li>\n" +
                        "<li>مدرسة في الجامعة الاردنية (محاضر غير متفرغ)</li>\n" +
                        "<li>استاذ مساعد - جامعة جرش الاهلية</li>\n" +
                        "</ul>",
                R.mipmap.safa_momany_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "احمد حسن سليمان الفريحات",
                "<p><strong>الاسم: </strong>احمد حسن سليمان الفريحات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 2 سبتمبر 1960<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رئيس لقسم الشؤون القانونية في المؤسسة الاستهلاكية المدنية</li>\n" +
                        "<li>محامي نظامي شرعي خبره 13 سنه</li>\n" +
                        "<li>عضوا في المجلس الاستشاري للواء كفرنجة</li>\n" +
                        "</ul>",
                R.mipmap.ahmad_freehat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد علي حسن الرياطي",
                "<p><strong>الاسم: </strong>محمد علي حسن الرياطي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مالك ومدير عام شركة الشهامة للمقاولات الانشائية</li>\n" +
                        "</ul>",
                R.mipmap.mohammad_reyatee_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حازم صالح صالح المجالي",
                "<p><strong>الاسم: </strong>حازم صالح صالح المجالي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 8 أبريل 1965<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير خدمة الزبائن (شركة اورنج) 1987 - 2009</li>\n" +
                        "<li>مدير الشكاوي والاقتراحات 2009 - 2011 - (Aseza)</li>\n" +
                        "<li>مدير خدمة علاقات العملاء النافذة الواحدة 2011 - 2015</li>\n" +
                        "<li>مدير النقل 2015 - 2016 - (Aseza)</li>\n" +
                        "</ul>",
                R.mipmap.hazem_majali_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ابراهيم عبدالرزاق سليمان ابو العز",
                "<p><strong>الاسم: </strong>ابراهيم عبدالرزاق سليمان ابو العز</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 25 ديسمبر<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رئيس بلدية العقبة</li>\n" +
                        "<li>عضو مجلس ادارة سلطة اقليم العقبة</li>\n" +
                        "<li>عضو مجلس استشاري سلطة منطقة العقبة الاقتصادية الخاصة</li>\n" +
                        "<li>عضو مجلس استشاري محافظة معان + العقبة</li>\n" +
                        "<li>عضو نقابة المحامين الاردنيين</li>\n" +
                        "<li>عضو هيئات ادارية جمعيات خيرية واندية رياضية</li>\n" +
                        "<li>عضو هيئة ادارية مركز الاميرة بسمة - العقبة</li>\n" +
                        "<li>امين عام جميعة المركز الاسلامي الخيرية</li>\n" +
                        "</ul>",
                R.mipmap.ibraheem_abuez_ic_launcher_round))



        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حابس ركاد خليف الشبيب",
                "<p><strong>الاسم: </strong>حابس ركاد خليف الشبيب</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 1 يناير 1974<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>موظف في وزارة الداخلية</li>\n" +
                        "</ul>",
                R.mipmap.habes_shabeeb_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مازن تركي سعود القاضي",
                "<p><strong>الاسم: </strong>مازن تركي سعود القاضي</p>\n" +
                        "<p><strong>اللقب: </strong>معالي المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 1 يناير 1957<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير للامن العام 2007-2010</li>\n" +
                        "<li>وزير سابق للداخلية</li>\n" +
                        "<li>امين عام حزب الوفاء</li>\n" +
                        "</ul>",
                R.mipmap.mazen_qadee_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "صوان طلب مريبيع الشرفات",
                "<p><strong>الاسم: </strong>صوان طلب مريبيع الشرفات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتور</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 15 يوليو 1965<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محاضر اكاديمي جامعات</li>\n" +
                        "<li>ضابط متقاعد</li>\n" +
                        "<li>رئيس نادي و جمعيات</li>\n" +
                        "<li>عضو مجلس المحافظه</li>\n" +
                        "</ul>",
                R.mipmap.sawan_sharafat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "سليمان حويلة عيد الزبن",
                "<p><strong>الاسم: </strong>سليمان حويلة عيد الزبن</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 2 مايو 1968<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محامي مزاول</li>\n" +
                        "<li>مدرس في جامعة الزيتونة</li>\n" +
                        "<li>محاضر غير متفرغ جامعة مؤتة</li>\n" +
                        "<li>ضابط متقاعد من القوات المسلحة الأردنية</li>\n" +
                        "<li>عضو المنظمة العربية لحقوق الانسان</li>\n" +
                        "</ul>",
                R.mipmap.sleman_zeben_ic_launcher_round))



        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محاسن منيزل عطية الشرعة",
                "<p><strong>الاسم: </strong>محاسن منيزل عطية الشرعة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 4 نوفمبر 1957<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ضابط متقاعد من القوات المسلحة الاردنية - الجيش العربي</li>\n" +
                        "<li>قائد منطقة عسكرية</li>\n" +
                        "<li>رئيس اكاديمية الملك عبدالله الثاني للدراسات الدفاعية</li>\n" +
                        "</ul>",
                R.mipmap.mhasen_shraa_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حابس سامي مثقال الفايز",
                "<p><strong>الاسم: </strong>حابس سامي مثقال الفايز</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 10 مارس 1964<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رئيس بلدية الجيزة - ثلاثة دورات متتالية</li>\n" +
                        "<li>عضو مجلس امانة عمان</li>\n" +
                        "</ul>",
                R.mipmap.habes_fayez_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "نواف حسين فرحان النعيمات",
                "<p><strong>الاسم: </strong>نواف حسين فرحان النعيمات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 2 فبراير 1963<p>\n",
                R.mipmap.nawaf_nemat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "محمد عايد صباح العمامره السليمانين الحويطات",
                "<p><strong>الاسم: </strong>محمد عايد صباح العمامره السليمانين الحويطات</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيد</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 11 ديسمبر 1965<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>استاذ في جامعة الحسين بالثقافة العسكرية لمدة 4 سنوات</li>\n" +
                        "</ul>",
                R.mipmap.mohammad_hwetat_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عواد محمد سلمان الزوايدة",
                "<p><strong>الاسم: </strong>عواد محمد سلمان الزوايدة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامي</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوج</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 20 سبتمبر 1962<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>رئيس مجلس ادارة شركة البحار الدولية</li>\n" +
                        "<li>عضو مجلس ادارة مؤسسة الاقراض الزراعي</li>\n" +
                        "<li>المؤتمر العام للفدرالية الدولية للعاملين في الزراعة-فرنسا</li>\n" +
                        "<li>نقابة المحامين الاردنيين</li>\n" +
                        "<li>رئيس جمعية الديسي التعاونية</li>\n" +
                        "<li>رئيس اتحاد مزارعي العقبة</li>\n" +
                        "<li>الاتحاد العام للمزارعين الاردنيين</li>\n" +
                        "</ul>",
                R.mipmap.awwad_zwaydeh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ديمه محمد طارق طهبوب",
                "<p><strong>الاسم: </strong>ديمه محمد طارق طهبوب</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتورة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: ارملة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 23 سبتمبر 1976<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>استاذ مساعد الجامعة العربية المفتوحة</li>\n" +
                        "</ul>",
                R.mipmap.demah_tahboob_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "انتصار بادي مصطفى حجازي",
                "<p><strong>الاسم: </strong>انتصار بادي مصطفى حجازي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الآنسة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: عزباء</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أحد 2 أبريل 1961<p>\n",
                R.mipmap.intesar_hejazy_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "هيا حسين علي مفلح الشبلي العبادي",
                "<p><strong>الاسم: </strong>هيا حسين علي مفلح الشبلي العبادي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 16 مارس 1968<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدرسة وناشطة اجتماعية</li>\n" +
                        "<li>عضو مؤسس في جمعية ماحص للعلوم والثقافة</li>\n" +
                        "<li>عضو تجمع لجان المرأة</li>\n" +
                        "</ul>",
                R.mipmap.hya_abbadey_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "منال علي عبدالرحمن الضمور",
                "<p><strong>الاسم: </strong>منال علي عبدالرحمن الضمور</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامية</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 1 يناير 1971<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مزاولة لمهنة المحاماه من عام 1994</li>\n" +
                        "</ul>",
                R.mipmap.manal_dmoor_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ابتسام يوسف خليل النوافلة",
                "<p><strong>الاسم: </strong>ابتسام يوسف خليل النوافلة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 21 نوفمبر<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>ملعمة</li>\n" +
                        "</ul>",
                R.mipmap.ibtisam_nawafleh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "حياة حسين علي مسيمي",
                "<p><strong>الاسم: </strong>حياة حسين علي مسيمي</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتورة</p>\n" +
                        "<p><strong>الجنس: </strong>ذكر</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: ثلاثاء 30 أكتوبر 1962<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو ملتقى القدس الثقافي</li>\n" +
                        "<li>عضو المنتدى الاسلامي العالمي للمرأة والاسرة</li>\n" +
                        "</ul>",
                R.mipmap.hayat_masemy_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "ريم عقلة نواش ابو دلبوح",
                "<p><strong>الاسم: </strong>ريم عقلة نواش ابو دلبوح</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الدكتورة المحامية</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: عزباء</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 15 يناير 1970<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>محاضر غير متفرغ في الجامعة الهاشمية</li>\n" +
                        "<li>خبرة في التدريس في جامعة الزرقاء الأهلية</li>\n" +
                        "<li>مزاوله لمهنة المحاماة منذ عام 1994\\\\دكتوراه في القانون الخاص" +
                        "</li>\n" +
                        "<li>مقرر تجمع لجان المرأة الوطني الأردني\\\\لمحافظة المفرق 1996-2007" +
                        "</li>\n" +
                        "<li>عضو اللجنة المنبثقة عن المبادرة الملكية السامية (الأردن اولا)" +
                        "</li>\n" +
                        "<li>ممثلة المجتمع المحلي وعضو مجلس جامعة آل البيت</li>\n" +
                        "<li>عضو المجلس الاستشاري في المفرق 1997-2009</li>\n" +
                        "<li>باحثة قانونية لأبحاث منشوره دوليا</li>\n" +
                        "</ul>",
                R.mipmap.reem_abudalbooh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "انصاف احمد سلامة الخوالدة",
                "<p><strong>الاسم: </strong>انصاف احمد سلامة الخوالدة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: أربعاء 1 يناير 1958<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مديرة مدرسه لمده 20 سنه في مناطق مادبا والعقبة والكرك والطفيلة وعمان</li>\n" +
                        "<li>نائب سابق لأكثر من دورة - ممثله عن منطقة لواء بصيرا</li>\n" +
                        "</ul>",
                R.mipmap.insaf_khawaldeh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "مرام مسلم علي الحيصة",
                "<p><strong>الاسم: </strong>مرام مسلم علي الحيصة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الآنسة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: عزباء</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 29 يونيو 1979<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير عام اقليمي لمؤسسة اكاديمية</li>\n" +
                        "</ul>",
                R.mipmap.maram_heesah_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "وفاء سعيد يعقوب بني مصطفى",
                "<p><strong>الاسم: </strong>وفاء سعيد يعقوب بني مصطفى</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة المحامية</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: جمعة 16 مارس 1979<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو نقابة المحامين</li>\n" +
                        "</ul>",
                R.mipmap.wafaa_banimustafa_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "منتهى عبدالجواد احمد البعول",
                "<p><strong>الاسم: </strong>منتهى عبدالجواد احمد البعول</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 7 ديسمبر 1961<p>\n",
                R.mipmap.montaha_bool_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "عليا عودة نصار ابو هليل",
                "<p><strong>الاسم: </strong>عليا عودة نصار ابو هليل</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 9 أكتوبر 1958<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>معلمة في وزارة التربية والتعليم 1992 - 2007</li>\n" +
                        "<li>مشرفة مرحلة للصفوف الثلاثة الاولى 2007 - 2016</li>\n" +
                        "<li>مدرسة لمناطق جيوب الفقر في وادي عربة</li>" +
                        "</ul>",
                R.mipmap.alia_abuhleyel_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "زينب حمود سالم الزبيد",
                "<p><strong>الاسم: </strong>زينب حمود سالم الزبيد</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة الآنسة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: عزباء</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: سبت 20 سبتمبر 1986<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مدير لدى UNHCR</li>\n" +
                        "<li>موظف UNDOP</li>\n" +
                        "<li>موظف Acred</li>" +
                        "</ul>",
                R.mipmap.zaineb_zbeed_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "رسميه علي عوض الكعابنة",
                "<p><strong>الاسم: </strong>رسميه علي عوض الكعابنة</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: عزباء</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: خميس 1 مارس 1973<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>مشرفة مشاريع جيوب الفقر /الصندوق الاردني الهاشمي للتنمية البشرية</li>\n" +
                        "<li>عضو الغرفة التجارية الامريكية الاردنية</li>\n" +
                        "<li>مديرة الاستشارات والتخطيط الاستراتيجي</li>\n" +
                        "</ul>",
                R.mipmap.rasmiah_kaabneh_ic_launcher_round))

        p0?.execSQL("insert into deputy(name, info, image) values(?, ?, ?)", arrayOf(
                "شاهه سالم سليم ابو شوشه العمارين",
                "<p><strong>الاسم: </strong>شاهه سالم سليم ابو شوشه العمارين</p>\n" +
                        "<p><strong>اللقب: </strong>سعادة السيدة</p>\n" +
                        "<p><strong>الجنس: </strong>أنثى</p>\n" +
                        "<p><strong>الحالة الاجتماعية</strong>: متزوجة</p>\n" +
                        "<p><strong>تاريخ الميلاد</strong>: اثنين 7 يونيو 1976<p>\n" +
                        "\n" +
                        "<br>\n" +
                        "<p><strong>الخبرات والوظائف السابقة</strong></p>\n" +
                        "<ul>\n" +
                        "<li>عضو مجلس بلدي لدورتين متتاليتين</li>\n" +
                        "<li>رئيس جمعية سيادة الشريف ناصر بن جميل الخيرية</li>\n" +
                        "<li>التقدير والتميز من عدة جهات رسمية ودولية</li>\n" +
                        "<li>حاصلة على عدة دورات في الحاسوب</li>\n" +
                        "<li>دورة في الإدارة والتنظيم</li>\n" +
                        "<li>دورة في إقامة وتنظيم المشاريع الإنتاجية</li>\n" +
                        "<li>دورة في مهارات الاتصال والتواصل</li>\n" +
                        "<li>دورة في التخطيط الاستراتيجي</li>\n" +
                        "<li>دورة في بناء المشاريع الفردية ومشاريع الآسر المنتجة</li>\n" +
                        "</ul>",
                R.mipmap.shahaa_amareen_ic_launcher_round))


        //bellow is the committee table creation and insertion
        p0?.execSQL("CREATE TABLE committee ( committee_id INTEGER PRIMARY KEY AUTOINCREMENT, committee_name VARCHAR(50), committee_image INTEGER)")

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "اللجنة القانونية", R.mipmap.law_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "اللجنة المالية", R.mipmap.finance_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الاقتصاد والاستثمار", R.mipmap.commerce_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الشؤون الخارجية", R.mipmap.affairs_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "اللجنة الادارية", R.mipmap.administration_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة التربية والتعليم والثقافة", R.mipmap.education_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الشباب والرياضة", R.mipmap.sport_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة التوجيه الوطني والاعلام", R.mipmap.media_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الصحة والبيئة", R.mipmap.health_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الزراعة والمياه", R.mipmap.agriculture_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة العمل والتنمية الاجتماعية والسكان", R.mipmap.work_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الطاقة والثروة المعدنية", R.mipmap.energy_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الخدمات العامة والنقل", R.mipmap.services_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة السياحة والاثار", R.mipmap.tourisim_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الحريات العامة وحقوق الانسان", R.mipmap.liberties_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة فلسطين", R.mipmap.palestain_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة الريف والبادية", R.mipmap.country_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة النظام والسلوك", R.mipmap.system_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة النزاهة والشفافية وتقصي الحقائق", R.mipmap.integrity_committee_launcher_round))

        p0?.execSQL("insert into committee (committee_name, committee_image) values(?, ?)", arrayOf(
                "لجنة المرأة وشؤون الاسرة", R.mipmap.woman_committee_launcher_round))


        //bellow is the committee_deputy table creation and insertion
        p0?.execSQL("CREATE TABLE `committee_deputy` ( `committee_id` INTEGER NOT NULL, `deputy_id` INTEGER NOT NULL )")

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 90))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 53))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 122))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 95))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 86))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 103))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 119))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 106))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 107))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 31))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(1, 41))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 17))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 48))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 29))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 36))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 3))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 8))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 22))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 23))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 100))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 115))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(2, 4))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 18))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 63))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 9))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 61))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 23))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 128))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 86))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 59))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 29))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 99))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 8))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 85))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 129))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 12))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 126))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 101))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 51))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 24))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 34))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 15))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(4, 116))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(3, 124))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 79))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 30))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 47))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 55))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 52))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 21))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 106))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 82))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 118))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 111))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(5, 43))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 62))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 67))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 89))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 33))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 97))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 120))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 51))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 70))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 127))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 118))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(6, 102))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 96))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 32))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 105))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 67))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 38))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 73))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 76))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 11))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 109))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 44))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(7, 130))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 38))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 104))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 26))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 93))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 102))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 96))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 125))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 117))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 75))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 17))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(8, 92))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 70))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 43))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 121))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 47))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 63))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 99))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 114))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 33))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 79))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 35))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(9, 40))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 55))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 52))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 5))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 56))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 80))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 45))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 107))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 44))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 100))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 94))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(10, 112))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 71))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 48))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 13))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 68))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 83))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 46))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 64))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 88))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 20))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 82))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(11, 114))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 61))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 89))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 21))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 90))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 71))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 62))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 49))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 12))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 83))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(12, 68))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 27))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 117))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 28))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 35))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 10))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 59))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 40))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 36))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 42))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 25))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(13, 50))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 101))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 77))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 126))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 20))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 1))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 93))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 39))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 119))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 92))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 123))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(14, 103))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 115))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 28))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 45))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 125))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 130))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 15))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 27))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 19))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 7))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 87))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(15, 24))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 7))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 77))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 19))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 1))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 73))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 105))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 32))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 54))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 9))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 75))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(16, 88))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(17, 7))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(17, 109))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(17, 128))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(17, 2))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(17, 113))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 64))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 112))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 91))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 108))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 66))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 34))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 87))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 80))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 25))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(18, 37))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 95))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 30))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 113))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 4))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 123))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 53))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 41))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 91))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 98))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 116))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(19, 120))

        //new committee insertion
        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 122))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 127))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 97))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 66))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 121))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 129))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 13))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 26))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 56))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 85))

        p0?.execSQL("insert into committee_deputy values(?, ?)", arrayOf(20, 124))

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


