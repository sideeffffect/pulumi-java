// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.enums.InstancePeeringCidrRange;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Optional. Description of the instance.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only. Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    @InputImport(name="diskEncryptionKeyName")
      private final @Nullable Input<String> diskEncryptionKeyName;

    public Input<String> getDiskEncryptionKeyName() {
        return this.diskEncryptionKeyName == null ? Input.empty() : this.diskEncryptionKeyName;
    }

    /**
     * Optional. Display name for the instance.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Optional. IP range represents the customer-provided CIDR block of length 22 that will be used for the Apigee instance creation. This optional range, if provided, should be freely available as part of larger named range the customer has allocated to the Service Networking peering. If this is not provided, Apigee will automatically request for any available /22 CIDR block from Service Networking. The customer should use this CIDR block for configuring their firewall needs to allow traffic from Apigee. Input format: "a.b.c.d/22", Output format: a.b.c.d/22, e.f.g.h/28"
     * 
     */
    @InputImport(name="ipRange")
      private final @Nullable Input<String> ipRange;

    public Input<String> getIpRange() {
        return this.ipRange == null ? Input.empty() : this.ipRange;
    }

    /**
     * Compute Engine location where the instance resides.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Resource ID of the instance. Values must match the regular expression `^a-z{0,30}[a-z\d]$`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Optional. Size of the CIDR block range that will be reserved by the instance. PAID organizations support `SLASH_16` to `SLASH_20` and defaults to `SLASH_16`. Evaluation organizations support only `SLASH_23`.
     * 
     */
    @InputImport(name="peeringCidrRange")
      private final @Nullable Input<InstancePeeringCidrRange> peeringCidrRange;

    public Input<InstancePeeringCidrRange> getPeeringCidrRange() {
        return this.peeringCidrRange == null ? Input.empty() : this.peeringCidrRange;
    }

    public InstanceArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> diskEncryptionKeyName,
        @Nullable Input<String> displayName,
        @Nullable Input<String> ipRange,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> organizationId,
        @Nullable Input<InstancePeeringCidrRange> peeringCidrRange) {
        this.description = description;
        this.diskEncryptionKeyName = diskEncryptionKeyName;
        this.displayName = displayName;
        this.ipRange = ipRange;
        this.location = location;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.peeringCidrRange = peeringCidrRange;
    }

    private InstanceArgs() {
        this.description = Input.empty();
        this.diskEncryptionKeyName = Input.empty();
        this.displayName = Input.empty();
        this.ipRange = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
        this.peeringCidrRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> diskEncryptionKeyName;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> ipRange;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> organizationId;
        private @Nullable Input<InstancePeeringCidrRange> peeringCidrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskEncryptionKeyName = defaults.diskEncryptionKeyName;
    	      this.displayName = defaults.displayName;
    	      this.ipRange = defaults.ipRange;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.peeringCidrRange = defaults.peeringCidrRange;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder diskEncryptionKeyName(@Nullable Input<String> diskEncryptionKeyName) {
            this.diskEncryptionKeyName = diskEncryptionKeyName;
            return this;
        }

        public Builder diskEncryptionKeyName(@Nullable String diskEncryptionKeyName) {
            this.diskEncryptionKeyName = Input.ofNullable(diskEncryptionKeyName);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder ipRange(@Nullable Input<String> ipRange) {
            this.ipRange = ipRange;
            return this;
        }

        public Builder ipRange(@Nullable String ipRange) {
            this.ipRange = Input.ofNullable(ipRange);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder organizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder peeringCidrRange(@Nullable Input<InstancePeeringCidrRange> peeringCidrRange) {
            this.peeringCidrRange = peeringCidrRange;
            return this;
        }

        public Builder peeringCidrRange(@Nullable InstancePeeringCidrRange peeringCidrRange) {
            this.peeringCidrRange = Input.ofNullable(peeringCidrRange);
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(description, diskEncryptionKeyName, displayName, ipRange, location, name, organizationId, peeringCidrRange);
        }
    }
}
