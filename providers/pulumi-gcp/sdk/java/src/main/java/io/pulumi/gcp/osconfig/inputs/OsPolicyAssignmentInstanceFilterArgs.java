// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterExclusionLabelArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInclusionLabelArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInventoryArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentInstanceFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentInstanceFilterArgs Empty = new OsPolicyAssignmentInstanceFilterArgs();

    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    @InputImport(name="all")
      private final @Nullable Input<Boolean> all;

    public Input<Boolean> getAll() {
        return this.all == null ? Input.empty() : this.all;
    }

    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    @InputImport(name="exclusionLabels")
      private final @Nullable Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels;

    public Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> getExclusionLabels() {
        return this.exclusionLabels == null ? Input.empty() : this.exclusionLabels;
    }

    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    @InputImport(name="inclusionLabels")
      private final @Nullable Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels;

    public Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> getInclusionLabels() {
        return this.inclusionLabels == null ? Input.empty() : this.inclusionLabels;
    }

    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    @InputImport(name="inventories")
      private final @Nullable Input<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories;

    public Input<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> getInventories() {
        return this.inventories == null ? Input.empty() : this.inventories;
    }

    public OsPolicyAssignmentInstanceFilterArgs(
        @Nullable Input<Boolean> all,
        @Nullable Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels,
        @Nullable Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels,
        @Nullable Input<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories) {
        this.all = all;
        this.exclusionLabels = exclusionLabels;
        this.inclusionLabels = inclusionLabels;
        this.inventories = inventories;
    }

    private OsPolicyAssignmentInstanceFilterArgs() {
        this.all = Input.empty();
        this.exclusionLabels = Input.empty();
        this.inclusionLabels = Input.empty();
        this.inventories = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentInstanceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> all;
        private @Nullable Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels;
        private @Nullable Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels;
        private @Nullable Input<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentInstanceFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclusionLabels = defaults.exclusionLabels;
    	      this.inclusionLabels = defaults.inclusionLabels;
    	      this.inventories = defaults.inventories;
        }

        public Builder all(@Nullable Input<Boolean> all) {
            this.all = all;
            return this;
        }

        public Builder all(@Nullable Boolean all) {
            this.all = Input.ofNullable(all);
            return this;
        }

        public Builder exclusionLabels(@Nullable Input<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels) {
            this.exclusionLabels = exclusionLabels;
            return this;
        }

        public Builder exclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs> exclusionLabels) {
            this.exclusionLabels = Input.ofNullable(exclusionLabels);
            return this;
        }

        public Builder inclusionLabels(@Nullable Input<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels) {
            this.inclusionLabels = inclusionLabels;
            return this;
        }

        public Builder inclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs> inclusionLabels) {
            this.inclusionLabels = Input.ofNullable(inclusionLabels);
            return this;
        }

        public Builder inventories(@Nullable Input<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories) {
            this.inventories = inventories;
            return this;
        }

        public Builder inventories(@Nullable List<OsPolicyAssignmentInstanceFilterInventoryArgs> inventories) {
            this.inventories = Input.ofNullable(inventories);
            return this;
        }
        public OsPolicyAssignmentInstanceFilterArgs build() {
            return new OsPolicyAssignmentInstanceFilterArgs(all, exclusionLabels, inclusionLabels, inventories);
        }
    }
}
