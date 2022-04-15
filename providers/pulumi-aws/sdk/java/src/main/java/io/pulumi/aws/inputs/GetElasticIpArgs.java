// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.aws.inputs.GetElasticIpFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetElasticIpArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetElasticIpArgs Empty = new GetElasticIpArgs();

    /**
     * One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetElasticIpFilter> filters;

    public List<GetElasticIpFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The allocation id of the specific VPC EIP to retrieve. If a classic EIP is required, do NOT set `id`, only set `public_ip`
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The public IP of the specific EIP to retrieve.
     * 
     */
    @Import(name="publicIp")
      private final @Nullable String publicIp;

    public Optional<String> publicIp() {
        return this.publicIp == null ? Optional.empty() : Optional.ofNullable(this.publicIp);
    }

    /**
     * A map of tags, each pair of which must exactly match a pair on the desired Elastic IP
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetElasticIpArgs(
        @Nullable List<GetElasticIpFilter> filters,
        @Nullable String id,
        @Nullable String publicIp,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.publicIp = publicIp;
        this.tags = tags;
    }

    private GetElasticIpArgs() {
        this.filters = List.of();
        this.id = null;
        this.publicIp = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetElasticIpFilter> filters;
        private @Nullable String id;
        private @Nullable String publicIp;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticIpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.publicIp = defaults.publicIp;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetElasticIpFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetElasticIpFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder publicIp(@Nullable String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetElasticIpArgs build() {
            return new GetElasticIpArgs(filters, id, publicIp, tags);
        }
    }
}
