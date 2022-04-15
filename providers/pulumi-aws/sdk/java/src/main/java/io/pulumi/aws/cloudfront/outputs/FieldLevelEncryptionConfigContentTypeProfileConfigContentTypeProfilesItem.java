// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem {
    /**
     * he content type for a field-level encryption content type-profile mapping. Valid value is `application/x-www-form-urlencoded`.
     * 
     */
    private final String contentType;
    /**
     * The format for a field-level encryption content type-profile mapping. Valid value is `URLEncoded`.
     * 
     */
    private final String format;
    /**
     * ID of profile to use for field-level encryption query argument-profile mapping
     * 
     */
    private final @Nullable String profileId;

    @CustomType.Constructor
    private FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem(
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("profileId") @Nullable String profileId) {
        this.contentType = contentType;
        this.format = format;
        this.profileId = profileId;
    }

    /**
     * he content type for a field-level encryption content type-profile mapping. Valid value is `application/x-www-form-urlencoded`.
     * 
    */
    public String contentType() {
        return this.contentType;
    }
    /**
     * The format for a field-level encryption content type-profile mapping. Valid value is `URLEncoded`.
     * 
    */
    public String format() {
        return this.format;
    }
    /**
     * ID of profile to use for field-level encryption query argument-profile mapping
     * 
    */
    public Optional<String> profileId() {
        return Optional.ofNullable(this.profileId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private String format;
        private @Nullable String profileId;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.format = defaults.format;
    	      this.profileId = defaults.profileId;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder profileId(@Nullable String profileId) {
            this.profileId = profileId;
            return this;
        }        public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem build() {
            return new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem(contentType, format, profileId);
        }
    }
}
