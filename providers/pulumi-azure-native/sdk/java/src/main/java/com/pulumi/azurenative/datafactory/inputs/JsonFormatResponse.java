// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data stored in JSON format.
 * 
 */
public final class JsonFormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final JsonFormatResponse Empty = new JsonFormatResponse();

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deserializer")
      private final @Nullable Object deserializer;

    public Optional<Object> deserializer() {
        return this.deserializer == null ? Optional.empty() : Optional.ofNullable(this.deserializer);
    }

    /**
     * The code page name of the preferred encoding. If not provided, the default value is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the 'Name' column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encodingName")
      private final @Nullable Object encodingName;

    public Optional<Object> encodingName() {
        return this.encodingName == null ? Optional.empty() : Optional.ofNullable(this.encodingName);
    }

    /**
     * File pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value is 'setOfObjects'. It is case-sensitive.
     * 
     */
    @Import(name="filePattern")
      private final @Nullable Object filePattern;

    public Optional<Object> filePattern() {
        return this.filePattern == null ? Optional.empty() : Optional.ofNullable(this.filePattern);
    }

    /**
     * The JSONPath of the JSON array element to be flattened. Example: "$.ArrayPath". Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="jsonNodeReference")
      private final @Nullable Object jsonNodeReference;

    public Optional<Object> jsonNodeReference() {
        return this.jsonNodeReference == null ? Optional.empty() : Optional.ofNullable(this.jsonNodeReference);
    }

    /**
     * The JSONPath definition for each column mapping with a customized column name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path", "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="jsonPathDefinition")
      private final @Nullable Object jsonPathDefinition;

    public Optional<Object> jsonPathDefinition() {
        return this.jsonPathDefinition == null ? Optional.empty() : Optional.ofNullable(this.jsonPathDefinition);
    }

    /**
     * The character used to separate nesting levels. Default value is '.' (dot). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="nestingSeparator")
      private final @Nullable Object nestingSeparator;

    public Optional<Object> nestingSeparator() {
        return this.nestingSeparator == null ? Optional.empty() : Optional.ofNullable(this.nestingSeparator);
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serializer")
      private final @Nullable Object serializer;

    public Optional<Object> serializer() {
        return this.serializer == null ? Optional.empty() : Optional.ofNullable(this.serializer);
    }

    /**
     * Type of dataset storage format.
     * Expected value is 'JsonFormat'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public JsonFormatResponse(
        @Nullable Object deserializer,
        @Nullable Object encodingName,
        @Nullable Object filePattern,
        @Nullable Object jsonNodeReference,
        @Nullable Object jsonPathDefinition,
        @Nullable Object nestingSeparator,
        @Nullable Object serializer,
        String type) {
        this.deserializer = deserializer;
        this.encodingName = encodingName;
        this.filePattern = filePattern;
        this.jsonNodeReference = jsonNodeReference;
        this.jsonPathDefinition = jsonPathDefinition;
        this.nestingSeparator = nestingSeparator;
        this.serializer = serializer;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JsonFormatResponse() {
        this.deserializer = null;
        this.encodingName = null;
        this.filePattern = null;
        this.jsonNodeReference = null;
        this.jsonPathDefinition = null;
        this.nestingSeparator = null;
        this.serializer = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deserializer;
        private @Nullable Object encodingName;
        private @Nullable Object filePattern;
        private @Nullable Object jsonNodeReference;
        private @Nullable Object jsonPathDefinition;
        private @Nullable Object nestingSeparator;
        private @Nullable Object serializer;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.encodingName = defaults.encodingName;
    	      this.filePattern = defaults.filePattern;
    	      this.jsonNodeReference = defaults.jsonNodeReference;
    	      this.jsonPathDefinition = defaults.jsonPathDefinition;
    	      this.nestingSeparator = defaults.nestingSeparator;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder deserializer(@Nullable Object deserializer) {
            this.deserializer = deserializer;
            return this;
        }
        public Builder encodingName(@Nullable Object encodingName) {
            this.encodingName = encodingName;
            return this;
        }
        public Builder filePattern(@Nullable Object filePattern) {
            this.filePattern = filePattern;
            return this;
        }
        public Builder jsonNodeReference(@Nullable Object jsonNodeReference) {
            this.jsonNodeReference = jsonNodeReference;
            return this;
        }
        public Builder jsonPathDefinition(@Nullable Object jsonPathDefinition) {
            this.jsonPathDefinition = jsonPathDefinition;
            return this;
        }
        public Builder nestingSeparator(@Nullable Object nestingSeparator) {
            this.nestingSeparator = nestingSeparator;
            return this;
        }
        public Builder serializer(@Nullable Object serializer) {
            this.serializer = serializer;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public JsonFormatResponse build() {
            return new JsonFormatResponse(deserializer, encodingName, filePattern, jsonNodeReference, jsonPathDefinition, nestingSeparator, serializer, type);
        }
    }
}
