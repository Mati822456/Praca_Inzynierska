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

import org.openapitools.client.models.ApiSettingsGetCollection200Response
import org.openapitools.client.models.SettingsSettingscreateSettingswrite
import org.openapitools.client.models.SettingsSettingsitemread
import org.openapitools.client.models.SettingsSettingsreadSettingsitemread
import org.openapitools.client.models.SettingsSettingswrite
import org.openapitools.client.models.SettingsjsonldSettingscreateSettingswrite
import org.openapitools.client.models.SettingsjsonldSettingsreadSettingsitemread

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

class SettingsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Retrieves the collection of Settings resources.
     * Retrieves the collection of Settings resources.
     * @param page The collection page number (optional, default to 1)
     * @return kotlin.collections.List<SettingsSettingsitemread>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiSettingsGetCollection(page: kotlin.Int? = 1) : kotlin.collections.List<SettingsSettingsitemread> {
        val localVarResponse = apiSettingsGetCollectionWithHttpInfo(page = page)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<SettingsSettingsitemread>
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
     * Retrieves the collection of Settings resources.
     * Retrieves the collection of Settings resources.
     * @param page The collection page number (optional, default to 1)
     * @return ApiResponse<kotlin.collections.List<SettingsSettingsitemread>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiSettingsGetCollectionWithHttpInfo(page: kotlin.Int?) : ApiResponse<kotlin.collections.List<SettingsSettingsitemread>?> {
        val localVariableConfig = apiSettingsGetCollectionRequestConfig(page = page)

        return request<Unit, kotlin.collections.List<SettingsSettingsitemread>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiSettingsGetCollection
     *
     * @param page The collection page number (optional, default to 1)
     * @return RequestConfig
     */
    fun apiSettingsGetCollectionRequestConfig(page: kotlin.Int?) : RequestConfig<Unit> {
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
            path = "/api/settings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Removes the Settings resource.
     * Removes the Settings resource.
     * @param id Settings identifier
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiSettingsIdDelete(id: kotlin.String) : Unit {
        val localVarResponse = apiSettingsIdDeleteWithHttpInfo(id = id)

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
     * Removes the Settings resource.
     * Removes the Settings resource.
     * @param id Settings identifier
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiSettingsIdDeleteWithHttpInfo(id: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = apiSettingsIdDeleteRequestConfig(id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiSettingsIdDelete
     *
     * @param id Settings identifier
     * @return RequestConfig
     */
    fun apiSettingsIdDeleteRequestConfig(id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/settings/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Retrieves a Settings resource.
     * Retrieves a Settings resource.
     * @param id Settings identifier
     * @return SettingsSettingsreadSettingsitemread
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiSettingsIdGet(id: kotlin.String) : SettingsSettingsreadSettingsitemread {
        val localVarResponse = apiSettingsIdGetWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SettingsSettingsreadSettingsitemread
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
     * Retrieves a Settings resource.
     * Retrieves a Settings resource.
     * @param id Settings identifier
     * @return ApiResponse<SettingsSettingsreadSettingsitemread?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiSettingsIdGetWithHttpInfo(id: kotlin.String) : ApiResponse<SettingsSettingsreadSettingsitemread?> {
        val localVariableConfig = apiSettingsIdGetRequestConfig(id = id)

        return request<Unit, SettingsSettingsreadSettingsitemread>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiSettingsIdGet
     *
     * @param id Settings identifier
     * @return RequestConfig
     */
    fun apiSettingsIdGetRequestConfig(id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json, application/ld+json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/settings/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Updates the Settings resource.
     * Updates the Settings resource.
     * @param id Settings identifier
     * @param settingsSettingswrite The updated Settings resource
     * @return SettingsSettingsreadSettingsitemread
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiSettingsIdPatch(id: kotlin.String, settingsSettingswrite: SettingsSettingswrite) : SettingsSettingsreadSettingsitemread {
        val localVarResponse = apiSettingsIdPatchWithHttpInfo(id = id, settingsSettingswrite = settingsSettingswrite)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SettingsSettingsreadSettingsitemread
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
     * Updates the Settings resource.
     * Updates the Settings resource.
     * @param id Settings identifier
     * @param settingsSettingswrite The updated Settings resource
     * @return ApiResponse<SettingsSettingsreadSettingsitemread?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiSettingsIdPatchWithHttpInfo(id: kotlin.String, settingsSettingswrite: SettingsSettingswrite) : ApiResponse<SettingsSettingsreadSettingsitemread?> {
        val localVariableConfig = apiSettingsIdPatchRequestConfig(id = id, settingsSettingswrite = settingsSettingswrite)

        return request<SettingsSettingswrite, SettingsSettingsreadSettingsitemread>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiSettingsIdPatch
     *
     * @param id Settings identifier
     * @param settingsSettingswrite The updated Settings resource
     * @return RequestConfig
     */
    fun apiSettingsIdPatchRequestConfig(id: kotlin.String, settingsSettingswrite: SettingsSettingswrite) : RequestConfig<SettingsSettingswrite> {
        val localVariableBody = settingsSettingswrite
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/merge-patch+json"
        localVariableHeaders["Accept"] = "application/json, application/ld+json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/api/settings/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Creates a Settings resource.
     * Creates a Settings resource.
     * @param settingsSettingscreateSettingswrite The new Settings resource
     * @return SettingsSettingsreadSettingsitemread
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiSettingsPost(settingsSettingscreateSettingswrite: SettingsSettingscreateSettingswrite) : SettingsSettingsreadSettingsitemread {
        val localVarResponse = apiSettingsPostWithHttpInfo(settingsSettingscreateSettingswrite = settingsSettingscreateSettingswrite)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SettingsSettingsreadSettingsitemread
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
     * Creates a Settings resource.
     * Creates a Settings resource.
     * @param settingsSettingscreateSettingswrite The new Settings resource
     * @return ApiResponse<SettingsSettingsreadSettingsitemread?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiSettingsPostWithHttpInfo(settingsSettingscreateSettingswrite: SettingsSettingscreateSettingswrite) : ApiResponse<SettingsSettingsreadSettingsitemread?> {
        val localVariableConfig = apiSettingsPostRequestConfig(settingsSettingscreateSettingswrite = settingsSettingscreateSettingswrite)

        return request<SettingsSettingscreateSettingswrite, SettingsSettingsreadSettingsitemread>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiSettingsPost
     *
     * @param settingsSettingscreateSettingswrite The new Settings resource
     * @return RequestConfig
     */
    fun apiSettingsPostRequestConfig(settingsSettingscreateSettingswrite: SettingsSettingscreateSettingswrite) : RequestConfig<SettingsSettingscreateSettingswrite> {
        val localVariableBody = settingsSettingscreateSettingswrite
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json, application/ld+json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/settings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
