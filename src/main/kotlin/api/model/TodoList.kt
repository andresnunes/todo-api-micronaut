package api.model

import io.micronaut.core.annotation.Introspected
import org.hibernate.Hibernate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Introspected
data class TodoList(
    @Id
    val id: Long?,
    @Column
    val description: String?,
    @Column
    val done: Boolean
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as TodoList

        return id != null && id == other.id
    }

    override fun hashCode(): Int = 1324074025

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id )"
    }
}