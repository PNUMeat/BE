package PNUMEAT.Backend.global.response;

import lombok.Getter;

@Getter
public enum ResponseMessageEnum {
    // TEAM
    TEAM_CREATED_SUCCESS("팀이 성공적으로 생성되었습니다.", 201),
    TEAM_TOTAL_DETAILS_SUCCESS("전체 팀을 성공적으로 조회했습니다.",200),
    MY_TEAM_DETAILS_SUCCESS("나의 팀을 성공적으로 조회했습니다.",200),
    TEAM_JOIN_SUCCESS("팀에 성공적으로 가입했습니다.", 200),

    //Article
    ARTICLE_CREATE_SUCCESS("게시글이 성공적으로 생성되었습니다.",201),
    ARTICLE_DELETE_SUCCESS("게시글이 성공적으로 삭제되었습니다.",200),
    ARTICLE_PUT_SUCCESS("게시글이 성공적으로 수정되었습니다.",200);


    private final String message;
    private final int statusCode;

    ResponseMessageEnum(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}
