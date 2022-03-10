// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetNetworkInterfacesFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkInterfacesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfacesArgs Empty = new GetNetworkInterfacesArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
      private final @Nullable List<GetNetworkInterfacesFilter> filters;

    public List<GetNetworkInterfacesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired network interfaces.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetNetworkInterfacesArgs(
        @Nullable List<GetNetworkInterfacesFilter> filters,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.tags = tags;
    }

    private GetNetworkInterfacesArgs() {
        this.filters = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetNetworkInterfacesFilter> filters;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfacesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetNetworkInterfacesFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetNetworkInterfacesArgs build() {
            return new GetNetworkInterfacesArgs(filters, tags);
        }
    }
}
