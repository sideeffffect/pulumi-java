// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FunctionMetadata {
    private final @Nullable String functionARN;

    @OutputCustomType.Constructor
    private FunctionMetadata(@OutputCustomType.Parameter("functionARN") @Nullable String functionARN) {
        this.functionARN = functionARN;
    }

    public Optional<String> getFunctionARN() {
        return Optional.ofNullable(this.functionARN);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String functionARN;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionARN = defaults.functionARN;
        }

        public Builder functionARN(@Nullable String functionARN) {
            this.functionARN = functionARN;
            return this;
        }
        public FunctionMetadata build() {
            return new FunctionMetadata(functionARN);
        }
    }
}
