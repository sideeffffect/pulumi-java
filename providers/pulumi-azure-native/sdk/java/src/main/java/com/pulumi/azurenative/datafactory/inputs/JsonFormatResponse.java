// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
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
    private @Nullable Object deserializer;

    public Optional<Object> deserializer() {
        return Optional.ofNullable(this.deserializer);
    }

    /**
     * The code page name of the preferred encoding. If not provided, the default value is &#39;utf-8&#39;, unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the &#39;Name&#39; column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encodingName")
    private @Nullable Object encodingName;

    public Optional<Object> encodingName() {
        return Optional.ofNullable(this.encodingName);
    }

    /**
     * File pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value is &#39;setOfObjects&#39;. It is case-sensitive.
     * 
     */
    @Import(name="filePattern")
    private @Nullable Object filePattern;

    public Optional<Object> filePattern() {
        return Optional.ofNullable(this.filePattern);
    }

    /**
     * The JSONPath of the JSON array element to be flattened. Example: &#34;$.ArrayPath&#34;. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="jsonNodeReference")
    private @Nullable Object jsonNodeReference;

    public Optional<Object> jsonNodeReference() {
        return Optional.ofNullable(this.jsonNodeReference);
    }

    /**
     * The JSONPath definition for each column mapping with a customized column name to extract data from JSON file. For fields under root object, start with &#34;$&#34;; for fields inside the array chosen by jsonNodeReference property, start from the array element. Example: {&#34;Column1&#34;: &#34;$.Column1Path&#34;, &#34;Column2&#34;: &#34;Column2PathInArray&#34;}. Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="jsonPathDefinition")
    private @Nullable Object jsonPathDefinition;

    public Optional<Object> jsonPathDefinition() {
        return Optional.ofNullable(this.jsonPathDefinition);
    }

    /**
     * The character used to separate nesting levels. Default value is &#39;.&#39; (dot). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="nestingSeparator")
    private @Nullable Object nestingSeparator;

    public Optional<Object> nestingSeparator() {
        return Optional.ofNullable(this.nestingSeparator);
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serializer")
    private @Nullable Object serializer;

    public Optional<Object> serializer() {
        return Optional.ofNullable(this.serializer);
    }

    /**
     * Type of dataset storage format.
     * Expected value is &#39;JsonFormat&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private JsonFormatResponse() {}

    private JsonFormatResponse(JsonFormatResponse $) {
        this.deserializer = $.deserializer;
        this.encodingName = $.encodingName;
        this.filePattern = $.filePattern;
        this.jsonNodeReference = $.jsonNodeReference;
        this.jsonPathDefinition = $.jsonPathDefinition;
        this.nestingSeparator = $.nestingSeparator;
        this.serializer = $.serializer;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JsonFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JsonFormatResponse $;

        public Builder() {
            $ = new JsonFormatResponse();
        }

        public Builder(JsonFormatResponse defaults) {
            $ = new JsonFormatResponse(Objects.requireNonNull(defaults));
        }

        public Builder deserializer(@Nullable Object deserializer) {
            $.deserializer = deserializer;
            return this;
        }

        public Builder encodingName(@Nullable Object encodingName) {
            $.encodingName = encodingName;
            return this;
        }

        public Builder filePattern(@Nullable Object filePattern) {
            $.filePattern = filePattern;
            return this;
        }

        public Builder jsonNodeReference(@Nullable Object jsonNodeReference) {
            $.jsonNodeReference = jsonNodeReference;
            return this;
        }

        public Builder jsonPathDefinition(@Nullable Object jsonPathDefinition) {
            $.jsonPathDefinition = jsonPathDefinition;
            return this;
        }

        public Builder nestingSeparator(@Nullable Object nestingSeparator) {
            $.nestingSeparator = nestingSeparator;
            return this;
        }

        public Builder serializer(@Nullable Object serializer) {
            $.serializer = serializer;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public JsonFormatResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
