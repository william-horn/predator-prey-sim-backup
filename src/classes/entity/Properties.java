package classes.entity;

import java.util.HashMap;

public class Properties {
	private HashMap<Property, Object> store = new HashMap<>();

	public enum Property {
		POSITION,
		ROTATION,
		MOVEMENT_SPEED,
	}

	public Object get(Property key) {
		return store.get(key);
	}

	public Properties set(Property key, Object value) {
		store.put(key, value);
		return this;
	}

	public HashMap<Property, Object> getProps() {
		return this.store;
	}
}
