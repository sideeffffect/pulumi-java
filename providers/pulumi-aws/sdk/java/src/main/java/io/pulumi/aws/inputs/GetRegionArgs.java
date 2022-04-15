// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionArgs Empty = new GetRegionArgs();

    /**
     * The EC2 endpoint of the region to select.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable String endpoint;

    public Optional<String> endpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    /**
     * The full name of the region to select.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public GetRegionArgs(
        @Nullable String endpoint,
        @Nullable String name) {
        this.endpoint = endpoint;
        this.name = name;
    }

    private GetRegionArgs() {
        this.endpoint = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.name = defaults.name;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public GetRegionArgs build() {
            return new GetRegionArgs(endpoint, name);
        }
    }
}
