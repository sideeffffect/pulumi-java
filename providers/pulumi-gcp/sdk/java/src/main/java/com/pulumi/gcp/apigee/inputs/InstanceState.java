// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceState extends ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * Description of the instance.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the instance.
     * 
     */
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

    /**
     * @return Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only.
     * Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    public Optional<Output<String>> diskEncryptionKeyName() {
        return Optional.ofNullable(this.diskEncryptionKeyName);
    }

    /**
     * Display name of the instance.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of the instance.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Output only. Hostname or IP address of the exposed Apigee endpoint used by clients to connect to the service.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Output only. Hostname or IP address of the exposed Apigee endpoint used by clients to connect to the service.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
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

    /**
     * @return IP range represents the customer-provided CIDR block of length 22 that will be used for
     * the Apigee instance creation. This optional range, if provided, should be freely
     * available as part of larger named range the customer has allocated to the Service
     * Networking peering. If this is not provided, Apigee will automatically request for any
     * available /22 CIDR block from Service Networking. The customer should use this CIDR block
     * for configuring their firewall needs to allow traffic from Apigee.
     * Input format: &#34;a.b.c.d/22&#34;
     * 
     */
    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    /**
     * Compute Engine location where the instance resides. For trial organization
     * subscriptions, the location must be a Compute Engine zone. For paid organization
     * subscriptions, it should correspond to a Compute Engine region.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Compute Engine location where the instance resides. For trial organization
     * subscriptions, the location must be a Compute Engine zone. For paid organization
     * subscriptions, it should correspond to a Compute Engine region.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource ID of the instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource ID of the instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Apigee Organization associated with the Apigee instance,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return The Apigee Organization associated with the Apigee instance,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * The size of the CIDR block range that will be reserved by the instance. For valid values,
     * see [CidrRange](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances#CidrRange) on the documentation.
     * 
     */
    @Import(name="peeringCidrRange")
    private @Nullable Output<String> peeringCidrRange;

    /**
     * @return The size of the CIDR block range that will be reserved by the instance. For valid values,
     * see [CidrRange](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances#CidrRange) on the documentation.
     * 
     */
    public Optional<Output<String>> peeringCidrRange() {
        return Optional.ofNullable(this.peeringCidrRange);
    }

    /**
     * Output only. Port number of the exposed Apigee endpoint.
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return Output only. Port number of the exposed Apigee endpoint.
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    private InstanceState() {}

    private InstanceState(InstanceState $) {
        this.description = $.description;
        this.diskEncryptionKeyName = $.diskEncryptionKeyName;
        this.displayName = $.displayName;
        this.host = $.host;
        this.ipRange = $.ipRange;
        this.location = $.location;
        this.name = $.name;
        this.orgId = $.orgId;
        this.peeringCidrRange = $.peeringCidrRange;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceState $;

        public Builder() {
            $ = new InstanceState();
        }

        public Builder(InstanceState defaults) {
            $ = new InstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the instance.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the instance.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskEncryptionKeyName Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only.
         * Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKeyName(@Nullable Output<String> diskEncryptionKeyName) {
            $.diskEncryptionKeyName = diskEncryptionKeyName;
            return this;
        }

        /**
         * @param diskEncryptionKeyName Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only.
         * Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKeyName(String diskEncryptionKeyName) {
            return diskEncryptionKeyName(Output.of(diskEncryptionKeyName));
        }

        /**
         * @param displayName Display name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param host Output only. Hostname or IP address of the exposed Apigee endpoint used by clients to connect to the service.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Output only. Hostname or IP address of the exposed Apigee endpoint used by clients to connect to the service.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param ipRange IP range represents the customer-provided CIDR block of length 22 that will be used for
         * the Apigee instance creation. This optional range, if provided, should be freely
         * available as part of larger named range the customer has allocated to the Service
         * Networking peering. If this is not provided, Apigee will automatically request for any
         * available /22 CIDR block from Service Networking. The customer should use this CIDR block
         * for configuring their firewall needs to allow traffic from Apigee.
         * Input format: &#34;a.b.c.d/22&#34;
         * 
         * @return builder
         * 
         */
        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange IP range represents the customer-provided CIDR block of length 22 that will be used for
         * the Apigee instance creation. This optional range, if provided, should be freely
         * available as part of larger named range the customer has allocated to the Service
         * Networking peering. If this is not provided, Apigee will automatically request for any
         * available /22 CIDR block from Service Networking. The customer should use this CIDR block
         * for configuring their firewall needs to allow traffic from Apigee.
         * Input format: &#34;a.b.c.d/22&#34;
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        /**
         * @param location Compute Engine location where the instance resides. For trial organization
         * subscriptions, the location must be a Compute Engine zone. For paid organization
         * subscriptions, it should correspond to a Compute Engine region.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Compute Engine location where the instance resides. For trial organization
         * subscriptions, the location must be a Compute Engine zone. For paid organization
         * subscriptions, it should correspond to a Compute Engine region.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Resource ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId The Apigee Organization associated with the Apigee instance,
         * in the format `organizations/{{org_name}}`.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId The Apigee Organization associated with the Apigee instance,
         * in the format `organizations/{{org_name}}`.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param peeringCidrRange The size of the CIDR block range that will be reserved by the instance. For valid values,
         * see [CidrRange](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances#CidrRange) on the documentation.
         * 
         * @return builder
         * 
         */
        public Builder peeringCidrRange(@Nullable Output<String> peeringCidrRange) {
            $.peeringCidrRange = peeringCidrRange;
            return this;
        }

        /**
         * @param peeringCidrRange The size of the CIDR block range that will be reserved by the instance. For valid values,
         * see [CidrRange](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances#CidrRange) on the documentation.
         * 
         * @return builder
         * 
         */
        public Builder peeringCidrRange(String peeringCidrRange) {
            return peeringCidrRange(Output.of(peeringCidrRange));
        }

        /**
         * @param port Output only. Port number of the exposed Apigee endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Output only. Port number of the exposed Apigee endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        public InstanceState build() {
            return $;
        }
    }

}
