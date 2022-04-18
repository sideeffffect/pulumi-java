// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomDomainPropertiesResponse {
    /**
     * The app name of domain.
     * 
     */
    private final String appName;
    /**
     * The bound certificate name of domain.
     * 
     */
    private final @Nullable String certName;
    /**
     * The thumbprint of bound certificate.
     * 
     */
    private final @Nullable String thumbprint;

    @CustomType.Constructor
    private CustomDomainPropertiesResponse(
        @CustomType.Parameter("appName") String appName,
        @CustomType.Parameter("certName") @Nullable String certName,
        @CustomType.Parameter("thumbprint") @Nullable String thumbprint) {
        this.appName = appName;
        this.certName = certName;
        this.thumbprint = thumbprint;
    }

    /**
     * The app name of domain.
     * 
    */
    public String appName() {
        return this.appName;
    }
    /**
     * The bound certificate name of domain.
     * 
    */
    public Optional<String> certName() {
        return Optional.ofNullable(this.certName);
    }
    /**
     * The thumbprint of bound certificate.
     * 
    */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appName;
        private @Nullable String certName;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.certName = defaults.certName;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder appName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }
        public Builder certName(@Nullable String certName) {
            this.certName = certName;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }        public CustomDomainPropertiesResponse build() {
            return new CustomDomainPropertiesResponse(appName, certName, thumbprint);
        }
    }
}
