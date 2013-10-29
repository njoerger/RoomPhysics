public class Particle{
	private float height;
	private float width;
	private float length;

	public Particle(){
	}
	public Particle(Room _room, float _height, float _width, float _length){
		setHeight(_room, _height);
		setWidth(_room,_width);
		setLength(_room,_length);
	}
	public Particle(Particle _piece){
	}
	private boolean setHeight(Room __room, float __height){
		if((__height <= 0) && (__room.getHeight() < __height))
			return false;
		else{
			height = __height;
			return true;
		}
	}
	private boolean setWidth(Room __room, float __width){
		if((__width <= 0) &&( __room.getWidth() < __width)){
			return false;
		}
		else{
			width = __width;
			return true;
		}
	}
	private boolean setLength(Room __room, float __length){
		if(__length <= 0 || __room.getLength() < __length)
			return false;
		else{
			length = __length;
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
		return (getHeight() * getWidth() * getLength());
	}
}
