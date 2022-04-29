// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GuestPoliciesAssignmentGroupLabelArgs extends ResourceArgs {

    public static final GuestPoliciesAssignmentGroupLabelArgs Empty = new GuestPoliciesAssignmentGroupLabelArgs();

    /**
     * Google Compute Engine instance labels that must be present for an instance to be included in this assignment group.
     * 
     */
    @Import(name="labels", required=true)
    private Output<Map<String,String>> labels;

    /**
     * @return Google Compute Engine instance labels that must be present for an instance to be included in this assignment group.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }

    private GuestPoliciesAssignmentGroupLabelArgs() {}

    private GuestPoliciesAssignmentGroupLabelArgs(GuestPoliciesAssignmentGroupLabelArgs $) {
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesAssignmentGroupLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesAssignmentGroupLabelArgs $;

        public Builder() {
            $ = new GuestPoliciesAssignmentGroupLabelArgs();
        }

        public Builder(GuestPoliciesAssignmentGroupLabelArgs defaults) {
            $ = new GuestPoliciesAssignmentGroupLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels Google Compute Engine instance labels that must be present for an instance to be included in this assignment group.
         * 
         * @return builder
         * 
         */
        public Builder labels(Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Google Compute Engine instance labels that must be present for an instance to be included in this assignment group.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public GuestPoliciesAssignmentGroupLabelArgs build() {
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            return $;
        }
    }

}
