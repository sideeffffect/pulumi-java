// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig;
import java.util.Objects;

@CustomType
public final class PreventionJobTriggerInspectJobActionSaveFindings {
    /**
     * @return Information on where to store output
     * Structure is documented below.
     * 
     */
    private final PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig outputConfig;

    @CustomType.Constructor
    private PreventionJobTriggerInspectJobActionSaveFindings(@CustomType.Parameter("outputConfig") PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * @return Information on where to store output
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig outputConfig() {
        return this.outputConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionSaveFindings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig outputConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionSaveFindings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputConfig = defaults.outputConfig;
        }

        public Builder outputConfig(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfig outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }        public PreventionJobTriggerInspectJobActionSaveFindings build() {
            return new PreventionJobTriggerInspectJobActionSaveFindings(outputConfig);
        }
    }
}
