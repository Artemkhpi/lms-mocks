package ua.khpi.lms.helper.mocks.db.mapper

import org.springframework.stereotype.Service
import ua.khpi.lms.helper.mocks.db.entity.ScormCourseEntity
import ua.khpi.lms.helper.mocks.model.ScormCourse
import java.util.*

@Service
class ScormCourseMapper {
    fun toJpa(scormCourse: ScormCourse): ScormCourseEntity {
        scormCourse.let {
            return ScormCourseEntity(
                    courseId = it.courseId,
                    title = it.title,
                    scope = it.scope,
                    complexity = it.complexity,
                    keyWords = it.keyWords,
                    creator = it.creator,
                    content = Base64.getDecoder().decode(it.content),
                    fileName = it.fileName
            )
        }
    }

    fun fromJpa(scormCourseEntity: ScormCourseEntity): ScormCourse {
        scormCourseEntity.let {
            return ScormCourse(
                    courseId = it.courseId,
                    title = it.title,
                    scope = it.scope,
                    complexity = it.complexity,
                    keyWords = it.keyWords,
                    creator = it.creator,
                    content = Base64.getEncoder().encodeToString(it.content),
                    fileName = it.fileName
            )
        }
    }
}
