package ua.khpi.lms.helper.mocks.db.repository.jpa

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ua.khpi.lms.helper.mocks.db.entity.ScormCourseEntity

@Repository
interface ScormCourseJpaRepository : CrudRepository<ScormCourseEntity, Long>