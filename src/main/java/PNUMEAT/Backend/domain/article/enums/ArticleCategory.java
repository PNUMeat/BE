package PNUMEAT.Backend.domain.article.enums;

public enum ArticleCategory {
    NORMAL(-1, "일반"),
    STUDY_REVIEW(1, "스터디 복습"),
    STUDY_PREVIEW(2, "스터디 예습"),
    STUDY(3, "스터디"),
    CODING_TEST(4, "코딩 테스트");

    private final int code;
    private final String name;

    ArticleCategory(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean isSubject(ArticleCategory category){
        if(category.getCode() > 0){
            return true;
        }
        return false;
    }
}
