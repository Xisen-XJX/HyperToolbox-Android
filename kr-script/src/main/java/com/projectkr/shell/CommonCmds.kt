package com.omarea.shared

import android.os.Environment

/**
 * Created by Hello on 2017/2/22.
 */

object CommonCmds {
    const val PACKAGE_NAME = "com.omarea.vtools"
    val SDCardDir: String = Environment.getExternalStorageDirectory().absolutePath
}
