// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsGetArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionGetArgs Empty = new PreventionJobTriggerInspectJobActionGetArgs();

    /**
     * Schedule for triggered jobs
     * Structure is documented below.
     * 
     */
    @Import(name="saveFindings", required=true)
    private Output<PreventionJobTriggerInspectJobActionSaveFindingsGetArgs> saveFindings;

    public Output<PreventionJobTriggerInspectJobActionSaveFindingsGetArgs> saveFindings() {
        return this.saveFindings;
    }

    private PreventionJobTriggerInspectJobActionGetArgs() {}

    private PreventionJobTriggerInspectJobActionGetArgs(PreventionJobTriggerInspectJobActionGetArgs $) {
        this.saveFindings = $.saveFindings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobActionGetArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobActionGetArgs();
        }

        public Builder(PreventionJobTriggerInspectJobActionGetArgs defaults) {
            $ = new PreventionJobTriggerInspectJobActionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder saveFindings(Output<PreventionJobTriggerInspectJobActionSaveFindingsGetArgs> saveFindings) {
            $.saveFindings = saveFindings;
            return this;
        }

        public Builder saveFindings(PreventionJobTriggerInspectJobActionSaveFindingsGetArgs saveFindings) {
            return saveFindings(Output.of(saveFindings));
        }

        public PreventionJobTriggerInspectJobActionGetArgs build() {
            $.saveFindings = Objects.requireNonNull($.saveFindings, "expected parameter 'saveFindings' to be non-null");
            return $;
        }
    }

}
