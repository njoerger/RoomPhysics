import java.util.*;

public class Interaction{
	public Interaction(){
	}
	public Interaction(Room _room, Vector<Particle> _particles){
		if((!checkRoomSize(_room)) && (!(_particles.isEmpty()))&&(totalSizeParticle(_room, _particles))){
		}
	}
	private boolean checkRoomSize(Room __room){
		if(__room.size() > 0)
			return true;
		return false;
	}
	private boolean totalSizeParticle(Room __room, Vector<Particle> __particles){
		float totalVolumeParticles=0;
		for (Particle counter: __particles){
			totalVolumeParticles += counter.size();
		}
		if (__room.size() > totalVolumeParticles)
			return true;
		return false;
	}
}
