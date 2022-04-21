// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data stored in Avro format.
 * 
 */
public final class AvroFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final AvroFormatArgs Empty = new AvroFormatArgs();

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deserializer")
    private @Nullable Output<Object> deserializer;

    public Optional<Output<Object>> deserializer() {
        return Optional.ofNullable(this.deserializer);
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serializer")
    private @Nullable Output<Object> serializer;

    public Optional<Output<Object>> serializer() {
        return Optional.ofNullable(this.serializer);
    }

    /**
     * Type of dataset storage format.
     * Expected value is &#39;AvroFormat&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private AvroFormatArgs() {}

    private AvroFormatArgs(AvroFormatArgs $) {
        this.deserializer = $.deserializer;
        this.serializer = $.serializer;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AvroFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvroFormatArgs $;

        public Builder() {
            $ = new AvroFormatArgs();
        }

        public Builder(AvroFormatArgs defaults) {
            $ = new AvroFormatArgs(Objects.requireNonNull(defaults));
        }

        public Builder deserializer(@Nullable Output<Object> deserializer) {
            $.deserializer = deserializer;
            return this;
        }

        public Builder deserializer(Object deserializer) {
            return deserializer(Output.of(deserializer));
        }

        public Builder serializer(@Nullable Output<Object> serializer) {
            $.serializer = serializer;
            return this;
        }

        public Builder serializer(Object serializer) {
            return serializer(Output.of(serializer));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AvroFormatArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
