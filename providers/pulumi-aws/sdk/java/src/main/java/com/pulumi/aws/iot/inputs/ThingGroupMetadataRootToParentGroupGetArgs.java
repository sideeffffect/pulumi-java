// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThingGroupMetadataRootToParentGroupGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThingGroupMetadataRootToParentGroupGetArgs Empty = new ThingGroupMetadataRootToParentGroupGetArgs();

    @Import(name="groupArn")
    private @Nullable Output<String> groupArn;

    public Optional<Output<String>> groupArn() {
        return Optional.ofNullable(this.groupArn);
    }

    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    private ThingGroupMetadataRootToParentGroupGetArgs() {}

    private ThingGroupMetadataRootToParentGroupGetArgs(ThingGroupMetadataRootToParentGroupGetArgs $) {
        this.groupArn = $.groupArn;
        this.groupName = $.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThingGroupMetadataRootToParentGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThingGroupMetadataRootToParentGroupGetArgs $;

        public Builder() {
            $ = new ThingGroupMetadataRootToParentGroupGetArgs();
        }

        public Builder(ThingGroupMetadataRootToParentGroupGetArgs defaults) {
            $ = new ThingGroupMetadataRootToParentGroupGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupArn(@Nullable Output<String> groupArn) {
            $.groupArn = groupArn;
            return this;
        }

        public Builder groupArn(String groupArn) {
            return groupArn(Output.of(groupArn));
        }

        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public ThingGroupMetadataRootToParentGroupGetArgs build() {
            return $;
        }
    }

}
