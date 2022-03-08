// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetLocalGatewaysFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocalGatewaysResult {
    private final @Nullable List<GetLocalGatewaysFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of all the Local Gateway identifiers
     * 
     */
    private final List<String> ids;
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"filters","id","ids","tags"})
    private GetLocalGatewaysResult(
        @Nullable List<GetLocalGatewaysFilter> filters,
        String id,
        List<String> ids,
        Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.tags = tags;
    }

    public List<GetLocalGatewaysFilter> getFilters() {
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
     * Set of all the Local Gateway identifiers
     * 
    */
    public List<String> getIds() {
        return this.ids;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewaysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetLocalGatewaysFilter> filters;
        private String id;
        private List<String> ids;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewaysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetLocalGatewaysFilter> filters) {
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

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetLocalGatewaysResult build() {
            return new GetLocalGatewaysResult(filters, id, ids, tags);
        }
    }
}
