package shop.mtcoding.blog.reply;


import lombok.Data;

public class ReplyResponse {

    @Data
    public static class DetailDTO {
        private int id;
        private String comment;
        private int userId; // 댓글 작성자 아이디
        private String username; // 댓글 작성자 이름
        private boolean isOwner;

        public DetailDTO(Reply reply, int sessionUserId) {
            this.id = reply.getId();
            this.comment = reply.getComment();
            this.userId = reply.getUser().getId();
            this.username = reply.getUser().getUsername();
            this.isOwner = reply.getUser().getId() == sessionUserId;
        }
    }

    @Data
    public static class DTO {
        private int replyId;
        private int boardId;
        private int userId; // 댓글 작성자 아이디
        private String comment;

        public DTO(Reply reply) {
            this.replyId = reply.getId();
            this.boardId = reply.getBoard().getId();
            this.userId = reply.getUser().getId();
            this.comment = reply.getComment();
        }
    }
}
