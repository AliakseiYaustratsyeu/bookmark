package by.gomel.bookmark.model.user;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import by.gomel.bookmark.model.BaseObject;

@Entity
@Table(name = "roles")
@NamedQueries({
        @NamedQuery(
                name = "findRoleByName",
                query = "select r from Role r where r.name = :name "
        )
})
public class Role extends BaseObject implements Serializable, GrantedAuthority {
	
	private static final long serialVersionUID = -91519442504161501L;
	
	private Long roleId;
    private String name;
    private String description;
    private Set<User> users;
    
    /**
     * Default constructor - creates a new instance with no values set.
     */
    public Role() {
    }

    /**
     * Create a new instance and set the name.
     *
     * @param name name of the role.
     */
    public Role(final String name) {
        this.name = name;
    }

    @Id
    @Column(name="role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    
    /**
     * @return the name property (getAuthority required by Acegi's GrantedAuthority interface)
     * @see org.springframework.security.core.GrantedAuthority#getAuthority()
     */
    @Transient
    public String getAuthority() {
        return getName();
    }

    @Column(name = "name", length = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name = "description", length = 64)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @ManyToMany(mappedBy="roles")
    public Set<User> getUsers() {
        return users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }

    /**
     * {@inheritDoc}
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Role)) {
            return false;
        }

        final Role role = (Role) o;

        return !(name != null ? !name.equals(role.name) : role.name != null);

    }

    /**
     * {@inheritDoc}
     */
    public int hashCode() {
        return (name != null ? name.hashCode() : 0);
    }

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
                .append(this.name)
                .toString();
    }

    /**
     * {@inheritDoc}
     */
    public int compareTo(Object o) {
        return (equals(o) ? 0 : -1);
    }
}
