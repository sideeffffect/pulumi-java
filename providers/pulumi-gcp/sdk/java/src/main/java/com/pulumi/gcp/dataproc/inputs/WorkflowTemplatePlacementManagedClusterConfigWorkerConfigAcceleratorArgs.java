// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs extends ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs();

    /**
     * The number of the accelerator cards of this type exposed to this instance.
     * 
     */
    @Import(name="acceleratorCount")
    private @Nullable Output<Integer> acceleratorCount;

    /**
     * @return The number of the accelerator cards of this type exposed to this instance.
     * 
     */
    public Optional<Output<Integer>> acceleratorCount() {
        return Optional.ofNullable(this.acceleratorCount);
    }

    /**
     * Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
     * 
     */
    @Import(name="acceleratorType")
    private @Nullable Output<String> acceleratorType;

    /**
     * @return Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
     * 
     */
    public Optional<Output<String>> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs $) {
        this.acceleratorCount = $.acceleratorCount;
        this.acceleratorType = $.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorCount The number of the accelerator cards of this type exposed to this instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(@Nullable Output<Integer> acceleratorCount) {
            $.acceleratorCount = acceleratorCount;
            return this;
        }

        /**
         * @param acceleratorCount The number of the accelerator cards of this type exposed to this instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(Integer acceleratorCount) {
            return acceleratorCount(Output.of(acceleratorCount));
        }

        /**
         * @param acceleratorType Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * @param acceleratorType Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs build() {
            return $;
        }
    }

}
