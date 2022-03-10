// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an incident label
 * 
 */
public final class IncidentLabelResponse extends io.pulumi.resources.InvokeArgs {

    public static final IncidentLabelResponse Empty = new IncidentLabelResponse();

    /**
     * The name of the label
     * 
     */
    @InputImport(name="labelName", required=true)
      private final String labelName;

    public String getLabelName() {
        return this.labelName;
    }

    /**
     * The type of the label
     * 
     */
    @InputImport(name="labelType", required=true)
      private final String labelType;

    public String getLabelType() {
        return this.labelType;
    }

    public IncidentLabelResponse(
        String labelName,
        String labelType) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
        this.labelType = Objects.requireNonNull(labelType, "expected parameter 'labelType' to be non-null");
    }

    private IncidentLabelResponse() {
        this.labelName = null;
        this.labelType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentLabelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labelName;
        private String labelType;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentLabelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
    	      this.labelType = defaults.labelType;
        }

        public Builder labelName(String labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }

        public Builder labelType(String labelType) {
            this.labelType = Objects.requireNonNull(labelType);
            return this;
        }
        public IncidentLabelResponse build() {
            return new IncidentLabelResponse(labelName, labelType);
        }
    }
}
