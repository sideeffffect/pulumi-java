// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkState Empty = new NetworkState();

    /**
     * When set to `true`, the network is created in "auto subnet mode" and
     * it will create a subnet for each region automatically across the
     * `10.128.0.0/9` address range.
     * When set to `false`, the network is created in "custom subnet mode" so
     * the user can explicitly connect subnetwork resources.
     * 
     */
    @InputImport(name="autoCreateSubnetworks")
      private final @Nullable Input<Boolean> autoCreateSubnetworks;

    public Input<Boolean> getAutoCreateSubnetworks() {
        return this.autoCreateSubnetworks == null ? Input.empty() : this.autoCreateSubnetworks;
    }

    /**
     * If set to `true`, default routes (`0.0.0.0/0`) will be deleted
     * immediately after network creation. Defaults to `false`.
     * 
     */
    @InputImport(name="deleteDefaultRoutesOnCreate")
      private final @Nullable Input<Boolean> deleteDefaultRoutesOnCreate;

    public Input<Boolean> getDeleteDefaultRoutesOnCreate() {
        return this.deleteDefaultRoutesOnCreate == null ? Input.empty() : this.deleteDefaultRoutesOnCreate;
    }

    /**
     * An optional description of this resource. The resource must be
     * recreated to modify this field.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The gateway address for default routing out of the network. This value is selected by GCP.
     * 
     */
    @InputImport(name="gatewayIpv4")
      private final @Nullable Input<String> gatewayIpv4;

    public Input<String> getGatewayIpv4() {
        return this.gatewayIpv4 == null ? Input.empty() : this.gatewayIpv4;
    }

    /**
     * Maximum Transmission Unit in bytes. The minimum value for this field is 1460
     * and the maximum value is 1500 bytes.
     * 
     */
    @InputImport(name="mtu")
      private final @Nullable Input<Integer> mtu;

    public Input<Integer> getMtu() {
        return this.mtu == null ? Input.empty() : this.mtu;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The network-wide routing mode to use. If set to `REGIONAL`, this
     * network's cloud routers will only advertise routes with subnetworks
     * of this network in the same region as the router. If set to `GLOBAL`,
     * this network's cloud routers will advertise routes with all
     * subnetworks of this network, across regions.
     * Possible values are `REGIONAL` and `GLOBAL`.
     * 
     */
    @InputImport(name="routingMode")
      private final @Nullable Input<String> routingMode;

    public Input<String> getRoutingMode() {
        return this.routingMode == null ? Input.empty() : this.routingMode;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    public NetworkState(
        @Nullable Input<Boolean> autoCreateSubnetworks,
        @Nullable Input<Boolean> deleteDefaultRoutesOnCreate,
        @Nullable Input<String> description,
        @Nullable Input<String> gatewayIpv4,
        @Nullable Input<Integer> mtu,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> routingMode,
        @Nullable Input<String> selfLink) {
        this.autoCreateSubnetworks = autoCreateSubnetworks;
        this.deleteDefaultRoutesOnCreate = deleteDefaultRoutesOnCreate;
        this.description = description;
        this.gatewayIpv4 = gatewayIpv4;
        this.mtu = mtu;
        this.name = name;
        this.project = project;
        this.routingMode = routingMode;
        this.selfLink = selfLink;
    }

    private NetworkState() {
        this.autoCreateSubnetworks = Input.empty();
        this.deleteDefaultRoutesOnCreate = Input.empty();
        this.description = Input.empty();
        this.gatewayIpv4 = Input.empty();
        this.mtu = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.routingMode = Input.empty();
        this.selfLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoCreateSubnetworks;
        private @Nullable Input<Boolean> deleteDefaultRoutesOnCreate;
        private @Nullable Input<String> description;
        private @Nullable Input<String> gatewayIpv4;
        private @Nullable Input<Integer> mtu;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> routingMode;
        private @Nullable Input<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateSubnetworks = defaults.autoCreateSubnetworks;
    	      this.deleteDefaultRoutesOnCreate = defaults.deleteDefaultRoutesOnCreate;
    	      this.description = defaults.description;
    	      this.gatewayIpv4 = defaults.gatewayIpv4;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.routingMode = defaults.routingMode;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder autoCreateSubnetworks(@Nullable Input<Boolean> autoCreateSubnetworks) {
            this.autoCreateSubnetworks = autoCreateSubnetworks;
            return this;
        }

        public Builder autoCreateSubnetworks(@Nullable Boolean autoCreateSubnetworks) {
            this.autoCreateSubnetworks = Input.ofNullable(autoCreateSubnetworks);
            return this;
        }

        public Builder deleteDefaultRoutesOnCreate(@Nullable Input<Boolean> deleteDefaultRoutesOnCreate) {
            this.deleteDefaultRoutesOnCreate = deleteDefaultRoutesOnCreate;
            return this;
        }

        public Builder deleteDefaultRoutesOnCreate(@Nullable Boolean deleteDefaultRoutesOnCreate) {
            this.deleteDefaultRoutesOnCreate = Input.ofNullable(deleteDefaultRoutesOnCreate);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder gatewayIpv4(@Nullable Input<String> gatewayIpv4) {
            this.gatewayIpv4 = gatewayIpv4;
            return this;
        }

        public Builder gatewayIpv4(@Nullable String gatewayIpv4) {
            this.gatewayIpv4 = Input.ofNullable(gatewayIpv4);
            return this;
        }

        public Builder mtu(@Nullable Input<Integer> mtu) {
            this.mtu = mtu;
            return this;
        }

        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = Input.ofNullable(mtu);
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

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder routingMode(@Nullable Input<String> routingMode) {
            this.routingMode = routingMode;
            return this;
        }

        public Builder routingMode(@Nullable String routingMode) {
            this.routingMode = Input.ofNullable(routingMode);
            return this;
        }

        public Builder selfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }
        public NetworkState build() {
            return new NetworkState(autoCreateSubnetworks, deleteDefaultRoutesOnCreate, description, gatewayIpv4, mtu, name, project, routingMode, selfLink);
        }
    }
}
