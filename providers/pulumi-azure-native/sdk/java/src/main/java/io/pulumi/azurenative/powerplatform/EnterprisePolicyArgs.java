// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform;

import io.pulumi.azurenative.powerplatform.enums.EnterprisePolicyKind;
import io.pulumi.azurenative.powerplatform.inputs.EnterprisePolicyIdentityArgs;
import io.pulumi.azurenative.powerplatform.inputs.PropertiesEncryptionArgs;
import io.pulumi.azurenative.powerplatform.inputs.PropertiesLockboxArgs;
import io.pulumi.azurenative.powerplatform.inputs.PropertiesNetworkInjectionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterprisePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterprisePolicyArgs Empty = new EnterprisePolicyArgs();

    /**
     * The encryption settings for a configuration store.
     * 
     */
    @InputImport(name="encryption")
      private final @Nullable Input<PropertiesEncryptionArgs> encryption;

    public Input<PropertiesEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * Name of the EnterprisePolicy.
     * 
     */
    @InputImport(name="enterprisePolicyName")
      private final @Nullable Input<String> enterprisePolicyName;

    public Input<String> getEnterprisePolicyName() {
        return this.enterprisePolicyName == null ? Input.empty() : this.enterprisePolicyName;
    }

    /**
     * The identity of the EnterprisePolicy.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<EnterprisePolicyIdentityArgs> identity;

    public Input<EnterprisePolicyIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The kind (type) of Enterprise Policy.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,EnterprisePolicyKind>> kind;

    public Input<Either<String,EnterprisePolicyKind>> getKind() {
        return this.kind;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Settings concerning lockbox.
     * 
     */
    @InputImport(name="lockbox")
      private final @Nullable Input<PropertiesLockboxArgs> lockbox;

    public Input<PropertiesLockboxArgs> getLockbox() {
        return this.lockbox == null ? Input.empty() : this.lockbox;
    }

    /**
     * Settings concerning network injection.
     * 
     */
    @InputImport(name="networkInjection")
      private final @Nullable Input<PropertiesNetworkInjectionArgs> networkInjection;

    public Input<PropertiesNetworkInjectionArgs> getNetworkInjection() {
        return this.networkInjection == null ? Input.empty() : this.networkInjection;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public EnterprisePolicyArgs(
        @Nullable Input<PropertiesEncryptionArgs> encryption,
        @Nullable Input<String> enterprisePolicyName,
        @Nullable Input<EnterprisePolicyIdentityArgs> identity,
        Input<Either<String,EnterprisePolicyKind>> kind,
        @Nullable Input<String> location,
        @Nullable Input<PropertiesLockboxArgs> lockbox,
        @Nullable Input<PropertiesNetworkInjectionArgs> networkInjection,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.encryption = encryption;
        this.enterprisePolicyName = enterprisePolicyName;
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.lockbox = lockbox;
        this.networkInjection = networkInjection;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private EnterprisePolicyArgs() {
        this.encryption = Input.empty();
        this.enterprisePolicyName = Input.empty();
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.lockbox = Input.empty();
        this.networkInjection = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterprisePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PropertiesEncryptionArgs> encryption;
        private @Nullable Input<String> enterprisePolicyName;
        private @Nullable Input<EnterprisePolicyIdentityArgs> identity;
        private Input<Either<String,EnterprisePolicyKind>> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<PropertiesLockboxArgs> lockbox;
        private @Nullable Input<PropertiesNetworkInjectionArgs> networkInjection;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterprisePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.enterprisePolicyName = defaults.enterprisePolicyName;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.lockbox = defaults.lockbox;
    	      this.networkInjection = defaults.networkInjection;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder encryption(@Nullable Input<PropertiesEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryption(@Nullable PropertiesEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder enterprisePolicyName(@Nullable Input<String> enterprisePolicyName) {
            this.enterprisePolicyName = enterprisePolicyName;
            return this;
        }

        public Builder enterprisePolicyName(@Nullable String enterprisePolicyName) {
            this.enterprisePolicyName = Input.ofNullable(enterprisePolicyName);
            return this;
        }

        public Builder identity(@Nullable Input<EnterprisePolicyIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable EnterprisePolicyIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder kind(Input<Either<String,EnterprisePolicyKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(Either<String,EnterprisePolicyKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder lockbox(@Nullable Input<PropertiesLockboxArgs> lockbox) {
            this.lockbox = lockbox;
            return this;
        }

        public Builder lockbox(@Nullable PropertiesLockboxArgs lockbox) {
            this.lockbox = Input.ofNullable(lockbox);
            return this;
        }

        public Builder networkInjection(@Nullable Input<PropertiesNetworkInjectionArgs> networkInjection) {
            this.networkInjection = networkInjection;
            return this;
        }

        public Builder networkInjection(@Nullable PropertiesNetworkInjectionArgs networkInjection) {
            this.networkInjection = Input.ofNullable(networkInjection);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public EnterprisePolicyArgs build() {
            return new EnterprisePolicyArgs(encryption, enterprisePolicyName, identity, kind, location, lockbox, networkInjection, resourceGroupName, tags);
        }
    }
}
