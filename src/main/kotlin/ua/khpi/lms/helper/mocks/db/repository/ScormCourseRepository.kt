package ua.khpi.lms.helper.mocks.db.repository

import org.springframework.stereotype.Component
import ua.khpi.lms.helper.mocks.db.mapper.ScormCourseMapper
import ua.khpi.lms.helper.mocks.db.repository.jpa.ScormCourseJpaRepository
import ua.khpi.lms.helper.mocks.model.ScormCourse

@Component
class ScormCourseRepository(private val repository: ScormCourseJpaRepository,
                            private val mapper: ScormCourseMapper) {
    fun getAll(): MutableSet<ScormCourse> {
        return repository.findAll().mapNotNullTo(mutableSetOf()) { mapper.fromJpa(it) }
    }

    fun findById(id: Long): ScormCourse {
        return mapper.fromJpa(repository.findById(id).get())
    }

    fun add(scormCourse: ScormCourse): ScormCourse {
        return mapper.fromJpa(repository.save(mapper.toJpa(scormCourse)))
    }

    fun addAll(scormCourses: List<ScormCourse>): List<ScormCourse> {
        return repository.saveAll(scormCourses.map { mapper.toJpa(it) }).map { mapper.fromJpa(it) }
    }

    fun update(scormCourse: ScormCourse): ScormCourse? {
        return mapper.fromJpa(repository.save(mapper.toJpa(scormCourse)))
    }

    fun remove(id: Long) {
        repository.deleteById(id)
    }
}