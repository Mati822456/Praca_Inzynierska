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

import org.openapitools.client.apis.TaskRewardApi
import org.openapitools.client.models.ApiTaskRewardsGetCollection200Response
import org.openapitools.client.models.TaskRewardTaskRewardcreateTaskRewardwrite
import org.openapitools.client.models.TaskRewardTaskRewarditemread
import org.openapitools.client.models.TaskRewardTaskRewardreadTaskRewarditemread
import org.openapitools.client.models.TaskRewardTaskRewardwrite
import org.openapitools.client.models.TaskRewardjsonldTaskRewardcreateTaskRewardwrite
import org.openapitools.client.models.TaskRewardjsonldTaskRewardreadTaskRewarditemread

class TaskRewardApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TaskRewardApi
        //val apiInstance = TaskRewardApi()

        // to test apiTaskRewardsGetCollection
        should("test apiTaskRewardsGetCollection") {
            // uncomment below to test apiTaskRewardsGetCollection
            //val page : kotlin.Int = 56 // kotlin.Int | The collection page number
            //val result : kotlin.collections.List<TaskRewardTaskRewarditemread> = apiInstance.apiTaskRewardsGetCollection(page)
            //result shouldBe ("TODO")
        }

        // to test apiTaskRewardsIdDelete
        should("test apiTaskRewardsIdDelete") {
            // uncomment below to test apiTaskRewardsIdDelete
            //val id : kotlin.String = id_example // kotlin.String | TaskReward identifier
            //apiInstance.apiTaskRewardsIdDelete(id)
        }

        // to test apiTaskRewardsIdGet
        should("test apiTaskRewardsIdGet") {
            // uncomment below to test apiTaskRewardsIdGet
            //val id : kotlin.String = id_example // kotlin.String | TaskReward identifier
            //val result : TaskRewardTaskRewardreadTaskRewarditemread = apiInstance.apiTaskRewardsIdGet(id)
            //result shouldBe ("TODO")
        }

        // to test apiTaskRewardsIdPatch
        should("test apiTaskRewardsIdPatch") {
            // uncomment below to test apiTaskRewardsIdPatch
            //val id : kotlin.String = id_example // kotlin.String | TaskReward identifier
            //val taskRewardTaskRewardwrite : TaskRewardTaskRewardwrite =  // TaskRewardTaskRewardwrite | The updated TaskReward resource
            //val result : TaskRewardTaskRewardreadTaskRewarditemread = apiInstance.apiTaskRewardsIdPatch(id, taskRewardTaskRewardwrite)
            //result shouldBe ("TODO")
        }

        // to test apiTaskRewardsPost
        should("test apiTaskRewardsPost") {
            // uncomment below to test apiTaskRewardsPost
            //val taskRewardTaskRewardcreateTaskRewardwrite : TaskRewardTaskRewardcreateTaskRewardwrite =  // TaskRewardTaskRewardcreateTaskRewardwrite | The new TaskReward resource
            //val result : TaskRewardTaskRewardreadTaskRewarditemread = apiInstance.apiTaskRewardsPost(taskRewardTaskRewardcreateTaskRewardwrite)
            //result shouldBe ("TODO")
        }

    }
}
