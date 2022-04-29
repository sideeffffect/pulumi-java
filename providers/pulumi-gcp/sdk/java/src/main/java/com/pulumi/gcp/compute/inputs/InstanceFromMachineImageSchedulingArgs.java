// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingNodeAffinityArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageSchedulingArgs extends ResourceArgs {

    public static final InstanceFromMachineImageSchedulingArgs Empty = new InstanceFromMachineImageSchedulingArgs();

    @Import(name="automaticRestart")
    private @Nullable Output<Boolean> automaticRestart;

    public Optional<Output<Boolean>> automaticRestart() {
        return Optional.ofNullable(this.automaticRestart);
    }

    @Import(name="minNodeCpus")
    private @Nullable Output<Integer> minNodeCpus;

    public Optional<Output<Integer>> minNodeCpus() {
        return Optional.ofNullable(this.minNodeCpus);
    }

    @Import(name="nodeAffinities")
    private @Nullable Output<List<InstanceFromMachineImageSchedulingNodeAffinityArgs>> nodeAffinities;

    public Optional<Output<List<InstanceFromMachineImageSchedulingNodeAffinityArgs>>> nodeAffinities() {
        return Optional.ofNullable(this.nodeAffinities);
    }

    @Import(name="onHostMaintenance")
    private @Nullable Output<String> onHostMaintenance;

    public Optional<Output<String>> onHostMaintenance() {
        return Optional.ofNullable(this.onHostMaintenance);
    }

    @Import(name="preemptible")
    private @Nullable Output<Boolean> preemptible;

    public Optional<Output<Boolean>> preemptible() {
        return Optional.ofNullable(this.preemptible);
    }

    private InstanceFromMachineImageSchedulingArgs() {}

    private InstanceFromMachineImageSchedulingArgs(InstanceFromMachineImageSchedulingArgs $) {
        this.automaticRestart = $.automaticRestart;
        this.minNodeCpus = $.minNodeCpus;
        this.nodeAffinities = $.nodeAffinities;
        this.onHostMaintenance = $.onHostMaintenance;
        this.preemptible = $.preemptible;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageSchedulingArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageSchedulingArgs();
        }

        public Builder(InstanceFromMachineImageSchedulingArgs defaults) {
            $ = new InstanceFromMachineImageSchedulingArgs(Objects.requireNonNull(defaults));
        }

        public Builder automaticRestart(@Nullable Output<Boolean> automaticRestart) {
            $.automaticRestart = automaticRestart;
            return this;
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            return automaticRestart(Output.of(automaticRestart));
        }

        public Builder minNodeCpus(@Nullable Output<Integer> minNodeCpus) {
            $.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder minNodeCpus(Integer minNodeCpus) {
            return minNodeCpus(Output.of(minNodeCpus));
        }

        public Builder nodeAffinities(@Nullable Output<List<InstanceFromMachineImageSchedulingNodeAffinityArgs>> nodeAffinities) {
            $.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder nodeAffinities(List<InstanceFromMachineImageSchedulingNodeAffinityArgs> nodeAffinities) {
            return nodeAffinities(Output.of(nodeAffinities));
        }

        public Builder nodeAffinities(InstanceFromMachineImageSchedulingNodeAffinityArgs... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }

        public Builder onHostMaintenance(@Nullable Output<String> onHostMaintenance) {
            $.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder onHostMaintenance(String onHostMaintenance) {
            return onHostMaintenance(Output.of(onHostMaintenance));
        }

        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            $.preemptible = preemptible;
            return this;
        }

        public Builder preemptible(Boolean preemptible) {
            return preemptible(Output.of(preemptible));
        }

        public InstanceFromMachineImageSchedulingArgs build() {
            return $;
        }
    }

}
