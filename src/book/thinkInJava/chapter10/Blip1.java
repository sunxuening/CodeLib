package book.thinkInJava.chapter10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Blip1 implements Externalizable {
	public Blip1() {
		System.out.println("Blip1 Constructor");
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Blip1.writeExternal");
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("Blip1.readExternal");
	}
}
