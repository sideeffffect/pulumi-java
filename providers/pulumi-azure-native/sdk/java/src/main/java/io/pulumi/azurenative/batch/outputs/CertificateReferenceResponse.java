// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateReferenceResponse {
    private final String id;
    /**
     * The default value is currentUser. This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    private final @Nullable String storeLocation;
    /**
     * This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any custom store name can also be used. The default value is My.
     * 
     */
    private final @Nullable String storeName;
    private final @Nullable List<String> visibility;

    @OutputCustomType.Constructor({"id","storeLocation","storeName","visibility"})
    private CertificateReferenceResponse(
        String id,
        @Nullable String storeLocation,
        @Nullable String storeName,
        @Nullable List<String> visibility) {
        this.id = id;
        this.storeLocation = storeLocation;
        this.storeName = storeName;
        this.visibility = visibility;
    }

    public String getId() {
        return this.id;
    }
    /**
     * The default value is currentUser. This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
    */
    public Optional<String> getStoreLocation() {
        return Optional.ofNullable(this.storeLocation);
    }
    /**
     * This property is applicable only for pools configured with Windows nodes (that is, created with cloudServiceConfiguration, or with virtualMachineConfiguration using a Windows image reference). Common store names include: My, Root, CA, Trust, Disallowed, TrustedPeople, TrustedPublisher, AuthRoot, AddressBook, but any custom store name can also be used. The default value is My.
     * 
    */
    public Optional<String> getStoreName() {
        return Optional.ofNullable(this.storeName);
    }
    public List<String> getVisibility() {
        return this.visibility == null ? List.of() : this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String storeLocation;
        private @Nullable String storeName;
        private @Nullable List<String> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storeLocation = defaults.storeLocation;
    	      this.storeName = defaults.storeName;
    	      this.visibility = defaults.visibility;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setStoreLocation(@Nullable String storeLocation) {
            this.storeLocation = storeLocation;
            return this;
        }

        public Builder setStoreName(@Nullable String storeName) {
            this.storeName = storeName;
            return this;
        }

        public Builder setVisibility(@Nullable List<String> visibility) {
            this.visibility = visibility;
            return this;
        }
        public CertificateReferenceResponse build() {
            return new CertificateReferenceResponse(id, storeLocation, storeName, visibility);
        }
    }
}
