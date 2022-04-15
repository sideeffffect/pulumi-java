// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs();

    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    @Import(name="tableReference", required=true)
      private final Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference;

    public Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference() {
        return this.tableReference;
    }

    public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs(Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference) {
        this.tableReference = Objects.requireNonNull(tableReference, "expected parameter 'tableReference' to be non-null");
    }

    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs() {
        this.tableReference = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableReference = defaults.tableReference;
        }

        public Builder tableReference(Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference) {
            this.tableReference = Objects.requireNonNull(tableReference);
            return this;
        }
        public Builder tableReference(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs tableReference) {
            this.tableReference = Output.of(Objects.requireNonNull(tableReference));
            return this;
        }        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs(tableReference);
        }
    }
}
