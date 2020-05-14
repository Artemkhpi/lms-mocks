package ua.khpi.lms.helper.mocks.service

import org.springframework.stereotype.Service
import ua.khpi.lms.helper.mocks.db.repository.ScormCourseRepository
import ua.khpi.lms.helper.mocks.model.ScormCourse

@Service
class ScormCourseService(private val scormCourseRepository: ScormCourseRepository) {
    fun getAll(): MutableSet<ScormCourse> {
        return scormCourseRepository.getAll()
    }

    fun findById(id: Long) =
            scormCourseRepository.findById(id)

    fun add(scormCourse: ScormCourse): ScormCourse {
        return scormCourseRepository.add(scormCourse)
    }

    fun update(scormCourse: ScormCourse): ScormCourse {
        return scormCourseRepository.update(scormCourse)!!
    }

    fun remove(id: Long) {
        scormCourseRepository.remove(id)
    }

}
