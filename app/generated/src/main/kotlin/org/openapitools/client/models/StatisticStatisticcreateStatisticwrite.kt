/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param code 
 * @param name 
 * @param player 
 */


data class StatisticStatisticcreateStatisticwrite (

    @Json(name = "code")
    val code: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "player")
    val player: kotlin.String? = null

) {


}
