package geometry3d;
class Cylinder implements Figure{
	Figure osn;
	double high;
	
	double Volume(){
		return (osn*high);
	}
}