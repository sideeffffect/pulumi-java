// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodePoolManagementArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolManagementArgs Empty = new NodePoolManagementArgs();

    /**
     * Whether the nodes will be automatically repaired.
     * 
     */
    @InputImport(name="autoRepair")
      private final @Nullable Input<Boolean> autoRepair;

    public Input<Boolean> getAutoRepair() {
        return this.autoRepair == null ? Input.empty() : this.autoRepair;
    }

    /**
     * Whether the nodes will be automatically upgraded.
     * 
     */
    @InputImport(name="autoUpgrade")
      private final @Nullable Input<Boolean> autoUpgrade;

    public Input<Boolean> getAutoUpgrade() {
        return this.autoUpgrade == null ? Input.empty() : this.autoUpgrade;
    }

    public NodePoolManagementArgs(
        @Nullable Input<Boolean> autoRepair,
        @Nullable Input<Boolean> autoUpgrade) {
        this.autoRepair = autoRepair;
        this.autoUpgrade = autoUpgrade;
    }

    private NodePoolManagementArgs() {
        this.autoRepair = Input.empty();
        this.autoUpgrade = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoRepair;
        private @Nullable Input<Boolean> autoUpgrade;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolManagementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
        }

        public Builder autoRepair(@Nullable Input<Boolean> autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }

        public Builder autoRepair(@Nullable Boolean autoRepair) {
            this.autoRepair = Input.ofNullable(autoRepair);
            return this;
        }

        public Builder autoUpgrade(@Nullable Input<Boolean> autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }

        public Builder autoUpgrade(@Nullable Boolean autoUpgrade) {
            this.autoUpgrade = Input.ofNullable(autoUpgrade);
            return this;
        }
        public NodePoolManagementArgs build() {
            return new NodePoolManagementArgs(autoRepair, autoUpgrade);
        }
    }
}
