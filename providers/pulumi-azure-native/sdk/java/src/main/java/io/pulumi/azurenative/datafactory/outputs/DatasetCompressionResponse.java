// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetCompressionResponse {
    /**
     * The dataset compression level. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object level;
    /**
     * Type of dataset compression. Type: string (or Expression with resultType string).
     * 
     */
    private final Object type;

    @OutputCustomType.Constructor({"level","type"})
    private DatasetCompressionResponse(
        @Nullable Object level,
        Object type) {
        this.level = level;
        this.type = type;
    }

    /**
     * The dataset compression level. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getLevel() {
        return Optional.ofNullable(this.level);
    }
    /**
     * Type of dataset compression. Type: string (or Expression with resultType string).
     * 
    */
    public Object getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetCompressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object level;
        private Object type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetCompressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.type = defaults.type;
        }

        public Builder setLevel(@Nullable Object level) {
            this.level = level;
            return this;
        }

        public Builder setType(Object type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DatasetCompressionResponse build() {
            return new DatasetCompressionResponse(level, type);
        }
    }
}
