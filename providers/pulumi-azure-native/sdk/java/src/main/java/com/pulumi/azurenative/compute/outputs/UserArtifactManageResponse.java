// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserArtifactManageResponse {
    /**
     * Required. The path and arguments to install the gallery application. This is limited to 4096 characters.
     * 
     */
    private final String install;
    /**
     * Required. The path and arguments to remove the gallery application. This is limited to 4096 characters.
     * 
     */
    private final String remove;
    /**
     * Optional. The path and arguments to update the gallery application. If not present, then update operation will invoke remove command on the previous version and install command on the current version of the gallery application. This is limited to 4096 characters.
     * 
     */
    private final @Nullable String update;

    @CustomType.Constructor
    private UserArtifactManageResponse(
        @CustomType.Parameter("install") String install,
        @CustomType.Parameter("remove") String remove,
        @CustomType.Parameter("update") @Nullable String update) {
        this.install = install;
        this.remove = remove;
        this.update = update;
    }

    /**
     * Required. The path and arguments to install the gallery application. This is limited to 4096 characters.
     * 
    */
    public String install() {
        return this.install;
    }
    /**
     * Required. The path and arguments to remove the gallery application. This is limited to 4096 characters.
     * 
    */
    public String remove() {
        return this.remove;
    }
    /**
     * Optional. The path and arguments to update the gallery application. If not present, then update operation will invoke remove command on the previous version and install command on the current version of the gallery application. This is limited to 4096 characters.
     * 
    */
    public Optional<String> update() {
        return Optional.ofNullable(this.update);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArtifactManageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String install;
        private String remove;
        private @Nullable String update;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArtifactManageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.install = defaults.install;
    	      this.remove = defaults.remove;
    	      this.update = defaults.update;
        }

        public Builder install(String install) {
            this.install = Objects.requireNonNull(install);
            return this;
        }
        public Builder remove(String remove) {
            this.remove = Objects.requireNonNull(remove);
            return this;
        }
        public Builder update(@Nullable String update) {
            this.update = update;
            return this;
        }        public UserArtifactManageResponse build() {
            return new UserArtifactManageResponse(install, remove, update);
        }
    }
}
