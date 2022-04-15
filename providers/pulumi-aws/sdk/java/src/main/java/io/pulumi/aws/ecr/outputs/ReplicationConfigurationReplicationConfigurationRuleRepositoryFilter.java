// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter {
    /**
     * The repository filter details.
     * 
     */
    private final String filter;
    /**
     * The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
     * 
     */
    private final String filterType;

    @CustomType.Constructor
    private ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter(
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("filterType") String filterType) {
        this.filter = filter;
        this.filterType = filterType;
    }

    /**
     * The repository filter details.
     * 
    */
    public String filter() {
        return this.filter;
    }
    /**
     * The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
     * 
    */
    public String filterType() {
        return this.filterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private String filterType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.filterType = defaults.filterType;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filterType(String filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }        public ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter build() {
            return new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter(filter, filterType);
        }
    }
}
