package com.sandbox.rest

import com.sandbox.*
import com.sandbox.bindings.AxiosConfigSettings
import com.sandbox.bindings.axiosGet
import com.sandbox.bindings.axiosPost
import com.sandbox.dto.DataTransportObject
import com.sandbox.dto.PersonDto
import kotlinext.js.jsObject
import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.list




class RestClient {

    private fun generateConfig(modelRestStub:String, httpMethod: HttpMethod, secured: Boolean = false, _data: DataTransportObject? = null, urlAddition: String? = null, modelId:Int? = null): AxiosConfigSettings {
        var securityHeaders: dynamic = null

        var restUrl = "$REST_SERVICE_ADDRESS$modelRestStub"
        if (urlAddition != null) {
            restUrl = "$restUrl$urlAddition"
        }

        var updateParams:dynamic = null
        if(modelId != null){
            updateParams = js("({})")
            updateParams["id"] = modelId
        }

        return jsObject {
            url = restUrl
            timeout = 10000
            method = httpMethod.value
            data = _data
            params = updateParams
            headers = securityHeaders
        }
    }

    fun updatePerson(dto: PersonDto){
        axiosPost<PersonDto>(generateConfig(httpMethod = HttpMethod.POST, secured = true, _data = dto, urlAddition = "/${dto.id}", modelId = dto.id, modelRestStub= STUB_PERSON)).then { response ->
            console.log(response.data)
        }.catch { error ->
            console.error(error)
        }
    }


    fun findAllPerson() {
        //getStoreEntity().saveListOfDto(KJSON.parse(BlogPostDto.serializer().list, JSON.stringify(responseList)))
        axiosGet<PersonDto>(generateConfig(httpMethod = HttpMethod.GET, modelRestStub= STUB_PERSON)).then { response ->
            console.log(response.data)
            val objList = KJSON.parse(PersonDto.serializer().list, JSON.stringify(response.data))
            Store.personList = objList
            console.log(objList)
        }.catch { error ->
                console.error(error)
        }
    }
}