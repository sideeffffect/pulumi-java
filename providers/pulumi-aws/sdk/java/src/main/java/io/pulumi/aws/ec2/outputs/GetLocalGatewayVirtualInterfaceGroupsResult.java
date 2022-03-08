// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupsFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocalGatewayVirtualInterfaceGroupsResult {
    private final @Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of EC2 Local Gateway Virtual Interface Group identifiers.
     * 
     */
    private final List<String> ids;
    /**
     * Set of EC2 Local Gateway Virtual Interface identifiers.
     * 
     */
    private final List<String> localGatewayVirtualInterfaceIds;
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"filters","id","ids","localGatewayVirtualInterfaceIds","tags"})
    private GetLocalGatewayVirtualInterfaceGroupsResult(
        @Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters,
        String id,
        List<String> ids,
        List<String> localGatewayVirtualInterfaceIds,
        Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds;
        this.tags = tags;
    }

    public List<GetLocalGatewayVirtualInterfaceGroupsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set of EC2 Local Gateway Virtual Interface Group identifiers.
     * 
    */
    public List<String> getIds() {
        return this.ids;
    }
    /**
     * Set of EC2 Local Gateway Virtual Interface identifiers.
     * 
    */
    public List<String> getLocalGatewayVirtualInterfaceIds() {
        return this.localGatewayVirtualInterfaceIds;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters;
        private String id;
        private List<String> ids;
        private List<String> localGatewayVirtualInterfaceIds;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayVirtualInterfaceGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.localGatewayVirtualInterfaceIds = defaults.localGatewayVirtualInterfaceIds;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIds(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }

        public Builder setLocalGatewayVirtualInterfaceIds(List<String> localGatewayVirtualInterfaceIds) {
            this.localGatewayVirtualInterfaceIds = Objects.requireNonNull(localGatewayVirtualInterfaceIds);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetLocalGatewayVirtualInterfaceGroupsResult build() {
            return new GetLocalGatewayVirtualInterfaceGroupsResult(filters, id, ids, localGatewayVirtualInterfaceIds, tags);
        }
    }
}
