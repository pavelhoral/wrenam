package org.forgerock.api.models;


import org.forgerock.json.JsonValue;
import org.forgerock.util.Function;
import org.forgerock.util.promise.NeverThrowsException;

/**
 * FIXME WREN remove after {@link TranslateJsonSchema} visibility gets fixed.
 */
public class TranslateJsonSchemaHotfix {

	public static Function<JsonValue, JsonValue, NeverThrowsException> newInstance(ClassLoader cl) {
		return new TranslateJsonSchema(cl);
	}

}
