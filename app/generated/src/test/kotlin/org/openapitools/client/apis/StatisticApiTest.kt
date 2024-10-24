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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.StatisticApi
import org.openapitools.client.models.ApiStatisticsGetCollection200Response
import org.openapitools.client.models.StatisticStatisticcreateStatisticwrite
import org.openapitools.client.models.StatisticStatisticitemread
import org.openapitools.client.models.StatisticStatisticreadStatisticitemread
import org.openapitools.client.models.StatisticStatisticwrite
import org.openapitools.client.models.StatisticjsonldStatisticcreateStatisticwrite
import org.openapitools.client.models.StatisticjsonldStatisticreadStatisticitemread

class StatisticApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of StatisticApi
        //val apiInstance = StatisticApi()

        // to test apiStatisticsGetCollection
        should("test apiStatisticsGetCollection") {
            // uncomment below to test apiStatisticsGetCollection
            //val page : kotlin.Int = 56 // kotlin.Int | The collection page number
            //val result : kotlin.collections.List<StatisticStatisticitemread> = apiInstance.apiStatisticsGetCollection(page)
            //result shouldBe ("TODO")
        }

        // to test apiStatisticsIdDelete
        should("test apiStatisticsIdDelete") {
            // uncomment below to test apiStatisticsIdDelete
            //val id : kotlin.String = id_example // kotlin.String | Statistic identifier
            //apiInstance.apiStatisticsIdDelete(id)
        }

        // to test apiStatisticsIdGet
        should("test apiStatisticsIdGet") {
            // uncomment below to test apiStatisticsIdGet
            //val id : kotlin.String = id_example // kotlin.String | Statistic identifier
            //val result : StatisticStatisticreadStatisticitemread = apiInstance.apiStatisticsIdGet(id)
            //result shouldBe ("TODO")
        }

        // to test apiStatisticsIdPatch
        should("test apiStatisticsIdPatch") {
            // uncomment below to test apiStatisticsIdPatch
            //val id : kotlin.String = id_example // kotlin.String | Statistic identifier
            //val statisticStatisticwrite : StatisticStatisticwrite =  // StatisticStatisticwrite | The updated Statistic resource
            //val result : StatisticStatisticreadStatisticitemread = apiInstance.apiStatisticsIdPatch(id, statisticStatisticwrite)
            //result shouldBe ("TODO")
        }

        // to test apiStatisticsPost
        should("test apiStatisticsPost") {
            // uncomment below to test apiStatisticsPost
            //val statisticStatisticcreateStatisticwrite : StatisticStatisticcreateStatisticwrite =  // StatisticStatisticcreateStatisticwrite | The new Statistic resource
            //val result : StatisticStatisticreadStatisticitemread = apiInstance.apiStatisticsPost(statisticStatisticcreateStatisticwrite)
            //result shouldBe ("TODO")
        }

    }
}
