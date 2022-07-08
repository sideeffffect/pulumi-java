// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class AssignmentGroupLabelResponse {
    /**
     * @return Google Compute Engine instance labels that must be present for an instance to be included in this assignment group.
     * 
     */
    private final Map<String,String> labels;

    @CustomType.Constructor
    private AssignmentGroupLabelResponse(@CustomType.Parameter("labels") Map<String,String> labels) {
        this.labels = labels;
    }

    /**
     * @return Google Compute Engine instance labels that must be present for an instance to be included in this assignment group.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentGroupLabelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentGroupLabelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }        public AssignmentGroupLabelResponse build() {
            return new AssignmentGroupLabelResponse(labels);
        }
    }
}
