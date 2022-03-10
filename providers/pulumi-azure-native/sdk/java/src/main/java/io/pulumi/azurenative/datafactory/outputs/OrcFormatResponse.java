// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrcFormatResponse {
    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object deserializer;
    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object serializer;
    /**
     * Type of dataset storage format.
     * Expected value is 'OrcFormat'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private OrcFormatResponse(
        @OutputCustomType.Parameter("deserializer") @Nullable Object deserializer,
        @OutputCustomType.Parameter("serializer") @Nullable Object serializer,
        @OutputCustomType.Parameter("type") String type) {
        this.deserializer = deserializer;
        this.serializer = serializer;
        this.type = type;
    }

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getDeserializer() {
        return Optional.ofNullable(this.deserializer);
    }
    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSerializer() {
        return Optional.ofNullable(this.serializer);
    }
    /**
     * Type of dataset storage format.
     * Expected value is 'OrcFormat'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrcFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deserializer;
        private @Nullable Object serializer;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrcFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder deserializer(@Nullable Object deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder serializer(@Nullable Object serializer) {
            this.serializer = serializer;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public OrcFormatResponse build() {
            return new OrcFormatResponse(deserializer, serializer, type);
        }
    }
}
