// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkState extends ResourceArgs {

    public static final NetworkState Empty = new NetworkState();

    /**
     * When set to `true`, the network is created in &#34;auto subnet mode&#34; and
     * it will create a subnet for each region automatically across the
     * `10.128.0.0/9` address range.
     * When set to `false`, the network is created in &#34;custom subnet mode&#34; so
     * the user can explicitly connect subnetwork resources.
     * 
     */
    @Import(name="autoCreateSubnetworks")
    private @Nullable Output<Boolean> autoCreateSubnetworks;

    /**
     * @return When set to `true`, the network is created in &#34;auto subnet mode&#34; and
     * it will create a subnet for each region automatically across the
     * `10.128.0.0/9` address range.
     * When set to `false`, the network is created in &#34;custom subnet mode&#34; so
     * the user can explicitly connect subnetwork resources.
     * 
     */
    public Optional<Output<Boolean>> autoCreateSubnetworks() {
        return Optional.ofNullable(this.autoCreateSubnetworks);
    }

    /**
     * If set to `true`, default routes (`0.0.0.0/0`) will be deleted
     * immediately after network creation. Defaults to `false`.
     * 
     */
    @Import(name="deleteDefaultRoutesOnCreate")
    private @Nullable Output<Boolean> deleteDefaultRoutesOnCreate;

    /**
     * @return If set to `true`, default routes (`0.0.0.0/0`) will be deleted
     * immediately after network creation. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> deleteDefaultRoutesOnCreate() {
        return Optional.ofNullable(this.deleteDefaultRoutesOnCreate);
    }

    /**
     * An optional description of this resource. The resource must be
     * recreated to modify this field.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. The resource must be
     * recreated to modify this field.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The gateway address for default routing out of the network. This value is selected by GCP.
     * 
     */
    @Import(name="gatewayIpv4")
    private @Nullable Output<String> gatewayIpv4;

    /**
     * @return The gateway address for default routing out of the network. This value is selected by GCP.
     * 
     */
    public Optional<Output<String>> gatewayIpv4() {
        return Optional.ofNullable(this.gatewayIpv4);
    }

    /**
     * Maximum Transmission Unit in bytes. The minimum value for this field is 1460
     * and the maximum value is 1500 bytes.
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    /**
     * @return Maximum Transmission Unit in bytes. The minimum value for this field is 1460
     * and the maximum value is 1500 bytes.
     * 
     */
    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
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
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The network-wide routing mode to use. If set to `REGIONAL`, this
     * network&#39;s cloud routers will only advertise routes with subnetworks
     * of this network in the same region as the router. If set to `GLOBAL`,
     * this network&#39;s cloud routers will advertise routes with all
     * subnetworks of this network, across regions.
     * Possible values are `REGIONAL` and `GLOBAL`.
     * 
     */
    @Import(name="routingMode")
    private @Nullable Output<String> routingMode;

    /**
     * @return The network-wide routing mode to use. If set to `REGIONAL`, this
     * network&#39;s cloud routers will only advertise routes with subnetworks
     * of this network in the same region as the router. If set to `GLOBAL`,
     * this network&#39;s cloud routers will advertise routes with all
     * subnetworks of this network, across regions.
     * Possible values are `REGIONAL` and `GLOBAL`.
     * 
     */
    public Optional<Output<String>> routingMode() {
        return Optional.ofNullable(this.routingMode);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    private NetworkState() {}

    private NetworkState(NetworkState $) {
        this.autoCreateSubnetworks = $.autoCreateSubnetworks;
        this.deleteDefaultRoutesOnCreate = $.deleteDefaultRoutesOnCreate;
        this.description = $.description;
        this.gatewayIpv4 = $.gatewayIpv4;
        this.mtu = $.mtu;
        this.name = $.name;
        this.project = $.project;
        this.routingMode = $.routingMode;
        this.selfLink = $.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkState $;

        public Builder() {
            $ = new NetworkState();
        }

        public Builder(NetworkState defaults) {
            $ = new NetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoCreateSubnetworks When set to `true`, the network is created in &#34;auto subnet mode&#34; and
         * it will create a subnet for each region automatically across the
         * `10.128.0.0/9` address range.
         * When set to `false`, the network is created in &#34;custom subnet mode&#34; so
         * the user can explicitly connect subnetwork resources.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateSubnetworks(@Nullable Output<Boolean> autoCreateSubnetworks) {
            $.autoCreateSubnetworks = autoCreateSubnetworks;
            return this;
        }

        /**
         * @param autoCreateSubnetworks When set to `true`, the network is created in &#34;auto subnet mode&#34; and
         * it will create a subnet for each region automatically across the
         * `10.128.0.0/9` address range.
         * When set to `false`, the network is created in &#34;custom subnet mode&#34; so
         * the user can explicitly connect subnetwork resources.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateSubnetworks(Boolean autoCreateSubnetworks) {
            return autoCreateSubnetworks(Output.of(autoCreateSubnetworks));
        }

        /**
         * @param deleteDefaultRoutesOnCreate If set to `true`, default routes (`0.0.0.0/0`) will be deleted
         * immediately after network creation. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder deleteDefaultRoutesOnCreate(@Nullable Output<Boolean> deleteDefaultRoutesOnCreate) {
            $.deleteDefaultRoutesOnCreate = deleteDefaultRoutesOnCreate;
            return this;
        }

        /**
         * @param deleteDefaultRoutesOnCreate If set to `true`, default routes (`0.0.0.0/0`) will be deleted
         * immediately after network creation. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder deleteDefaultRoutesOnCreate(Boolean deleteDefaultRoutesOnCreate) {
            return deleteDefaultRoutesOnCreate(Output.of(deleteDefaultRoutesOnCreate));
        }

        /**
         * @param description An optional description of this resource. The resource must be
         * recreated to modify this field.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. The resource must be
         * recreated to modify this field.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gatewayIpv4 The gateway address for default routing out of the network. This value is selected by GCP.
         * 
         * @return builder
         * 
         */
        public Builder gatewayIpv4(@Nullable Output<String> gatewayIpv4) {
            $.gatewayIpv4 = gatewayIpv4;
            return this;
        }

        /**
         * @param gatewayIpv4 The gateway address for default routing out of the network. This value is selected by GCP.
         * 
         * @return builder
         * 
         */
        public Builder gatewayIpv4(String gatewayIpv4) {
            return gatewayIpv4(Output.of(gatewayIpv4));
        }

        /**
         * @param mtu Maximum Transmission Unit in bytes. The minimum value for this field is 1460
         * and the maximum value is 1500 bytes.
         * 
         * @return builder
         * 
         */
        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        /**
         * @param mtu Maximum Transmission Unit in bytes. The minimum value for this field is 1460
         * and the maximum value is 1500 bytes.
         * 
         * @return builder
         * 
         */
        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param routingMode The network-wide routing mode to use. If set to `REGIONAL`, this
         * network&#39;s cloud routers will only advertise routes with subnetworks
         * of this network in the same region as the router. If set to `GLOBAL`,
         * this network&#39;s cloud routers will advertise routes with all
         * subnetworks of this network, across regions.
         * Possible values are `REGIONAL` and `GLOBAL`.
         * 
         * @return builder
         * 
         */
        public Builder routingMode(@Nullable Output<String> routingMode) {
            $.routingMode = routingMode;
            return this;
        }

        /**
         * @param routingMode The network-wide routing mode to use. If set to `REGIONAL`, this
         * network&#39;s cloud routers will only advertise routes with subnetworks
         * of this network in the same region as the router. If set to `GLOBAL`,
         * this network&#39;s cloud routers will advertise routes with all
         * subnetworks of this network, across regions.
         * Possible values are `REGIONAL` and `GLOBAL`.
         * 
         * @return builder
         * 
         */
        public Builder routingMode(String routingMode) {
            return routingMode(Output.of(routingMode));
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        public NetworkState build() {
            return $;
        }
    }

}
