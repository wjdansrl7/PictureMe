package hello.pictureMe.entity.enums;

public enum LocalType {
    SEOUL("서울"),
    GYEONGI("경기도"),
    JEJU("제주도"),
    GANGWON("강원도");

    private String value;

    LocalType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
