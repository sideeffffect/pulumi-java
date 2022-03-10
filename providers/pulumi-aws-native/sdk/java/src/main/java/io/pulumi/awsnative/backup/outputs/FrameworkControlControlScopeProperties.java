// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.FrameworkTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FrameworkControlControlScopeProperties {
    /**
     * The ID of the only AWS resource that you want your control scope to contain.
     * 
     */
    private final @Nullable List<String> complianceResourceIds;
    /**
     * Describes whether the control scope includes one or more types of resources, such as `EFS` or `RDS`.
     * 
     */
    private final @Nullable List<String> complianceResourceTypes;
    /**
     * Describes whether the control scope includes resources with one or more tags. Each tag is a key-value pair.
     * 
     */
    private final @Nullable List<FrameworkTag> tags;

    @OutputCustomType.Constructor
    private FrameworkControlControlScopeProperties(
        @OutputCustomType.Parameter("complianceResourceIds") @Nullable List<String> complianceResourceIds,
        @OutputCustomType.Parameter("complianceResourceTypes") @Nullable List<String> complianceResourceTypes,
        @OutputCustomType.Parameter("tags") @Nullable List<FrameworkTag> tags) {
        this.complianceResourceIds = complianceResourceIds;
        this.complianceResourceTypes = complianceResourceTypes;
        this.tags = tags;
    }

    /**
     * The ID of the only AWS resource that you want your control scope to contain.
     * 
    */
    public List<String> getComplianceResourceIds() {
        return this.complianceResourceIds == null ? List.of() : this.complianceResourceIds;
    }
    /**
     * Describes whether the control scope includes one or more types of resources, such as `EFS` or `RDS`.
     * 
    */
    public List<String> getComplianceResourceTypes() {
        return this.complianceResourceTypes == null ? List.of() : this.complianceResourceTypes;
    }
    /**
     * Describes whether the control scope includes resources with one or more tags. Each tag is a key-value pair.
     * 
    */
    public List<FrameworkTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControlControlScopeProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> complianceResourceIds;
        private @Nullable List<String> complianceResourceTypes;
        private @Nullable List<FrameworkTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControlControlScopeProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceResourceIds = defaults.complianceResourceIds;
    	      this.complianceResourceTypes = defaults.complianceResourceTypes;
    	      this.tags = defaults.tags;
        }

        public Builder complianceResourceIds(@Nullable List<String> complianceResourceIds) {
            this.complianceResourceIds = complianceResourceIds;
            return this;
        }

        public Builder complianceResourceTypes(@Nullable List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }

        public Builder tags(@Nullable List<FrameworkTag> tags) {
            this.tags = tags;
            return this;
        }
        public FrameworkControlControlScopeProperties build() {
            return new FrameworkControlControlScopeProperties(complianceResourceIds, complianceResourceTypes, tags);
        }
    }
}
