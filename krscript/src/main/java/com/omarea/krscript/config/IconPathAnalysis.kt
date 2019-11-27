package com.omarea.krscript.config

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import com.omarea.krscript.model.ConfigItemBase
import android.graphics.drawable.BitmapDrawable
import android.graphics.Bitmap
import com.omarea.krscript.R


class IconPathAnalysis {
    // 获取快捷方式的图标
    fun loadIcon(context: Context, configItem: ConfigItemBase): Drawable {
        if (!configItem.iconPath.isEmpty()) {
            val inputStream = PathAnalysis(context).parsePath(configItem.iconPath)
            inputStream?.run {
                return bitmap2Drawable(BitmapFactory.decodeStream(this)) // BitmapDrawable.createFromStream(inputStream, "")
            }
        }
        return context.getDrawable(R.drawable.kr_shortcut_logo)!!
    }


    // Bitmap转换成Drawable
    fun bitmap2Drawable(bitmap: Bitmap): Drawable {
        return BitmapDrawable(bitmap)
    }
}