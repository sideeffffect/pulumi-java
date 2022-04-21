// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentInstanceFilterExclusionLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentInstanceFilterExclusionLabelArgs Empty = new OsPolicyAssignmentInstanceFilterExclusionLabelArgs();

    /**
     * Labels are identified by key/value pairs in this map. A VM should contain all the key/value pairs specified in this map to be selected.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private OsPolicyAssignmentInstanceFilterExclusionLabelArgs() {}

    private OsPolicyAssignmentInstanceFilterExclusionLabelArgs(OsPolicyAssignmentInstanceFilterExclusionLabelArgs $) {
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentInstanceFilterExclusionLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentInstanceFilterExclusionLabelArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentInstanceFilterExclusionLabelArgs();
        }

        public Builder(OsPolicyAssignmentInstanceFilterExclusionLabelArgs defaults) {
            $ = new OsPolicyAssignmentInstanceFilterExclusionLabelArgs(Objects.requireNonNull(defaults));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public OsPolicyAssignmentInstanceFilterExclusionLabelArgs build() {
            return $;
        }
    }

}
