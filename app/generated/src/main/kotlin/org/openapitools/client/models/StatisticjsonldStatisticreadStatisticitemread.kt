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

import org.openapitools.client.models.CategoryJsonldCategoryReadCategoryItemReadContext

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param code 
 * @param atContext 
 * @param atId 
 * @param atType 
 * @param id 
 * @param name 
 * @param player 
 */


data class StatisticjsonldStatisticreadStatisticitemread (

    @Json(name = "code")
    val code: kotlin.String,

    @Json(name = "@context")
    val atContext: CategoryJsonldCategoryReadCategoryItemReadContext? = null,

    @Json(name = "@id")
    val atId: kotlin.String? = null,

    @Json(name = "@type")
    val atType: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "player")
    val player: kotlin.String? = null

) {


}

