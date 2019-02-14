
public class News {
	int newsId; 
	String postedByUse,commentByUser,comment;
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUse() {
		return postedByUse;
	}
	public void setPostedByUse(String postedByUse) {
		this.postedByUse = postedByUse;
	}
	public News(int newsId, String postedByUse, String commentByUser,
			String comment) {
	
		this.newsId = newsId;
		this.postedByUse = postedByUse;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	
	public String getCommentByUser() {
		return commentByUser;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUse=" + postedByUse
				+ ", commentByUser=" + commentByUser + ", comment=" + comment
				+ "]";
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
