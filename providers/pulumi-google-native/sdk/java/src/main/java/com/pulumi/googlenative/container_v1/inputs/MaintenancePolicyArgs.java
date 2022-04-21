// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.MaintenanceWindowArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MaintenancePolicy defines the maintenance policy to be used for the cluster.
 * 
 */
public final class MaintenancePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenancePolicyArgs Empty = new MaintenancePolicyArgs();

    /**
     * A hash identifying the version of this policy, so that updates to fields of the policy won&#39;t accidentally undo intermediate changes (and so that users of the API unaware of some fields won&#39;t accidentally remove other fields). Make a `get()` request to the cluster to get the current resource version and include it with requests to set the policy.
     * 
     */
    @Import(name="resourceVersion")
    private @Nullable Output<String> resourceVersion;

    public Optional<Output<String>> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }

    /**
     * Specifies the maintenance window in which maintenance may be performed.
     * 
     */
    @Import(name="window")
    private @Nullable Output<MaintenanceWindowArgs> window;

    public Optional<Output<MaintenanceWindowArgs>> window() {
        return Optional.ofNullable(this.window);
    }

    private MaintenancePolicyArgs() {}

    private MaintenancePolicyArgs(MaintenancePolicyArgs $) {
        this.resourceVersion = $.resourceVersion;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenancePolicyArgs $;

        public Builder() {
            $ = new MaintenancePolicyArgs();
        }

        public Builder(MaintenancePolicyArgs defaults) {
            $ = new MaintenancePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            $.resourceVersion = resourceVersion;
            return this;
        }

        public Builder resourceVersion(String resourceVersion) {
            return resourceVersion(Output.of(resourceVersion));
        }

        public Builder window(@Nullable Output<MaintenanceWindowArgs> window) {
            $.window = window;
            return this;
        }

        public Builder window(MaintenanceWindowArgs window) {
            return window(Output.of(window));
        }

        public MaintenancePolicyArgs build() {
            return $;
        }
    }

}
