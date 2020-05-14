package ua.khpi.lms.helper.mocks.exception


open class ApiException : RuntimeException {
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
}
