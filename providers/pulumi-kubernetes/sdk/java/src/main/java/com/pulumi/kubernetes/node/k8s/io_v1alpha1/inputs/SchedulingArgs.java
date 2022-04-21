// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.node.k8s.io_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.TolerationArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
 * 
 */
public final class SchedulingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulingArgs Empty = new SchedulingArgs();

    /**
     * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
     * 
     */
    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,String>> nodeSelector;

    public Optional<Output<Map<String,String>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    /**
     * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
     * 
     */
    @Import(name="tolerations")
    private @Nullable Output<List<TolerationArgs>> tolerations;

    public Optional<Output<List<TolerationArgs>>> tolerations() {
        return Optional.ofNullable(this.tolerations);
    }

    private SchedulingArgs() {}

    private SchedulingArgs(SchedulingArgs $) {
        this.nodeSelector = $.nodeSelector;
        this.tolerations = $.tolerations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingArgs $;

        public Builder() {
            $ = new SchedulingArgs();
        }

        public Builder(SchedulingArgs defaults) {
            $ = new SchedulingArgs(Objects.requireNonNull(defaults));
        }

        public Builder nodeSelector(@Nullable Output<Map<String,String>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        public Builder nodeSelector(Map<String,String> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        public Builder tolerations(@Nullable Output<List<TolerationArgs>> tolerations) {
            $.tolerations = tolerations;
            return this;
        }

        public Builder tolerations(List<TolerationArgs> tolerations) {
            return tolerations(Output.of(tolerations));
        }

        public Builder tolerations(TolerationArgs... tolerations) {
            return tolerations(List.of(tolerations));
        }

        public SchedulingArgs build() {
            return $;
        }
    }

}
