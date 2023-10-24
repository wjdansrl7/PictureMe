package hello.pictureMe.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.time.LocalDateTime;

@Embeddable
@Getter
public class Period {

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    protected Period() {
    }

    public Period(LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
