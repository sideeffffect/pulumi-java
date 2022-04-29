// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterExclusionLabelArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInclusionLabelArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInventoryArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentInstanceFilterArgs extends ResourceArgs {

    public static final OsPolicyAssignmentInstanceFilterArgs Empty = new OsPolicyAssignmentInstanceFilterArgs();

    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    @Import(name="all")
    private @Nullable Output<Boolean> all;

    /**
     * @return Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    public Optional<Output<Boolean>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    @Import(name="exclusionLabels")
    private @Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels;

    /**
     * @return List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    public Optional<Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>>> exclusionLabels() {
        return Optional.ofNullable(this.exclusionLabels);
    }

    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    @Import(name="inclusionLabels")
    private @Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels;

    /**
     * @return List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    public Optional<Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>>> inclusionLabels() {
        return Optional.ofNullable(this.inclusionLabels);
    }

    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    @Import(name="inventories")
    private @Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories;

    /**
     * @return List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    public Optional<Output<List<OsPolicyAssignmentInstanceFilterInventoryArgs>>> inventories() {
        return Optional.ofNullable(this.inventories);
    }

    private OsPolicyAssignmentInstanceFilterArgs() {}

    private OsPolicyAssignmentInstanceFilterArgs(OsPolicyAssignmentInstanceFilterArgs $) {
        this.all = $.all;
        this.exclusionLabels = $.exclusionLabels;
        this.inclusionLabels = $.inclusionLabels;
        this.inventories = $.inventories;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentInstanceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentInstanceFilterArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentInstanceFilterArgs();
        }

        public Builder(OsPolicyAssignmentInstanceFilterArgs defaults) {
            $ = new OsPolicyAssignmentInstanceFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all Target all VMs in the project. If true, no other criteria is permitted.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<Boolean> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all Target all VMs in the project. If true, no other criteria is permitted.
         * 
         * @return builder
         * 
         */
        public Builder all(Boolean all) {
            return all(Output.of(all));
        }

        /**
         * @param exclusionLabels List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
         * 
         * @return builder
         * 
         */
        public Builder exclusionLabels(@Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs>> exclusionLabels) {
            $.exclusionLabels = exclusionLabels;
            return this;
        }

        /**
         * @param exclusionLabels List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
         * 
         * @return builder
         * 
         */
        public Builder exclusionLabels(List<OsPolicyAssignmentInstanceFilterExclusionLabelArgs> exclusionLabels) {
            return exclusionLabels(Output.of(exclusionLabels));
        }

        /**
         * @param exclusionLabels List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
         * 
         * @return builder
         * 
         */
        public Builder exclusionLabels(OsPolicyAssignmentInstanceFilterExclusionLabelArgs... exclusionLabels) {
            return exclusionLabels(List.of(exclusionLabels));
        }

        /**
         * @param inclusionLabels List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
         * 
         * @return builder
         * 
         */
        public Builder inclusionLabels(@Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs>> inclusionLabels) {
            $.inclusionLabels = inclusionLabels;
            return this;
        }

        /**
         * @param inclusionLabels List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
         * 
         * @return builder
         * 
         */
        public Builder inclusionLabels(List<OsPolicyAssignmentInstanceFilterInclusionLabelArgs> inclusionLabels) {
            return inclusionLabels(Output.of(inclusionLabels));
        }

        /**
         * @param inclusionLabels List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
         * 
         * @return builder
         * 
         */
        public Builder inclusionLabels(OsPolicyAssignmentInstanceFilterInclusionLabelArgs... inclusionLabels) {
            return inclusionLabels(List.of(inclusionLabels));
        }

        /**
         * @param inventories List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
         * 
         * @return builder
         * 
         */
        public Builder inventories(@Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryArgs>> inventories) {
            $.inventories = inventories;
            return this;
        }

        /**
         * @param inventories List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
         * 
         * @return builder
         * 
         */
        public Builder inventories(List<OsPolicyAssignmentInstanceFilterInventoryArgs> inventories) {
            return inventories(Output.of(inventories));
        }

        /**
         * @param inventories List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
         * 
         * @return builder
         * 
         */
        public Builder inventories(OsPolicyAssignmentInstanceFilterInventoryArgs... inventories) {
            return inventories(List.of(inventories));
        }

        public OsPolicyAssignmentInstanceFilterArgs build() {
            return $;
        }
    }

}
