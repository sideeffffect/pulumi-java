// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupMetadataRootToParentGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupMetadataRootToParentGroupGetArgs Empty = new ThingGroupMetadataRootToParentGroupGetArgs();

    @InputImport(name="groupArn")
      private final @Nullable Input<String> groupArn;

    public Input<String> getGroupArn() {
        return this.groupArn == null ? Input.empty() : this.groupArn;
    }

    @InputImport(name="groupName")
      private final @Nullable Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName == null ? Input.empty() : this.groupName;
    }

    public ThingGroupMetadataRootToParentGroupGetArgs(
        @Nullable Input<String> groupArn,
        @Nullable Input<String> groupName) {
        this.groupArn = groupArn;
        this.groupName = groupName;
    }

    private ThingGroupMetadataRootToParentGroupGetArgs() {
        this.groupArn = Input.empty();
        this.groupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupMetadataRootToParentGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> groupArn;
        private @Nullable Input<String> groupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupMetadataRootToParentGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupArn = defaults.groupArn;
    	      this.groupName = defaults.groupName;
        }

        public Builder groupArn(@Nullable Input<String> groupArn) {
            this.groupArn = groupArn;
            return this;
        }

        public Builder groupArn(@Nullable String groupArn) {
            this.groupArn = Input.ofNullable(groupArn);
            return this;
        }

        public Builder groupName(@Nullable Input<String> groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder groupName(@Nullable String groupName) {
            this.groupName = Input.ofNullable(groupName);
            return this;
        }
        public ThingGroupMetadataRootToParentGroupGetArgs build() {
            return new ThingGroupMetadataRootToParentGroupGetArgs(groupArn, groupName);
        }
    }
}
