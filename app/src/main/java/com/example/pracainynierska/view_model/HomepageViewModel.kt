package com.example.pracainynierska.view_model

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.pracainynierska.context.PlayerContextInterface
import com.example.pracainynierska.resolver.UserPhotoResourceResolver

class HomepageViewModel(
    pc: PlayerContextInterface,
    private val appContext: Context
) : AbstractViewModel(pc) {

    private val userPhotoResourceResolver = UserPhotoResourceResolver()

    var userPhotoResId = mutableStateOf(0)

    fun getPhotoResId(): Int {
        val userPhotoPath = playerContext.getPlayer()?.userPhotoPath
        userPhotoResId.value = userPhotoPath?.takeIf { it.isNotBlank() }
            ?.let { userPhotoResourceResolver.getResId(appContext, it) } ?: 0
        return userPhotoResId.value
    }
}
