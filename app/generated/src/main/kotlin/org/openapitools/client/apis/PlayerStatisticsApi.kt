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

import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

import org.openapitools.client.models.ApiPlayerStatisticsGetCollection200Response
import org.openapitools.client.models.PlayerStatisticsPlayerStatisticscreatePlayerStatisticswrite
import org.openapitools.client.models.PlayerStatisticsPlayerStatisticsitemread
import org.openapitools.client.models.PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread
import org.openapitools.client.models.PlayerStatisticsPlayerStatisticswrite
import org.openapitools.client.models.PlayerStatisticsjsonldPlayerStatisticscreatePlayerStatisticswrite
import org.openapitools.client.models.PlayerStatisticsjsonldPlayerStatisticsreadPlayerStatisticsitemread

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class PlayerStatisticsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Retrieves the collection of PlayerStatistics resources.
     * Retrieves the collection of PlayerStatistics resources.
     * @param page The collection page number (optional, default to 1)
     * @return kotlin.collections.List<PlayerStatisticsPlayerStatisticsitemread>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiPlayerStatisticsGetCollection(page: kotlin.Int? = 1) : kotlin.collections.List<PlayerStatisticsPlayerStatisticsitemread> {
        val localVarResponse = apiPlayerStatisticsGetCollectionWithHttpInfo(page = page)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<PlayerStatisticsPlayerStatisticsitemread>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Retrieves the collection of PlayerStatistics resources.
     * Retrieves the collection of PlayerStatistics resources.
     * @param page The collection page number (optional, default to 1)
     * @return ApiResponse<kotlin.collections.List<PlayerStatisticsPlayerStatisticsitemread>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiPlayerStatisticsGetCollectionWithHttpInfo(page: kotlin.Int?) : ApiResponse<kotlin.collections.List<PlayerStatisticsPlayerStatisticsitemread>?> {
        val localVariableConfig = apiPlayerStatisticsGetCollectionRequestConfig(page = page)

        return request<Unit, kotlin.collections.List<PlayerStatisticsPlayerStatisticsitemread>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiPlayerStatisticsGetCollection
     *
     * @param page The collection page number (optional, default to 1)
     * @return RequestConfig
     */
    fun apiPlayerStatisticsGetCollectionRequestConfig(page: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json, application/ld+json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/player_statistics",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Removes the PlayerStatistics resource.
     * Removes the PlayerStatistics resource.
     * @param id PlayerStatistics identifier
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiPlayerStatisticsIdDelete(id: kotlin.String) : Unit {
        val localVarResponse = apiPlayerStatisticsIdDeleteWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Removes the PlayerStatistics resource.
     * Removes the PlayerStatistics resource.
     * @param id PlayerStatistics identifier
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiPlayerStatisticsIdDeleteWithHttpInfo(id: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = apiPlayerStatisticsIdDeleteRequestConfig(id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiPlayerStatisticsIdDelete
     *
     * @param id PlayerStatistics identifier
     * @return RequestConfig
     */
    fun apiPlayerStatisticsIdDeleteRequestConfig(id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/player_statistics/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Retrieves a PlayerStatistics resource.
     * Retrieves a PlayerStatistics resource.
     * @param id PlayerStatistics identifier
     * @return PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiPlayerStatisticsIdGet(id: kotlin.String) : PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread {
        val localVarResponse = apiPlayerStatisticsIdGetWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Retrieves a PlayerStatistics resource.
     * Retrieves a PlayerStatistics resource.
     * @param id PlayerStatistics identifier
     * @return ApiResponse<PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiPlayerStatisticsIdGetWithHttpInfo(id: kotlin.String) : ApiResponse<PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread?> {
        val localVariableConfig = apiPlayerStatisticsIdGetRequestConfig(id = id)

        return request<Unit, PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiPlayerStatisticsIdGet
     *
     * @param id PlayerStatistics identifier
     * @return RequestConfig
     */
    fun apiPlayerStatisticsIdGetRequestConfig(id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json, application/ld+json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/player_statistics/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Updates the PlayerStatistics resource.
     * Updates the PlayerStatistics resource.
     * @param id PlayerStatistics identifier
     * @param playerStatisticsPlayerStatisticswrite The updated PlayerStatistics resource
     * @return PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiPlayerStatisticsIdPatch(id: kotlin.String, playerStatisticsPlayerStatisticswrite: PlayerStatisticsPlayerStatisticswrite) : PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread {
        val localVarResponse = apiPlayerStatisticsIdPatchWithHttpInfo(id = id, playerStatisticsPlayerStatisticswrite = playerStatisticsPlayerStatisticswrite)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Updates the PlayerStatistics resource.
     * Updates the PlayerStatistics resource.
     * @param id PlayerStatistics identifier
     * @param playerStatisticsPlayerStatisticswrite The updated PlayerStatistics resource
     * @return ApiResponse<PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiPlayerStatisticsIdPatchWithHttpInfo(id: kotlin.String, playerStatisticsPlayerStatisticswrite: PlayerStatisticsPlayerStatisticswrite) : ApiResponse<PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread?> {
        val localVariableConfig = apiPlayerStatisticsIdPatchRequestConfig(id = id, playerStatisticsPlayerStatisticswrite = playerStatisticsPlayerStatisticswrite)

        return request<PlayerStatisticsPlayerStatisticswrite, PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiPlayerStatisticsIdPatch
     *
     * @param id PlayerStatistics identifier
     * @param playerStatisticsPlayerStatisticswrite The updated PlayerStatistics resource
     * @return RequestConfig
     */
    fun apiPlayerStatisticsIdPatchRequestConfig(id: kotlin.String, playerStatisticsPlayerStatisticswrite: PlayerStatisticsPlayerStatisticswrite) : RequestConfig<PlayerStatisticsPlayerStatisticswrite> {
        val localVariableBody = playerStatisticsPlayerStatisticswrite
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/merge-patch+json"
        localVariableHeaders["Accept"] = "application/json, application/ld+json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/api/player_statistics/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Creates a PlayerStatistics resource.
     * Creates a PlayerStatistics resource.
     * @param playerStatisticsPlayerStatisticscreatePlayerStatisticswrite The new PlayerStatistics resource
     * @return PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiPlayerStatisticsPost(playerStatisticsPlayerStatisticscreatePlayerStatisticswrite: PlayerStatisticsPlayerStatisticscreatePlayerStatisticswrite) : PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread {
        val localVarResponse = apiPlayerStatisticsPostWithHttpInfo(playerStatisticsPlayerStatisticscreatePlayerStatisticswrite = playerStatisticsPlayerStatisticscreatePlayerStatisticswrite)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Creates a PlayerStatistics resource.
     * Creates a PlayerStatistics resource.
     * @param playerStatisticsPlayerStatisticscreatePlayerStatisticswrite The new PlayerStatistics resource
     * @return ApiResponse<PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiPlayerStatisticsPostWithHttpInfo(playerStatisticsPlayerStatisticscreatePlayerStatisticswrite: PlayerStatisticsPlayerStatisticscreatePlayerStatisticswrite) : ApiResponse<PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread?> {
        val localVariableConfig = apiPlayerStatisticsPostRequestConfig(playerStatisticsPlayerStatisticscreatePlayerStatisticswrite = playerStatisticsPlayerStatisticscreatePlayerStatisticswrite)

        return request<PlayerStatisticsPlayerStatisticscreatePlayerStatisticswrite, PlayerStatisticsPlayerStatisticsreadPlayerStatisticsitemread>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiPlayerStatisticsPost
     *
     * @param playerStatisticsPlayerStatisticscreatePlayerStatisticswrite The new PlayerStatistics resource
     * @return RequestConfig
     */
    fun apiPlayerStatisticsPostRequestConfig(playerStatisticsPlayerStatisticscreatePlayerStatisticswrite: PlayerStatisticsPlayerStatisticscreatePlayerStatisticswrite) : RequestConfig<PlayerStatisticsPlayerStatisticscreatePlayerStatisticswrite> {
        val localVariableBody = playerStatisticsPlayerStatisticscreatePlayerStatisticswrite
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json, application/ld+json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/player_statistics",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
