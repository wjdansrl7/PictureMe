package hello.pictureMe.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardForm {

    private Long id;

    private String title;
    private String local;
    private String content;
}
