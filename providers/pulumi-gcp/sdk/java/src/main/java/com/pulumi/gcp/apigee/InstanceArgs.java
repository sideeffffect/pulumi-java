// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Description of the instance.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only.
     * Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    @Import(name="diskEncryptionKeyName")
    private @Nullable Output<String> diskEncryptionKeyName;

    public Optional<Output<String>> diskEncryptionKeyName() {
        return Optional.ofNullable(this.diskEncryptionKeyName);
    }

    /**
     * Display name of the instance.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * IP range represents the customer-provided CIDR block of length 22 that will be used for
     * the Apigee instance creation. This optional range, if provided, should be freely
     * available as part of larger named range the customer has allocated to the Service
     * Networking peering. If this is not provided, Apigee will automatically request for any
     * available /22 CIDR block from Service Networking. The customer should use this CIDR block
     * for configuring their firewall needs to allow traffic from Apigee.
     * Input format: &#34;a.b.c.d/22&#34;
     * 
     */
    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    /**
     * Compute Engine location where the instance resides. For trial organization
     * subscriptions, the location must be a Compute Engine zone. For paid organization
     * subscriptions, it should correspond to a Compute Engine region.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * Resource ID of the instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Apigee Organization associated with the Apigee instance,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * The size of the CIDR block range that will be reserved by the instance. For valid values,
     * see [CidrRange](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances#CidrRange) on the documentation.
     * 
     */
    @Import(name="peeringCidrRange")
    private @Nullable Output<String> peeringCidrRange;

    public Optional<Output<String>> peeringCidrRange() {
        return Optional.ofNullable(this.peeringCidrRange);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.description = $.description;
        this.diskEncryptionKeyName = $.diskEncryptionKeyName;
        this.displayName = $.displayName;
        this.ipRange = $.ipRange;
        this.location = $.location;
        this.name = $.name;
        this.orgId = $.orgId;
        this.peeringCidrRange = $.peeringCidrRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder diskEncryptionKeyName(@Nullable Output<String> diskEncryptionKeyName) {
            $.diskEncryptionKeyName = diskEncryptionKeyName;
            return this;
        }

        public Builder diskEncryptionKeyName(String diskEncryptionKeyName) {
            return diskEncryptionKeyName(Output.of(diskEncryptionKeyName));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder peeringCidrRange(@Nullable Output<String> peeringCidrRange) {
            $.peeringCidrRange = peeringCidrRange;
            return this;
        }

        public Builder peeringCidrRange(String peeringCidrRange) {
            return peeringCidrRange(Output.of(peeringCidrRange));
        }

        public InstanceArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            return $;
        }
    }

}
