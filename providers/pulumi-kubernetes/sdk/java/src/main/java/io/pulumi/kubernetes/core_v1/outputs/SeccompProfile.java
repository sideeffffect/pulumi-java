// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SeccompProfile {
    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
     * 
     */
    private final @Nullable String localhostProfile;
    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * Possible enum values:
     *  - `"Localhost"` indicates a profile defined in a file on the node should be used. The file's location relative to <kubelet-root-dir>/seccomp.
     *  - `"RuntimeDefault"` represents the default container runtime seccomp profile.
     *  - `"Unconfined"` indicates no seccomp profile is applied (A.K.A. unconfined).
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"localhostProfile","type"})
    private SeccompProfile(
        @Nullable String localhostProfile,
        String type) {
        this.localhostProfile = localhostProfile;
        this.type = type;
    }

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
     * 
    */
    public Optional<String> getLocalhostProfile() {
        return Optional.ofNullable(this.localhostProfile);
    }
    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * Possible enum values:
     *  - `"Localhost"` indicates a profile defined in a file on the node should be used. The file's location relative to <kubelet-root-dir>/seccomp.
     *  - `"RuntimeDefault"` represents the default container runtime seccomp profile.
     *  - `"Unconfined"` indicates no seccomp profile is applied (A.K.A. unconfined).
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SeccompProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String localhostProfile;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SeccompProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localhostProfile = defaults.localhostProfile;
    	      this.type = defaults.type;
        }

        public Builder setLocalhostProfile(@Nullable String localhostProfile) {
            this.localhostProfile = localhostProfile;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SeccompProfile build() {
            return new SeccompProfile(localhostProfile, type);
        }
    }
}
