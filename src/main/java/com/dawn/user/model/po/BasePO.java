package com.dawn.user.model.po;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author : leonwang
 * @Descpriction
 * @Date:created 2020/5/5
 */
@MappedSuperclass
public class BasePO implements Persistable {
    @Transient
    private boolean isNew = true;

    private static final String UNKNOWN_USER = "_UNKNOWN";
    private static final long serialVersionUID = 2388213001235406501L;

    private static Logger logger = LoggerFactory.getLogger(BasePO.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "created_at", updatable = false)
    private Date createdAt;

    @Column(name = "modified_at")
    private Date modifiedAt;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return isNew;
    }


    @PrePersist
    public void prePersist() {
        this.isNew = false;
        this.createdAt = new Date();
        this.modifiedAt = new Date();

        /*Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (null != authentication) {
            this.createdBy = authentication.getName();
            this.modifiedBy = authentication.getName();
        } else {
            this.createdBy = UNKNOWN_USER;
            this.modifiedBy = UNKNOWN_USER;
        }*/
    }

    @PostLoad
    void markNotNew() {
        this.isNew = false;
    }

    @PreUpdate
    public void preUpdate() {
        this.modifiedAt = new Date();

       /* Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (null != authentication) {
            if (authentication.getName().equals("anonymousUser")) {
                if (logger.isWarnEnabled())
                    logger.warn("Warning: The update user is anonymousUser, Please check it");
            }
            this.modifiedBy = authentication.getName();
        } else {
            this.modifiedBy = UNKNOWN_USER;
        }*/
    }

}
