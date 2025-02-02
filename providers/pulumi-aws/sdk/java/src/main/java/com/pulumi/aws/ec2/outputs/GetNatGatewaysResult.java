// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetNatGatewaysFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNatGatewaysResult {
    private final @Nullable List<GetNatGatewaysFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of all the NAT gateway ids found.
     * 
     */
    private final List<String> ids;
    private final Map<String,String> tags;
    private final @Nullable String vpcId;

    @CustomType.Constructor
    private GetNatGatewaysResult(
        @CustomType.Parameter("filters") @Nullable List<GetNatGatewaysFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    public List<GetNatGatewaysFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of all the NAT gateway ids found.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatGatewaysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetNatGatewaysFilter> filters;
        private String id;
        private List<String> ids;
        private Map<String,String> tags;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatGatewaysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder filters(@Nullable List<GetNatGatewaysFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNatGatewaysFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public GetNatGatewaysResult build() {
            return new GetNatGatewaysResult(filters, id, ids, tags, vpcId);
        }
    }
}
