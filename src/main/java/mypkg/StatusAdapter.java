package mypkg;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;

public class StatusAdapter implements JsonbAdapter<Status, JsonObject> { 

	@Override
	public JsonObject adaptToJson(Status status) throws Exception {
	   
        return Json.createObjectBuilder()
                .add("f1", status.field1) 
                .add("f2", status.field2)
               .build();
    }

	@Override
	public Status adaptFromJson(JsonObject arg0) throws Exception {
		return null;
	}

}