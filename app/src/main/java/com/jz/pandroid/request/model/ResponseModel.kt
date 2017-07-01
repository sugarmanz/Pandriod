package com.jz.pandroid.request.model

/**
 * Created by jzucker on 7/1/17.
 */
data class ResponseModel(val stat: String, val result: HashMap<String, *>) {
    val isOk get() = stat.equals("ok", true)
}