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
 * The data stored in Optimized Row Columnar (ORC) format.
 * 
 */
public final class OrcFormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final OrcFormatResponse Empty = new OrcFormatResponse();

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
     * Expected value is &#39;OrcFormat&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private OrcFormatResponse() {}

    private OrcFormatResponse(OrcFormatResponse $) {
        this.deserializer = $.deserializer;
        this.serializer = $.serializer;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrcFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrcFormatResponse $;

        public Builder() {
            $ = new OrcFormatResponse();
        }

        public Builder(OrcFormatResponse defaults) {
            $ = new OrcFormatResponse(Objects.requireNonNull(defaults));
        }

        public Builder deserializer(@Nullable Object deserializer) {
            $.deserializer = deserializer;
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

        public OrcFormatResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
