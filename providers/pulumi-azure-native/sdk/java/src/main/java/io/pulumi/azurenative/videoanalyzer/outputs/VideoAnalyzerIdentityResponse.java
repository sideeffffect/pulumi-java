// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.UserAssignedManagedIdentityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class VideoAnalyzerIdentityResponse {
    /**
     * The identity type.
     * 
     */
    private final String type;
    /**
     * The User Assigned Managed Identities.
     * 
     */
    private final @Nullable Map<String,UserAssignedManagedIdentityResponse> userAssignedIdentities;

    @OutputCustomType.Constructor({"type","userAssignedIdentities"})
    private VideoAnalyzerIdentityResponse(
        String type,
        @Nullable Map<String,UserAssignedManagedIdentityResponse> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The identity type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The User Assigned Managed Identities.
     * 
    */
    public Map<String,UserAssignedManagedIdentityResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoAnalyzerIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private @Nullable Map<String,UserAssignedManagedIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoAnalyzerIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,UserAssignedManagedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public VideoAnalyzerIdentityResponse build() {
            return new VideoAnalyzerIdentityResponse(type, userAssignedIdentities);
        }
    }
}
