// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyPlayRightResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The PlayReady license
 * 
 */
public final class ContentKeyPolicyPlayReadyLicenseResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyPlayReadyLicenseResponse Empty = new ContentKeyPolicyPlayReadyLicenseResponse();

    /**
     * A flag indicating whether test devices can use the license.
     * 
     */
    @InputImport(name="allowTestDevices", required=true)
      private final Boolean allowTestDevices;

    public Boolean getAllowTestDevices() {
        return this.allowTestDevices;
    }

    /**
     * The begin date of license
     * 
     */
    @InputImport(name="beginDate")
      private final @Nullable String beginDate;

    public Optional<String> getBeginDate() {
        return this.beginDate == null ? Optional.empty() : Optional.ofNullable(this.beginDate);
    }

    /**
     * The content key location.
     * 
     */
    @InputImport(name="contentKeyLocation", required=true)
      private final Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation;

    public Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> getContentKeyLocation() {
        return this.contentKeyLocation;
    }

    /**
     * The PlayReady content type.
     * 
     */
    @InputImport(name="contentType", required=true)
      private final String contentType;

    public String getContentType() {
        return this.contentType;
    }

    /**
     * The expiration date of license.
     * 
     */
    @InputImport(name="expirationDate")
      private final @Nullable String expirationDate;

    public Optional<String> getExpirationDate() {
        return this.expirationDate == null ? Optional.empty() : Optional.ofNullable(this.expirationDate);
    }

    /**
     * The grace period of license.
     * 
     */
    @InputImport(name="gracePeriod")
      private final @Nullable String gracePeriod;

    public Optional<String> getGracePeriod() {
        return this.gracePeriod == null ? Optional.empty() : Optional.ofNullable(this.gracePeriod);
    }

    /**
     * The license type.
     * 
     */
    @InputImport(name="licenseType", required=true)
      private final String licenseType;

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * The license PlayRight
     * 
     */
    @InputImport(name="playRight")
      private final @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight;

    public Optional<ContentKeyPolicyPlayReadyPlayRightResponse> getPlayRight() {
        return this.playRight == null ? Optional.empty() : Optional.ofNullable(this.playRight);
    }

    /**
     * The relative begin date of license.
     * 
     */
    @InputImport(name="relativeBeginDate")
      private final @Nullable String relativeBeginDate;

    public Optional<String> getRelativeBeginDate() {
        return this.relativeBeginDate == null ? Optional.empty() : Optional.ofNullable(this.relativeBeginDate);
    }

    /**
     * The relative expiration date of license.
     * 
     */
    @InputImport(name="relativeExpirationDate")
      private final @Nullable String relativeExpirationDate;

    public Optional<String> getRelativeExpirationDate() {
        return this.relativeExpirationDate == null ? Optional.empty() : Optional.ofNullable(this.relativeExpirationDate);
    }

    public ContentKeyPolicyPlayReadyLicenseResponse(
        Boolean allowTestDevices,
        @Nullable String beginDate,
        Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation,
        String contentType,
        @Nullable String expirationDate,
        @Nullable String gracePeriod,
        String licenseType,
        @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight,
        @Nullable String relativeBeginDate,
        @Nullable String relativeExpirationDate) {
        this.allowTestDevices = Objects.requireNonNull(allowTestDevices, "expected parameter 'allowTestDevices' to be non-null");
        this.beginDate = beginDate;
        this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation, "expected parameter 'contentKeyLocation' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.expirationDate = expirationDate;
        this.gracePeriod = gracePeriod;
        this.licenseType = Objects.requireNonNull(licenseType, "expected parameter 'licenseType' to be non-null");
        this.playRight = playRight;
        this.relativeBeginDate = relativeBeginDate;
        this.relativeExpirationDate = relativeExpirationDate;
    }

    private ContentKeyPolicyPlayReadyLicenseResponse() {
        this.allowTestDevices = null;
        this.beginDate = null;
        this.contentKeyLocation = null;
        this.contentType = null;
        this.expirationDate = null;
        this.gracePeriod = null;
        this.licenseType = null;
        this.playRight = null;
        this.relativeBeginDate = null;
        this.relativeExpirationDate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyLicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowTestDevices;
        private @Nullable String beginDate;
        private Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation;
        private String contentType;
        private @Nullable String expirationDate;
        private @Nullable String gracePeriod;
        private String licenseType;
        private @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight;
        private @Nullable String relativeBeginDate;
        private @Nullable String relativeExpirationDate;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyLicenseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTestDevices = defaults.allowTestDevices;
    	      this.beginDate = defaults.beginDate;
    	      this.contentKeyLocation = defaults.contentKeyLocation;
    	      this.contentType = defaults.contentType;
    	      this.expirationDate = defaults.expirationDate;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.licenseType = defaults.licenseType;
    	      this.playRight = defaults.playRight;
    	      this.relativeBeginDate = defaults.relativeBeginDate;
    	      this.relativeExpirationDate = defaults.relativeExpirationDate;
        }

        public Builder allowTestDevices(Boolean allowTestDevices) {
            this.allowTestDevices = Objects.requireNonNull(allowTestDevices);
            return this;
        }

        public Builder beginDate(@Nullable String beginDate) {
            this.beginDate = beginDate;
            return this;
        }

        public Builder contentKeyLocation(Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation) {
            this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder gracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }

        public Builder licenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }

        public Builder playRight(@Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight) {
            this.playRight = playRight;
            return this;
        }

        public Builder relativeBeginDate(@Nullable String relativeBeginDate) {
            this.relativeBeginDate = relativeBeginDate;
            return this;
        }

        public Builder relativeExpirationDate(@Nullable String relativeExpirationDate) {
            this.relativeExpirationDate = relativeExpirationDate;
            return this;
        }
        public ContentKeyPolicyPlayReadyLicenseResponse build() {
            return new ContentKeyPolicyPlayReadyLicenseResponse(allowTestDevices, beginDate, contentKeyLocation, contentType, expirationDate, gracePeriod, licenseType, playRight, relativeBeginDate, relativeExpirationDate);
        }
    }
}
