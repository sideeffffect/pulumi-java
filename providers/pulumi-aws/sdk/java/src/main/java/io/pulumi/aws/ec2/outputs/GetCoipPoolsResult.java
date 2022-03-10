// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetCoipPoolsFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCoipPoolsResult {
    private final @Nullable List<GetCoipPoolsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of COIP Pool Identifiers
     * 
     */
    private final List<String> poolIds;
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetCoipPoolsResult(
        @OutputCustomType.Parameter("filters") @Nullable List<GetCoipPoolsFilter> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("poolIds") List<String> poolIds,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.poolIds = poolIds;
        this.tags = tags;
    }

    public List<GetCoipPoolsFilter> getFilters() {
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
     * Set of COIP Pool Identifiers
     * 
    */
    public List<String> getPoolIds() {
        return this.poolIds;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoipPoolsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetCoipPoolsFilter> filters;
        private String id;
        private List<String> poolIds;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoipPoolsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.poolIds = defaults.poolIds;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetCoipPoolsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder poolIds(List<String> poolIds) {
            this.poolIds = Objects.requireNonNull(poolIds);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetCoipPoolsResult build() {
            return new GetCoipPoolsResult(filters, id, poolIds, tags);
        }
    }
}
