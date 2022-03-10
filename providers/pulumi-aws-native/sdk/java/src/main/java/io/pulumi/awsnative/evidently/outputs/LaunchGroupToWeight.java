// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LaunchGroupToWeight {
    private final String groupName;
    private final Integer splitWeight;

    @OutputCustomType.Constructor
    private LaunchGroupToWeight(
        @OutputCustomType.Parameter("groupName") String groupName,
        @OutputCustomType.Parameter("splitWeight") Integer splitWeight) {
        this.groupName = groupName;
        this.splitWeight = splitWeight;
    }

    public String getGroupName() {
        return this.groupName;
    }
    public Integer getSplitWeight() {
        return this.splitWeight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchGroupToWeight defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupName;
        private Integer splitWeight;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchGroupToWeight defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupName = defaults.groupName;
    	      this.splitWeight = defaults.splitWeight;
        }

        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder splitWeight(Integer splitWeight) {
            this.splitWeight = Objects.requireNonNull(splitWeight);
            return this;
        }
        public LaunchGroupToWeight build() {
            return new LaunchGroupToWeight(groupName, splitWeight);
        }
    }
}
