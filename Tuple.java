public class Tuple<E>{
	private E x;
	private E y;
	private E z;

	public Tuple(){
	}
	public Tuple(Tuple<E> t){
	}
	public Tuple(E _x, E _y, E _z){
		x = _x;
		y = _y;
		z = _z;
	}
	public boolean setX(E __x){
		x=__x;
		if (x == __x)
			return true;
		return false;
	}
	public boolean setY(E __y){
		y=__y;
		if (y == __y)
			return true;
		return false;
	}
	public boolean setZ(E __z){
		z=__z;
		if (z == __z)
			return true;
		return false;
	}
	public E getX(){
		return x;
	}
	public E getY(){
		return y;
	}
	public E getZ(){
		return z;
	}
}
