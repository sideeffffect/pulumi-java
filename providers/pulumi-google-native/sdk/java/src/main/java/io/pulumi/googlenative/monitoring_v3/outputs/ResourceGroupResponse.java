// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceGroupResponse {
    /**
     * The group of resources being monitored. Should be only the [GROUP_ID], and not the full-path projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID].
     * 
     */
    private final String groupId;
    /**
     * The resource type of the group members.
     * 
     */
    private final String resourceType;

    @OutputCustomType.Constructor
    private ResourceGroupResponse(
        @OutputCustomType.Parameter("groupId") String groupId,
        @OutputCustomType.Parameter("resourceType") String resourceType) {
        this.groupId = groupId;
        this.resourceType = resourceType;
    }

    /**
     * The group of resources being monitored. Should be only the [GROUP_ID], and not the full-path projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID].
     * 
    */
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * The resource type of the group members.
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public ResourceGroupResponse build() {
            return new ResourceGroupResponse(groupId, resourceType);
        }
    }
}
