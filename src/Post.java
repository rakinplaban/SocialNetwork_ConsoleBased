
public class Post implements ILikable{
	private String content;
	private int like;
	
	public Post(String content, int like) {
		this.content = content;
		this.like = like;
	}

	@Override
	public int like() {
		// TODO Auto-generated method stub
		like++;
		return like;
	}

	@Override
	public int unlike() {
		// TODO Auto-generated method stub
		like--;
		return like;
	}
	
	
}
