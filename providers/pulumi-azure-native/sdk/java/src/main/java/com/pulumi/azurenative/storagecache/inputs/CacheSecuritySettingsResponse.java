// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.azurenative.storagecache.inputs.NfsAccessPolicyResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cache security settings.
 * 
 */
public final class CacheSecuritySettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CacheSecuritySettingsResponse Empty = new CacheSecuritySettingsResponse();

    /**
     * NFS access policies defined for this cache.
     * 
     */
    @Import(name="accessPolicies")
      private final @Nullable List<NfsAccessPolicyResponse> accessPolicies;

    public List<NfsAccessPolicyResponse> accessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }

    public CacheSecuritySettingsResponse(@Nullable List<NfsAccessPolicyResponse> accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    private CacheSecuritySettingsResponse() {
        this.accessPolicies = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheSecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NfsAccessPolicyResponse> accessPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheSecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
        }

        public Builder accessPolicies(@Nullable List<NfsAccessPolicyResponse> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public Builder accessPolicies(NfsAccessPolicyResponse... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }        public CacheSecuritySettingsResponse build() {
            return new CacheSecuritySettingsResponse(accessPolicies);
        }
    }
}
