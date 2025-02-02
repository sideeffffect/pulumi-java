// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationClientDetailsResponse {
    /**
     * @return The client application Id.
     * 
     */
    private final @Nullable String applicationId;
    /**
     * @return The client Oid.
     * 
     */
    private final @Nullable String oid;
    /**
     * @return The client Puid
     * 
     */
    private final @Nullable String puid;

    @CustomType.Constructor
    private ApplicationClientDetailsResponse(
        @CustomType.Parameter("applicationId") @Nullable String applicationId,
        @CustomType.Parameter("oid") @Nullable String oid,
        @CustomType.Parameter("puid") @Nullable String puid) {
        this.applicationId = applicationId;
        this.oid = oid;
        this.puid = puid;
    }

    /**
     * @return The client application Id.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * @return The client Oid.
     * 
     */
    public Optional<String> oid() {
        return Optional.ofNullable(this.oid);
    }
    /**
     * @return The client Puid
     * 
     */
    public Optional<String> puid() {
        return Optional.ofNullable(this.puid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationClientDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String oid;
        private @Nullable String puid;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationClientDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.oid = defaults.oid;
    	      this.puid = defaults.puid;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder oid(@Nullable String oid) {
            this.oid = oid;
            return this;
        }
        public Builder puid(@Nullable String puid) {
            this.puid = puid;
            return this;
        }        public ApplicationClientDetailsResponse build() {
            return new ApplicationClientDetailsResponse(applicationId, oid, puid);
        }
    }
}
