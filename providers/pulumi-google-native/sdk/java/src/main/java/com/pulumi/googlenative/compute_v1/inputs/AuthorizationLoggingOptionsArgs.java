// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.enums.AuthorizationLoggingOptionsPermissionType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class AuthorizationLoggingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorizationLoggingOptionsArgs Empty = new AuthorizationLoggingOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="permissionType")
      private final @Nullable Output<AuthorizationLoggingOptionsPermissionType> permissionType;

    public Output<AuthorizationLoggingOptionsPermissionType> permissionType() {
        return this.permissionType == null ? Codegen.empty() : this.permissionType;
    }

    public AuthorizationLoggingOptionsArgs(@Nullable Output<AuthorizationLoggingOptionsPermissionType> permissionType) {
        this.permissionType = permissionType;
    }

    private AuthorizationLoggingOptionsArgs() {
        this.permissionType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationLoggingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AuthorizationLoggingOptionsPermissionType> permissionType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationLoggingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissionType = defaults.permissionType;
        }

        public Builder permissionType(@Nullable Output<AuthorizationLoggingOptionsPermissionType> permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public Builder permissionType(@Nullable AuthorizationLoggingOptionsPermissionType permissionType) {
            this.permissionType = Codegen.ofNullable(permissionType);
            return this;
        }        public AuthorizationLoggingOptionsArgs build() {
            return new AuthorizationLoggingOptionsArgs(permissionType);
        }
    }
}
