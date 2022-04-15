// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutingControlState extends io.pulumi.resources.ResourceArgs {

    public static final RoutingControlState Empty = new RoutingControlState();

    /**
     * ARN of the routing control.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * ARN of the cluster in which this routing control will reside.
     * 
     */
    @Import(name="clusterArn")
      private final @Nullable Output<String> clusterArn;

    public Output<String> clusterArn() {
        return this.clusterArn == null ? Codegen.empty() : this.clusterArn;
    }

    /**
     * ARN of the control panel in which this routing control will reside.
     * 
     */
    @Import(name="controlPanelArn")
      private final @Nullable Output<String> controlPanelArn;

    public Output<String> controlPanelArn() {
        return this.controlPanelArn == null ? Codegen.empty() : this.controlPanelArn;
    }

    /**
     * The name describing the routing control.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Status of routing control. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public RoutingControlState(
        @Nullable Output<String> arn,
        @Nullable Output<String> clusterArn,
        @Nullable Output<String> controlPanelArn,
        @Nullable Output<String> name,
        @Nullable Output<String> status) {
        this.arn = arn;
        this.clusterArn = clusterArn;
        this.controlPanelArn = controlPanelArn;
        this.name = name;
        this.status = status;
    }

    private RoutingControlState() {
        this.arn = Codegen.empty();
        this.clusterArn = Codegen.empty();
        this.controlPanelArn = Codegen.empty();
        this.name = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingControlState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> clusterArn;
        private @Nullable Output<String> controlPanelArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingControlState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterArn = defaults.clusterArn;
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder clusterArn(@Nullable Output<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }
        public Builder clusterArn(@Nullable String clusterArn) {
            this.clusterArn = Codegen.ofNullable(clusterArn);
            return this;
        }
        public Builder controlPanelArn(@Nullable Output<String> controlPanelArn) {
            this.controlPanelArn = controlPanelArn;
            return this;
        }
        public Builder controlPanelArn(@Nullable String controlPanelArn) {
            this.controlPanelArn = Codegen.ofNullable(controlPanelArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public RoutingControlState build() {
            return new RoutingControlState(arn, clusterArn, controlPanelArn, name, status);
        }
    }
}
