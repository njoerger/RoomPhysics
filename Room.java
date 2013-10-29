public class Room{
	private float height;
	private float width;
	private float length;

	public Room(){
	}
	public Room(float _height, float _width, float _length){
		height = _height;
		width = _width;
		length = _length;
	}
	public Room(Room _room){
		height = _room.getHeight();
		width = _room.getWidth();
		length = _room.getLength();
	}
	public boolean setHeight(float _height){
		if(_height <= 0)
			return false;
		else{
			height = _height;
			return true;
		}
	}
	public boolean setWidth(float _width){
		if(_width <= 0){
			return false;
		}
		else{
			width = _width;
			return true;
		}
	}
	public boolean setLength(float _length){
		if(_length <= 0)
			return false;
		else{
			length = _length;
			return true;
		}
	}
	public float getHeight(){
		return height;
	}
	public float getWidth(){
		return width;
	}
	public  float getLength(){
		return length;
	}
	public float size(){
		return (getHeight()*getWidth()*getLength());
	}
}
