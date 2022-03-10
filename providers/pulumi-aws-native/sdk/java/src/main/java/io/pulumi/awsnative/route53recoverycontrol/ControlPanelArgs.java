// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol;

import io.pulumi.awsnative.route53recoverycontrol.inputs.ControlPanelTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlPanelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControlPanelArgs Empty = new ControlPanelArgs();

    /**
     * Cluster to associate with the Control Panel
     * 
     */
    @InputImport(name="clusterArn")
      private final @Nullable Input<String> clusterArn;

    public Input<String> getClusterArn() {
        return this.clusterArn == null ? Input.empty() : this.clusterArn;
    }

    /**
     * The name of the control panel. You can use any non-white space character in the name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ControlPanelTagArgs>> tags;

    public Input<List<ControlPanelTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ControlPanelArgs(
        @Nullable Input<String> clusterArn,
        @Nullable Input<String> name,
        @Nullable Input<List<ControlPanelTagArgs>> tags) {
        this.clusterArn = clusterArn;
        this.name = name;
        this.tags = tags;
    }

    private ControlPanelArgs() {
        this.clusterArn = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlPanelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterArn;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ControlPanelTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlPanelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder clusterArn(@Nullable Input<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }

        public Builder clusterArn(@Nullable String clusterArn) {
            this.clusterArn = Input.ofNullable(clusterArn);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder tags(@Nullable Input<List<ControlPanelTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<ControlPanelTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ControlPanelArgs build() {
            return new ControlPanelArgs(clusterArn, name, tags);
        }
    }
}
