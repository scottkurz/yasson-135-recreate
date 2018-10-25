package test;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import org.junit.Test;

import mypkg.Status;
import mypkg.StatusAdapter;

public class TheTest {

	/**
	 * A real test would verify output, just showing that it doesn't throw exc like the other.
	 */
	@Test
	public void normalTest() {
		
		Status testStatus = new Status();
		testStatus.field1 = "a1";
		testStatus.field2 = "a2";

		Jsonb jsonb = JsonbBuilder.create(new JsonbConfig()
				.withNullValues(true)
			    .withAdapters(new StatusAdapter()));
		
		String json = jsonb.toJson(testStatus,Status.class);
		System.out.println("firstTest: " + json);
	}
	
	@Test
	public void nullTest() {
		
		Status testStatus = new Status();
		testStatus.field1 = "a1";
		testStatus.field2 = null;

		Jsonb jsonb = JsonbBuilder.create(new JsonbConfig()
				.withNullValues(true)
			    .withAdapters(new StatusAdapter()));
		
		String json = jsonb.toJson(testStatus,Status.class);
		System.out.println("nullTest: " + json);
	}
}
