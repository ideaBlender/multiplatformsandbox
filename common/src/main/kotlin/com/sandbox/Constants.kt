package com.sandbox

const val REST_SERVICE_ADDRESS = "http://localhost:8080"
const val STUB_PERSON = "/api/person"
const val STUB_PET = "/api/pet"
const val STUB_COMMENT = "/api/comment"
const val STUB_SEC_USER = "/api/secUser"
const val STUB_SEC_ROLE = "/api/secRole"
const val STUB_SEC_ROLE_AUTHOR = "/api/secRoleAuthor"
const val STUB_SEC_ROLE_USER = "/api/secRoleUser"
const val STUB_AUTH = "/api/auth"
const val GET_BY_ID = "getById"


enum class HttpMethod(val value: String) {
    GET(value = "get"),
    POST(value = "post"),
    PUT(value = "put"),
    PATCH(value = "patch"),
    DELETE(value = "delete"),
}