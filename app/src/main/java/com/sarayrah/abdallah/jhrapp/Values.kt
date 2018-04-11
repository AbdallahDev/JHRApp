package com.sarayrah.abdallah.jhrapp

/**
 * Created by abdallah.sarayrah on 3/26/2018.
 */
//this class to store static page names, to decide which one choose from the about fragment
class Values {
    companion object {
        //by the bellow variable i store the about page name to use it later in the needed pages
        var page_name = ""
        //by the bellow variables i store the deputy details from the db to use it in all the pages
        var deputy_name = ""
        var deputy_info = ""
        var deputy_image = 0

        //this variable used to define the selected committee to view it's deputies
        var committee_id = 0
    }
}
