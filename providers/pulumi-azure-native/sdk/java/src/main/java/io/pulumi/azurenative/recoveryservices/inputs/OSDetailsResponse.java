// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Disk Details.
 * 
 */
public final class OSDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSDetailsResponse Empty = new OSDetailsResponse();

    /**
     * The OS Major Version.
     * 
     */
    @InputImport(name="oSMajorVersion")
      private final @Nullable String oSMajorVersion;

    public Optional<String> getOSMajorVersion() {
        return this.oSMajorVersion == null ? Optional.empty() : Optional.ofNullable(this.oSMajorVersion);
    }

    /**
     * The OS Minor Version.
     * 
     */
    @InputImport(name="oSMinorVersion")
      private final @Nullable String oSMinorVersion;

    public Optional<String> getOSMinorVersion() {
        return this.oSMinorVersion == null ? Optional.empty() : Optional.ofNullable(this.oSMinorVersion);
    }

    /**
     * The OS Version.
     * 
     */
    @InputImport(name="oSVersion")
      private final @Nullable String oSVersion;

    public Optional<String> getOSVersion() {
        return this.oSVersion == null ? Optional.empty() : Optional.ofNullable(this.oSVersion);
    }

    /**
     * The OSEdition.
     * 
     */
    @InputImport(name="osEdition")
      private final @Nullable String osEdition;

    public Optional<String> getOsEdition() {
        return this.osEdition == null ? Optional.empty() : Optional.ofNullable(this.osEdition);
    }

    /**
     * VM Disk details.
     * 
     */
    @InputImport(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * Product type.
     * 
     */
    @InputImport(name="productType")
      private final @Nullable String productType;

    public Optional<String> getProductType() {
        return this.productType == null ? Optional.empty() : Optional.ofNullable(this.productType);
    }

    public OSDetailsResponse(
        @Nullable String oSMajorVersion,
        @Nullable String oSMinorVersion,
        @Nullable String oSVersion,
        @Nullable String osEdition,
        @Nullable String osType,
        @Nullable String productType) {
        this.oSMajorVersion = oSMajorVersion;
        this.oSMinorVersion = oSMinorVersion;
        this.oSVersion = oSVersion;
        this.osEdition = osEdition;
        this.osType = osType;
        this.productType = productType;
    }

    private OSDetailsResponse() {
        this.oSMajorVersion = null;
        this.oSMinorVersion = null;
        this.oSVersion = null;
        this.osEdition = null;
        this.osType = null;
        this.productType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String oSMajorVersion;
        private @Nullable String oSMinorVersion;
        private @Nullable String oSVersion;
        private @Nullable String osEdition;
        private @Nullable String osType;
        private @Nullable String productType;

        public Builder() {
    	      // Empty
        }

        public Builder(OSDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oSMajorVersion = defaults.oSMajorVersion;
    	      this.oSMinorVersion = defaults.oSMinorVersion;
    	      this.oSVersion = defaults.oSVersion;
    	      this.osEdition = defaults.osEdition;
    	      this.osType = defaults.osType;
    	      this.productType = defaults.productType;
        }

        public Builder oSMajorVersion(@Nullable String oSMajorVersion) {
            this.oSMajorVersion = oSMajorVersion;
            return this;
        }

        public Builder oSMinorVersion(@Nullable String oSMinorVersion) {
            this.oSMinorVersion = oSMinorVersion;
            return this;
        }

        public Builder oSVersion(@Nullable String oSVersion) {
            this.oSVersion = oSVersion;
            return this;
        }

        public Builder osEdition(@Nullable String osEdition) {
            this.osEdition = osEdition;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder productType(@Nullable String productType) {
            this.productType = productType;
            return this;
        }
        public OSDetailsResponse build() {
            return new OSDetailsResponse(oSMajorVersion, oSMinorVersion, oSVersion, osEdition, osType, productType);
        }
    }
}
