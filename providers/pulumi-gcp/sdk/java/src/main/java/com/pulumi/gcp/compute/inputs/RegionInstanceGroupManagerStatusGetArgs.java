// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulGetArgs;
import com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusVersionTargetGetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusGetArgs Empty = new RegionInstanceGroupManagerStatusGetArgs();

    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    @Import(name="isStable")
    private @Nullable Output<Boolean> isStable;

    public Optional<Output<Boolean>> isStable() {
        return Optional.ofNullable(this.isStable);
    }

    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    @Import(name="statefuls")
    private @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls;

    public Optional<Output<List<RegionInstanceGroupManagerStatusStatefulGetArgs>>> statefuls() {
        return Optional.ofNullable(this.statefuls);
    }

    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances&#39; target version are specified by version field on Instance Group Manager.
     * 
     */
    @Import(name="versionTargets")
    private @Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets;

    public Optional<Output<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>>> versionTargets() {
        return Optional.ofNullable(this.versionTargets);
    }

    private RegionInstanceGroupManagerStatusGetArgs() {}

    private RegionInstanceGroupManagerStatusGetArgs(RegionInstanceGroupManagerStatusGetArgs $) {
        this.isStable = $.isStable;
        this.statefuls = $.statefuls;
        this.versionTargets = $.versionTargets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceGroupManagerStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceGroupManagerStatusGetArgs $;

        public Builder() {
            $ = new RegionInstanceGroupManagerStatusGetArgs();
        }

        public Builder(RegionInstanceGroupManagerStatusGetArgs defaults) {
            $ = new RegionInstanceGroupManagerStatusGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder isStable(@Nullable Output<Boolean> isStable) {
            $.isStable = isStable;
            return this;
        }

        public Builder isStable(Boolean isStable) {
            return isStable(Output.of(isStable));
        }

        public Builder statefuls(@Nullable Output<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls) {
            $.statefuls = statefuls;
            return this;
        }

        public Builder statefuls(List<RegionInstanceGroupManagerStatusStatefulGetArgs> statefuls) {
            return statefuls(Output.of(statefuls));
        }

        public Builder statefuls(RegionInstanceGroupManagerStatusStatefulGetArgs... statefuls) {
            return statefuls(List.of(statefuls));
        }

        public Builder versionTargets(@Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets) {
            $.versionTargets = versionTargets;
            return this;
        }

        public Builder versionTargets(List<RegionInstanceGroupManagerStatusVersionTargetGetArgs> versionTargets) {
            return versionTargets(Output.of(versionTargets));
        }

        public Builder versionTargets(RegionInstanceGroupManagerStatusVersionTargetGetArgs... versionTargets) {
            return versionTargets(List.of(versionTargets));
        }

        public RegionInstanceGroupManagerStatusGetArgs build() {
            return $;
        }
    }

}
