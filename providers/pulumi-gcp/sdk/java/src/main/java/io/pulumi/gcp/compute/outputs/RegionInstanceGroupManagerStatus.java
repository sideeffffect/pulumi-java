// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerStatusStateful;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerStatusVersionTarget;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionInstanceGroupManagerStatus {
    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    private final @Nullable Boolean isStable;
    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    private final @Nullable List<RegionInstanceGroupManagerStatusStateful> statefuls;
    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
     */
    private final @Nullable List<RegionInstanceGroupManagerStatusVersionTarget> versionTargets;

    @OutputCustomType.Constructor
    private RegionInstanceGroupManagerStatus(
        @OutputCustomType.Parameter("isStable") @Nullable Boolean isStable,
        @OutputCustomType.Parameter("statefuls") @Nullable List<RegionInstanceGroupManagerStatusStateful> statefuls,
        @OutputCustomType.Parameter("versionTargets") @Nullable List<RegionInstanceGroupManagerStatusVersionTarget> versionTargets) {
        this.isStable = isStable;
        this.statefuls = statefuls;
        this.versionTargets = versionTargets;
    }

    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
    */
    public Optional<Boolean> getIsStable() {
        return Optional.ofNullable(this.isStable);
    }
    /**
     * Stateful status of the given Instance Group Manager.
     * 
    */
    public List<RegionInstanceGroupManagerStatusStateful> getStatefuls() {
        return this.statefuls == null ? List.of() : this.statefuls;
    }
    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
    */
    public List<RegionInstanceGroupManagerStatusVersionTarget> getVersionTargets() {
        return this.versionTargets == null ? List.of() : this.versionTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isStable;
        private @Nullable List<RegionInstanceGroupManagerStatusStateful> statefuls;
        private @Nullable List<RegionInstanceGroupManagerStatusVersionTarget> versionTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isStable = defaults.isStable;
    	      this.statefuls = defaults.statefuls;
    	      this.versionTargets = defaults.versionTargets;
        }

        public Builder isStable(@Nullable Boolean isStable) {
            this.isStable = isStable;
            return this;
        }

        public Builder statefuls(@Nullable List<RegionInstanceGroupManagerStatusStateful> statefuls) {
            this.statefuls = statefuls;
            return this;
        }

        public Builder versionTargets(@Nullable List<RegionInstanceGroupManagerStatusVersionTarget> versionTargets) {
            this.versionTargets = versionTargets;
            return this;
        }
        public RegionInstanceGroupManagerStatus build() {
            return new RegionInstanceGroupManagerStatus(isStable, statefuls, versionTargets);
        }
    }
}
