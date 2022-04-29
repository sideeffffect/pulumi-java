// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LaunchGroupToWeightArgs extends ResourceArgs {

    public static final LaunchGroupToWeightArgs Empty = new LaunchGroupToWeightArgs();

    @Import(name="groupName", required=true)
    private Output<String> groupName;

    public Output<String> groupName() {
        return this.groupName;
    }

    @Import(name="splitWeight", required=true)
    private Output<Integer> splitWeight;

    public Output<Integer> splitWeight() {
        return this.splitWeight;
    }

    private LaunchGroupToWeightArgs() {}

    private LaunchGroupToWeightArgs(LaunchGroupToWeightArgs $) {
        this.groupName = $.groupName;
        this.splitWeight = $.splitWeight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchGroupToWeightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchGroupToWeightArgs $;

        public Builder() {
            $ = new LaunchGroupToWeightArgs();
        }

        public Builder(LaunchGroupToWeightArgs defaults) {
            $ = new LaunchGroupToWeightArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupName(Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public Builder splitWeight(Output<Integer> splitWeight) {
            $.splitWeight = splitWeight;
            return this;
        }

        public Builder splitWeight(Integer splitWeight) {
            return splitWeight(Output.of(splitWeight));
        }

        public LaunchGroupToWeightArgs build() {
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            $.splitWeight = Objects.requireNonNull($.splitWeight, "expected parameter 'splitWeight' to be non-null");
            return $;
        }
    }

}
