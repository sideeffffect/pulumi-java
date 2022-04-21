// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.SubnetworkLogConfigGetArgs;
import com.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetworkState extends com.pulumi.resources.ResourceArgs {

    public static final SubnetworkState Empty = new SubnetworkState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource. This field can be set only at resource
     * creation time.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @Import(name="externalIpv6Prefix")
    private @Nullable Output<String> externalIpv6Prefix;

    public Optional<Output<String>> externalIpv6Prefix() {
        return Optional.ofNullable(this.externalIpv6Prefix);
    }

    /**
     * Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     * @deprecated
     * This field is not useful for users, and has been removed as an output.
     * 
     */
    @Deprecated /* This field is not useful for users, and has been removed as an output. */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    @Deprecated /* This field is not useful for users, and has been removed as an output. */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    @Import(name="gatewayAddress")
    private @Nullable Output<String> gatewayAddress;

    public Optional<Output<String>> gatewayAddress() {
        return Optional.ofNullable(this.gatewayAddress);
    }

    /**
     * The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    @Import(name="ipCidrRange")
    private @Nullable Output<String> ipCidrRange;

    public Optional<Output<String>> ipCidrRange() {
        return Optional.ofNullable(this.ipCidrRange);
    }

    /**
     * The access type of IPv6 address this subnet holds. It&#39;s immutable and can only be specified during creation
     * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
     * cannot enable direct path.
     * Possible values are `EXTERNAL`.
     * 
     */
    @Import(name="ipv6AccessType")
    private @Nullable Output<String> ipv6AccessType;

    public Optional<Output<String>> ipv6AccessType() {
        return Optional.ofNullable(this.ipv6AccessType);
    }

    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @Import(name="ipv6CidrRange")
    private @Nullable Output<String> ipv6CidrRange;

    public Optional<Output<String>> ipv6CidrRange() {
        return Optional.ofNullable(this.ipv6CidrRange);
    }

    /**
     * Denotes the logging options for the subnetwork flow logs. If logging is enabled
     * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
     * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<SubnetworkLogConfigGetArgs> logConfig;

    public Optional<Output<SubnetworkLogConfigGetArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * The name of the resource, provided by the client when initially
     * creating the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network this subnet belongs to.
     * Only networks that are in the distributed mode can have subnetworks.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * When enabled, VMs in this subnetwork without external IP addresses can
     * access Google APIs and services by using Private Google Access.
     * 
     */
    @Import(name="privateIpGoogleAccess")
    private @Nullable Output<Boolean> privateIpGoogleAccess;

    public Optional<Output<Boolean>> privateIpGoogleAccess() {
        return Optional.ofNullable(this.privateIpGoogleAccess);
    }

    /**
     * The private IPv6 google access type for the VMs in this subnet.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
    private @Nullable Output<String> privateIpv6GoogleAccess;

    public Optional<Output<String>> privateIpv6GoogleAccess() {
        return Optional.ofNullable(this.privateIpv6GoogleAccess);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The purpose of the resource. A subnetwork with purpose set to
     * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
     * reserved for Internal HTTP(S) Load Balancing.
     * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
     * 
     */
    @Import(name="purpose")
    private @Nullable Output<String> purpose;

    public Optional<Output<String>> purpose() {
        return Optional.ofNullable(this.purpose);
    }

    /**
     * The GCP region for this subnetwork.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The role of subnetwork. Currently, this field is only used when
     * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
     * or BACKUP. An ACTIVE subnetwork is one that is currently being used
     * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
     * is ready to be promoted to ACTIVE or is currently draining.
     * Possible values are `ACTIVE` and `BACKUP`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * 
     */
    @Import(name="secondaryIpRanges")
    private @Nullable Output<List<SubnetworkSecondaryIpRangeGetArgs>> secondaryIpRanges;

    public Optional<Output<List<SubnetworkSecondaryIpRangeGetArgs>>> secondaryIpRanges() {
        return Optional.ofNullable(this.secondaryIpRanges);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
     * If not specified IPV4_ONLY will be used.
     * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
     * 
     */
    @Import(name="stackType")
    private @Nullable Output<String> stackType;

    public Optional<Output<String>> stackType() {
        return Optional.ofNullable(this.stackType);
    }

    private SubnetworkState() {}

    private SubnetworkState(SubnetworkState $) {
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.externalIpv6Prefix = $.externalIpv6Prefix;
        this.fingerprint = $.fingerprint;
        this.gatewayAddress = $.gatewayAddress;
        this.ipCidrRange = $.ipCidrRange;
        this.ipv6AccessType = $.ipv6AccessType;
        this.ipv6CidrRange = $.ipv6CidrRange;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.network = $.network;
        this.privateIpGoogleAccess = $.privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = $.privateIpv6GoogleAccess;
        this.project = $.project;
        this.purpose = $.purpose;
        this.region = $.region;
        this.role = $.role;
        this.secondaryIpRanges = $.secondaryIpRanges;
        this.selfLink = $.selfLink;
        this.stackType = $.stackType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetworkState $;

        public Builder() {
            $ = new SubnetworkState();
        }

        public Builder(SubnetworkState defaults) {
            $ = new SubnetworkState(Objects.requireNonNull(defaults));
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder externalIpv6Prefix(@Nullable Output<String> externalIpv6Prefix) {
            $.externalIpv6Prefix = externalIpv6Prefix;
            return this;
        }

        public Builder externalIpv6Prefix(String externalIpv6Prefix) {
            return externalIpv6Prefix(Output.of(externalIpv6Prefix));
        }

        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        public Builder gatewayAddress(@Nullable Output<String> gatewayAddress) {
            $.gatewayAddress = gatewayAddress;
            return this;
        }

        public Builder gatewayAddress(String gatewayAddress) {
            return gatewayAddress(Output.of(gatewayAddress));
        }

        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        public Builder ipv6AccessType(@Nullable Output<String> ipv6AccessType) {
            $.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder ipv6AccessType(String ipv6AccessType) {
            return ipv6AccessType(Output.of(ipv6AccessType));
        }

        public Builder ipv6CidrRange(@Nullable Output<String> ipv6CidrRange) {
            $.ipv6CidrRange = ipv6CidrRange;
            return this;
        }

        public Builder ipv6CidrRange(String ipv6CidrRange) {
            return ipv6CidrRange(Output.of(ipv6CidrRange));
        }

        public Builder logConfig(@Nullable Output<SubnetworkLogConfigGetArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(SubnetworkLogConfigGetArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder privateIpGoogleAccess(@Nullable Output<Boolean> privateIpGoogleAccess) {
            $.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }

        public Builder privateIpGoogleAccess(Boolean privateIpGoogleAccess) {
            return privateIpGoogleAccess(Output.of(privateIpGoogleAccess));
        }

        public Builder privateIpv6GoogleAccess(@Nullable Output<String> privateIpv6GoogleAccess) {
            $.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            return privateIpv6GoogleAccess(Output.of(privateIpv6GoogleAccess));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder purpose(@Nullable Output<String> purpose) {
            $.purpose = purpose;
            return this;
        }

        public Builder purpose(String purpose) {
            return purpose(Output.of(purpose));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder secondaryIpRanges(@Nullable Output<List<SubnetworkSecondaryIpRangeGetArgs>> secondaryIpRanges) {
            $.secondaryIpRanges = secondaryIpRanges;
            return this;
        }

        public Builder secondaryIpRanges(List<SubnetworkSecondaryIpRangeGetArgs> secondaryIpRanges) {
            return secondaryIpRanges(Output.of(secondaryIpRanges));
        }

        public Builder secondaryIpRanges(SubnetworkSecondaryIpRangeGetArgs... secondaryIpRanges) {
            return secondaryIpRanges(List.of(secondaryIpRanges));
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        public Builder stackType(@Nullable Output<String> stackType) {
            $.stackType = stackType;
            return this;
        }

        public Builder stackType(String stackType) {
            return stackType(Output.of(stackType));
        }

        public SubnetworkState build() {
            return $;
        }
    }

}
