package ua.khpi.lms.helper.mocks.model

data class ScormCourse(
        var courseId: Long? = null,
        var title: String,
        var scope: String,
        var complexity: String,
        var keyWords: List<String>,
        var creator: String,
        var content: String,
        var fileName: String
)