// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MLTransformSchema {
    /**
     * The type of data in the column.
     * 
     */
    private final @Nullable String dataType;
    /**
     * The name you assign to this ML Transform. It must be unique in your account.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor
    private MLTransformSchema(
        @OutputCustomType.Parameter("dataType") @Nullable String dataType,
        @OutputCustomType.Parameter("name") @Nullable String name) {
        this.dataType = dataType;
        this.name = name;
    }

    /**
     * The type of data in the column.
     * 
    */
    public Optional<String> getDataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * The name you assign to this ML Transform. It must be unique in your account.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.name = defaults.name;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public MLTransformSchema build() {
            return new MLTransformSchema(dataType, name);
        }
    }
}
