// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.aws.iot.outputs.ThingGroupMetadataRootToParentGroup;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ThingGroupMetadata {
    private final @Nullable String creationDate;
    /**
     * The name of the parent Thing Group.
     * 
     */
    private final @Nullable String parentGroupName;
    private final @Nullable List<ThingGroupMetadataRootToParentGroup> rootToParentGroups;

    @OutputCustomType.Constructor
    private ThingGroupMetadata(
        @OutputCustomType.Parameter("creationDate") @Nullable String creationDate,
        @OutputCustomType.Parameter("parentGroupName") @Nullable String parentGroupName,
        @OutputCustomType.Parameter("rootToParentGroups") @Nullable List<ThingGroupMetadataRootToParentGroup> rootToParentGroups) {
        this.creationDate = creationDate;
        this.parentGroupName = parentGroupName;
        this.rootToParentGroups = rootToParentGroups;
    }

    public Optional<String> getCreationDate() {
        return Optional.ofNullable(this.creationDate);
    }
    /**
     * The name of the parent Thing Group.
     * 
    */
    public Optional<String> getParentGroupName() {
        return Optional.ofNullable(this.parentGroupName);
    }
    public List<ThingGroupMetadataRootToParentGroup> getRootToParentGroups() {
        return this.rootToParentGroups == null ? List.of() : this.rootToParentGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationDate;
        private @Nullable String parentGroupName;
        private @Nullable List<ThingGroupMetadataRootToParentGroup> rootToParentGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.parentGroupName = defaults.parentGroupName;
    	      this.rootToParentGroups = defaults.rootToParentGroups;
        }

        public Builder creationDate(@Nullable String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder parentGroupName(@Nullable String parentGroupName) {
            this.parentGroupName = parentGroupName;
            return this;
        }

        public Builder rootToParentGroups(@Nullable List<ThingGroupMetadataRootToParentGroup> rootToParentGroups) {
            this.rootToParentGroups = rootToParentGroups;
            return this;
        }
        public ThingGroupMetadata build() {
            return new ThingGroupMetadata(creationDate, parentGroupName, rootToParentGroups);
        }
    }
}
